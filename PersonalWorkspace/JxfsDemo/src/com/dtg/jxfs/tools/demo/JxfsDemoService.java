package com.dtg.jxfs.tools.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;

import com.jxfs.control.IJxfsBaseControl;
import com.jxfs.events.JxfsException;
import com.jxfs.general.JxfsDeviceInformation;
import com.jxfs.general.JxfsDeviceManager;
import com.jxfs.general.IJxfsConst;

/**
 * This abstract class handles the JxfsDeviceManager instance.
 *
 */
public abstract class JxfsDemoService {
	//protected final static String INIT_STRING = "com.jxfs.forum.communication.local.SpecificDeviceManagerLOCAL,ws1,DynastyTest,./Server/Repository/Read.repository";
	//protected final static String INIT_RMI_STRING = "com.jxfs.forum.communication.rmi.SpecificDeviceManagerRMI,ws1,DynastyTest,2006;localhost";
	protected final static String INIT_STRING_DDM = "com.jxfs.forum.communication.rmi.SpecificDeviceManagerRMI,RmiPort=2009,RmiPortFirewall=0,RmiPortRank=0,Application=DynastyTest,Repository=D:/Essence/Repository/Misys.repository,MasterRepository=D:/Essence/Repository/Read.repository,MasterCopyRepository=C:/DDSS/Workstations/master_copy.repository,LookupByIP=false,DomainHostNames=false,NetbiosName=false,Traces=false,User=,Password=,TimeOut=,ProxyUser=,ProxyPassword=,ProxyHost=,ProxyPort=,ProxyDomain=,";
	private static String initString_ = null;
	
	private static JxfsDeviceManager jxfsDM_;
	
	/**
	 * If the initString is not set, the user will be ask to type the J/XFS Device Manager
	 * init string or select the default value.
	 * @return init string set by the user
	 */
	protected final static String getInitString() {
		if( initString_ == null) {
			initString_ = JxfsDemoService.INIT_STRING_DDM;
			
            String line = getResponseStr( "Please type J/XFS Device Manager init string..." +
            		"\nPress ENTER to use default value: " + initString_);
            if( line.length() > 0) {
            	initString_ = line;
            }
		}
		
		return initString_;
	}
	
	protected static String getResponseStr(String question)
	{
		String sResp = null;		
		try 
		{
			if ((null != question)){
				System.out.println( question);
			}
			System.out.print ("> ");			
			BufferedReader reader = new BufferedReader( new InputStreamReader( System.in));
			sResp = reader.readLine();
			if (null != sResp) {
				sResp = sResp.trim();
			}
		}
		catch (Exception ex) 
		{
			ex.printStackTrace();
			sResp = null;
		}		
		return sResp;
	}
	
	/**
	 * If the device manager isn't set, the reference is obtained and initialized. 
	 * (Init can be done only once)
	 * @return initialized device manager
	 */
	protected final static JxfsDeviceManager getDeviceManager(){
		// init JXFS DM
		try {
			if( jxfsDM_ == null){
				jxfsDM_ = JxfsDeviceManager.getReference();            
				jxfsDM_.initialize( getInitString());
			}
		} catch(JxfsException e) {
			e.printStackTrace();
		}
		return jxfsDM_;
	}
	
	/**
	 * Executes a shutdown on the device manager, before application is ended.
	 */
	protected final static void shutdown(){		
		if( jxfsDM_ != null){
			jxfsDM_.shutdown();
		}
		jxfsDM_ = null;
	}
	
	protected JxfsDemoService(){
		initString_ = INIT_STRING_DDM;
	}
	
	protected JxfsDemoService( String initString) {
		initString_ = initString;
	}
	
	/**
	 * Return the device control depending on its device name and if not found on the device class.
	 * @param devName device name you want to get the device control for
	 * @param deviceClass device class you want to get the device control for, 
	 * in case that control for device name is not found.
	 * @return the device control
	 */
	protected IJxfsBaseControl getDeviceControl( String devName, Class deviceClass){
		//simulator
		IJxfsBaseControl deviceControl = null;
		try {
			deviceControl = getDeviceManager().getDevice( devName);
		} catch( JxfsException e){
			System.out.println( devName + " not found, looking for another " + deviceClass.getName());
		}
		
		if( deviceControl == null){			
            Vector devA_ = getDeviceManager().getDeviceListFor( deviceClass, IJxfsConst.JXFS_LEVEL_ALL);
            
            if( devA_.size() > 0) {
            	
                String deviceName =(( JxfsDeviceInformation) devA_.elementAt( 0)).getDeviceName ();

    			// get the JXFS Control
                System.out.println( deviceClass.getName() + ": " + deviceName);
                try {
					deviceControl = getDeviceManager().getDevice( deviceName);
				} catch (JxfsException e) {
					System.out.println( "JxfsException on getDevice( " +  deviceName + " )" );
					e.printStackTrace();
				}
            }
		}
		return deviceControl;
	}
	
	
	public abstract String getDemoName();
	public abstract String getDemoDescription();
	
	public abstract void startDemo();

	
}
