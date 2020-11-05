package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MutualFundUtils {

    public static String changeDateFormat(String date, String srcFormat, String destFormat) {
        SimpleDateFormat format1 = new SimpleDateFormat(srcFormat);
        SimpleDateFormat format2 = new SimpleDateFormat(destFormat);
        Date date1 = new Date(date);
        try {
            date1 = format1.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return format2.format(date1);
    }
    
    public static String getDate(Calendar cal, String format) {
        String date = new SimpleDateFormat(format).format(cal.getInstance().getTimeInMillis());
        return date;
    }
}
