package excel.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFConditionalFormatting;
import org.apache.poi.xssf.usermodel.XSSFConditionalFormattingRule;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheetConditionalFormatting;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import pojo.HistoryData;
import pojo.XIRRValues;
import xirr.XirrDate;

public class ExcelHelper {

    private static final int NAV_COLUMN = 7;

    private static final int PROFIT_AMOUNT_COLUMN = 10;

    private static final int PROFIT_PERCENTAGE_COLUMN = 11;

    private static final int XIRR_COLUMN = 12;

    public static void updateNAV(XSSFSheet mfSummarySheet, int i, Double nav) {
        Cell cell = null;
        cell = mfSummarySheet.getRow(i + 1).getCell(NAV_COLUMN);
        cell.setCellValue(nav);
    }

    public static void updateXIRR(XSSFSheet mfSummarySheet, int i, Double nav) {
        Cell cell = null;
        cell = mfSummarySheet.getRow(i + 1).getCell(XIRR_COLUMN);
        // System.out.println("Row " +(i + 1)+" NAV " + nav);
        if (!Double.isNaN(nav) && Double.compare(nav, new Double(0)) != 0 && !nav.equals("-Infinity"))
            cell.setCellValue(nav);
    }

    public static boolean updateHistory(Logger LOGGER, XSSFSheet mfSummarySheet, XSSFSheet mfHistorySheet, int totalFolios, String date,
        String history_Prop_File) {
        XSSFSheetConditionalFormatting sheetCF = mfHistorySheet.getSheetConditionalFormatting();
        int numOfCF = sheetCF.getNumConditionalFormattings();
        XSSFConditionalFormatting cf = sheetCF.getConditionalFormattingAt(0);

        HistoryData historyData = readHistoryColumn(date, history_Prop_File);

        LOGGER.info("Updating History Cells");
        CellStyle dateCellStyle = getCellStyle(mfHistorySheet, 0, historyData.getHistoryColumnNumber() - 1);
        Cell dateCell = mfHistorySheet.getRow(0).getCell(historyData.getHistoryColumnNumber());
        dateCell.setCellStyle(dateCellStyle);

        // Set Date
        dateCell.setCellValue(date);

        // Set History Amount Value
        for (int j = 1; j < totalFolios + 1; j++) {
            Cell cell = null;
            CellStyle cStyle = getCellStyle(mfHistorySheet, j, historyData.getHistoryColumnNumber() - 1);
            cell = mfHistorySheet.getRow(j).getCell(historyData.getHistoryColumnNumber());
            double amount = mfSummarySheet.getRow(j).getCell(PROFIT_AMOUNT_COLUMN).getNumericCellValue();
            if (Double.compare(amount, new Double(0)) != 0)
                cell.setCellValue(amount);
            cell.setCellStyle(cStyle);
        }

        // Set History Percentage
        for (int j = 1; j < totalFolios + 1; j++) {
            Cell cell = null;
            // CellStyle cStyle = getCellStyle(mfHistorySheet, j + totalFolios + 2, histColumnNumber - 1);
            cell = mfHistorySheet.getRow(j + totalFolios + 2).getCell(historyData.getHistoryColumnNumber());
            double percentage = mfSummarySheet.getRow(j).getCell(PROFIT_PERCENTAGE_COLUMN).getNumericCellValue();
            if (Double.compare(percentage, new Double(0)) != 0)
                cell.setCellValue(percentage);
        }

        // Set XIRR Percentage
        for (int j = 1; j < totalFolios + 1; j++) {
            Cell cell = null;
            // CellStyle cStyle = getCellStyle(mfHistorySheet, j + totalFolios + 2, histColumnNumber - 1);
            cell = mfHistorySheet.getRow(j + (totalFolios + 2) * 2).getCell(historyData.getHistoryColumnNumber());
            // System.out.println("Row " + j + " " + mfSummarySheet.getRow(j).getCell(XIRR_COLUMN));
            
            double xirr = 0;
                try{
                    xirr =  mfSummarySheet.getRow(j).getCell(XIRR_COLUMN).getNumericCellValue();
                }catch(Exception e){
                    
                }
            
            if (Double.compare(xirr, new Double(0)) != 0)
                cell.setCellValue(xirr);
            // cell.setCellStyle(cStyle);
        }

        LOGGER.info("Updated History Cells");

        return historyData.isUpdate();
    }

