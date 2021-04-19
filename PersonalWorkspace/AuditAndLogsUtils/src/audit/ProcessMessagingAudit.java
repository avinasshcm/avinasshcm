package audit;

// Java Program to illustrate reading from
// FileReader using FileReader
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import pojo.AuditData;

//PSD2
public class ProcessMessagingAudit {
	private static final String AuditDir = "D:\\Finastra\\Fonseca, Bruno - SP1.1_POSMSG\\Supreeth\\audit-20210417213810\\Messaging.txt";
	private static final HashMap<String, String> referenceTag = referenceTagMap();
	private static final HashMap<String, String> txnCodeTag = txnCodeTagMap();
	private static final HashMap<String, String> msgFunctionTag = msgFunctionTagMap();

	private static HashMap<String, String> referenceTagMap() {
		HashMap<String, String> newMap = new HashMap<String, String>();
		newMap.put("'UB_POS_POSMSG_REQ'", "typ:holdReference");
		newMap.put("'UB_ATM_CASHTXN_REQ'", "typ:tellerTxnReferece");
		newMap.put("'UB_IND_PaymentRequestQ'", "typ:transactionalItem");
		return newMap;
	}

	private static HashMap<String, String> txnCodeTagMap() {
		HashMap<String, String> newMap = new HashMap<String, String>();
		newMap.put("'UB_POS_POSMSG_REQ'", "head:messageType");
		newMap.put("'UB_ATM_CASHTXN_REQ'", "head:messageType");
		newMap.put("'UB_IND_PaymentRequestQ'", "typ:transactionalType");
		return newMap;
	}

