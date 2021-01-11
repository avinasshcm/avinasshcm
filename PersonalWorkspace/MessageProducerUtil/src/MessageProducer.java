import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

import javax.jms.QueueConnectionFactory;

import com.ibm.mq.jms.MQQueueConnectionFactory;

import fileutils.ReadQueueManagerDetails;
import transaction.InternalPayment;
import transaction.IntraBankPayment;
import transaction.SEPAPayment;

public class MessageProducer {
	private final static AtomicInteger count = new AtomicInteger(0);
	static long start = System.currentTimeMillis();

	public static void main(String args[]) {
		System.out.print("\n0.All ");
		System.out.print("\n1.Internal Account Transfer ");
		System.out.print("\n2.IntraBank Account Transfer ");
		System.out.print("\n3.SEPA Account Transfer ");
		System.out.print("\n\nEnter Your Selection : ");
		String option = readLine();
		List validOptions = new ArrayList<>();
		validOptions.add("0");
		validOptions.add("1");
		validOptions.add("2");
		validOptions.add("3");
		// String option = c.readLine();
		if (!validOptions.contains(option)) {
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
		QueueConnectionFactory factory = getFactory();
		for (int i = 0; i < Integer.parseInt(numberOfThreads); i++) {
			if ((System.currentTimeMillis() - start) >= 300000) {
				System.out.println("Iterations : " + count.get());
				System.exit(0);
			}
			//System.out.println("Started Thread");
			if (option.equals("0") || option.equals("1")) {
				Runnable internalWorker = new InternalPayment(factory, numberOfTxns);
				executor.execute(internalWorker);
			}
			if (option.equals("0") || option.equals("2")) {
				Runnable intraBankWorker = new IntraBankPayment(factory, numberOfTxns);
				executor.execute(intraBankWorker);
			}
			if (option.equals("0") || option.equals("3")) {
				Runnable sepaWorker = new SEPAPayment(factory, numberOfTxns);
				executor.execute(sepaWorker);
			}
		}
		executor.shutdown();
		// Wait until all threads are finish
		while (!executor.isTerminated()) {
		}
		System.out.println("Completed publishing DC Messages with Run Name : " + ReadQueueManagerDetails.RUN_NAME);
	}

	private static QueueConnectionFactory getFactory() {
		String mqserver = ReadQueueManagerDetails.QM_HOSTNAME;
		String port = ReadQueueManagerDetails.QM_PORT;
		String queuemgr = ReadQueueManagerDetails.QM_NAME;
		String connectionFactory = "com.ibm.mq.jms.MQQueueConnectionFactory";
		QueueConnectionFactory factory = new MQQueueConnectionFactory();
		try {
			Class.forName(connectionFactory);
			factory = new MQQueueConnectionFactory();
			((MQQueueConnectionFactory) factory).setQueueManager(queuemgr);
			((MQQueueConnectionFactory) factory).setHostName(mqserver);
			((MQQueueConnectionFactory) factory).setPort(Integer.parseInt(port));
			((MQQueueConnectionFactory) factory).setTransportType(1);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return factory;
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
