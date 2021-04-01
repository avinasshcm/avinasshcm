package transaction.atm;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.TextMessage;

import com.ibm.mq.jms.MQQueueConnectionFactory;

import utils.CommonMethods;

public class ATMCashWithMessage implements Runnable {
	ArrayList<String> accountList = new ArrayList();
	Long s = Long.valueOf(System.currentTimeMillis());
	String startMessageID = this.s.toString();
	String numberOfTxns = "1";
	CommonMethods commonMethods = new CommonMethods();

	public ATMCashWithMessage() {
	}

	public ATMCashWithMessage(String numberOfTxns) {
		this.numberOfTxns = numberOfTxns;
	}

	public void run() {
		String originalMessage = readFileAsString("templates/Request_ATM_CASHDEP.xml");
		QueueConnection connection = null;
		QueueSession session = null;
		Queue queue = null;
		QueueSender sender = null;
		populateValues();
		int noOfTxns = Integer.parseInt(this.numberOfTxns);
		int startMeID = Integer.parseInt(this.startMessageID);
		try {
			String mqserver = "10.251.5.18";
			String port = "1414";
			String queuemgr = "MPMQMGR";
			String connectionFactory = "com.ibm.mq.jms.MQQueueConnectionFactory";
			Class.forName(connectionFactory);
			QueueConnectionFactory factory = new MQQueueConnectionFactory();
			((MQQueueConnectionFactory) factory).setQueueManager(queuemgr);
			((MQQueueConnectionFactory) factory).setHostName(mqserver);
			((MQQueueConnectionFactory) factory).setPort(Integer.parseInt(port));
			((MQQueueConnectionFactory) factory).setTransportType(1);
			connection = factory.createQueueConnection("", "");
			connection.start();
			session = connection.createQueueSession(false, 1);
			queue = session.createQueue("TO.BACK.OFFICE.Q");
			sender = session.createSender(queue);
		}
		catch (Exception exception) {
			System.err.println(exception);
		}
		for (int message = 1; message <= noOfTxns; message++) {
			int counter = message % this.accountList.size();
			String modifiedMessage = originalMessage.replaceAll("PT50019300001050009250634", (String) this.accountList.get(counter));
			modifiedMessage = modifiedMessage.replaceAll("14745", Integer.toString(startMeID));
			modifiedMessage = modifiedMessage.replaceAll("S20180426608302231TPT1PT06765938702", "S20180426608302231TPT1PT06765" + startMeID);
			modifiedMessage = modifiedMessage.replaceAll("S201804260001998000000000000000001", "S201804260001998000000000000" + startMeID);
			modifiedMessage = modifiedMessage.replaceAll("S20180426002", "S20180426" + startMeID);
			System.out.println(modifiedMessage);
			try {
				TextMessage outMessage = session.createTextMessage();
				outMessage.setJMSCorrelationID(java.util.UUID.randomUUID().toString());
				outMessage.setText(modifiedMessage);
				sender.send(outMessage);
			}
			catch (Exception exception) {
				exception.printStackTrace();
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
	}

	private void populateValues() {
		try {
			File currentDirectory = new File(".");
			FileInputStream fstream = new FileInputStream(currentDirectory + "/" + "AccountList.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine = br.readLine();
			while (strLine != null) {
				this.accountList.add(strLine);
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