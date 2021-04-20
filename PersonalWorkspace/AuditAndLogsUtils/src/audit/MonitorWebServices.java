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

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import common.CommonMethods;
import pojo.WebServiceData;

public class MonitorWebServices {
	private static final String AuditDir = "D:\\Essence\\INSTALL-LOCATION\\CTTDEV\\AuditDir\\default_running\\audit.txt";
	private static boolean writeToFile = true;
	private static final String tabOrComma = writeToFile ? "," : "\t";
	private static String excelFileName = "Result_" + CommonMethods.formatDate("yyyyMMddHHssSSS", new Date(Calendar.getInstance().getTimeInMillis())) + ".xlsx";

	public static void main(String[] args) {
		// pass the path to the file as a parameter
		HashMap<String, WebServiceData> MSGMap = new HashMap<String, WebServiceData>();
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

	public static void processMap(HashMap<String, WebServiceData> lineMap) {
		printHeader();
		for (Map.Entry<String, WebServiceData> entry : lineMap.entrySet()) {
			printResults(entry, entry.getValue());
		}
		if (writeToFile) {
			writeToExcel(lineMap);
			System.out.println("File generated : " + excelFileName);
		}
	}

	private static void writeToExcel(HashMap<String, WebServiceData> lineMap) {
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

	private static void prepareWorksheet(XSSFWorkbook workbook, XSSFSheet sheet, HashMap<String, WebServiceData> lineMap) throws IOException, FileNotFoundException {
		int rowCount = 0;
		CreationHelper creationHelper = workbook.getCreationHelper();
		CellStyle style = workbook.createCellStyle();
		CellStyle headerStyle = workbook.createCellStyle();
		createHeaderRow(sheet, creationHelper, headerStyle);
		for (Map.Entry<String, WebServiceData> entry : lineMap.entrySet()) {
			Row row = sheet.createRow(++rowCount);
			insertRow(creationHelper, style, entry, row);
		}
	}

	private static void insertRow(CreationHelper creationHelper, CellStyle style, Map.Entry<String, WebServiceData> entry, Row row) {
		style.setAlignment(CellStyle.ALIGN_CENTER);
		WebServiceData wsd = entry.getValue();
		createCell(creationHelper, style, row, 0, entry.getKey());
		createCell(creationHelper, style, row, 1, wsd.getServiceName());
		createCell(creationHelper, style, row, 2, wsd.getUser());
		createCell(creationHelper, style, row, 3, wsd.getInvocationMode());
		//createCell(creationHelper, style, row, 4, wsd.getStatus());
		createCell(creationHelper, style, row, 5, wsd.getThreadID());
		createCell(creationHelper, style, row, 6, wsd.startTime);
		createCell(creationHelper, style, row, 7, wsd.endTime);
		createCell(creationHelper, style, row, 8, wsd.getTimeTaken());
	}

	private static void createHeaderRow(XSSFSheet sheet, CreationHelper creationHelper, CellStyle style) {
		style.setAlignment(CellStyle.ALIGN_GENERAL);
		Row headerRow = sheet.createRow(0);
		createCell(creationHelper, style, headerRow, 0, "Correlation ID");
		createCell(creationHelper, style, headerRow, 1, "ServiceName");
		createCell(creationHelper, style, headerRow, 2, "User ID");
		createCell(creationHelper, style, headerRow, 3, "Invocation Mode");
		createCell(creationHelper, style, headerRow, 4, "Status");
		createCell(creationHelper, style, headerRow, 5, "ThreadID");
		createCell(creationHelper, style, headerRow, 6, "StartTime");
		createCell(creationHelper, style, headerRow, 7, "EndTime");
		createCell(creationHelper, style, headerRow, 8, "TimeTaken(ms)");
	}

	public static Cell createCell(CreationHelper creationHelper, CellStyle style, Row row, int colIndex, Object value) {
		Cell cell = row.createCell(colIndex);
		if (value instanceof String) {
			cell.setCellValue((String) value);
		}
		else if (value instanceof Integer) {
			cell.setCellValue((Integer) value);
		}
		else if (value instanceof Long) {
			cell.setCellValue((Long) value);
		}
		else if (value instanceof Timestamp) {
			cell.setCellValue((Date) value);
			style.setDataFormat(creationHelper.createDataFormat().getFormat("yyyy-MM-dd HH:mm:ss"));
			cell.setCellStyle(style);
		}
		return cell;
	}

	private static void printHeader() {
		StringBuilder sb = new StringBuilder();
		sb.append("Correlation ID").append(tabOrComma);
		sb.append("ServiceName").append(tabOrComma);
		sb.append("User ID").append(tabOrComma);
		sb.append("Invocation Mode").append(tabOrComma);
		sb.append("Status").append(tabOrComma);
		sb.append("ThreadID").append(tabOrComma);
		sb.append("StartTime").append(tabOrComma);
		sb.append("EndTime").append(tabOrComma);
		sb.append("TimeTaken(ms)").append(tabOrComma);
		if (!writeToFile) {
			System.out.println(sb.toString());
		}
	}

	private static void printResults(Map.Entry<String, WebServiceData> entry, WebServiceData ap) {
		StringBuilder sb = new StringBuilder();
		sb.append(entry.getKey()).append(tabOrComma);
		sb.append(ap.getServiceName()).append(tabOrComma);
		sb.append(ap.getUser()).append(tabOrComma);
		sb.append(ap.getInvocationMode()).append(tabOrComma);
		sb.append(/*ap.getStatus()*/"").append(tabOrComma);
		sb.append(ap.getThreadID()).append(tabOrComma);
		sb.append(ap.startTime).append(tabOrComma);
		sb.append(ap.endTime).append(tabOrComma);
		sb.append(ap.timeTaken).append(tabOrComma);
		if (!writeToFile) {
			System.out.println(sb.toString());
		}
	}

	private static void readTime(HashMap<String, WebServiceData> FBPMap, List<String> lineItems) throws ParseException {
		int typeIndex = CommonMethods.getIndexOf(lineItems, "INVOCATION-MODE") + 1;
		String invocationMode = lineItems.get(typeIndex).replaceAll("'", "");
		String correlationIDTagName = invocationMode.contains("REST") ? "correlationId" : "correlationID";
		int index = CommonMethods.getIndexOf(lineItems, correlationIDTagName) + 1;
		int serviceNameIndex = CommonMethods.getIndexOf(lineItems, "WebServiceName") + 1;
		int directionIndex = 8;
		String direction = lineItems.get(directionIndex);
		if (lineItems.size() > 20) {
			if (index > 1) {
				WebServiceData ap = new WebServiceData();
				String correlationID = lineItems.get(index).replaceAll("'", "");
				String time = lineItems.get(0);
				String serviceName = lineItems.get(serviceNameIndex).replaceAll("'", "");
				if (direction.contains("In-Message")) {
					ap.setStartTime(CommonMethods.parseTimestamp(time));
					ap.setServiceName(serviceName);
					ap.setInvocationMode(invocationMode);
					ap.setThreadID(Integer.parseInt(CommonMethods.getThreadID(lineItems, "CurrentThread", "'WebContainer : ", "'")));
					FBPMap.put(correlationID, ap);
				}
				else if (direction.contains("Out-Message")) {
					if (FBPMap.containsKey(correlationID)) {
						ap = FBPMap.get(correlationID);
						ap.setEndTime(CommonMethods.parseTimestamp(time));
						ap.setStatus(lineItems.get(CommonMethods.getIndexOf(lineItems, "STATUS") + 1).replaceAll("'", ""));
						ap.setUser(lineItems.get(4).replaceAll("'", ""));
						long timeTaken = CommonMethods.getTimeDiff(ap.endTime, ap.startTime);
						ap.setTimeTaken(timeTaken);
						// System.out.println(Calendar.getInstance().getTimeInMillis());
					}
					else {
						//System.out.println("Untracked Response");
					}
				}
			}
		}
	}
}
