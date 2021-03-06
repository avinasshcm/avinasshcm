package com.misys;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class ReadPropertyFile {

    public static String EXCEL_FILE_NAME;

    public static String BANK_REPOSITORY_PATH;

    public static String READ_REPOSITORY_PATH;

    public static String PASSBOOK_PRINTER_NAME;

    public static String DOCUMENT_PRINTER_NAME;

    public static String DOCUMENT_PRINTER_PREFIX;

    public static String PASSBOOK_PRINTER_PREFIX;

    public static String skipAdvice;

    public static String skipPassbook;

    private static final Logger LOGGER = Logger.getLogger(ReadPropertyFile.class.getName());
    /**
     * @param args
     */
    static {
        // create an instance of properties class
        Properties props = new Properties();
        // try retrieve data from file
        try {
            props.load(new FileInputStream("config.properties"));
            EXCEL_FILE_NAME = props.getProperty("EXCEL_FILE_NAME");
            BANK_REPOSITORY_PATH = props.getProperty("BANK_REPOSITORY_PATH");
            READ_REPOSITORY_PATH = props.getProperty("READ_REPOSITORY_PATH");
            PASSBOOK_PRINTER_NAME = props.getProperty("PASSBOOK_PRINTER_NAME");
            DOCUMENT_PRINTER_NAME = props.getProperty("DOCUMENT_PRINTER_NAME");
            DOCUMENT_PRINTER_PREFIX = props.getProperty("docPrinterPrefix");
            PASSBOOK_PRINTER_PREFIX = props.getProperty("passPrinterPrefix");
            skipPassbook = props.getProperty("skipPassbook");
            skipAdvice = props.getProperty("skipAdvice");
        }
        // catch exception in case properties file does not exist
        catch (IOException e) {
            e.printStackTrace();
            LOGGER.severe("Problem in loading build.properties file");
        }
    }

    public static void main(String[] args) {
    }
}
