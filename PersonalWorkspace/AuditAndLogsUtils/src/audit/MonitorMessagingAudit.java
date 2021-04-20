package audit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import common.CommonMethods;
import pojo.AuditData;

//PSD2
public class MonitorMessagingAudit {
	private static final String AuditDir = "D:\\POS_Timeout\\BF_running\\Messaging.txt";
	private static boolean writeToFile = true;
	private static final String tabOrComma = writeToFile ? "," : "\t";
	private static final HashMap<String, String> referenceTag = referenceTagMap();
	private static final HashMap<String, String> txnCodeTag = txnCodeTagMap();
	private static final HashMap<String, String> msgFunctionTag = msgFunctionTagMap();

	private static HashMap<String, String> referenceTagMap() {
		HashMap<String, String> newMap = new HashMap<String, String>();
		newMap.put("UB_POS_POSMSG_REQ", "typ:holdReference");
		newMap.put("UB_ATM_CASHTXN_REQ", "typ:tellerTxnReference");
		newMap.put("UB_ATM_BALENQ_REQ", "typ:reference");
		newMap.put("UB_ATM_MINSTMT_REQ", "typ:reference");
		newMap.put("UB_IND_PaymentRequestQ", "typ:transactionalItem");
		return newMap;
	}

	private static HashMap<String, String> txnCodeTagMap() {
		HashMap<String, String> newMap = new HashMap<String, String>();
		newMap.put("UB_POS_POSMSG_REQ", "head:messageType");
		newMap.put("UB_ATM_CASHTXN_REQ", "head:messageType");
		newMap.put("UB_ATM_BALENQ_REQ", "");
		newMap.put("UB_ATM_MINSTMT_REQ", "");
		newMap.put("UB_IND_PaymentRequestQ", "typ:transactionalType");
		return newMap;
	}

	private static HashMap<String, String> msgFunctionTagMap() {
		HashMap<String, String> newMap = new HashMap<String, String>();
		newMap.put("UB_POS_POSMSG_REQ", "typ:messageFunction");
		newMap.put("UB_ATM_CASHTXN_REQ", "typ:messageFunction");
		newMap.put("UB_ATM_BALENQ_REQ", "typ:messageFunction");
		newMap.put("UB_ATM_MINSTMT_REQ", "typ:messageFunction");
		newMap.put("UB_IND_PaymentRequestQ", "");
		return newMap;
	}

	public static void main(String[] args) throws Exception {
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
		catch (IOException e) {
			e.printStackTrace();
		}
		processMap(MSGMap);
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
					ap.setTxnDateTime(getTrmDateTime(lineItems));
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
						// System.out.println(Calendar.getInstance().getTimeInMillis());
					}
					else {
						//System.out.println("Untracked Response");
					}
				}
			}
		}
	}

	private static Timestamp getTrmDateTime(List<String> lineItems) {
		String startTag = "<typ:txnDateTime>";
		String endTag = "</typ:txnDateTime>";
		String msg = lineItems.get(lineItems.size() - 2);
		//System.out.println(msg);
		int start = msg.indexOf(startTag) + startTag.length();
		int end = msg.indexOf(endTag);
		String txnDateTime = "";
		Timestamp timestamp = null;
		if (msg.contains(startTag)) {
			//System.out.println(msg.substring(start, end));
			txnDateTime = msg.substring(start, end - "+01:00".length()).replaceAll("T", " ");
			timestamp = CommonMethods.parseTimestamp("yyyy-MM-dd HH:mm:ss.SSS", txnDateTime);
		}
		return timestamp;
	}

	public static void processMap(HashMap<String, AuditData> lineMap) {
		String filePath = "Result_" + CommonMethods.formatDate("yyyyMMddHHssSSS", new Date(Calendar.getInstance().getTimeInMillis())) + ".csv";
		Path path = Paths.get(filePath);
		//Use try-with-resource to get auto-closeable writer instance
		try (BufferedWriter writer = Files.newBufferedWriter(path)) {
			printHeader(writer);
			for (Map.Entry<String, AuditData> entry : lineMap.entrySet()) {
				AuditData ap = entry.getValue();
				long timeTaken = CommonMethods.getTimeDiff(ap.endTime, ap.startTime);
				long delay = CommonMethods.getTimeDiff(ap.startTime, ap.txnDateTime);
				printResults(writer, entry, ap, timeTaken, delay);
			}
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void printHeader(BufferedWriter writer) throws IOException {
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
		if (writeToFile) {
			writer.write(sb.append("\n").toString());
		}
		else {
			System.out.println(sb.toString());
		}
	}

	private static void printResults(BufferedWriter writer, Map.Entry<String, AuditData> entry, AuditData ap, long timeTaken, long delay) throws IOException {
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
		sb.append(timeTaken).append(tabOrComma);
		sb.append(delay).append(tabOrComma);
		if (writeToFile) {
			writer.write(sb.append("\n").toString());
		}
		else {
			System.out.println(sb.toString());
		}
	}
}