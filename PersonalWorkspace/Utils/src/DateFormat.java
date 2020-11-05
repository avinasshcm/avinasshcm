import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormat {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println(getDate(Calendar.getInstance(), "YYYY-MM-dd"));
        System.out.println(Calendar.getInstance().getTimeInMillis());
    }

    protected static String getDate(Calendar cal, String format) {
        String date = new SimpleDateFormat(format).format(cal.getInstance().getTimeInMillis());
        return date;
    }
}
