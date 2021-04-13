package com.dtg.jxfs.tools.demo;

import java.util.Vector;

import com.jxfs.control.IJxfsBaseControl;
import com.jxfs.events.JxfsException;
import com.jxfs.general.IJxfsConst;
import com.jxfs.general.JxfsDeviceInformation;

/**
 * Class to list all devices in the repository 
 *
 */
public class JxfsListDevices extends JxfsDemoService implements IJxfsConst {
	
	private final static String DEMO_NAME = "List Devices";
	private final static String DEMO_DESCRIPTION = "Returns the list of all devices in the repository";

	//
	public static void main( String[] args) {
        new JxfsListDevices( getInitString()).startDemo();
		System.out.println( "<<<<< JXFS shutdown >>>>>");
    	shutdown();
        System.exit(1);
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
	public JxfsListDevices() {
		super();
	}
	
	/**
	 * Used only for the main method of this class, where you
	 * can specify the initialization string for the J/XFS Manager or 
	 * Dynasty Device Manager.
	 * @param initString
	 */
	private JxfsListDevices( String initString)
	{
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
	 * it and then we can ask for the devices of the device manager.
	 */
	public void startDemo() {
		
        //
        System.out.print  ( "J/XFS Device Manager getDeviceList");
        Vector documentPrintersA = getDeviceManager().getDeviceList( JXFS_LEVEL_ALL);
        System.out.println( " > " + documentPrintersA.size() + " devices");
		        
        //
        JxfsDeviceInformation devInfo;
        IJxfsBaseControl deviceControl;
        
        for (int i = 0; i < documentPrintersA.size(); i++) {
        	devInfo = ( JxfsDeviceInformation) documentPrintersA.elementAt( i);

			// get the MSD JXFS Control
            System.out.println( "----------------------------- [" + devInfo.getDeviceName() + "] -----------------------------");
            System.out.println( devInfo.toString());
    		try {
    			deviceControl = getDeviceManager().getDevice( devInfo.getDeviceName());
    			System.out.println( "... " + deviceControl.getStatus().toString());
    		} catch( JxfsException e) {
    			System.out.println( "<<< " + e);
    		}
        }
	}							
}
