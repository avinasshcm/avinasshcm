package fileutils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadQueueManagerDetails {

    public static String QM_HOSTNAME;

    public static String QUEUE_MANAGER;

    public static int QM_PORT;

    public static String QM_CHANNEL;

    public static String QM_USER;

    public static String QM_PASSWORD;

    public static String CASHWITH_QUEUE_NAME;

    public static String POSPUR_QUEUE_NAME;

    public static String PAYMENTS_QM_HOSTNAME;

    public static String PAYMENTS_QUEUE_MANAGER;

    public static int PAYMENTS_QM_PORT;

    public static String PAYMENTS_QM_CHANNEL;

    public static String PAYMENTS_QM_USER;

    public static String PAYMENTS_QM_PASSWORD;

    public static String INWARD_DEBIT_HOST_INPUT;

    public static String INWARD_CREDIT_HOST_INPUT;

    /**
     * @param args
     */
    static {
        // create an instance of properties class
        Properties props = new Properties();
        // try retrieve data from file
        try {
            props.load(new FileInputStream("QueueManager.properties"));

            QM_HOSTNAME = props.getProperty("QM_HOSTNAME");
            QUEUE_MANAGER = props.getProperty("QUEUE_MANAGER");
            QM_PORT = Integer.valueOf(props.getProperty("QM_PORT"));
            QM_CHANNEL = props.getProperty("QM_CHANNEL");
            QM_USER = props.getProperty("QM_USER");
            QM_PASSWORD = props.getProperty("QM_PASSWORD");
            CASHWITH_QUEUE_NAME = props.getProperty("CASHWITH_QUEUE_NAME");
            POSPUR_QUEUE_NAME = props.getProperty("POSPUR_QUEUE_NAME");

            PAYMENTS_QM_HOSTNAME = props.getProperty("PAYMENTS_QM_HOSTNAME");
            PAYMENTS_QUEUE_MANAGER = props.getProperty("PAYMENTS_QUEUE_MANAGER");
            PAYMENTS_QM_PORT = Integer.valueOf(props.getProperty("PAYMENTS_QM_PORT"));
            PAYMENTS_QM_CHANNEL = props.getProperty("PAYMENTS_QM_CHANNEL");

            PAYMENTS_QM_PASSWORD = props.getProperty("PAYMENTS_QM_PASSWORD");
            QM_PASSWORD = props.getProperty("QUEUE_PASSWORD");

            INWARD_DEBIT_HOST_INPUT = props.getProperty("INWARD_DIRECT_DEBITS");
            INWARD_CREDIT_HOST_INPUT = props.getProperty("INWARD_CREDIT_TRANSFERS");
        }
        // catch exception in case properties file does not exist
        catch (IOException e) {
            e.printStackTrace();
            System.err.println("Problem in loading QueueManager.properties file");
        }
    }

    public static void main(String[] args) {
    }
}
