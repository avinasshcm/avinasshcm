import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormat {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDate(Calendar.getInstance(), "YYYY-MM-dd"));
		System.out.println(Calendar.getInstance().getTimeInMillis());
		System.out.println(getDate("YYYY-MM-dd'T'hh:mm:ss.sssXXX"));
		System.out.println(Calendar.getInstance().getTimeInMillis());
	}

	protected static String getDate(Calendar cal, String format) {
		String date = new SimpleDateFormat(format).format(cal.getInstance().getTimeInMillis());
		return date;
	}

	protected static String getDate(String format) {
		String date = new SimpleDateFormat(format).format(new Date());
		return date;
	}
}
