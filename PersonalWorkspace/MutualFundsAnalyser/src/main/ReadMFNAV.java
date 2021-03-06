package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

import logger.utils.LogHelper;

import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import pojo.FieldsDescriptor;
import utils.MutualFundUtils;
import xml.Global;
import xml.Item;
import xml.StaXParser;
import constants.ReadConstants;
import excel.utils.ExcelHelper;
import file.utils.FileUtilsHelper;

public class ReadMFNAV {

    private static final String CONFIG_XML = "MFAnalysis.xml";

    private static final int ISIN_COLUMN = 3;

    private static final String MF_SUMMARY_SHEET = "Summary";

    private static final String MF_HISTORY_SHEET = "Historical";

    private static final Logger LOGGER = Logger.getLogger(ReadMFNAV.class.getName());

    private static int myStockListSize = 0;

    public static void main(String[] args) {

        LOGGER.addHandler(LogHelper.getLogHandler());
        StaXParser read = new StaXParser();
        Global global = read.readConfig(CONFIG_XML);

        String historicDataLocation = global.getFILEPATH() + global.getHistoricData();
        String histFileName = historicDataLocation + "/" + MutualFundUtils.getDate(Calendar.getInstance(), "yyyyMMdd") + ".txt";
        File f = new File(histFileName);

        String AMFIINDIA = global.getAMFIINDIAURL();
        LOGGER.info("Fetching data from        : " + AMFIINDIA);
        String result = getUrlContents(AMFIINDIA);
        FileUtilsHelper.writeToFile(histFileName, result);
        LOGGER.info("Storing Data in File      : " + f.getAbsolutePath());
        HashMap<String, FieldsDescriptor> hm = FileUtilsHelper.readFileAsString(histFileName);

        for (Item item : global.getItem()) {
            analyzeMF(global.getFILEPATH(), item, hm);
        }
        LOGGER.info("Completed\n\n\n");

    }

    private static void analyzeMF(String FILE_PATH, Item item, HashMap<String, FieldsDescriptor> hm) {
        String NAME = item.getName();
        String FILE_NAME = item.getExcelName();
        String history_Prop_File = item.getHistoryPropFileName();

        LOGGER.info("\n\nWorking on : " + NAME + " : " + FILE_NAME + " : " + history_Prop_File);

        String FILE_NAME_PATH = FILE_PATH + FILE_NAME;
        String date = updateSummaryPage(hm, FILE_NAME_PATH);

        date = MutualFundUtils.changeDateFormat(date, "dd-MMM-yyyy", "dd-MM-yyyy");
        boolean updated = false;

        HashMap<String, Double> xirrMap = calculateXIRR(date, FILE_NAME_PATH);
        updateXIRR(xirrMap, FILE_NAME_PATH);

        updated = checkIfHistoryUpdated(date, updated, FILE_NAME_PATH, history_Prop_File);

        if (updated) {
            ExcelHelper.updateHistoryNumberInFile(date, history_Prop_File);
            LOGGER.info("Updated History details in txt File for " + FILE_NAME_PATH);
        } else {
            LOGGER.info("Skipping History details in txt File for " + FILE_NAME_PATH);
        }
    }

    private static boolean checkIfHistoryUpdated(String date, boolean updated, String FILE_NAME_PATH, String history_Prop_File) {
        LOGGER.info("Checking History Data");
        try {
            FileInputStream file = new FileInputStream(new File(FILE_NAME_PATH));
            XSSFWorkbook yourworkbook = new XSSFWorkbook(file);
            XSSFSheet mfSummarySheet = yourworkbook.getSheet(MF_SUMMARY_SHEET);
            XSSFSheet mfHistorySheet = yourworkbook.getSheet(MF_HISTORY_SHEET);
            updated = ExcelHelper.updateHistory(LOGGER, mfSummarySheet, mfHistorySheet, myStockListSize, date, history_Prop_File);
            XSSFFormulaEvaluator.evaluateAllFormulaCells(yourworkbook);
            file.close();
            // XSSFFormulaEvaluator.evaluateAllFormulaCells(yourworkbook);
            FileOutputStream out = new FileOutputStream(new File(FILE_NAME_PATH));
            yourworkbook.write(out);
            out.close();
        } catch (FileNotFoundException e) {
            LOGGER.severe(e.getLocalizedMessage());
            System.exit(0);
        } catch (IOException e) {
            LOGGER.severe(e.getLocalizedMessage());
            System.exit(0);
        }
        LOGGER.info("Checking History Completed");
        return updated;
    }

