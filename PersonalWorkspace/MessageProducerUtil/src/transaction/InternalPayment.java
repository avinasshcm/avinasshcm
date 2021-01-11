package transaction;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.logging.Logger;

import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.TextMessage;

import com.ibm.mq.jms.MQQueueConnectionFactory;

import fileutils.ReadQueueManagerDetails;
import pojo.DCTxnData;
import utils.CommonMethods;

public class InternalPayment implements Runnable {
	HashMap<Integer, DCTxnData> data = new HashMap<Integer, DCTxnData>();
	String numberOfTxns = "1";
	private static final Logger LOGGER = Logger.getLogger(InternalPayment.class.getName());
	QueueConnectionFactory factory = new MQQueueConnectionFactory();
	CommonMethods commonMethods = new CommonMethods();

	public InternalPayment() {
	}

	public InternalPayment(QueueConnectionFactory factory, String numberOfTxns) {
		this.numberOfTxns = numberOfTxns;
		this.factory = factory;
	}

	public void run() {
		LOGGER.info("InternalPayment Started " + Thread.currentThread().getId());
		String originalMessage = readFileAsString("templates/Request_InternalTransfer.xml");
		QueueConnection connection = null;
		QueueSession session = null;
		Queue queue = null;
		QueueSender sender = null;
		populateValues();
		int noOfTxns = Integer.parseInt(this.numberOfTxns);
		try {
			connection = factory.createQueueConnection("", "");
			connection.start();
			session = connection.createQueueSession(false, 1);
			queue = session.createQueue(ReadQueueManagerDetails.DC_ACCTFR_QUEUE_NAME);
			sender = session.createSender(queue);
		}
		catch (Exception exception) {
			System.err.println(exception);
		}
		for (int message = 1; message <= noOfTxns; message++) {
			// System.out.println("data " + this.data.size());
			// System.out.println("Msg " + message);
			int counter = message % this.data.size();
			// System.out.println("counter " + counter);
			DCTxnData txnData = this.data.get(counter);
			String modifiedMessage = originalMessage.replaceAll("TRANSACTION_REF", commonMethods.getReference(txnData.getTxnRef()));
			modifiedMessage = modifiedMessage.replaceAll("DR_CUST_ID", txnData.getDebitCustomer());
			modifiedMessage = modifiedMessage.replaceAll("FROM_ACCOUNT", txnData.getFromAccount());
			modifiedMessage = modifiedMessage.replaceAll("TO_ACCOUNT", txnData.getToAccount());
			/*
			LOGGER.addHandler(new LogHelper("logs/LOG_InternalPayment.log").getLogHandler());
			LOGGER.setUseParentHandlers(false);
			LOGGER.info(XMLFormatter.minifyXML(modifiedMessage));
			LOGGER.setUseParentHandlers(true);
			*/
			try {
				TextMessage outMessage = session.createTextMessage();
				outMessage.setText(modifiedMessage);
				sender.send(outMessage);
			}
			catch (Exception exception) {
				exception.printStackTrace();
			}
			try {
				Thread.sleep(ReadQueueManagerDetails.MESSAGE_FEEDER_DELAY_IN_MILLIS);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			session.close();
		}
		catch (Exception localException1) {
		}
		try {
			connection.close();
		}
		catch (Exception localException2) {
		}
		LOGGER.info("InternalPayment Completed " + Thread.currentThread().getId());
	}

	private void populateValues() {
		try {
			File currentDirectory = new File(".");
			FileInputStream fstream = new FileInputStream(currentDirectory + "/" + "AccountList.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			int counter = 0;
			String strLine = br.readLine();
			while (strLine != null) {
				String[] txnData = strLine.split(",");
				DCTxnData dcTxnData = new DCTxnData();
				dcTxnData.setTxnRef(txnData[0]);
				dcTxnData.setDebitCustomer(txnData[1]);
				dcTxnData.setFromAccount(txnData[2]);
				dcTxnData.setToAccount(txnData[3]);
				this.data.put(counter, dcTxnData);
				// this.accountList.add(strLine);
				counter++;
				strLine = br.readLine();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String readFileAsString(String fileName) {
		String text = "";
		try {
			text = new String(Files.readAllBytes(Paths.get(fileName)));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return text;
	}
}