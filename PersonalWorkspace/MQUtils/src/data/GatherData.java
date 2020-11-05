package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import pojo.AccountInfo;
import pojo.TxnInfo;

public class GatherData {

    private String accountsFile;

    public GatherData(String accountsFile) {
        this.accountsFile = accountsFile;
    }

    static TxnInfo readDDTxnsFromFile(XSSFSheet sheet, int index) throws IOException {
        TxnInfo txnInfo = new TxnInfo();
        Row row = sheet.getRow(index);
        txnInfo.setInstructionID(row.getCell(0).getStringCellValue());
        txnInfo.setEndToEndID(row.getCell(1).getStringCellValue());
        txnInfo.setCreditorIdentifier(row.getCell(2).getStringCellValue());
        txnInfo.setCreditorAccount(row.getCell(3).getStringCellValue());
        txnInfo.setDebitorAccount(row.getCell(4).getStringCellValue());

        return txnInfo;
    }

    public List<AccountInfo> getAccountList(int txnCount) {

        List<AccountInfo> acctInfoList = new ArrayList<AccountInfo>();

        Integer totalTransactions = txnCount; // 8
        // System.out.println(totalTransactions);
        try {
            FileInputStream file = new FileInputStream(new File(accountsFile));
            XSSFSheet sheet = readSheet(file);
            int totalRows = sheet.getLastRowNum();
            // System.out.println("Total Rows : " + totalRows);
            int rowNum = 1;
            for (int i = 1; i <= totalTransactions; i++) {
                try {
                    if (isCellEmpty(sheet, rowNum)) {
                        rowNum = 1;
                    }
                } catch (Exception e) {
                    rowNum = 1;
                }

                AccountInfo acctInfo = readFile(sheet, rowNum);
                // System.out.println(String.valueOf(i) + "\t" + acctInfo.getDbtrAcc() + "\t" + acctInfo.getCdtrAcct() + "\t"
                // + acctInfo.getCreditorIdentifier() + "\t" + acctInfo.getStdAcctNum() + "\t" + acctInfo.getAtmCardNumber());
                acctInfoList.add(acctInfo);
                rowNum++;

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the writer regardless of what happens...
                System.out.println();
            } catch (Exception e) {
                System.out.println("finally block pain008");
                e.printStackTrace();
            }
        }
        return acctInfoList;
    }

    public static String readLine() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String option = null;
        try {
            option = br.readLine();
        } catch (IOException ioe) {
            System.out.println("IO error trying to read Input!");
            // System.exit(1);
        }
        return option;
    }

    static XSSFSheet readSheet(FileInputStream file) throws IOException {
        // Create Workbook instance holding reference to .xlsx file
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        // Get first/desired sheet from the workbook
        XSSFSheet sheet = workbook.getSheetAt(0);
        return sheet;
    }

    static AccountInfo readFile(XSSFSheet sheet, int index) throws IOException {
        AccountInfo acctInfo = new AccountInfo();
        Row row = sheet.getRow(index);
        acctInfo.setDbtrAcc(extractTagValue(row, 0));
        acctInfo.setCdtrAcct(extractTagValue(row, 1));
        acctInfo.setPartyID(extractTagValue(row, 2));
        acctInfo.setCreditorIdentifier(extractTagValue(row, 3));
        acctInfo.setStdAcctNum(extractTagValue(row, 4));
        acctInfo.setAtmCardNumber(extractTagValue(row, 5));
        return acctInfo;
    }

    static boolean isCellEmpty(XSSFSheet sheet, int index) throws IOException, NullPointerException {
        Row row = sheet.getRow(index);

        if (extractTagValue(row, 0) != null && !extractTagValue(row, 0).isEmpty())
            return false;
        return true;
    }

    private static String extractTagValue(Row row, int cellNumber) {
        Cell cell = row.getCell(cellNumber);
        int cellType = cell.getCellType();
        if (cellType == cell.CELL_TYPE_NUMERIC)
            return String.valueOf(row.getCell(cellNumber).getNumericCellValue());
        else
            return row.getCell(cellNumber).getStringCellValue();
    }

    public static void main(String args[]) {
        // List<AccountInfo> acctInfoList = getAccountList(20);
        // System.out.println(acctInfoList.size());
        System.out.println(String.valueOf(Calendar.getInstance().getTimeInMillis()).length());
    }
}
