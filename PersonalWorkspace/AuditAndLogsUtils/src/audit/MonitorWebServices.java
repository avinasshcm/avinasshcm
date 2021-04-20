package audit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import common.CommonMethods;
import pojo.WebServiceData;

public class MonitorWebServices {
	private static final String AuditDir = "D:\\Essence\\INSTALL-LOCATION\\CTTDEV\\AuditDir\\default_running\\audit.txt";

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
			WebServiceData ap = entry.getValue();
			long timeTaken = CommonMethods.getTimeDiff(ap.endTime, ap.startTime);
			ap.setTimeTaken(timeTaken);
			printResults(entry, ap);
		}
	}

	private static void printHeader() {
		StringBuilder sb = new StringBuilder();
		sb.append("Correlation ID").append("\t");
		sb.append("ServiceName").append("\t");
		sb.append("User ID").append("\t");
		sb.append("Invocation Mode").append("\t");
		sb.append("Status").append("\t");
		sb.append("ThreadID").append("\t");
		sb.append("StartTime").append("\t");
		sb.append("EndTime").append("\t");
		sb.append("TimeTaken(ms)").append("\t");
		System.out.println(sb.toString());
	}

	private static void printResults(Map.Entry<String, WebServiceData> entry, WebServiceData ap) {
		StringBuilder sb = new StringBuilder();
		sb.append(entry.getKey()).append("\t");
		sb.append(ap.getServiceName()).append("\t");
		sb.append(ap.getUser()).append("\t");
		sb.append(ap.getInvocationMode()).append("\t");
		sb.append(/*ap.getStatus()*/"").append("\t");
		sb.append(ap.getThreadID()).append("\t");
		sb.append(ap.startTime).append("\t");
		sb.append(ap.endTime).append("\t");
		sb.append(ap.timeTaken).append("\t");
		System.out.println(sb.toString());
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
					ap.setThreadID(CommonMethods.getThreadID(lineItems, "CurrentThread", "'WebContainer : ", "'"));
					FBPMap.put(correlationID, ap);
				}
				else if (direction.contains("Out-Message")) {
					if (FBPMap.containsKey(correlationID)) {
						ap = FBPMap.get(correlationID);
						ap.setEndTime(CommonMethods.parseTimestamp(time));
						ap.setStatus(lineItems.get(CommonMethods.getIndexOf(lineItems, "STATUS") + 1).replaceAll("'", ""));
						ap.setUser(lineItems.get(4).replaceAll("'", ""));
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
