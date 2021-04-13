package com.dtg.jxfs.tools.demo;

import java.io.Serializable;
import java.util.Hashtable;
import java.util.Iterator;

import com.dtg.jxfs.consts.DtgJxfsPrinterConst;
import com.dtg.jxfs.misc.DtgJxfsDirectIOParameter;
import com.dtg.jxfs.misc.DtgJxfsObjectToStringResolver;
import com.jxfs.control.IJxfsBaseControl;
import com.jxfs.control.ptr.IJxfsPrinterConst;
import com.jxfs.control.ptr.JxfsDocumentPrinter;
import com.jxfs.events.IJxfsOperationCompleteListener;
import com.jxfs.events.IJxfsStatusListener;
import com.jxfs.events.JxfsException;
import com.jxfs.events.JxfsOperationCompleteEvent;
import com.jxfs.general.IJxfsConst;


/**
 * DEMO CLASS FOR DOCUMENT
 * 	1. Open Device
 *  2. Print form
 *  3. Eject
 *  4. DirectIO
 *  5. Close Device
 *  6. Deregister Device 
 */
public class JxfsDocumentPtrDemoDirectIO extends JxfsBasicDemo implements IJxfsConst, IJxfsPrinterConst, IJxfsOperationCompleteListener, IJxfsStatusListener  {

	private final static String DEMO_NAME = "Document Printer Demo";
	private final static String DEMO_DESCRIPTION = "Executes the following commands on the Document System Printer:\n"+
													"\t1. Open Device\n" +
													"\t2. DirectIO setPrinter\n" +
													"\t3. DirectIO getMediaTray\n" +
													"\t4. DirectIO setMediaTray\n" +
													"\t5. Close Device\n" +
													"\t6. Deregister";
			
	

	//These constants are used to indicate the next command to execute
	//see runCommands method
	private final static int CMD_OPEN   		= 1;
	private final static int CMD_DIRECTIO_SET_PRINTER	 = 2;	
	private final static int CMD_DIRECTIO_GET_MEDIA_TRAY = 3;	
	private final static int CMD_DIRECTIO_SET_MEDIA_TRAY = 4;	
	private final static int CMD_CLOSE  		= 5;
	private final static int CMD_DEREGISTER 	= 6;
	
	//In case of an error, we will execute a close and the
	//demo will end
	private final static int CMD_ERROR  		= CMD_CLOSE;
	private final static int CMD_END			= -1;


	//The Document Control
	private JxfsDocumentPrinter ptr_;
	
	//
	public static void main( String[] args) {
		new JxfsDocumentPtrDemoDirectIO( JxfsDemoService.getInitString()).startDemo();
		System.out.println( "<<<<< JXFS shutdown >>>>>");
    	shutdown();
    	System.exit(0);
	}
	
	/**
	 * This default constructor will use the default initialization string
	 * for the J/XFS Manager (JxfsDemoService.INIT_STRING).
	 * If you want to use the Dynasty Device Manager, you just have to
	 * change the constructor of JxfsDemoService to this:
	 * 
	 * protected JxfsDemoService(){
	 *	initString_ = INIT_STRING_DDM;
	 * }
	 */
	public JxfsDocumentPtrDemoDirectIO() {
		super();
	}
	
	/**
	 * Used only for the main method of this class, where you
	 * can specify the initialization string for the J/XFS Manager or 
	 * Dynasty Device Manager.
	 * @param initString
	 */
	public JxfsDocumentPtrDemoDirectIO( String initString){
		super( initString);
	}

    //
    public String getDemoName() {
		return DEMO_NAME;
	}
	
    //
	public String getDemoDescription() {
		return DEMO_DESCRIPTION;
	}
	
	/**
	 * As first step, we have to check, if we have already obtained
	 * an instance of the J/XFS Device Manager. If not so, we have to initialize
	 * it and then we can ask for the device control of the simulator.
	 * 
	 * If you haven't configured a simulator, the first JxfsDocumentPrinter found will be used instead.
	 * 
	 * This procedure is all done in the getDeviceControl method.
	 * 
	 * Once we have got the deviceControl, we have to map it to JxfsDocumentPrinter to 
	 * finally run the commands.
	 */
	public void startDemo() {
		IJxfsBaseControl deviceControl = getDeviceControl( "DocumentSystemDefault", JxfsDocumentPrinter.class);
		if( deviceControl != null) {
            deviceControl.addOperationCompleteListener( this);
            deviceControl.addStatusListener( this);
            
        	if( deviceControl instanceof JxfsDocumentPrinter){
        		ptr_ = ( JxfsDocumentPrinter) deviceControl;
            	runCommands();
        	}
		}
	}

