
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

//PSD2
public class ProcessDefaultRunning {
	private static final String AuditDir = "D:\\OneDrive - Finastra\\CTT\\New_ATM_Framework\\audit\\consolidated.txt";

	public static void main(String[] args) throws Exception {
		// pass the path to the file as a parameter
		HashMap<String, AuditPojo> SVRMap = new HashMap<String, AuditPojo>();
		HashMap<String, AuditPojo> FBPMap = new HashMap<String, AuditPojo>();
		HashMap<String, AuditPojo> UXPMap = new HashMap<String, AuditPojo>();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(AuditDir));
			String line = reader.readLine();
			while (line != null) {
				String[] lineItems = line.split("\\|\\|");
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
		processMap(UXPMap);
	}

	private static void readTime(HashMap<String, AuditPojo> FBPMap, String[] lineItems, int correlationIDIndex, int serviceNameIndex) throws ParseException {
		if (lineItems.length > 20) {
			AuditPojo ap = new AuditPojo();
			String correlationID = "";
			try {
				correlationID = lineItems[correlationIDIndex];
			}
			catch (Exception e) {
				// System.out.println(lineItems[0]);
			}
			String time = lineItems[0];
			String serviceName = lineItems[serviceNameIndex];
			if (FBPMap.containsKey(correlationID)) {
				ap = FBPMap.get(correlationID);
				ap.setEndTime(getDate(time));
				// System.out.println(Calendar.getInstance().getTimeInMillis());
			}
			else {
				ap.setStartTime(getDate(time));
				ap.setServiceName(serviceName);
				FBPMap.put(correlationID, ap);
			}
		}
	}

	public static void processMap(HashMap<String, AuditPojo> lineMap) {
		System.out.println("Correlation ID" + "\t" + "ServiceName" + "\t" + "StartTime" + "\t" + "EndTime" + "\t" + "TimeTaken");
		for (Map.Entry<String, AuditPojo> entry : lineMap.entrySet()) {
			AuditPojo ap = entry.getValue();
			long diff = 0;
			try {
				diff = ap.endTime.getTime() - ap.startTime.getTime();
			}
			catch (Exception e) {
				// System.out.println(ap.endTime);
				// System.out.println(ap.startTime);
			}
			System.out.println(entry.getKey() + "\t" + ap.getServiceName() + "\t" + ap.startTime + "\t" + ap.endTime + "\t" + diff);
		}
	}

	// 2019.08.12/20:22:19.596
	public static Timestamp getDate(String date) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd/hh:mm:ss.SSS");
		Date parsedDate = dateFormat.parse(date);
		Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
		return timestamp;
	}
}