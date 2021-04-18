package audit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

import pojo.AuditData;

public class ProcessDCACCTFRAudit {
	static int counter = 0;

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		HashMap<String, AuditData> hm = readFileAsString("C:\\Users\\amanjuna\\Desktop\\YOMA_5.3.1.1\\20180927\\DC_ACCTFR.txt");
		// printHashMap(hm);
	}

	public static HashMap<String, AuditData> readFileAsString(String fileName) throws ParseException {
		HashMap<String, AuditData> hm = new HashMap<String, AuditData>();
		try {
			File file = new File(fileName);
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				stringBuffer.append(line);
				AuditData auditData = extractResults(line);
				if (!hm.containsKey(auditData.correlationID)) {
					hm.put(auditData.correlationID, auditData);
				}
				else {
					AuditData temp = hm.get(auditData.correlationID);
					temp.setEndTime(auditData.startTime);
					hm.put(auditData.correlationID, temp);
				}
				stringBuffer.append("\n");
			}
			System.out.println(counter);
			fileReader.close();
		}
		catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		return hm;
	}

	private static AuditData extractResults(String line) throws ParseException {
		AuditData auditData = new AuditData();
		if (line != null && !line.isEmpty()) {
			// String[] list = line.split("|");
			// auditData.setCorrelationID(list[25]);
			List<String> list = Arrays.asList(Pattern.compile("\\|\\|").split(line));
			auditData.setCorrelationID(list.get(26));
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd/hh:mm:ss.SSS");
			Date parsedDate = dateFormat.parse(list.get(1));
			auditData.setStartTime(new Timestamp(parsedDate.getTime()));
			for (int i = 0; i < list.size(); i++) {
				// System.out.println(i + " : " + list.get(i));
			}
			String msg = list.get(29);
			String fromMyAcct = "NA";
			String toMyAcct = "NA";
			String OtherAcct = "NA";
			// int index = msg.indexOf("fromMyAccount");
			// String acctType = "<typ:otherAccount>";
			// String acctType = "<typ:toMyAccount>";
			String acctType = "<typ:toMyAccount>";
			int index = msg.indexOf(acctType);
			if (index > 0) {
				// String acctNum = msg.substring(index + 13, index + 13 + 17);
				String acctNum = msg.substring(index + acctType.length(), index + acctType.length() + 15);
				if (!acctNum.contains("<"))
					toMyAcct = acctNum;
				// counter++;
			}
			acctType = "<typ:fromMyAccount>";
			index = msg.indexOf(acctType);
			if (index > 0) {
				// String acctNum = msg.substring(index + 13, index + 13 + 17);
				String acctNum = msg.substring(index + acctType.length(), index + acctType.length() + 15);
				if (!acctNum.contains("<"))
					fromMyAcct = acctNum;
				// counter++;
			}
			acctType = "<typ:otherAccount>";
			index = msg.indexOf(acctType);
			if (index > 0) {
				// String acctNum = msg.substring(index + 13, index + 13 + 17);
				String acctNum = msg.substring(index + acctType.length(), index + acctType.length() + 15);
				if (!acctNum.contains("<"))
					OtherAcct = acctNum;
				// counter++;
			}
			String amt = "<typ:amount>";
			index = msg.indexOf(amt);
			if (index > 0) {
				// String acctNum = msg.substring(index + 13, index + 13 + 17);
				String acctNum = msg.substring(index + acctType.length(), msg.indexOf("</typ:amount>"));
				if (!acctNum.contains("<"))
					amt = acctNum;
				// counter++;
			}
			System.out.println(list.get(1) + " " + fromMyAcct + " " + toMyAcct + " " + OtherAcct + " " + amt);
		}
		return auditData;
	}

	public static void printHashMap(HashMap<String, AuditData> hm) {
		System.out.println("------------------------------------------------");
		System.out.println("Iterating or looping map using java5 foreach loop");
		for (String key : hm.keySet()) {
			System.out.println("key: " + key + " value: " + (hm.get(key).getEndTime().getTime() - hm.get(key).getStartTime().getTime()));
		}
	}
}
