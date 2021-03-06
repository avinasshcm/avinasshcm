package audit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import common.CommonMethods;
import file.excel.ExcelUtils;
import pojo.AuditData;

//PSD2
public class MonitorMessagingAudit {
	private static final String AuditDir = "D:\\OneDrive - Finastra\\CTT\\Issues\\Messaging_2021.txt";
	private static boolean writeToFile = true;
	private static final String tabOrComma = writeToFile ? "," : "\t";
	private static String excelFileName = "Result_" + CommonMethods.formatDate("yyyyMMdd_HHssSSS", new Date(Calendar.getInstance().getTimeInMillis())) + ".xlsx";
	private static final HashMap<String, String> referenceTag = referenceTagMap();
	private static final HashMap<String, String> txnCodeTag = txnCodeTagMap();
	private static final HashMap<String, String> msgFunctionTag = msgFunctionTagMap();
	private static final HashMap<String, String> trmDateTimeTag = trmDateTimeMap();

	private static HashMap<String, String> referenceTagMap() {
		HashMap<String, String> newMap = new HashMap<String, String>();
		newMap.put("UB_POS_POSMSG_REQ", ":holdReference");
		newMap.put("UB_ATM_CASHTXN_REQ", ":tellerTxnReference");
		newMap.put("UB_ATM_BALENQ_REQ", ":reference");
		newMap.put("UB_ATM_MINSTMT_REQ", ":reference");
		newMap.put("UB_IND_PaymentRequestQ", ":transactionalItem");
		return newMap;
	}

	private static HashMap<String, String> txnCodeTagMap() {
		HashMap<String, String> newMap = new HashMap<String, String>();
		newMap.put("UB_POS_POSMSG_REQ", ":messageType");
		newMap.put("UB_ATM_CASHTXN_REQ", ":messageType");
		newMap.put("UB_ATM_BALENQ_REQ", ":messageType");
		newMap.put("UB_ATM_MINSTMT_REQ", ":messageType");
		newMap.put("UB_IND_PaymentRequestQ", ":transactionalType");
		return newMap;
	}

	private static HashMap<String, String> msgFunctionTagMap() {
		HashMap<String, String> newMap = new HashMap<String, String>();
		newMap.put("UB_POS_POSMSG_REQ", ":messageFunction");
		newMap.put("UB_ATM_CASHTXN_REQ", ":messageFunction");
		newMap.put("UB_ATM_BALENQ_REQ", ":messageFunction");
		newMap.put("UB_ATM_MINSTMT_REQ", ":messageFunction");
		newMap.put("UB_IND_PaymentRequestQ", "");
		return newMap;
	}

	private static HashMap<String, String> trmDateTimeMap() {
		HashMap<String, String> newMap = new HashMap<String, String>();
		newMap.put("UB_POS_POSMSG_REQ", ":txnDateTime");
		newMap.put("UB_ATM_CASHTXN_REQ", ":txnDateTime");
		newMap.put("UB_ATM_BALENQ_REQ", ":txnDateTime");
		newMap.put("UB_ATM_MINSTMT_REQ", ":txnDateTime");
		newMap.put("UB_IND_PaymentRequestQ", "");
		return newMap;
	}

