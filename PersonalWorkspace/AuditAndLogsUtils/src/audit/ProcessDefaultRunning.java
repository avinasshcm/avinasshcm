package audit;

// Java Program to illustrate reading from
// FileReader using FileReader
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import common.CommonMethods;
import pojo.AuditData;

//PSD2
public class ProcessDefaultRunning {
	private static final String AuditDir = "D:\\POS_Timeout\\BF_running\\Messaging_CASH_REQ.txt";
	private static final HashMap<String, String> referenceTag = referenceTagMap();

	private static HashMap<String, String> referenceTagMap() {
		HashMap<String, String> newMap = new HashMap<String, String>();
		newMap.put("'UB_POS_POSMSG_REQ'", "typ:holdReference");
		newMap.put("'UB_ATM_CASHTXN_REQ'", "typ:tellerTxnReference");
		return newMap;
	}

	public static void main(String[] args) throws Exception {
		// pass the path to the file as a parameter
		HashMap<String, AuditData> SVRMap = new HashMap<String, AuditData>();
		HashMap<String, AuditData> FBPMap = new HashMap<String, AuditData>();
		HashMap<String, AuditData> UXPMap = new HashMap<String, AuditData>();
		HashMap<String, AuditData> MSGMap = new HashMap<String, AuditData>();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(AuditDir));
			String line = reader.readLine();
			while (line != null) {
				//List<String> list = Arrays.asList(Pattern.compile("\\|\\|").split(line));
				String[] lineItems = line.split("\\|\\|");
				//System.out.println(lineItems[5]);
				switch (lineItems[5]) {
				case "'SVR'":
					readTime(SVRMap, lineItems, 20, 23);
					break;
				case "'FBP'":
					readTime(FBPMap, lineItems, 20, 23);
					break;
				case "'UXP'":
					readTime(UXPMap, lineItems, 2, 3);
					break;
				default:
					readTime(MSGMap, lineItems);
					// System.out.println(lineItems[0]);
					// System.out.println(lineItems[5]);
					break;
				}
				// System.out.println(line);
				// read next line
				line = reader.readLine();
			}
			reader.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		// processMap(SVRMap);
		// processMap(FBPMap);
		// processMap(UXPMap);
		processMap(MSGMap);
	}

	private static void readTime(HashMap<String, AuditData> FBPMap, String[] lineItems, int correlationIDIndex, int serviceNameIndex) throws ParseException {
		int index = getIndexOf(lineItems, "MessageGUID") + 1;
		if (lineItems.length > 20) {
			if (index > 1) {
				AuditData ap = new AuditData();
				String correlationID = "";
				try {
					correlationID = lineItems[index];
				}
				catch (Exception e) {
					// System.out.println(lineItems[0]);
				}
				String time = lineItems[0];
				String serviceName = lineItems[serviceNameIndex];
				if (FBPMap.containsKey(correlationID)) {
					ap = FBPMap.get(correlationID);
					ap.setEndTime(CommonMethods.parseTimestamp(time));
				}
				else {
					ap.setStartTime(CommonMethods.parseTimestamp(time));
					ap.setServiceName(serviceName);
					ap.setTxnDateTime(getTrmDateTime(lineItems));
					ap.setThreadID(CommonMethods.getThreadID(lineItems, "TCPWorkerThreadID", "'Camel \\(camel\\) thread #", " - JmsConsumer[A-Za-z\\_\\[\\]]*'"));
					FBPMap.put(correlationID, ap);
				}
			}
		}
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
					ap.setStartTime(CommonMethods.parseTimestamp(time));
					ap.setServiceName(serviceName);
					ap.setTxnDateTime(getTrmDateTime(lineItems));
					ap.setTxnCode(getTagValue("head:messageType", lineItems));
					ap.setTxnRef(getTagValue(referenceTag.get(serviceName), lineItems));
					ap.setMsgFunction(getTagValue("typ:messageFunction", lineItems));
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
			timestamp = CommonMethods.parseTimestamp("yyyy-MM-dd HH:mm:ss.SSS", txnDateTime);
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
			long timeTaken = CommonMethods.getTimeDiff(ap.endTime, ap.startTime);
			long delay = CommonMethods.getTimeDiff(ap.startTime, ap.txnDateTime);
			printResults(entry, ap, timeTaken, delay);
		}
	}

	private static void printResults(Map.Entry<String, AuditData> entry, AuditData ap, long timeTaken, long delay) {
		StringBuilder sb = new StringBuilder();
		sb.append(entry.getKey()).append("\t");
		sb.append(ap.getServiceName()).append("\t");
		sb.append(ap.getTxnCode()).append("\t");
		sb.append(ap.getMsgFunction()).append("\t");
		sb.append(ap.getTxnRef()).append("\t");
		sb.append(ap.getThreadID()).append("\t");
		sb.append(ap.startTime).append("\t");
		sb.append(ap.endTime).append("\t");
		sb.append(ap.txnDateTime).append("\t");
		sb.append(timeTaken).append("\t");
		sb.append(delay).append("\t");
		System.out.println(sb.toString());
	}

	private static void printHeader() {
		StringBuilder sb = new StringBuilder();
		sb.append("Correlation ID").append("\t");
		sb.append("ServiceName").append("\t");
		sb.append("TransactionCode").append("\t");
		sb.append("MessageFunction").append("\t");
		sb.append("TransactionReference").append("\t");
		sb.append("ThreadID").append("\t");
		sb.append("StartTime").append("\t");
		sb.append("EndTime").append("\t");
		sb.append("TxnDateTime").append("\t");
		sb.append("TimeTaken(ms)").append("\t");
		sb.append("Delay(ms)").append("\t");
		System.out.println(sb.toString());
	}
}