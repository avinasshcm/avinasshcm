package com.dtg.jxfs.tools.demo;

import java.io.Serializable;
import java.util.Enumeration;

import com.dtg.jxfs.consts.DtgJxfsCheckReaderConst;
import com.dtg.jxfs.misc.DtgJxfsDirectIOParameter;
import com.dtg.jxfs.misc.DtgJxfsObjectToStringResolver;
import com.jxfs.control.IJxfsBaseControl;
import com.jxfs.control.chk.IJxfsCheckReaderConst;
import com.jxfs.control.chk.JxfsCHKData;
import com.jxfs.control.chk.JxfsCheckReader;
import com.jxfs.control.chk.JxfsComplexCheckReader;
import com.jxfs.events.IJxfsIntermediateListener;
import com.jxfs.events.IJxfsOperationCompleteListener;
import com.jxfs.events.IJxfsStatusListener;
import com.jxfs.events.JxfsException;
import com.jxfs.general.IJxfsConst;

/**
 * DEMO CLASS FOR CHECK
 * 	1. Open Device
 *  2. Read data
 *  3. Read data with image
 *  4. DirectIO
 *  5. Close Device
 *  6. Deregister Device 
 */
public class JxfsCHKDemo extends JxfsBasicDemo implements IJxfsConst, IJxfsCheckReaderConst, IJxfsIntermediateListener, IJxfsOperationCompleteListener, IJxfsStatusListener  {

	private final static String DEMO_NAME = "CHK Demo";
	private final static String DEMO_DESCRIPTION = "Executes the following commands on the Dynasty CHK Simulator:\n"+
													"\t1. Open Device\n" +
													"\t2. Read data\n" +
													"\t3. Read data with image\n" +
													"\t4. DirectIO" +
													"\t5. Close Device\n" +
													"\t6. Deregister Device";
	
	//These constants are used to indicate the next command to execute
	//see runCommands method
	private final static int CMD_OPEN   			= 1;
	private final static int CMD_READ_DATA  		= 2;
	private final static int CMD_READ_DATA_IMAGE  	= 3;
	private final static int CMD_DIRECTIO			= 4;
	private final static int CMD_CLOSE  			= 5;
	private final static int CMD_DEREGISTER  		= 6;
	
	//In case of an error, we will execute a close and the
	//demo will end
	private final static int CMD_ERROR  			= CMD_CLOSE;
	private final static int CMD_END				= -1;
	
	//The Check Control
	private JxfsCheckReader chk_;
	
	public static void main( String[] args) {
		new JxfsCHKDemo( getInitString()).startDemo();
		System.out.println( "<<<<< JXFS shutdown >>>>>");
    	shutdown();
		System.exit( 0);
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
	public JxfsCHKDemo() {
	}
	
	/**
	 * Used only for the main method of this class, where you
	 * can specify the initialization string for the J/XFS Manager or 
	 * Dynasty Device Manager.
	 * @param initString
	 */
	private JxfsCHKDemo( String initString)
	{
		super( initString);
	}

	public String getDemoName() {
		return DEMO_NAME;
	}
	
	public String getDemoDescription() {
		return DEMO_DESCRIPTION;
	}
	
	/**
	 * As first step, we have to check, if we have already obtained
	 * an instance of the J/XFS Device Manager. If not so, we have to initialize
	 * it and then we can ask for the device control of the simulator.
	 * 
	 * If you haven't configured a simulator, the first JxfsComplexCheckReader found will be used instead.
	 * 
	 * This procedure is all done in the getDeviceControl method.
	 * 
	 * Once we have got the deviceControl, we have to map it to JxfsCheckReader to 
	 * finally run the commands.
	 */
	public void startDemo() {
		IJxfsBaseControl deviceControl = getDeviceControl( "CheckScannerDynastySimulator", JxfsComplexCheckReader.class);
		if( deviceControl != null) {
            deviceControl.addOperationCompleteListener( this);
            deviceControl.addStatusListener( this);
            deviceControl.addIntermediateListener( this);
            
        	if( deviceControl instanceof JxfsCheckReader){
        		chk_ = ( JxfsCheckReader) deviceControl;
            	runCommands();
        	}
		}
	}

	/**
	 * It's just a method to print the event data on console.
	 */
	protected void printEventData( Serializable eventData) {
		if( eventData instanceof JxfsCHKData){
	        JxfsCHKData chkData = (JxfsCHKData) eventData;
	        System.out.println("DATA READ: " + chkData.getDebugInfo());
		} else if( eventData instanceof DtgJxfsDirectIOParameter){
			DtgJxfsDirectIOParameter param = (DtgJxfsDirectIOParameter) eventData;
			Enumeration paramKeysEnum = param.getAll().keys();
			String paramKey;
			while( paramKeysEnum.hasMoreElements()){
				paramKey = ( String) paramKeysEnum.nextElement();
				System.out.println( paramKey + ": "  + param.get( paramKey));
			}			
		} else {
			System.out.println(  "event.getData(): " + eventData.toString());
		}
	}

	/**
	 * In case that any error occurs, the next step will be closing the device
	 * and end the demo.
	 */
	protected void setError() {
		
		try {
			if( chk_.getStatus().isOpen()){
				nextCommand_ = CMD_ERROR;
			} else{
				chk_.deregisterDevice();
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
			try {
				switch( nextCommand_) {
					case CMD_OPEN:
						identificationID_ = chk_.open();
					break;
					case CMD_READ_DATA:
						// read data 
						identificationID_ = chk_.readData();
					break;
					case CMD_READ_DATA_IMAGE:
						// read data, with image 
						identificationID_ = chk_.readData( true);
					break;
					case CMD_DIRECTIO:
						DtgJxfsDirectIOParameter param = new DtgJxfsDirectIOParameter();
						param.put( DtgJxfsCheckReaderConst.DIO_PARAM_FORMAT , "JPG");
						identificationID_ = chk_.directIO( DtgJxfsCheckReaderConst.DTG_JXFS_CHK_DIO_GET_ALL_SCAN_DATA, param);
					break;
					case CMD_CLOSE:
						identificationID_ = chk_.close();
					break;
					case CMD_DEREGISTER:
						chk_.deregisterDevice();
				    	nextCommand_ = CMD_END;
					continue;
				}
				waitForOce();
		    } catch( JxfsException e){
		    	int errorCode = e.getErrorCode();
		   
		    	System.out.println( "JxfsException: " + errorCode + " = " + 
		    			DtgJxfsObjectToStringResolver.getOperationCompleteIdStringFromObject( chk_, errorCode));

		    	setError();
		    }
		}
	}

}
