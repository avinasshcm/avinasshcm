package com.dtg.jxfs.tools.demo.clients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.Vector;

import com.dtg.jxfs.tools.demo.JxfsDemoService;
import com.jxfs.control.IJxfsBaseControl;
import com.jxfs.control.ptr.IJxfsPrinterConst;
import com.jxfs.control.ptr.JxfsDocumentPrinter;
import com.jxfs.events.IJxfsOperationCompleteListener;
import com.jxfs.events.IJxfsStatusListener;
import com.jxfs.events.JxfsException;
import com.jxfs.events.JxfsOperationCompleteEvent;
import com.jxfs.events.JxfsStatusEvent;
import com.jxfs.general.IJxfsConst;
import com.jxfs.general.JxfsDeviceInformation;
import com.jxfs.general.JxfsDeviceManager;

public class JxfsPtrDemoLoopForMisys extends JxfsDemoService implements IJxfsConst, IJxfsPrinterConst, IJxfsOperationCompleteListener, IJxfsStatusListener  {

	private final static String DEMO_NAME = "Printer Demo";
	private final static String DEMO_DESCRIPTION = "Executes the following commands on the Dynasty ATM Simulator:\n"+
													"\t1. Open Device\n" +
													"\t2. Print form\n" +
													"\t3. Eject\n" +
													"\t4. Close Device\n";
			
	
	private final static int APP_END	= -2;
	private final static int APP_BEGIN  = -1;
	private final static int APP_OPEN   = 0;
	private final static int APP_CLOSE  = 1;
	private final static int APP_ERROR  = 2;
	
	int appStatus_ = APP_BEGIN;
	ApplicationFlow	appFlow_;
		
	JxfsDeviceManager jxfsDM_;
	JxfsDocumentPrinter printer_;
	
	int identificationID_;
	
	boolean isDone_ = false;
	private BufferedReader bufIn_ = new BufferedReader(new InputStreamReader(System.in));
	
	
	public JxfsPtrDemoLoopForMisys() {};
	
	//
	public static void main( String[] args) {
//		new JxfsPtrDemoLoopForMisys( JxfsDemoService.getInitString());
		new JxfsPtrDemoLoopForMisys( JxfsDemoService.INIT_STRING_DDM);
	}
	
