import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UEGeneration {

    private static final Logger LOGGER = Logger.getLogger(UEGeneration.class.getName());

    private static final String FILE_NAME = "UE.xlsx";

    private static final String FILE_PATH = "D:\\Branch_Teller\\EquationUE\\";

    private static final String FILE_NAME_PATH = FILE_PATH + FILE_NAME;

    private static final String TXN_CODE_LIST_SHEET = "TUB";

    public static void main(String[] args) {
        LOGGER.info("Started");
        int initialPKSeqNum = 18000;

        try {
            HashMap<String, String> hashMap = new HashMap<>();
            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME_PATH));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet txnCodeListSheet = workbook.getSheet(TXN_CODE_LIST_SHEET);
            Iterator<Row> txnCodeListSheetIterator = txnCodeListSheet.iterator();

            int counter = 0;
            BufferedWriter writer = null;
            LOGGER.info("Gathering Information Started");
            try {
                File ddXML = new File(FILE_PATH + "Script_V3.0.sql");

                writer = new BufferedWriter(new FileWriter(ddXML));
                while (txnCodeListSheetIterator.hasNext()) {
                    Row currentRow = txnCodeListSheetIterator.next();
                    if (counter > 0 && currentRow.getCell(0) != null) {
                        LOGGER.info("Iteration Number : " + counter);

                        int id = (int) currentRow.getCell(0).getNumericCellValue();
                        String txnCode = currentRow.getCell(1).getStringCellValue();
                        Object[] arguments = { String.valueOf(initialPKSeqNum), String.valueOf(id), txnCode };
                        MessageFormat sqlTemplate = new MessageFormat(SQLTemplate.template);
                        writer.write(sqlTemplate.format(arguments));

                    }
                    writer.write("\n\n");
                    initialPKSeqNum++;
                    counter++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    // Close the writer regardless of what happens...
                    writer.close();
                } catch (Exception e) {
                    System.out.println("finally block pain008");
                    e.printStackTrace();
                }
            }

        } catch (FileNotFoundException e) {
            LOGGER.severe(e.getLocalizedMessage());
        } catch (IOException e) {
            LOGGER.severe(e.getLocalizedMessage());
        }
        LOGGER.info("Completed");
    }

}
