import java.sql.Timestamp;
import java.util.Calendar;

// Main Class
public class Multithread {

    public static void main(String[] args) {

        long start = Calendar.getInstance().getTimeInMillis();

        ;
        System.out.println("Start : " + new Timestamp(start));
        int n = 1000; // Number of threads
        int iteration = 10000;
        while (iteration > 0) {
            for (int i = 0; i < 8; i++) {
                MultithreadingDemo object = new MultithreadingDemo();
                object.start();
            }
            iteration--;
        }

        long end = Calendar.getInstance().getTimeInMillis();
        System.out.println("Start : " + new Timestamp(end));
        System.out.println("Time Taken : " + (end - start) + " milliseconds");
    }
}