    private static HashMap<String, Double> calculateXIRR(String date, String FILE_NAME_PATH) {
        LOGGER.info("Calculating XIRR Started");
        HashMap<String, Double> xirrMap = new HashMap<String, Double>();
        try {
            FileInputStream file = new FileInputStream(new File(FILE_NAME_PATH));
            XSSFWorkbook yourworkbook = new XSSFWorkbook(file);
            XSSFSheet mfSummarySheet = yourworkbook.getSheet(MF_SUMMARY_SHEET);
            // XSSFSheet mfHistorySheet = yourworkbook.getSheet(MF_HISTORY_SHEET);
            xirrMap = ExcelHelper.updateXIRR(LOGGER, date, yourworkbook, mfSummarySheet, /* mfHistorySheet, */myStockListSize);
            XSSFFormulaEvaluator.evaluateAllFormulaCells(yourworkbook);
            file.close();
            // XSSFFormulaEvaluator.evaluateAllFormulaCells(yourworkbook);
            FileOutputStream out = new FileOutputStream(new File(FILE_NAME_PATH));
            yourworkbook.write(out);
            out.close();
        } catch (FileNotFoundException e) {
            LOGGER.severe(e.getLocalizedMessage());
            System.exit(0);
        } catch (IOException e) {
            LOGGER.severe(e.getLocalizedMessage());
            System.exit(0);
        }
        LOGGER.info("Calculating XIRR Completed");
        return xirrMap;
    }

    private static String getUrlContents(String theUrl) {
        StringBuilder content = new StringBuilder();
        try {
            URL url = new URL(theUrl);
            URLConnection urlConnection = url.openConnection();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                content.append(line + "\n");
            }
            bufferedReader.close();
        } catch (Exception e) {
            LOGGER.severe("Unable to access the URL");
            System.exit(0);
        }
        return content.toString();
    }

    private static String updateSummaryPage(HashMap<String, FieldsDescriptor> hm, String FILE_NAME_PATH) {
        LOGGER.info("Updating Summary Page");
        String date = "";
        try {
            FileInputStream file = new FileInputStream(new File(FILE_NAME_PATH));
            XSSFWorkbook yourworkbook = new XSSFWorkbook(file);
            XSSFSheet mfSummarySheet = yourworkbook.getSheet(MF_SUMMARY_SHEET);

            String MFID = "";
            int j = 1;

            List<String> myStockList = new ArrayList<String>();
            do {
                MFID = mfSummarySheet.getRow(j).getCell(ISIN_COLUMN).getStringCellValue();
                j++;

                myStockList.add(MFID);
            } while (MFID != null && !MFID.isEmpty());
            myStockListSize = myStockList.size();
            LOGGER.info("\tISIN\t\t\tDate\t\t\t\tNAV\t\tSchemeName");
            for (int i = 0; i < myStockList.size() - 1; i++) {
                FieldsDescriptor fd = null;

                if (hm.containsKey(myStockList.get(i))) {
                    fd = hm.get(myStockList.get(i));
                    date = fd.getDate();
                    float nav = Float.valueOf(fd.getNetAssetValue());
                    LOGGER.info(myStockList.get(i) + "\t" + fd.getDate() + "\t" + String.format("%15.5f", nav) + "\t\t"
                        + fd.getScheme_Name());
                    ExcelHelper.updateNAV(mfSummarySheet, i, new Double(fd.getNetAssetValue()));
                }
            }
            file.close();
            XSSFFormulaEvaluator.evaluateAllFormulaCells(yourworkbook);
            FileOutputStream out = new FileOutputStream(new File(FILE_NAME_PATH));
            yourworkbook.write(out);
            out.close();
        } catch (FileNotFoundException e) {
            LOGGER.severe(e.getLocalizedMessage());
            System.exit(0);
        } catch (IOException e) {
            LOGGER.severe(e.getLocalizedMessage());
            System.exit(0);
        }
        LOGGER.info("Updated Summary Page");
        return date;
    }

    private static String updateXIRR(HashMap<String, Double> hm, String FILE_NAME_PATH) {
        // LOGGER.info("Updating XIRR Page");
        String date = "";
        try {
            FileInputStream file = new FileInputStream(new File(FILE_NAME_PATH));
            XSSFWorkbook yourworkbook = new XSSFWorkbook(file);
            XSSFSheet mfSummarySheet = yourworkbook.getSheet(MF_SUMMARY_SHEET);

            String MFID = "";
            int j = 1;
            List<String> myStockList = new ArrayList<String>();
            do {
                MFID = mfSummarySheet.getRow(j).getCell(ISIN_COLUMN).getStringCellValue();
                j++;
                myStockList.add(MFID);
            } while (MFID != null && !MFID.isEmpty());
            myStockListSize = myStockList.size();

            for (int i = 0; i < myStockList.size() - 1; i++) {
                String key = myStockList.get(i);
                double xirr = (hm.get(key) != null) ? hm.get(key) : new Double(0);
                ExcelHelper.updateXIRR(mfSummarySheet, i, xirr);
            }
            ExcelHelper.updateXIRR(mfSummarySheet, myStockList.size() - 1, hm.get("Master"));

            file.close();
            XSSFFormulaEvaluator.evaluateAllFormulaCells(yourworkbook);
            FileOutputStream out = new FileOutputStream(new File(FILE_NAME_PATH));
            yourworkbook.write(out);
            out.close();
        } catch (FileNotFoundException e) {
            LOGGER.severe(e.getLocalizedMessage());
            System.exit(0);
        } catch (IOException e) {
            LOGGER.severe(e.getLocalizedMessage());
            System.exit(0);
        }
        // LOGGER.info("Updated XIRR Page");
        return date;
    }

}
