package com.dtg.jxfs.tools.demo;

import java.io.Serializable;
import java.util.ArrayList;

import com.dtg.jxfs.misc.DtgJxfsObjectToStringResolver;
import com.jxfs.events.JxfsException;
import com.jxfs.events.JxfsIntermediateEvent;
import com.jxfs.events.JxfsOperationCompleteEvent;
import com.jxfs.events.JxfsStatusEvent;
import com.jxfs.general.IJxfsConst;

public abstract class JxfsBasicDemo extends JxfsDemoService implements IJxfsConst {
	
	/**
	 * A Thread to wait for the operation complete event.
	 */
	protected Thread			waitingThread_ = new Thread();
	
	/**
	 * Identification id for the asynchronous methods
	 */
	protected int 				identificationID_;
	
	/**
	 * Contains the next command to execute
	 */
	protected int				nextCommand_;
	
	/**
	 * List of already arrived Operation Complete Events
	 */
	private ArrayList			oceList_ = new ArrayList();

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
	protected JxfsBasicDemo(){
		super();
	}
	
	/**
	 * Used only for the main method of this class, where you
	 * can specify the initialization string for the J/XFS Manager or 
	 * Dynasty Device Manager.
	 * @param initString
	 */
	protected JxfsBasicDemo(String initString) {
		super(initString);
	}

	
    /**
     * Receives a J/XFS Status Event and shows a properly message on the user interface.
     * @param event a <code>JxfsStatusEvent</code>.
     */
    public void statusOccurred( JxfsStatusEvent event)
    {
        int status = event.getStatus();
    	
        System.out.println( "\t>>> SE " + event.toString());
        System.out.println( "\t\tstatus  [" + event.getStatus() + "] " 
        		+ DtgJxfsObjectToStringResolver.getStatusIdStringFromObject( event.getSource(), status));
        System.out.println( "\t\tresult  [" + event.getResult() + "] extendedResult [" + event.getExtendedResult() + "]");
        System.out.println( "\t\tdetails [" + event.getDetails() + "]");
    }
    
    /**
     * Receives a J/XFS Intermediate Event and shows a properly message on the user interface.
     * @param event
     */
    public void intermediateOccurred(JxfsIntermediateEvent event) {
    	int operationID = event.getOperationID();
        int reason = event.getReason();

        System.out.println( "\t>>> IE " + event);
        System.out.println( "\t\toperationID      [" + operationID + "] " 
        		+ DtgJxfsObjectToStringResolver.getOperationIdStringFromObject( event.getSource(),  operationID));
        System.out.println( "\t\tidentificationID [" + event.getIdentificationID() + "]");
        System.out.println( "\t\treason           [" +  reason + "] "
        		+ DtgJxfsObjectToStringResolver.getIntermediateIdStringFromObject( event.getSource(), reason));
	}
    
    /**
     * Receives a J/XFS Operation Complete Event, shows a properly message on the user interface 
     * and notifies the waiting thread, about the oce arrival.
     *  
     * @param event a <code>JxfsOperationCompleteEvent</code>.
     */
    public void operationCompleteOccurred( JxfsOperationCompleteEvent event)
    {
    	int operationID = event.getOperationID();
        int result = event.getResult();

        System.out.println( "\t>>> OCE " + event);
        System.out.println( "\t\tevent operationID      [" + operationID + "] " 
        		+ DtgJxfsObjectToStringResolver.getOperationIdStringFromObject( event.getSource(),  operationID));
        System.out.println( "\t\tevent result           [" + result + "] " 
        		+ DtgJxfsObjectToStringResolver.getOperationCompleteIdStringFromObject( event.getSource(),  result));
        System.out.println( "\t\tevent identificationID [" + event.getIdentificationID() + "]");
        System.out.print  ( "\t\tevent data ");
          
          
         
        //add the oce to list  
        oceList_.add( new Integer(event.getIdentificationID()));
        //
		synchronized (waitingThread_) {
	    	if( result == JXFS_RC_SUCCESSFUL) {
	    		nextCommand_++;
	    	} else {
	    		setError();
	    	}
	    	
    		if( event.getData() == null){
    			System.out.println( "null");
    		} else {
    			System.out.println( event.getData().getClass().getName());
    			printEventData( event.getData());
    		}
	
	    	//notify the waiting thread
	    	waitingThread_.notify();
		}
    }
	
    /**
     * Method to wait for the oce.
     */
	protected void waitForOce()
	{
		// check if the oce has already arrived.
		// usually this will only be the case in debug mode
		if (!oceList_.remove(new Integer(identificationID_))) {
			// oce has not arrived, we have to wait for
			try {
				//printingLogHelper.logInfo(LOGGER, "waitForOce waiting started...", String.valueOf(idId));
				synchronized (waitingThread_) {
					waitingThread_.wait(20000);
					if (!oceList_.remove(new Integer(identificationID_))) {
						/*try {
							//ptr_.cancel(identificationID_);
						}
						catch (JxfsException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}*/
					}
				}
				//printingLogHelper.logInfo(LOGGER, "waitForOce waiting ended...", String.valueOf(idId));
			}
			catch (InterruptedException ie) {
				//printingLogHelper.logError(LOGGER, "waitForOce waiting... Interrupted!!!", String.valueOf(idId));
			}
		}
	}
	
	protected abstract void printEventData( Serializable eventData);
	protected abstract void setError();
}
