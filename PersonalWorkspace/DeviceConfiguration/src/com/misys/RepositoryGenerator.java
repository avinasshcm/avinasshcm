package com.misys;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RepositoryGenerator {

    private static final Logger LOGGER = Logger.getLogger(RepositoryGenerator.class.getName());

    private static final String docPrinterPrefix = ReadPropertyFile.DOCUMENT_PRINTER_PREFIX;

    private static final String passPrinterPrefix = ReadPropertyFile.PASSBOOK_PRINTER_PREFIX;

    private static final String DOCUMENT_PRINTER_NAME = ReadPropertyFile.DOCUMENT_PRINTER_NAME;

    private static final String PASSBOOK_PRINTER_NAME = ReadPropertyFile.PASSBOOK_PRINTER_NAME;

    private static final String EXCEL_FILE_NAME = ReadPropertyFile.EXCEL_FILE_NAME;

    private static final String BANK_REPOSITORY_PATH = ReadPropertyFile.BANK_REPOSITORY_PATH;

    private static final String READ_REPOSITORY_PATH = ReadPropertyFile.READ_REPOSITORY_PATH;

    private static final String skipPassbook = ReadPropertyFile.skipPassbook;

    private static final String skipAdvice = ReadPropertyFile.skipAdvice;

    public static void main(String[] args) {
        LOGGER.info("Repository Generation Started");
        try {
            LOGGER.info("Reading File " + EXCEL_FILE_NAME);
            FileInputStream excelFile = new FileInputStream(new File(EXCEL_FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheet("DeviceConfiguration");
            Iterator<Row> iterator = datatypeSheet.iterator();
            int counter = 0;

            PrintWriter out = new PrintWriter(new FileWriter(BANK_REPOSITORY_PATH), true);
            PrintWriter masterOut = new PrintWriter(new FileWriter(READ_REPOSITORY_PATH), true);
            Map<String, String> repos = new HashMap<String, String>();
            // Map<String, String> masterRepos = new HashMap<String, String>();
            String masterRepos = "";
            String masterReposList = "DeviceManager.logicalNames=String,";

            LOGGER.info("skipAdvice : " + skipAdvice);
            LOGGER.info("skipPassbook : " + skipPassbook);
            while (iterator.hasNext()) {

                Row currentRow = iterator.next();
                if (counter > 0) {
                    String branchCode = currentRow.getCell(5).toString();
                    if (branchCode != null && !branchCode.isEmpty())

                    {
                        String docKey = docPrinterPrefix + branchCode;
                        String passbookKey = passPrinterPrefix + branchCode;

                        if (skipAdvice.equalsIgnoreCase("false")) {
                            LOGGER.info("Preparing Advice Printers List : " + docKey);
                            if (repos.containsKey(docKey)) {
                                String contents = repos.get(docKey);
                                contents = contents + DOCUMENT_PRINTER_NAME + "@" + currentRow.getCell(1).toString() + ",";
                                repos.put(docKey, contents);

                            } else {
                                repos.put(docKey, "DeviceManager." + docKey + ".list=String,");
                                String contents = repos.get(docKey);
                                contents = contents + DOCUMENT_PRINTER_NAME + "@" + currentRow.getCell(1).toString() + ",";
                                repos.put(docKey, contents);
                                masterReposList = masterReposList + docKey + ",";
                                masterRepos = masterRepos + "DeviceManager." + docKey + ".current=String," + DOCUMENT_PRINTER_NAME + "\n";
                                masterRepos = masterRepos + "DeviceManager." + docKey + ".list=String," + DOCUMENT_PRINTER_NAME + ",\n\n";
                            }
                        }

                        if (skipPassbook.equalsIgnoreCase("false")) {
                            LOGGER.info("Preparing Passbook Printers List : " + passbookKey);
                            if (repos.containsKey(passbookKey)) {
                                String contents = repos.get(passbookKey);
                                contents = contents + PASSBOOK_PRINTER_NAME + "@" + currentRow.getCell(2).toString() + ",";
                                repos.put(passbookKey, contents);

                            } else {
                                repos.put(passbookKey, "DeviceManager." + passbookKey + ".list=String,");
                                String contents = repos.get(passbookKey);
                                contents = contents + PASSBOOK_PRINTER_NAME + "@" + currentRow.getCell(2).toString() + ",";
                                repos.put(passbookKey, contents);
                                masterReposList = masterReposList + passbookKey + ",";
                                masterRepos =
                                    masterRepos + "DeviceManager." + passbookKey + ".current=String," + PASSBOOK_PRINTER_NAME + "\n";
                                masterRepos =
                                    masterRepos + "DeviceManager." + passbookKey + ".list=String," + PASSBOOK_PRINTER_NAME + ",\n\n";
                            }
                        }

                        // DeviceManager.PR2_00000001.current=String,PassbookOlivetti_PR2
                        // DeviceManager.PR2_00000001.list=String,PassbookOlivetti_PR2,

                        // DeviceManager.logicalNames=String,PIN,ALM,SIU,TIO,CDR,PR2_00000001,PTR_0053,PTR1_0053,PTR_0777,PTR_0999,PTR_0063,PTR1_0063,PTR_0001,PTR1_0001,PTR_0666,PTR1_0666,PTR_0064,PTR1_0064,PTR_0065,PTR1_0065,PTR_0055,PTR1_0055,PTR_0013,PTR1_0013,PTR_0034,PTR1_0034,PTR_0014,PTR1_0014,PTR_0025,PTR1_0025,PTR_0022,PTR1_0022,PTR_0009,PTR1_0009,PTR_0003,PTR1_0003,PTR_0059,PTR1_0059,PTR_0058,PTR1_0058,PTR_0020,PTR1_0020,PTR_0027,PTR1_0027,PTR_0038,PTR1_0038,PTR_0021,PTR1_0021,PTR_0067,PTR1_0067,PTR_0017,PTR1_0017,PTR_0008,PTR1_0008,PTR_0026,PTR1_0026,PTR_0068,PTR1_0068,PTR_0039,PTR1_0039,PTR_0041,PTR1_0041,PTR_0018,PTR1_0018,PTR_0002,PTR1_0002,PTR_0054,PTR1_0054,PTR_0033,PTR1_0033,PTR_0057,PTR1_0057,PTR_0069,PTR1_0069,PTR_0070,PTR1_0070,PTR_0071,PTR1_0071,PTR_0048,PTR1_0048,PTR_0072,PTR1_0072,DSD,PR2,

                    }
                }
                counter++;
                // System.out.println(counter);

            }
            printMap(repos, out);
            LOGGER.info("Writing File " + READ_REPOSITORY_PATH);
            masterOut.println(masterRepos);
            masterOut.println(masterReposList);

            LOGGER.info("Repository Generation Completed");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printMap(Map mp, PrintWriter out) {
        Iterator it = mp.entrySet().iterator();
        LOGGER.info("Writing File " + BANK_REPOSITORY_PATH);
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            // out.println(pair.getKey() + " = " + pair.getValue());
            out.println(pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }
    }

    private static String generateGUID() {
        return UUID.randomUUID().toString().replace("-", "").substring(0, 16);
    }

    private static String generateTimeStamp() {
        LocalDateTime ldt = LocalDateTime.now();
        return ldt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
    }
}