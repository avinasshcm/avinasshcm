import java.sql.Date;
import java.sql.Timestamp;
import java.util.Calendar;

public class SavingsPremiumDate {

    public static final Integer INTEGER_ZERO = Integer.valueOf(0);

    public static void main(String[] args) {
        java.sql.Date businessDate = new Date(Calendar.getInstance().getTimeInMillis());

        int THWENTY_THREE = 23;
        int FIFTY_NINE = 59;
        Calendar cal = Calendar.getInstance();
        cal.setTime(businessDate);
        cal.add(2, -1);

        cal.set(5, 1);
        setTime(cal, INTEGER_ZERO.intValue(), INTEGER_ZERO.intValue(), INTEGER_ZERO.intValue());

        Timestamp firstDateOfPreviousMonthTime = new Timestamp(cal.getTime().getTime());

        
        cal.set(5, cal.getActualMaximum(5));
        setTime(cal, THWENTY_THREE, FIFTY_NINE, FIFTY_NINE);

        Timestamp lastDateOfPreviousMonthTime = new Timestamp(cal.getTime().getTime());

        Calendar calDD = Calendar.getInstance();
        calDD.setTime(businessDate);
        calDD.add(2, -2);

        calDD.set(5, 1);
        setTime(calDD, INTEGER_ZERO.intValue(), INTEGER_ZERO.intValue(), INTEGER_ZERO.intValue());

        Timestamp firstDateOfFirstOfSecondMonthTime = new Timestamp(calDD.getTime().getTime());

        
        System.out.println(firstDateOfPreviousMonthTime);
        System.out.println(lastDateOfPreviousMonthTime);
        System.out.println(firstDateOfFirstOfSecondMonthTime);
    }

    private static Calendar setTime(Calendar cal, int hour, int minute, int second) {
        cal.set(10, hour);
        cal.set(12, minute);
        cal.set(13, second);

        return cal;
    }

}