	private JxfsPtrDemoLoopForMisys( String initString)
	{
		try {
			
		String restartDM = "y";
		while(restartDM.equals("y")) {
			// init JXFS DM
			try {
				jxfsDM_ = JxfsDeviceManager.getReference();
            
				jxfsDM_.initialize( initString);
			} catch(JxfsException e) {
				System.out.println("J/XFS device manager already initialized");
			}
			
		
            String press = bufIn_.readLine();
            
            Vector documentPrintersA_ = jxfsDM_.getDeviceListFor( JxfsDocumentPrinter.class, JXFS_LEVEL_ALL);
            
            if( documentPrintersA_.size() > 0) {
                String deviceName =(( JxfsDeviceInformation) documentPrintersA_.elementAt( 0)).getDeviceName ();

    			
                
                String option = "y";
                
                while(option.equals("y")) {
	                for(int i=0;i<100;i++) {
	                	appStatus_ = APP_BEGIN;
	                	
	                	IJxfsBaseControl deviceControl = jxfsDM_.getDevice( deviceName);
	                	deviceControl.addOperationCompleteListener( this);
	                	deviceControl.addStatusListener( this);
	                
	                	if( deviceControl instanceof JxfsDocumentPrinter){
	                		printer_ = ( JxfsDocumentPrinter)deviceControl;
	                		appFlow_ = new ApplicationFlow(this, ( JxfsDocumentPrinter)deviceControl);
	                		appFlow_.start();
	                	
	                		while(!this.isDone()) {
	                			try {
	                				Thread.sleep(100);
	                			} catch (InterruptedException e) {
								// 	TODO Auto-generated catch block
	                				e.printStackTrace();
	                			}
	                		}
	                		System.out.println("Iteration " + i + ": Completed");
	                	   	setDone(false);
	                	}
	                }
	            
		            System.out.println("Do you want to run again the test?: ");
		            try {
						option = bufIn_.readLine();
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                }
                System.out.println("Shutting down jxfsDM");
                jxfsDM_.shutdown();
            }
            System.out.println("Do you want to restart the DDM again?: ");
            try {
				restartDM = bufIn_.readLine();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
		}
		
		
            
        } catch( JxfsException e){
        	System.err.println( e.toString());
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setDone(boolean done) {
		isDone_ = done;
	}
	
	public boolean isDone() {
		return isDone_;
	}
	
	private class ApplicationFlow extends Thread {
		private JxfsPtrDemoLoopForMisys demoProgram_ = null;
//		JxfsDocumentPrinter printer_;
		
		public ApplicationFlow(JxfsPtrDemoLoopForMisys demo, JxfsDocumentPrinter printer) {
			demoProgram_ = demo;
//			printer_ = printer;
		}

		public void run() {
			while( appStatus_ != APP_END) {
				try {
					switch( appStatus_) {
						case APP_BEGIN:
							identificationID_ = printer_.open();
						break;
						case APP_OPEN:
						
							identificationID_ = printer_.close();
						break;
						case APP_CLOSE:
						case APP_ERROR:
							System.out.println( "<<<<< JXFS shutdown >>>>>");
//					    	
							printer_.removeOperationCompleteListener(demoProgram_);
							printer_.removeStatusListener(demoProgram_);
							printer_.deregisterDevice();
					    	appStatus_ = APP_END;
					    	demoProgram_.setDone(true);
					    	
						break;
					}

					if( appStatus_ != APP_END) {
				        System.out.println( appStatus_ + " wait for OCE ...");
						waitForOce();
					}
			    } catch( JxfsException e){
			    	System.err.println( e.toString());
					appStatus_ = APP_ERROR;
			    }
			}
		}
	}
	
    /**
     * Receives a J/XFS Status Event and shows a properly message on the user interface.
     * @param event a <code>JxfsStatusEvent</code>.
     */
    public void statusOccurred( JxfsStatusEvent event)
    {
        int status = event.getStatus();
    	
        System.out.println( "JxfsStatusEvent >>> " + event.toString());
        System.out.println( "    status:  " + event.getStatus() + " - " + getFieldName( status, "JXFS_S_"));
        System.out.println( "    result:  " + event.getResult() + " (" + event.getExtendedResult() + ")");
        System.out.println( "    details: " + event.getDetails());
       
    }

    /**
     * Receives a J/XFS Operation Complete Event and updates the values of
     * {@link #Return} and {@link #ExecuteOK} properly and sets
     * {@link #LockOperationComplete} to <code>false</code>.
     * @param event a <code>JxfsOperationCompleteEvent</code>.
     */
    public void operationCompleteOccurred( JxfsOperationCompleteEvent event)
    {
    	int operationID = event.getOperationID();
        int result = event.getResult();

        System.out.println( "OCE " + event);
        System.out.println( "    event operationID             [" + operationID + "]  " + getFieldName( operationID, "JXFS_O_"));
        System.out.println( "    event result                  [" + result + "]  " + getFieldName( result, "JXFS_RC_"));
        System.out.println( "    event identificationID        [" + event.getIdentificationID() + "]");
        System.out.println( "    last command identificationID [" + identificationID_ + "]");
        
        //
		synchronized (appFlow_) {
	    	if( result == JXFS_RC_SUCCESSFUL) {
	    		switch( operationID) {
	    			case JXFS_O_OPEN:
	                    System.out.println( "    >>> JXFS_O_OPEN " + event.toString());
	    				appStatus_ = APP_OPEN;
	    				break;
	
	    			
	    			case JXFS_O_CLOSE:
	                    System.out.println( "    >>> JXFS_O_CLOSE " + event.toString());
	    				appStatus_ = APP_CLOSE;
	    				break;
	    		}
	    	} else {
	    		System.err.println( "    >>> " + event.toString());
				appStatus_ = APP_ERROR;
	    	}
	
	    	//
			appFlow_.notify();
		}
    }
    
	public void waitForOce()
	{
		try {
			synchronized (appFlow_) {
				appFlow_.wait(1000);
			}
		} catch( InterruptedException ie) {
	    	System.err.println( ie.toString());
		}
	}
    

    //
    /**
     * return the field name of the specified printer constant
     * @param value		constant value 
     * @param prefix	constant prefix 
     * @return
     */
    private final String getFieldName( int value, String prefix)
    {
    	try {
        	// we know that it would be a printer related status so ... 
    		Field[] aFields = IJxfsPrinterConst.class.getFields();
    		
    		for (int i = 0; i < aFields.length; i++) {
    			if ( aFields[ i].getType() == int.class 
    					&& aFields[i].getInt( this) == value 
    					// usually constants are unique but in some cases the same constant value is used in different 'environments'.
    					// by example 0 will match JXFS_S_BIN_OK and JXFS_RC_SUCCESSFUL
    					&& aFields[ i].getName().startsWith( prefix)) {
    				
    				return aFields[ i].getName();
    			}
			}
    	} catch( Exception se) {
    	}
    	
    	return "???";
    }
    
    //
    public String getDemoName() {
		return DEMO_NAME;
	}
	
    //
	public String getDemoDescription() {
		return DEMO_DESCRIPTION;
	}
	
	//
	public void startDemo() {
		new JxfsPtrDemoLoopForMisys(INIT_STRING_DDM);
	}	
    
}
