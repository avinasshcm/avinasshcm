package transaction.atm;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Logger;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;

import com.ibm.mq.jms.MQQueueConnectionFactory;

import fileutils.ReadQueueManagerDetails;
import pojo.ATMTxnData;
import utils.CommonMethods;

public class ATMPOSPurchaseMessage implements Runnable {
	HashMap<Integer, ATMTxnData> data = new HashMap<Integer, ATMTxnData>();
	String numberOfTxns = "1";
	private static final Logger LOGGER = Logger.getLogger(ATMPOSPurchaseMessage.class.getName());
	QueueConnectionFactory factory = new MQQueueConnectionFactory();
	CommonMethods commonMethods = new CommonMethods();

	public ATMPOSPurchaseMessage() {
	}

	public ATMPOSPurchaseMessage(QueueConnectionFactory factory, String numberOfTxns) {
		this.numberOfTxns = numberOfTxns;
		this.factory = factory;
	}

	public void run() {
		LOGGER.info("ATMCashDepositMessage Started " + Thread.currentThread().getId());
		String originalMessage = readFileAsString("templates/Request_POS_POSPUR.xml");
		QueueConnection connection = null;
		QueueSession session = null;
		Queue queue = null;
		//Queue responseQueue = null;
		QueueSender sender = null;
		populateValues();
		int noOfTxns = Integer.parseInt(this.numberOfTxns);
		try {
			connection = factory.createQueueConnection("", "");
			connection.start();
			session = connection.createQueueSession(false, 1);
			queue = session.createQueue(ReadQueueManagerDetails.ATM_POS_QUEUE_NAME);
			//responseQueue = session.createQueue("UB_ATM_RES");
			sender = session.createSender(queue);
		}
		catch (Exception exception) {
			System.err.println(exception);
		}
		for (int message = 1; message <= noOfTxns; message++) {
			// System.out.println("data " + this.data.size());
			// System.out.println("Msg " + message);
			int counter = message % this.data.size();
			//System.out.println("counter " + counter);
			ATMTxnData txnData = this.data.get(counter);
			String reference = commonMethods.getReference();
			String modifiedMessage = originalMessage.replaceAll("TRANSACTION_REF", reference);
			modifiedMessage = modifiedMessage.replaceAll("FROM_ACCOUNT", txnData.getAccount());
			modifiedMessage = modifiedMessage.replaceAll("CARD_NUMBER", txnData.getCardNumber());
			String date = getDate("YYYY-MM-dd'T'HH:mm:ss.sssXXX");
			modifiedMessage = modifiedMessage.replaceAll("TRANSACTION_DATE", date);
			/*
			LOGGER.addHandler(new LogHelper("logs/LOG_InternalPayment.log").getLogHandler());
			LOGGER.setUseParentHandlers(false);
			LOGGER.info(XMLFormatter.minifyXML(modifiedMessage));
			LOGGER.setUseParentHandlers(true);
			*/
			try {
				TextMessage outMessage = session.createTextMessage();
				outMessage.setJMSCorrelationID(java.util.UUID.randomUUID().toString());
				//System.out.println(outMessage.getJMSCorrelationID());
				//outMessage.setJMSCorrelationID(reference);
				//outMessage.setJMSReplyTo(responseQueue);
				outMessage.setText(modifiedMessage);
				sender.send(outMessage);
				//Thread.sleep(200);
				//consumeResponse(connection, session, reference, outMessage.getJMSCorrelationID());
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
		LOGGER.info("ATMCashDepositMessage Completed " + Thread.currentThread().getId());
	}

	public static String getTagValue(String tagName, String msg) {
		String txnCode = "";
		try {
			msg = msg.substring(msg.indexOf(tagName) + tagName.length());
			if (!msg.startsWith("/>")) {
				msg = msg.substring(msg.indexOf(">") + 1);
				txnCode = msg.substring(0, msg.indexOf("</"));
			}
			//System.out.println(msg);
		}
		catch (Exception e) {
		}
		return txnCode;
	}

	private void consumeResponse(QueueConnection connection, Session session, String reference, String rqCorrelationID) throws JMSException {
		long startTime = Calendar.getInstance().getTimeInMillis();
		//Session replySession = connection.createQueueSession(false, 1);
		Destination destination = session.createQueue("UB_ATM_RES");
		MessageConsumer consumer = session.createConsumer(destination);
		Message msg = consumer.receive();
		String correlationID = "";
		String rsReference = "";
		if (msg instanceof TextMessage) {
			TextMessage replyMessage = (TextMessage) msg;
			//System.out.println("Received reply ");
			/*
			System.out.println("Received reply ");
			System.out.println("\tTime:       " + System.currentTimeMillis() + " ms");
			System.out.println("\tMessage ID: " + replyMessage.getJMSMessageID());
			System.out.println("\tCorrel. ID: " + replyMessage.getJMSCorrelationID());
			System.out.println("\tReply to:   " + replyMessage.getJMSReplyTo());
			System.out.println("\tContents:   " + replyMessage.getText());
			*/
			replyMessage.getJMSMessageID();
			replyMessage.getJMSCorrelationID();
			replyMessage.getJMSReplyTo();
			replyMessage.getText();
			rsReference = getTagValue("holdReference", replyMessage.getText());
			correlationID = replyMessage.getJMSCorrelationID();
			//long endTime = Calendar.getInstance().getTimeInMillis();
			//System.out.println(correlationID + " : " + (endTime - startTime) + " ms");
		}
		//System.out.println(getDate("YYYY-MM-dd'T'HH:mm:ss.sssXXX"));
		long endTime = Calendar.getInstance().getTimeInMillis();
		System.out.println(rqCorrelationID + "\t" + reference + "\t" + correlationID + "\t" + rsReference + " : " + (endTime - startTime) + " ms");
	}

	@SuppressWarnings("resource")
	private void populateValues() {
		try {
			File currentDirectory = new File(".");
			FileInputStream fstream = new FileInputStream(currentDirectory + "/" + "AccountList_ATM.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			int counter = 0;
			String strLine = br.readLine();
			while (strLine != null) {
				String[] txnData = strLine.split(",");
				ATMTxnData atmTxnData = new ATMTxnData();
				atmTxnData.setAccount(txnData[0]);
				atmTxnData.setCardNumber(txnData[1]);
				this.data.put(counter, atmTxnData);
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

	public static String getDate(String format) {
		String date = new SimpleDateFormat(format).format(new Date(Calendar.getInstance().getTimeInMillis()));
		return date;
	}
}