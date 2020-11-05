package fileutils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadThreadDetails {

    public static int Number_Of_Threads;

    /**
     * @param args
     */
    static {
        // create an instance of properties class
        Properties props = new Properties();
        // try retrieve data from file
        try {
            props.load(new FileInputStream("Thread.properties"));
            Number_Of_Threads = Integer.valueOf(props.getProperty("NUMBER_OF_THREADS"));
        }
        // catch exception in case properties file does not exist
        catch (IOException e) {
            e.printStackTrace();
            System.err.println("Problem in loading Thread.properties file");
        }
    }

    public static void main(String[] args) {
    }
}
