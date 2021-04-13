package com.avinash;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CCCorrection {
	private static final Logger LOGGER = Logger.getLogger(CCCorrection.class.getName());
	private static final String FILE_NAME = "CC_Strategy.xlsx";
	private static final String FILE_PATH = "D:\\My Cloud\\OneDrive\\Misys\\";
	private static final String FILE_NAME_PATH = FILE_PATH + FILE_NAME;
	private static final String EMI_DETAILS = "EMI_Details";
	private static final String HDFC_HISTO = "HDFC Hist";
	private static final String EMI_SUMMARY = "EMI_Summary";
	private static final String EMI_CORRECTION = "EMI_Correction";
	private static final String CELL_REFERENCE = EMI_DETAILS + "!G";
	private static final String CELL_REFERENCE_OS = EMI_DETAILS + "!B";
	// private static final String cellReference = "G";
	private static final LocalDate Billed_Date_Start = LocalDate.of(2015, 10, 12);
	private static final LocalDate DUE_DATE_START = LocalDate.of(2015, 11, 1);
	private static final String DATE_FORMAT = "dd-MM-yyyy";

	public static void main(String[] args) {
		LOGGER.info("Started");
		try {
			HashMap<String, String> hashMap = new HashMap<>();
			HashMap<String, String> hashMapOS = new HashMap<>();
			FileInputStream excelFile = new FileInputStream(new File(FILE_NAME_PATH));
			Workbook workbook = new XSSFWorkbook(excelFile);
			Sheet emiCorrectionSheet = workbook.getSheet(EMI_CORRECTION);
			Iterator<Row> emiCorrectionSheetIterator = emiCorrectionSheet.iterator();
			int counter = 0;
			LOGGER.info("Gathering Information Started");
			while (emiCorrectionSheetIterator.hasNext()) {
				Row currentRow = emiCorrectionSheetIterator.next();
				if (counter > 0 && currentRow.getCell(0) != null && !currentRow.getCell(0).getStringCellValue().isEmpty()) {
					// LOGGER.info("Iteration Number : " + counter);
					int from = (int) currentRow.getCell(3).getNumericCellValue();
					int to = (int) currentRow.getCell(4).getNumericCellValue();
					String targetCellName = currentRow.getCell(6).getStringCellValue();
					String targerCellIndex = targetCellName.substring(0, 1);
					int targetCellNumber = Integer.parseInt(targetCellName.substring(1));
					int startFrom = targetCellNumber;
					for (int i = from; i <= to; i++) {
						addToMap(hashMap, targerCellIndex + startFrom, CELL_REFERENCE + i);
						startFrom++;
					}
					/*
					String targetCellNameOS = currentRow.getCell(7).getStringCellValue();
					String targerCellIndexOS = targetCellNameOS.substring(0, 1);
					int targetCellNumberOS = Integer.parseInt(targetCellNameOS.substring(1));
					int startFromOS = targetCellNumberOS;
					for (int i = from; i <= to; i++) {
						addToMap(hashMapOS, targerCellIndexOS + startFromOS, CELL_REFERENCE_OS + i);
						startFrom++;
					}
					*/
				}
				counter++;
			}
			LOGGER.info("Gathering Information Completed");
			updateCell(hashMap);
			// printMap(hashMap);
			excelFile.close();
			LOGGER.info("Completed");
		}
		catch (FileNotFoundException e) {
			LOGGER.severe(e.getLocalizedMessage());
			// e.printStackTrace();
		}
		catch (IOException e) {
			LOGGER.severe(e.getLocalizedMessage());
			// e.printStackTrace();
		}
	}

	private static void addToMap(HashMap<String, String> hashMap, String index, String value) {
		if (hashMap.containsKey(index)) {
			StringBuilder content = new StringBuilder();
			content.append(hashMap.get(index));
			content.append("+");
			content.append(value);
			hashMap.put(index, content.toString());
		}
		else {
			StringBuilder content = new StringBuilder();
			content.append(value);
			hashMap.put(index, content.toString());
		}
	}

	public static void printMap(Map<String, String> hashmap) {
		Iterator iterator = hashmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry pair = (Map.Entry) iterator.next();
			LOGGER.info(pair.getKey() + " :: " + pair.getValue());
			iterator.remove();
		}
	}

	private static void updateCell(HashMap<String, String> hashMap) {
		LOGGER.info("Updating Cells");
		Iterator iterator = hashMap.entrySet().iterator();
		try {
			FileInputStream file = new FileInputStream(new File(FILE_NAME_PATH));
			XSSFWorkbook yourworkbook = new XSSFWorkbook(file);
			XSSFSheet emiSummarySheet = yourworkbook.getSheet(EMI_SUMMARY);
			XSSFSheet hdfcHistoSheet = yourworkbook.getSheet(HDFC_HISTO);
			CellStyle cStyle = getCellStyle(hdfcHistoSheet, 1, 4);
			while (iterator.hasNext()) {
				Map.Entry pair = (Map.Entry) iterator.next();
				CellReference cellRef = getCellReference(emiSummarySheet, pair.getKey().toString());
				// Get Row
				Row row = emiSummarySheet.getRow(cellRef.getRow());
				if (row == null)
					row = emiSummarySheet.createRow(cellRef.getRow());
				// Update EMI Number
				Cell emiNumber = row.getCell(0);
				if (emiNumber == null)
					emiNumber = row.createCell(0);
				emiNumber.setCellValue("EMI " + cellRef.getRow());
				// Update EMI Amount
				Cell emiAmount = row.getCell(cellRef.getCol());
				if (emiAmount == null)
					emiAmount = row.createCell(cellRef.getCol());
				emiAmount.setCellStyle(cStyle);
				String emiAmountFormula = (String) pair.getValue();
				emiAmount.setCellType(XSSFCell.CELL_TYPE_FORMULA);
				emiAmount.setCellFormula(emiAmountFormula);
				// Update EMI Due Date
				Cell emiDueDate = row.getCell(2);
				if (emiDueDate == null)
					emiDueDate = row.createCell(2);
				emiDueDate.setCellValue(calculateActualDate(DUE_DATE_START, cellRef));
				// Update EMI Bill Date
				Cell emiBillDate = row.getCell(1);
				if (emiBillDate == null)
					emiBillDate = row.createCell(1);
				emiBillDate.setCellValue(calculateActualDate(Billed_Date_Start, cellRef));
			}
			FileOutputStream out = new FileOutputStream(new File(FILE_NAME_PATH));
			yourworkbook.write(out);
			out.close();
		}
		catch (FileNotFoundException e) {
			LOGGER.severe(e.getLocalizedMessage());
		}
		catch (IOException e) {
			LOGGER.severe(e.getLocalizedMessage());
		}
		LOGGER.info("Updated Cells");
	}

	private static String calculateActualDate(LocalDate startDate, CellReference cellRef) {
		LocalDate newDate = startDate.plusMonths(cellRef.getRow());
		return formatDate(newDate);
	}

	private static String formatDate(LocalDate date) {
		return date.format(DateTimeFormatter.ofPattern(DATE_FORMAT));
	}

	private static CellStyle getCellStyle(XSSFSheet emiDetailsSheet, int rowNumber, int columnNumber) {
		Row row = emiDetailsSheet.getRow(rowNumber);
		Cell column = row.getCell(columnNumber);
		return column.getCellStyle();
	}

	private static CellReference getCellReference(XSSFSheet sheet, String cellName) {
		CellReference cellRef = new CellReference(cellName);
		int r = cellRef.getRow();
		int c = cellRef.getCol();
		Row row = sheet.getRow(r);
		if (row == null)
			row = sheet.createRow(r);
		Cell cell = row.getCell(c, Row.CREATE_NULL_AS_BLANK);
		cell.setCellValue(cellName);
		return cellRef;
	}
}
