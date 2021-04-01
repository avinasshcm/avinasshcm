package fileutils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadQueueManagerDetails {
	public static String QM_HOSTNAME;
	public static String QM_NAME;
	public static String QM_PORT;
	public static String QM_CHANNEL;
	public static String QM_USER;
	public static String QM_PASSWORD;
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
			QM_HOSTNAME = props.getProperty("QM_HOSTNAME");
			QM_NAME = props.getProperty("QM_NAME");
			QM_PORT = props.getProperty("QM_PORT");
			QM_CHANNEL = props.getProperty("QM_CHANNEL");
			QM_USER = props.getProperty("QM_USER");
			QM_PASSWORD = props.getProperty("QM_PASSWORD");
			ATM_QM_HOSTNAME = props.getProperty("ATM_QM_HOSTNAME");
			ATM_QM_NAME = props.getProperty("ATM_QM_NAME");
			ATM_QM_PORT = props.getProperty("ATM_QM_PORT");
			ATM_QM_CHANNEL = props.getProperty("ATM_QM_CHANNEL");
			ATM_QM_USER = props.getProperty("ATM_QM_USER");
			ATM_QM_PASSWORD = props.getProperty("ATM_QM_PASSWORD");
			ATM_CASH_QUEUE_NAME = props.getProperty("ATM_CASH_QUEUE_NAME");
			DC_ACCTFR_QUEUE_NAME = props.getProperty("DC_ACCTFR_QUEUE_NAME");
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
