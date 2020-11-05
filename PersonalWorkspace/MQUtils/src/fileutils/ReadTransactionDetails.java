package fileutils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadTransactionDetails {

    public static String AMOUNT;

    public static String ACCOUNTS_FILE_NAME_FOR_DD;

    public static String ACCOUNTS_FILE_NAME_FOR_ATM;
    /**
     * @param args
     */
    static {
        Properties props = new Properties();
        try {
            props.load(new FileInputStream("Transaction.properties"));
            AMOUNT = props.getProperty("AMOUNT");
            ACCOUNTS_FILE_NAME_FOR_DD = props.getProperty("ACCOUNTS_FILE_NAME_FOR_DD");
            ACCOUNTS_FILE_NAME_FOR_ATM = props.getProperty("ACCOUNTS_FILE_NAME_FOR_ATM");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Problem in loading QueueManager.properties file");
        }
    }

    public static void main(String[] args) {
    }
}
