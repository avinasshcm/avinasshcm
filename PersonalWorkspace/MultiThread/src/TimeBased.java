import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class TimeBased {

    private static DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

    private final static AtomicInteger count = new AtomicInteger(0);

    static long start = System.currentTimeMillis();

    public static void main(String args[]) {
        ExecutorService executor = Executors.newFixedThreadPool(100);

        for (int i = 0; i < 1000000000; i++) {
            if ((System.currentTimeMillis() - start) >= 300000) {
                System.out.println("Iterations : " + count.get());
                System.exit(0);
            }
            Runnable worker = new MultithreadingDemo(); // have a AtomicInteger int to increment the value
            executor.execute(worker);
        }
        executor.shutdown();
        // Wait until all threads are finish
        while (!executor.isTerminated()) {
        }
    }

    static class MultithreadingDemo implements Runnable {

        private static Date date = new Date(Calendar.getInstance().getTimeInMillis());

        @Override
        public void run() {
            try {
                // Displaying the thread that is running
                // System.out.println("Thread " + Thread.currentThread().getId() + " is running");
                // DateFormat dateFormatter = null;
                // dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

                synchronized (dateFormatter) {
                    String formattedDate = dateFormatter.format(date);
                }

                count.incrementAndGet();
                // System.out.println(formattedDate);
            } catch (Exception e) {
                // Throwing an exception
                System.out.println("Exception is caught " + e.getLocalizedMessage());
            }
        }
    }
}
