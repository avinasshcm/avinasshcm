import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Calendar.getInstance().getTimeInMillis());
		System.out.println(getDate("YYYY-MM-dd'T'hh:mm:ss.sss XXX"));
		System.out.println(Calendar.getInstance().getTimeInMillis());
		System.out.println(parseDate("YYYY-MM-dd'T'hh:mm:ss.sssXXX", "2021-04-17T11:22:30.000+01:00"));
	}

	protected static String getDate(Calendar cal, String format) {
		String date = new SimpleDateFormat(format).format(cal.getInstance().getTimeInMillis());
		return date;
	}

	protected static String getDate(String format) {
		String date = new SimpleDateFormat(format).format(new Date());
		return date;
	}

	protected static Date parseDate(String format, String dateStr) {
		Date date = null;
		try {
			date = new SimpleDateFormat(format).parse(dateStr);
		}
		catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
}
