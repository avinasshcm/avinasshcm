import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class TimeBasedNewInstance {
	private final static AtomicInteger count = new AtomicInteger(0);
	// private static DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
	private static final Date a = new Date(0L);
	static long start = System.currentTimeMillis();
	static Runnable worker = new MultithreadingDemo();

	public static void main(String args[]) {
		ExecutorService executor = Executors.newFixedThreadPool(100);
		for (int i = 0; i < 1000000000; i++) {
			if ((System.currentTimeMillis() - start) >= 300000) {
				System.out.println("Iterations : " + count.get());
				System.exit(0);
			}
			executor.execute(worker);
		}
		executor.shutdown();
		// Wait until all threads are finish
		while (!executor.isTerminated()) {
		}
	}

	static class MultithreadingDemo implements Runnable {
		private DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");

		@Override
		public void run() {
			try {
				// Displaying the thread that is running
				// System.out.println("Thread " + Thread.currentThread().getId() + " is running");
				// DateFormat dateFormatter = null;
				// dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
				dateFormatter.format(a);
				count.incrementAndGet();
				// System.out.println(formattedDate);
			}
			catch (Exception e) {
				System.out.println("Exception is caught");
			}
		}
	}
}
