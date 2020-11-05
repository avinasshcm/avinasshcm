import java.sql.Date;
import java.util.Calendar;



public class DateDifference {

    public static void main(String[] args) throws InterruptedException {
        long time = Calendar.getInstance().getTimeInMillis();
        Date firstDate = new Date(time);
        Thread.sleep(10000);
        time = Calendar.getInstance().getTimeInMillis();
        Date secDate = new Date(time);
        System.out.println(run(firstDate, secDate));
    }

    public static Integer run(java.util.Date date1, java.util.Date date2) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        Calendar cal3 = Calendar.getInstance();
        Calendar cal4 = Calendar.getInstance();
        cal1.setTime(date1);
        cal3.set(cal1.get(Calendar.YEAR), cal1.get(Calendar.MONTH), cal1.get(Calendar.DATE));
        cal2.setTime(date2);
        cal4.set(cal2.get(Calendar.YEAR), cal2.get(Calendar.MONTH), cal2.get(Calendar.DATE));
        long t1 = cal3.getTime().getTime();
        long t2 = cal4.getTime().getTime();
        int fDateOffset = cal1.get(Calendar.DST_OFFSET);
        int tDateOffset = cal2.get(Calendar.DST_OFFSET);
        double days1 = (t1 + fDateOffset) / (1000 * 60 * 60 * 24);
        double days2 = (t2 + tDateOffset) / (1000 * 60 * 60 * 24);
        int days = new Double(days1 - days2).intValue();
        return new Integer(days);
    }
}
