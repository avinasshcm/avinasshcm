package fileutils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadQueueManagerDetails {
	public static String DC_QM_HOSTNAME;
	public static String DC_QM_NAME;
	public static String DC_QM_PORT;
	public static String DC_QM_CHANNEL;
	public static String DC_QM_USER;
	public static String DC_QM_PASSWORD;
	public static String ATM_QM_HOSTNAME;
	public static String ATM_QM_NAME;
	public static String ATM_QM_PORT;
	public static String ATM_QM_CHANNEL;
	public static String ATM_QM_USER;
	public static String ATM_QM_PASSWORD;
	public static String ATM_CASH_QUEUE_NAME;
	public static String DC_ACCTFR_QUEUE_NAME;
	public static String SEPA_TFR_QUEUE_NAME;
	public static int MESSAGE_FEEDER_DELAY_IN_MILLIS;
	public static String RUN_NAME;
	/**
	 * @param args
	 */
	static {
		// create an instance of properties class
		Properties props = new Properties();
		// try retrieve data from file
		try {
			props.load(new FileInputStream("QMGR.properties"));
			DC_QM_HOSTNAME = props.getProperty("DC_QM_HOSTNAME");
			DC_QM_NAME = props.getProperty("DC_QM_NAME");
			DC_QM_PORT = props.getProperty("DC_QM_PORT");
			DC_QM_CHANNEL = props.getProperty("DC_QM_CHANNEL");
			DC_QM_USER = props.getProperty("DC_QM_USER");
			DC_QM_PASSWORD = props.getProperty("DC_QM_PASSWORD");
			//
			DC_ACCTFR_QUEUE_NAME = props.getProperty("DC_ACCTFR_QUEUE_NAME");
			//
			ATM_QM_HOSTNAME = props.getProperty("ATM_QM_HOSTNAME");
			ATM_QM_NAME = props.getProperty("ATM_QM_NAME");
			ATM_QM_PORT = props.getProperty("ATM_QM_PORT");
			ATM_QM_CHANNEL = props.getProperty("ATM_QM_CHANNEL");
			ATM_QM_USER = props.getProperty("ATM_QM_USER");
			ATM_QM_PASSWORD = props.getProperty("ATM_QM_PASSWORD");
			//
			ATM_CASH_QUEUE_NAME = props.getProperty("ATM_CASH_QUEUE_NAME");
			SEPA_TFR_QUEUE_NAME = props.getProperty("SEPA_TFR_QUEUE_NAME");
			MESSAGE_FEEDER_DELAY_IN_MILLIS = Integer.parseInt(props.getProperty("MESSAGE_FEEDER_DELAY_IN_MILLIS"));
			RUN_NAME = props.getProperty("RUN_NAME");
		}
		// catch exception in case properties file does not exist
		catch (IOException e) {
			e.printStackTrace();
			System.err.println("Problem in loading QMGR.properties file");
		}
	}

	public static void main(String[] args) {
	}
}
