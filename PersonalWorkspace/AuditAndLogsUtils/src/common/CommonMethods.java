package common;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonMethods {
	public CommonMethods() {
	}

	public static int getIndexOf(String[] lineItems, String tagName) {
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

	public static String getTagValue(String tagName, String[] lineItems) {
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

	public static long getTimeDiff(Timestamp start, Timestamp end) {
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

	public static Date parseDate(String format, String dateStr) {
		Date date = null;
		try {
			date = new SimpleDateFormat(format).parse(dateStr);
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	public static Timestamp parseTimestamp(String format, String dateStr) {
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

	public static String formatDate(String format, Date date) {
		String dateStr = new SimpleDateFormat(format).format(new Date());
		return dateStr;
	}

	public static Timestamp getTrmDateTime(String[] lineItems) {
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

	public static String getThreadID(String[] lineItems, String tagName, String prefix, String suffix) {
		int indexOfThread = getIndexOf(lineItems, tagName) + 1;
		String threadID = "";
		try {
			threadID = lineItems[indexOfThread];
		}
		catch (Exception e) {
			// System.out.println(lineItems[0]);
		}
		threadID = threadID.replaceAll(prefix, "");
		threadID = threadID.replaceAll(suffix, "");
		//System.out.println(threadID);
		return threadID;
	}
}
