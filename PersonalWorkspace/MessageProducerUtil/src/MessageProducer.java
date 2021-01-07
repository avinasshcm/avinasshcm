import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import fileutils.ReadQueueManagerDetails;
import transaction.InternalPayment;
import transaction.IntraBankPayment;
import transaction.MobileTopUp;

public class MessageProducer {
	private final static AtomicInteger count = new AtomicInteger(0);
	static long start = System.currentTimeMillis();

	public static void main(String args[]) {
		System.out.print("\n1.DC Account Transfer ");
		System.out.print("\nEnter Your Selection : ");
		String option = readLine();
		// String option = c.readLine();
		if ((!option.equals("1"))) {
			System.out.println("Enter valid option");
		}
		// String numberOfTxns = c.readLine("Enter the number of messages: ", new Object[0]);
		System.out.print("\nEnter Number of Threads : ");
		String numberOfThreads = readLine();
		if ((numberOfThreads == null) || (numberOfThreads.trim().length() <= 0)) {
			System.out.println("Invalid number of Threads.");
			return;
		}
		System.out.print("\nEnter Number of Transactions to be pushed : ");
		String numberOfTxns = readLine();
		if ((numberOfTxns == null) || (numberOfTxns.trim().length() <= 0)) {
			System.out.println("Invalid number of txns.");
			return;
		}
		System.out.println("Started publishing DC Messages with Run Name : " + ReadQueueManagerDetails.RUN_NAME);
		ExecutorService executor = Executors.newFixedThreadPool(100);
		for (int i = 0; i < Integer.parseInt(numberOfThreads); i++) {
			if ((System.currentTimeMillis() - start) >= 300000) {
				System.out.println("Iterations : " + count.get());
				System.exit(0);
			}
			Runnable intraBankWorker = new IntraBankPayment(numberOfTxns);
			executor.execute(intraBankWorker);
			Runnable internalWorker = new InternalPayment(numberOfTxns);
			executor.execute(internalWorker);
			/*Runnable mobileTopUpWorker = new MobileTopUp(numberOfTxns); 
			executor.execute(mobileTopUpWorker);*/
		}
		executor.shutdown();
		// Wait until all threads are finish
		while (!executor.isTerminated()) {
		}
		System.out.println("Completed publishing DC Messages with Run Name : " + ReadQueueManagerDetails.RUN_NAME);
	}

	public static String readLine() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String option = null;
		try {
			option = br.readLine();
		}
		catch (IOException ioe) {
			System.out.println("IO error trying to read Input!");
		}
		return option;
	}
}
