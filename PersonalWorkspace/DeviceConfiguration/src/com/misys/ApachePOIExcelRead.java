package com.misys;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.UUID;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePOIExcelRead {

    // private static final String FILE_NAME = "C:\\Users\\amanjuna\\Desktop\\DeviceConfig.xlsx";

    private static final String FILE_NAME = "C:\\Users\\amanjuna\\Desktop\\Awash_Repos\\Device_Config.xlsx";

    private static final String OUT_FILE_NAME = "C:\\Users\\amanjuna\\Desktop\\Awash_Repos\\CBTB_DEVICECONFIG.sql";

    public static void main(String[] args) {
        try {
            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheet("DeviceConfiguration");
            Iterator<Row> iterator = datatypeSheet.iterator();
            int counter = 0;

            PrintWriter out = new PrintWriter(new FileWriter(OUT_FILE_NAME) , true);

            while (iterator.hasNext()) {
                Row currentRow = iterator.next();
                if (counter > 0) {
                    out.println("INSERT INTO CBS.CBTB_DEVICECONFIG ( CBDEVICECONFIGPK,  CBIPADDRESSBK,  CBDOCUMENTPRNIP,  CBPASSBOOKPRNIP,    CBWKSDESCRIPTION,  CBLASTMAINTAINEDUSER,  CBRECLASTMODIFIEDD,  VERSIONNUM,  CBBRANCHSORTCODE )");
                    out.println("VALUES (  '" + generateGUID() + "',  '" + currentRow.getCell(0) + "',  '" + currentRow.getCell(1)
                        + "',  '" + currentRow.getCell(2) + "',  '" + currentRow.getCell(3) + "',  '" + currentRow.getCell(4)
                        + "',  TIMESTAMP '" + generateTimeStamp() + "',  1,  '" + currentRow.getCell(5) + "' );");
                    out.println();
                    /*
                     * System.out .println(
                     * "INSERT INTO CBS.CBTB_DEVICECONFIG ( CBDEVICECONFIGPK,  CBIPADDRESSBK,  CBDOCUMENTPRNIP,  CBPASSBOOKPRNIP,    CBWKSDESCRIPTION,  CBLASTMAINTAINEDUSER,  CBRECLASTMODIFIEDD,  VERSIONNUM,  CBBRANCHSORTCODE )"
                     * ); System.out.println("VALUES (  '" + generateGUID() + "',  '" + currentRow.getCell(0) + "',  '" +
                     * currentRow.getCell(1) + "',  '" + currentRow.getCell(2) + "',  '" + currentRow.getCell(3) + "',  '" +
                     * currentRow.getCell(4) + "',  TIMESTAMP '" + generateTimeStamp() + "',  1,  '" + currentRow.getCell(5) + "' );");
                     * System.out.println();
                     */
                }
                counter++;
                System.out.println(counter);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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