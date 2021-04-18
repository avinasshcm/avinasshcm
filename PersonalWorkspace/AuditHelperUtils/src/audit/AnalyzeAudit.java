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
public class AnalyzeAudit {
	private static final String AuditDir = "C:\\Users\\amanjuna\\Desktop\\20200127_ATM_Timeout\\audit-20200127124220\\Messaging.txt";

	public static void main(String[] args) throws Exception {
		// pass the path to the file as a parameter
		HashMap<String, AuditData> lineMap = new HashMap<String, AuditData>();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(AuditDir));
			String line = reader.readLine();
			while (line != null) {
				String[] lineItems = line.split("\\|\\|");
				String mfID = lineItems[23];
				String time = lineItems[0];
				String serviceName = lineItems[6];
				AuditData ap = new AuditData();
				if (lineItems[9].equals("'IN'")) {
					System.out.println(lineItems[0] + "\t" + lineItems[8] + "\t" + lineItems[9] + "\t" + lineItems[23] + "\t" + lineItems[6]);
				}
				else {
					System.out.println(lineItems[0] + "\t" + lineItems[8] + "\t" + lineItems[9] + "\t" + lineItems[20] + "\t" + lineItems[6]);
				}
				if (lineMap.containsKey(mfID)) {
					ap = lineMap.get(mfID);
					ap.setEndTime(getDate(time));
					// System.out.println(Calendar.getInstance().getTimeInMillis());
				}
				else {
					ap.setStartTime(getDate(time));
					ap.setServiceName(serviceName);
					lineMap.put(mfID, ap);
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
		processMap(lineMap);
	}

	public static void processMap(HashMap<String, AuditData> lineMap) {
		for (Map.Entry<String, AuditData> entry : lineMap.entrySet()) {
			AuditData ap = entry.getValue();
			long diff = ap.endTime.getTime() - ap.startTime.getTime();
			System.out.println(entry.getKey() + "\t" + diff);
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