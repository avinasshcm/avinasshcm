import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import pojo.ISOData;

public class ProcessISOLogs {
	private static final String AuditDir = "D:\\POS_Timeout\\ISO_Logs\\ISO_IN_OUT.txt";

	public static void main(String[] args) {
		// pass the path to the file as a parameter
		HashMap<String, ISOData> MSGMap = new HashMap<String, ISOData>();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(AuditDir));
			String line = reader.readLine();
			while (line != null) {
				if (line.contains("ISO8583.ISO8583.IntegrationFlowService") && line.contains("INFO") && !line.contains("retrievalReferenceNumber")) {
					try {
						readTime(MSGMap, line);
					}
					catch (Exception e) {
						e.printStackTrace();
						System.out.println(line);
					}
				}
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

	private static void readTime(HashMap<String, ISOData> FBPMap, String line) {
		Timestamp timestamp = extractTimestamp(line);
		//System.out.println(timestamp);
		String[] lineData = line.split("\\|");
		//System.out.println(lineData[1]);
		//System.out.println(lineData[2]);
		String txnRef = lineData[3];
		ISOData isoData = new ISOData();
		if (FBPMap.containsKey(txnRef)) {
			isoData = FBPMap.get(txnRef);
		}
		else {
			isoData.setTxnRef(txnRef);
		}
		switch (lineData[1]) {
		case "REQ":
			if (lineData[2].equals("BFM")) {
				isoData.setIsoINTime(timestamp);
			}
			else if (lineData[2].equals("FBE")) {
				isoData.setTxnType(getTransactionType(lineData[0]));
				isoData.setFbeINTime(timestamp);
			}
			break;
		case "RES":
			if (lineData[2].equals("BFM")) {
				isoData.setIsoOUTTime(timestamp);
			}
			else if (lineData[2].equals("FBE")) {
				isoData.setFbeOUTTime(timestamp);
			}
			break;
		default:
			break;
		}
		FBPMap.put(txnRef, isoData);
	}

	private static String getTransactionType(String line) {
		String txnCode = "";
		String startTag = "ISO8583_1993_to_";
		String endTag = "  - ";
		if (line.contains(startTag)) {
			int start = line.indexOf(startTag) + startTag.length();
			int end = line.indexOf(endTag);
			//System.out.println(msg.substring(start, end));
			txnCode = line.substring(start, end);
			//System.out.println(txnCode);
		}
		return txnCode;
	}

	private static Timestamp extractTimestamp(String line) {
		int startIndex = line.indexOf("[") + 1;
		int endIndex = line.indexOf("]");
		String timestamp = line.substring(startIndex, endIndex);
		//System.out.println(timestamp);
		//return parseTimestamp("dd-MM-YYYY HH:mm:ss:SSS z", timestamp);
		return parseTimestamp("dd-MM-yyyy HH:mm:ss:SSS", timestamp.replaceAll(" WEST", ""));
	}

	protected static Timestamp parseTimestamp(String format, String dateStr) {
		Date date = null;
		Timestamp timestamp = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			//sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
			date = sdf.parse(dateStr);
			//long diff = TimeZone.getDefault().getRawOffset() - sdf.getTimeZone().getRawOffset();
			//timestamp = new java.sql.Timestamp(date.getTime() - diff);
			timestamp = new java.sql.Timestamp(date.getTime());
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		return timestamp;
	}

	public static void processMap(HashMap<String, ISOData> lineMap) {
		printHeader();
		for (Map.Entry<String, ISOData> entry : lineMap.entrySet()) {
			ISOData ap = entry.getValue();
			long isoReqTime = getTimeDiff(ap.fbeINTime, ap.isoINTime);
			long isoResTime = getTimeDiff(ap.isoOUTTime, ap.fbeOUTTime);
			long fbeTimeTaken = getTimeDiff(ap.fbeOUTTime, ap.fbeINTime);
			printResults(entry, ap, isoReqTime, isoResTime, fbeTimeTaken);
		}
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

	private static void printHeader() {
		StringBuilder sb = new StringBuilder();
		sb.append("Correlation ID").append("\t");
		sb.append("Txn Type").append("\t");
		sb.append("ISO IN Time").append("\t");
		sb.append("FBE IN Time").append("\t");
		sb.append("ISO REQ TimeTaken(ms)").append("\t");
		sb.append("FBE OUT Time").append("\t");
		sb.append("ISO OUT Time").append("\t");
		sb.append("ISO RES TimeTaken(ms)").append("\t");
		sb.append("FBE TimeTaken(ms)").append("\t");
		System.out.println(sb.toString());
	}

	private static void printResults(Map.Entry<String, ISOData> entry, ISOData ap, long isoReqTime, long isoResTime, long fbeTimeTaken) {
		StringBuilder sb = new StringBuilder();
		if (ap.isoINTime != null) {
			sb.append(entry.getKey()).append("\t");
			sb.append(ap.txnType).append("\t");
			sb.append(ap.isoINTime).append("\t");
			sb.append(ap.fbeINTime).append("\t");
			sb.append(isoReqTime).append("\t");
			sb.append(ap.fbeOUTTime).append("\t");
			sb.append(ap.isoOUTTime).append("\t");
			sb.append(isoResTime).append("\t");
			sb.append(fbeTimeTaken).append("\t");
			System.out.println(sb.toString());
		}
	}
}
