import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicInteger;

class MultithreadingDemo extends Thread {

    AtomicInteger count;

    private static DateFormat dateFormatter;

    private static String dateFormat = "yyyy-MM-dd";

    public void run() {
        try {

            int iteration = 10000000;
            while (iteration > 0) {
                // Displaying the thread that is running
                // System.out.println("Thread " + Thread.currentThread().getId() + " is running");
                DateFormat dateFormatter = null;
                if (dateFormatter == null) {
                    dateFormatter = new SimpleDateFormat(dateFormat);
                }
                // synchronized (dateFormatter) {
                String formattedDate = dateFormatter.format(Calendar.getInstance().getTimeInMillis());
                // }

                count.incrementAndGet();
                // System.out.println(formattedDate);
                iteration--;
            }

        } catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
        System.out.println("End : " + new Timestamp(Calendar.getInstance().getTimeInMillis()));

    }
}