	/**
	 * It's just a method to print the event data on console.
	 */
	protected void printEventData(Serializable eventData) {
		System.out.println(  "event.getData(): " + eventData.toString());
	}

	/**
	 * In case that any error occurs, the next step will be closing the device
	 * and end the demo.
	 */
	protected void setError() {
		
		try {
			if( ptr_.getStatus().isOpen()){
				nextCommand_ = CMD_ERROR;
			} else{
				ptr_.deregisterDevice();
				nextCommand_ = CMD_END;
			}
		} catch (JxfsException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * This method is running step by step some of the methods of
	 * the device control. 
	 * 
	 * deregisterDevice() is synchronous and we haven't to wait for the operation complete event. 
	 * After the switch we are calling the method to wait for the operation complete,
	 * so for all synchronous methods, we have to use "continue" to avoid 
	 * that application hangs, waiting for a operation complete event, that
	 * doesn't exist.
	 * 
	 */
	private void runCommands() {
		nextCommand_ = CMD_OPEN;
		while( nextCommand_ != CMD_END) {
			DtgJxfsDirectIOParameter DIOparameters = null;
			try {
				switch( nextCommand_) {
					case CMD_OPEN:
						identificationID_ = ptr_.open();
						 ptr_.removeStatusListener( this);
					break;
					case CMD_DIRECTIO_SET_PRINTER:
						DIOparameters = new DtgJxfsDirectIOParameter();
						DIOparameters.put("PrinterName", "PrimoPDF");
						identificationID_ = ptr_.directIO( DtgJxfsPrinterConst.DTG_JXFS_PTR_DIO_SET_PRINTERNAME, DIOparameters);
					break;
					case CMD_DIRECTIO_GET_MEDIA_TRAY:
						identificationID_ = ptr_.directIO( DtgJxfsPrinterConst.DTG_JXFS_PTR_DIO_GET_SUPPORTED_MEDIATRAY, null);
					break;
					case CMD_DIRECTIO_SET_MEDIA_TRAY:
						DIOparameters = new DtgJxfsDirectIOParameter();
						DIOparameters.put("MediaTray", "MAIN");
						identificationID_ = ptr_.directIO( DtgJxfsPrinterConst.DTG_JXFS_PTR_DIO_SET_MEDIATRAY, DIOparameters);
					break;
					case CMD_CLOSE:
						identificationID_ = ptr_.close();
					break;
					case CMD_DEREGISTER:
						ptr_.deregisterDevice();
				    	nextCommand_ = CMD_END;
					continue;
				}
				
				waitForOce();
		    } catch( JxfsException e){
		    	int errorCode = e.getErrorCode();
				   
		    	System.out.println( "JxfsException: " + errorCode + " = " + 
		    			DtgJxfsObjectToStringResolver.getOperationCompleteIdStringFromObject( ptr_, errorCode));

		    	setError();
		    }
		}
	}
    
    /**
     * Receives a J/XFS Operation Complete Event, shows a properly message on the user interface 
     * and notifies the waiting thread, about the oce arrival.
     *  
     * @param event a <code>JxfsOperationCompleteEvent</code>.
     */
    public void operationCompleteOccurred( JxfsOperationCompleteEvent event)
    {
    	super.operationCompleteOccurred(event);

    	if (JXFSDIRECTIO_OFFSET == event.getOperationID())
    	{
    		if (null == event.getData()) {
    			System.out.println( "    directIO parameter            null");
    		}
    		else {
    			DtgJxfsDirectIOParameter parameter = (DtgJxfsDirectIOParameter)event.getData();
    			Hashtable table = parameter.getAll();
    			Iterator it = table.keySet().iterator();
    			while (it.hasNext()) {
    				String key = (String)it.next();
        			System.out.println( "    directIO parameter            " + key + " = " + table.get(key));    				
    			}
    		}
    	}
    	
    }
}