	public static void main(String[] args) {
		// pass the path to the file as a parameter
		HashMap<String, AuditData> MSGMap = new HashMap<String, AuditData>();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(AuditDir));
			String line = reader.readLine();
			while (line != null) {
				List<String> lineItems = Arrays.asList(Pattern.compile("\\|\\|").split(line));
				//String[] lineItems = line.split("\\|\\|");
				readTime(MSGMap, lineItems);
				// System.out.println(line);
				line = reader.readLine();
			}
			reader.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		processMap(MSGMap);
	}

	public static void processMap(HashMap<String, AuditData> lineMap) {
		printHeader();
		for (Map.Entry<String, AuditData> entry : lineMap.entrySet()) {
			printResults(entry, entry.getValue());
		}
		if (writeToFile) {
			writeToExcel(lineMap);
			System.out.println("File generated : " + excelFileName);
		}
	}

	private static void writeToExcel(HashMap<String, AuditData> lineMap) {
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("WebServices");
		try {
			prepareWorksheet(workbook, sheet, lineMap);
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try (FileOutputStream outputStream = new FileOutputStream(excelFileName)) {
			workbook.write(outputStream);
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void prepareWorksheet(XSSFWorkbook workbook, XSSFSheet sheet, HashMap<String, AuditData> lineMap) throws IOException, FileNotFoundException {
		int rowCount = 0;
		CreationHelper creationHelper = workbook.getCreationHelper();
		CellStyle style = workbook.createCellStyle();
		CellStyle headerStyle = workbook.createCellStyle();
		createHeaderRow(sheet, creationHelper, headerStyle);
		for (Map.Entry<String, AuditData> entry : lineMap.entrySet()) {
			Row row = sheet.createRow(++rowCount);
			insertRow(creationHelper, style, entry, row);
		}
	}

	private static void insertRow(CreationHelper creationHelper, CellStyle style, Map.Entry<String, AuditData> entry, Row row) {
		style.setAlignment(CellStyle.ALIGN_CENTER);
		AuditData wsd = entry.getValue();
		int columnNumber = 0;
		ExcelUtils.createCell(creationHelper, style, row, columnNumber++, wsd.getTxnRef());
		ExcelUtils.createCell(creationHelper, style, row, columnNumber++, entry.getKey());
		ExcelUtils.createCell(creationHelper, style, row, columnNumber++, wsd.getServiceName());
		ExcelUtils.createCell(creationHelper, style, row, columnNumber++, wsd.getTxnCode());
		ExcelUtils.createCell(creationHelper, style, row, columnNumber++, wsd.getMsgFunction());
		ExcelUtils.createCell(creationHelper, style, row, columnNumber++, wsd.getThreadID());
		ExcelUtils.createCell(creationHelper, style, row, columnNumber++, wsd.startTime);
		ExcelUtils.createCell(creationHelper, style, row, columnNumber++, wsd.endTime);
		ExcelUtils.createCell(creationHelper, style, row, columnNumber++, wsd.txnDateTime);
		ExcelUtils.createCell(creationHelper, style, row, columnNumber++, wsd.getTimeTaken());
		ExcelUtils.createCell(creationHelper, style, row, columnNumber++, wsd.delay);
	}

	private static void createHeaderRow(XSSFSheet sheet, CreationHelper creationHelper, CellStyle style) {
		style.setAlignment(CellStyle.ALIGN_GENERAL);
		Row headerRow = sheet.createRow(0);
		int columnNumber = 0;
		ExcelUtils.createCell(creationHelper, style, headerRow, columnNumber++, "TransactionReference");
		ExcelUtils.createCell(creationHelper, style, headerRow, columnNumber++, "Correlation ID");
		ExcelUtils.createCell(creationHelper, style, headerRow, columnNumber++, "ServiceName");
		ExcelUtils.createCell(creationHelper, style, headerRow, columnNumber++, "TransactionCode");
		ExcelUtils.createCell(creationHelper, style, headerRow, columnNumber++, "MessageFunction");
		ExcelUtils.createCell(creationHelper, style, headerRow, columnNumber++, "ThreadID");
		ExcelUtils.createCell(creationHelper, style, headerRow, columnNumber++, "StartTime");
		ExcelUtils.createCell(creationHelper, style, headerRow, columnNumber++, "EndTime");
		ExcelUtils.createCell(creationHelper, style, headerRow, columnNumber++, "TxnDateTime");
		ExcelUtils.createCell(creationHelper, style, headerRow, columnNumber++, "TimeTaken(ms)");
		ExcelUtils.createCell(creationHelper, style, headerRow, columnNumber++, "Delay(ms)");
	}

	private static void printHeader() {
		StringBuilder sb = new StringBuilder();
		sb.append("TransactionReference").append(tabOrComma);
		sb.append("Correlation ID").append(tabOrComma);
		sb.append("ServiceName").append(tabOrComma);
		sb.append("TransactionCode").append(tabOrComma);
		sb.append("MessageFunction").append(tabOrComma);
		sb.append("ThreadID").append(tabOrComma);
		sb.append("StartTime").append(tabOrComma);
		sb.append("EndTime").append(tabOrComma);
		sb.append("TxnDateTime").append(tabOrComma);
		sb.append("TimeTaken(ms)").append(tabOrComma);
		sb.append("Delay(ms)").append(tabOrComma);
		if (!writeToFile) {
			System.out.println(sb.toString());
		}
	}

	private static void printResults(Map.Entry<String, AuditData> entry, AuditData ap) {
		StringBuilder sb = new StringBuilder();
		sb.append(ap.getTxnRef()).append(tabOrComma);
		sb.append(entry.getKey()).append(tabOrComma);
		sb.append(ap.getServiceName()).append(tabOrComma);
		sb.append(ap.getTxnCode()).append(tabOrComma);
		sb.append(ap.getMsgFunction()).append(tabOrComma);
		sb.append(ap.getThreadID()).append(tabOrComma);
		sb.append(ap.startTime).append(tabOrComma);
		sb.append(ap.endTime).append(tabOrComma);
		sb.append(ap.txnDateTime != null ? ap.txnDateTime : "").append(tabOrComma);
		sb.append(ap.timeTaken).append(tabOrComma);
		sb.append(ap.delay).append(tabOrComma);
		if (!writeToFile) {
			System.out.println(sb.toString());
		}
	}

	private static void readTime(HashMap<String, AuditData> FBPMap, List<String> lineItems) throws ParseException {
		int index = CommonMethods.getIndexOf(lineItems, "MessageGUID") + 1;
		int serviceNameIndex = CommonMethods.getIndexOf(lineItems, "JmsEndPointDestination") + 1;
		int directionIndex = CommonMethods.getIndexOf(lineItems, "Messaging") + 1;
		String direction = lineItems.get(directionIndex);
		if (lineItems.size() > 20) {
			if (index > 1) {
				AuditData ap = new AuditData();
				String correlationID = lineItems.get(index).replaceAll("'", "");
				String time = lineItems.get(0);
				String serviceName = lineItems.get(serviceNameIndex).replaceAll("'", "");
				if (direction.contains("IN")) {
					ap.setStartTime(CommonMethods.parseTimestamp(time));
					ap.setServiceName(serviceName);
					//System.out.println(correlationID);
					ap.setTxnDateTime(getTrmDateTime(CommonMethods.getTagValue(trmDateTimeTag.get(serviceName), lineItems)));
					ap.setTxnCode(CommonMethods.getTagValue(txnCodeTag.get(serviceName), lineItems));
					ap.setTxnRef(CommonMethods.getTagValue(referenceTag.get(serviceName), lineItems));
					ap.setMsgFunction(CommonMethods.getTagValue(msgFunctionTag.get(serviceName), lineItems));
					ap.setThreadID(CommonMethods.getThreadID(lineItems, "TCPWorkerThreadID", "'Camel \\(camel\\) thread #", " - JmsConsumer[A-Za-z\\_\\[\\]]*'"));
					FBPMap.put(correlationID, ap);
				}
				else if (direction.contains("OUT")) {
					if (FBPMap.containsKey(correlationID)) {
						ap = FBPMap.get(correlationID);
						ap.setEndTime(CommonMethods.parseTimestamp(time));
						ap.setDelay(CommonMethods.getTimeDiff(ap.startTime, ap.txnDateTime));
						ap.setTimeTaken(CommonMethods.getTimeDiff(ap.endTime, ap.startTime));
						// System.out.println(Calendar.getInstance().getTimeInMillis());
					}
					else {
						//System.out.println("Untracked Response");
					}
				}
			}
		}
	}

	private static Timestamp getTrmDateTime(String date) {
		int timeZoneLength = 6;
		if (date.contains("Z")) {
			timeZoneLength = 1;
		}
		int endIndex = date.length() - timeZoneLength;
		if (endIndex > 1) {
			String txnDateTime = date.substring(0, date.length() - timeZoneLength).replaceAll("T", " ");
			return CommonMethods.parseTimestamp("yyyy-MM-dd HH:mm:ss.SSS", txnDateTime);
		}
		return null;
	}
}