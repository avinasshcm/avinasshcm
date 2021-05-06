package filedescriptor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

import common.CommonMethods;
import pojo.WebServiceData;

public class ProcessOpenFiles {
	private static final String AuditDir = "D:\\File_Descriptors\\lxpmbf01_open_files_26042021.log";
	private static boolean writeToFile = true;
	private static final String tabOrComma = writeToFile ? "," : "\t";
	private static String excelFileName = "Result_" + CommonMethods.formatDate("yyyyMMdd_HHssSSS", new Date(Calendar.getInstance().getTimeInMillis())) + ".xlsx";

	public static void main(String[] args) {
		// pass the path to the file as a parameter
		HashMap<String, WebServiceData> MSGMap = new HashMap<String, WebServiceData>();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(AuditDir));
			String line = reader.readLine();
			while (line != null) {
				List<String> lineItems = Arrays.asList(Pattern.compile(" ").split(line));
				// System.out.println(line);
				line = reader.readLine();
				Timestamp date = CommonMethods.parseTimestamp("yyyyMMddHHmm", lineItems.get(1));
				if (lineItems.size() ==6) {
					System.out.println(date + "\t" + lineItems.get(3) + "\t" + lineItems.get(5));
				}
			}
			reader.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