	private static HashMap<String, String> msgFunctionTagMap() {
		HashMap<String, String> newMap = new HashMap<String, String>();
		newMap.put("'UB_POS_POSMSG_REQ'", "typ:messageFunction");
		newMap.put("'UB_ATM_CASHTXN_REQ'", "typ:messageFunction");
		newMap.put("'UB_IND_PaymentRequestQ'", "");
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
				String[] lineItems = line.split("\\|\\|");
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

	private static void readTime(HashMap<String, AuditData> FBPMap, String[] lineItems) throws ParseException {
		int index = getIndexOf(lineItems, "MessageGUID") + 1;
		int serviceNameIndex = getIndexOf(lineItems, "JmsEndPointDestination") + 1;
		int directionIndex = getIndexOf(lineItems, "Messaging") + 1;
		String direction = lineItems[directionIndex];
		if (lineItems.length > 20) {
			if (index > 1) {
				AuditData ap = new AuditData();
				String correlationID = lineItems[index];
				String time = lineItems[0];
				String serviceName = lineItems[serviceNameIndex];
				if (direction.contains("IN")) {
					ap.setStartTime(parseTimestamp(time));
					ap.setServiceName(serviceName);
					ap.setTxnDateTime(getTrmDateTime(lineItems));
					ap.setTxnCode(getTagValue(txnCodeTag.get(serviceName), lineItems));
					ap.setTxnRef(getTagValue(referenceTag.get(serviceName), lineItems));
					ap.setMsgFunction(getTagValue(msgFunctionTag.get(serviceName), lineItems));
					ap.setThreadID(getThreadID(lineItems));
					FBPMap.put(correlationID, ap);
				}
				else if (direction.contains("OUT")) {
					if (FBPMap.containsKey(correlationID)) {
						ap = FBPMap.get(correlationID);
						ap.setEndTime(parseTimestamp(time));
						// System.out.println(Calendar.getInstance().getTimeInMillis());
					}
					else {
						//System.out.println("Untracked Response");
					}
				}
			}
		}
	}

	private static String getThreadID(String[] lineItems) {
		int indexOfThread = getIndexOf(lineItems, "TCPWorkerThreadID") + 1;
		String threadID = "";
		try {
			threadID = lineItems[indexOfThread];
		}
		catch (Exception e) {
			// System.out.println(lineItems[0]);
		}
		threadID = threadID.replaceAll("\\'Camel \\(camel\\) thread \\#", "");
		threadID = threadID.replaceAll(" - JmsConsumer[A-Za-z\\_\\[\\]]*\\'", "");
		//System.out.println(threadID);
		return threadID;
	}

	private static int getIndexOf(String[] lineItems, String tagName) {
		int counter = 0;
		for (int i = 0; i < lineItems.length - 1; i++) {
			if (lineItems[i].contains(tagName)) {
				break;
			}
			counter++;
		}
		if (counter == lineItems.length - 1) {
			counter = 0;
		}
		return counter;
	}

	private static Timestamp getTrmDateTime(String[] lineItems) {
		String startTag = "<typ:txnDateTime>";
		String endTag = "</typ:txnDateTime>";
		String msg = lineItems[lineItems.length - 2];
		//System.out.println(msg);
		int start = msg.indexOf(startTag) + startTag.length();
		int end = msg.indexOf(endTag);
		String txnDateTime = "";
		Timestamp timestamp = null;
		if (msg.contains(startTag)) {
			//System.out.println(msg.substring(start, end));
			txnDateTime = msg.substring(start, end - "+01:00".length()).replaceAll("T", " ");
			timestamp = parseTimestamp("yyyy-MM-dd HH:mm:ss.SSS", txnDateTime);
		}
		return timestamp;
	}

	private static String getTagValue(String tagName, String[] lineItems) {
		String txnCode = "";
		String startTag = "<" + tagName + ">";
		String endTag = "</" + tagName + ">";
		String emptyTag = "<" + tagName + "/>";
		String msg = lineItems[lineItems.length - 2];
		//System.out.println(msg);
		if (!msg.contains(emptyTag)) {
			int start = msg.indexOf(startTag) + startTag.length();
			int end = msg.indexOf(endTag);
			if (msg.contains(startTag)) {
				//System.out.println(msg.substring(start, end));
				txnCode = msg.substring(start, end);
			}
		}
		return txnCode;
	}

	public static void processMap(HashMap<String, AuditData> lineMap) {
		printHeader();
		for (Map.Entry<String, AuditData> entry : lineMap.entrySet()) {
			AuditData ap = entry.getValue();
			long timeTaken = getTimeDiff(ap.endTime, ap.startTime);
			long delay = getTimeDiff(ap.startTime, ap.txnDateTime);
			printResults(entry, ap, timeTaken, delay);
		}
	}

	private static void printHeader() {
		StringBuilder sb = new StringBuilder();
		sb.append("TransactionReference").append("\t");
		sb.append("Correlation ID").append("\t");
		sb.append("ServiceName").append("\t");
		sb.append("TransactionCode").append("\t");
		sb.append("MessageFunction").append("\t");
		sb.append("ThreadID").append("\t");
		sb.append("StartTime").append("\t");
		sb.append("EndTime").append("\t");
		sb.append("TxnDateTime").append("\t");
		sb.append("TimeTaken(ms)").append("\t");
		sb.append("Delay(ms)").append("\t");
		System.out.println(sb.toString());
	}

	private static void printResults(Map.Entry<String, AuditData> entry, AuditData ap, long timeTaken, long delay) {
		StringBuilder sb = new StringBuilder();
		sb.append(ap.getTxnRef()).append("\t");
		sb.append(entry.getKey()).append("\t");
		sb.append(ap.getServiceName()).append("\t");
		sb.append(ap.getTxnCode()).append("\t");
		sb.append(ap.getMsgFunction()).append("\t");
		sb.append(ap.getThreadID()).append("\t");
		sb.append(ap.startTime).append("\t");
		sb.append(ap.endTime).append("\t");
		sb.append(ap.txnDateTime != null ? ap.txnDateTime : "").append("\t");
		sb.append(timeTaken).append("\t");
		sb.append(delay).append("\t");
		System.out.println(sb.toString());
	}

	private static long getTimeDiff(Timestamp start, Timestamp end) {
		long delay = 0;
		try {
			delay = start.getTime() - end.getTime();
		}
		catch (Exception e) {
			// System.out.println(ap.endTime);
			// System.out.println(ap.startTime);
		}
		return delay;
	}

	// 2019.08.12/20:22:19.596
	public static Timestamp parseTimestamp(String dateStr) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd/HH:mm:ss.SSS");
		Date parsedDate = dateFormat.parse(dateStr);
		Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
		return timestamp;
	}

	protected static Date parseDate(String format, String dateStr) {
		Date date = null;
		try {
			date = new SimpleDateFormat(format).parse(dateStr);
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	protected static Timestamp parseTimestamp(String format, String dateStr) {
		Date date = null;
		Timestamp timestamp = null;
		try {
			date = new SimpleDateFormat(format).parse(dateStr);
			timestamp = new java.sql.Timestamp(date.getTime());
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		return timestamp;
	}

	protected static String formatDate(String format, Date date) {
		String dateStr = new SimpleDateFormat(format).format(new Date());
		return dateStr;
	}
}