    public static HashMap<String, Double> updateXIRR(Logger LOGGER, String executionDate, XSSFWorkbook workbook, XSSFSheet mfSummarySheet,
        int totalFolios) {
        LOGGER.info("Updating XIRR");
        HashMap<String, XIRRValues> transactions = new HashMap<String, XIRRValues>();
        List<String> evaluatedSheets = new ArrayList<String>();
        for (int j = 1; j < totalFolios; j++) {
            String sheetName = mfSummarySheet.getRow(j).getCell(1).getStringCellValue();
            //LOGGER.info(sheetName);
            XSSFSheet mfSheet = workbook.getSheet(sheetName);

            if (!evaluatedSheets.contains(sheetName) && mfSheet != null) {
                loadTransactions(LOGGER, mfSheet, transactions);
            }
            evaluatedSheets.add(sheetName);
        }
        HashMap<String, Double> xirrMap = evaluateXIRR(LOGGER, executionDate, transactions);
        LOGGER.info("Updated XIRR Cells");
        return xirrMap;
    }

    private static HashMap<String, Double> evaluateXIRR(Logger LOGGER, String executionDate, HashMap<String, XIRRValues> transactions) {
        //LOGGER.info("XIRR evaluation started");
        HashMap<String, Double> xirrMap = new HashMap<String, Double>();

        List<Date> masterTxnDateList = new ArrayList<Date>();

        List<Double> masterTxnAmountList = new ArrayList<Double>();
       // LOGGER.info("transactions.size " + transactions.size());
        transactions.size();
        for (String name : transactions.keySet()) {
          //  LOGGER.info("name " + name);
            XIRRValues xirrValues = transactions.get(name);
            double withdrawable = Double.sum(xirrValues.getInvested(), xirrValues.getProfit());

            xirrValues.getTxnAmount().add(withdrawable);

            Date date1 = new Date(Calendar.getInstance().getTimeInMillis());
            try {
                date1 = new SimpleDateFormat("dd-MM-yy").parse(executionDate);

            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            xirrValues.getTxnDate().add(date1);
            transactions.put(name, xirrValues);

            masterTxnAmountList.addAll(xirrValues.getTxnAmount());
            double[] txnAmountArray = new double[xirrValues.getTxnAmount().size()];
           // LOGGER.info("txnAmountArray.length " + txnAmountArray.length);

            for (int i = 0; i < txnAmountArray.length; i++) {
                txnAmountArray[i] = xirrValues.getTxnAmount().get(i); // java 1.5+ style (outboxing)
           //     LOGGER.info(String.valueOf(txnAmountArray[i]));
            }
            masterTxnDateList.addAll(xirrValues.getTxnDate());
            Date[] txnDateArray = new Date[xirrValues.getTxnDate().size()];
           // LOGGER.info("txnDateArray.length " + txnDateArray.length);
            for (int i = 0; i < txnDateArray.length; i++) {
                txnDateArray[i] = xirrValues.getTxnDate().get(i); // java 1.5+ style (outboxing)
           //     LOGGER.info(txnDateArray[i].toString());
            }
           // LOGGER.info("xirrMap.put");
            xirrMap.put(name, XirrDate.Newtons_method(LOGGER, 0.1, txnAmountArray, txnDateArray));
            // System.out.println(name + " : " + XirrDate.Newtons_method(0.1, txnAmountArray, txnDateArray));
        }

        double[] masterTxnAmountArray = new double[masterTxnAmountList.size()];
        //LOGGER.info("masterTxnAmountArray.length " + masterTxnAmountArray.length);
        for (int i = 0; i < masterTxnAmountArray.length; i++) {
            masterTxnAmountArray[i] = masterTxnAmountList.get(i); // java 1.5+ style (outboxing)
        }

        Date[] masterTxnDateArray = new Date[masterTxnDateList.size()];
       // LOGGER.info("masterTxnDateArray.length " + masterTxnDateArray.length);
        for (int i = 0; i < masterTxnDateArray.length; i++) {
            masterTxnDateArray[i] = masterTxnDateList.get(i); // java 1.5+ style (outboxing)
        }

        xirrMap.put("Master", XirrDate.Newtons_method(LOGGER, 0.1, masterTxnAmountArray, masterTxnDateArray));
       // LOGGER.info("XIRR evaluation complated");
        return xirrMap;
    }

    private static void loadTransactions(Logger LOGGER, XSSFSheet mfSheet, HashMap<String, XIRRValues> transactions) {
        // LOGGER.info("Loading Transactions");
        int i = 1;
        boolean cont = true;
        do {
            String isin = mfSheet.getRow(i).getCell(1).getStringCellValue();
            XIRRValues xirrValues = transactions.get(isin);
            if (xirrValues == null) {
                xirrValues = new XIRRValues();
            }
            xirrValues.getTxnDate().add(mfSheet.getRow(i).getCell(0).getDateCellValue());
            xirrValues.getTxnAmount().add(-(mfSheet.getRow(i).getCell(2).getNumericCellValue()));
            xirrValues.setInvested(Double.sum(xirrValues.getInvested(), mfSheet.getRow(i).getCell(2).getNumericCellValue()));
            xirrValues.setProfit(Double.sum(xirrValues.getProfit(), mfSheet.getRow(i).getCell(11).getNumericCellValue()));

            transactions.put(isin, xirrValues);
            i++;
            if (mfSheet.getRow(i).getCell(7) == null) {
                cont = false;
            }
            // LOGGER.info(String.valueOf(i));
        } while (cont);
        // LOGGER.info("Transactions Loaded");
    }

    private static HistoryData readHistoryColumn(String date, String history_Prop_File) {
        int HISTORY_COLUMN = 1;

        HistoryData historyData = new HistoryData();
        historyData.setUpdate(true);

        String HISTORY_DATE = "";
        Properties props = new Properties();
        try {
            props.load(new FileInputStream(history_Prop_File));
            HISTORY_COLUMN = Integer.parseInt(props.getProperty("HISTORY_COLUMN"));
            HISTORY_DATE = (String) props.getProperty("HISTORY_DATE");
            if (date.equalsIgnoreCase(HISTORY_DATE)) {
                HISTORY_COLUMN = HISTORY_COLUMN - 1;
                historyData.setUpdate(false);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Problem in loading History.properties file");
            System.exit(0);
        }

        historyData.setHistoryColumnNumber(HISTORY_COLUMN);
        return historyData;
    }

    private static CellStyle getCellStyle(XSSFSheet emiDetailsSheet, int rowNumber, int columnNumber) {
        Row row = emiDetailsSheet.getRow(rowNumber);
        Cell column = row.getCell(columnNumber);
        return column.getCellStyle();
    }

    private void updateFYSummery(String FILE_NAME_PATH) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(FILE_NAME_PATH);
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
            StringBuilder sb = new StringBuilder();
            sb.append("=");
            // for each sheet in the workbook
            for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
                System.out.println("Sheet name: " + workbook.getSheetName(i));
                sb.append("=SUMIFS(" + workbook.getSheetName(i) + "!C:C," + workbook.getSheetName(i) + "!H:H,'FY Summary'!A3,"
                    + workbook.getSheetName(i) + "!I:I,\"ELSS\")+");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.exit(0);
                }
            }
        }
    }

    public static int updateHistoryNumberInFile(String date, String history_Prop_File) {
        int HISTORY_COLUMN = 1;
        Properties props = new Properties();
        try {
            props.load(new FileInputStream(history_Prop_File));
            HISTORY_COLUMN = Integer.parseInt(props.getProperty("HISTORY_COLUMN"));
            int New_Hist_Column = HISTORY_COLUMN + 1;
            props.setProperty("HISTORY_COLUMN", String.valueOf(New_Hist_Column));
            props.setProperty("HISTORY_DATE", String.valueOf(date));
            FileOutputStream out = new FileOutputStream(history_Prop_File);
            props.store(out, null);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Problem in loading History.properties file");
        }
        return HISTORY_COLUMN;
    }

    private void expandConditionalFormatting(XSSFCell cell, XSSFCell styleCell) {
        XSSFSheetConditionalFormatting xscf = cell.getSheet().getSheetConditionalFormatting();
        for (int idx = 0; idx < xscf.getNumConditionalFormattings(); idx++) {
            XSSFConditionalFormatting cf = xscf.getConditionalFormattingAt(idx);
            List<CellRangeAddress> cra = Arrays.asList(cf.getFormattingRanges());
            List<CellRangeAddress> newCra = new ArrayList();
            for (CellRangeAddress c : cra) {
                if (containsCell(c, styleCell) && !containsCell(c, cell)) {
                    newCra.add(new CellRangeAddress(Math.min(c.getFirstRow(), cell.getRowIndex()), Math.max(c.getLastRow(),
                        cell.getRowIndex()), Math.min(c.getFirstColumn(), cell.getColumnIndex()), Math.max(c.getLastColumn(),
                        cell.getColumnIndex())));
                } else {
                    newCra.add(c);
                }
            }
            ArrayList<XSSFConditionalFormattingRule> cfs = new ArrayList();
            for (int ci = 0; ci < cf.getNumberOfRules(); ci++) {
                cfs.add(cf.getRule(ci));
            }

            xscf.addConditionalFormatting(newCra.toArray(new CellRangeAddress[newCra.size()]),
                cfs.toArray(new XSSFConditionalFormattingRule[cfs.size()]));
            xscf.removeConditionalFormatting(idx);
        }
    }

    private boolean containsCell(CellRangeAddress cra, Cell cell) {
        if (cra.getFirstRow() <= cell.getRowIndex() && cra.getLastRow() >= cell.getRowIndex()) {
            if (cra.getFirstColumn() <= cell.getColumnIndex() && cra.getLastColumn() >= cell.getColumnIndex()) {
                return true;
            }
        }
        return false;
    }
}
