package transaction.payments;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.TextMessage;

import com.ibm.mq.jms.MQQueueConnectionFactory;

import utils.CommonMethods;

public class CTMessage implements Runnable {
	ArrayList<String> accountList = new ArrayList();
	Long s = (long) 0;
	String startMessageID = this.s.toString();
	String numberOfTxns = "1";
	QueueConnectionFactory factory = new MQQueueConnectionFactory();
	CommonMethods commonMethods = new CommonMethods();

	public CTMessage() {
	}

	public CTMessage(QueueConnectionFactory factory, String numberOfTxns) {
		this.factory = factory;
		this.numberOfTxns = numberOfTxns;
	}

	public void run() {
		String originalMessage = commonMethods.readFileAsString("templates/Request_CT_Inward.xml");
		QueueConnection connection = null;
		QueueSession session = null;
		Queue queue = null;
		QueueSender sender = null;
		populateValues();
		int noOfTxns = Integer.parseInt(this.numberOfTxns);
		int startMeID = Integer.parseInt(this.startMessageID);
		try {
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
			String modifiedMessage = originalMessage.replaceAll("CDTR_ACCT", (String) this.accountList.get(counter));
			modifiedMessage = modifiedMessage.replaceAll("MSD_ID", Integer.toString(startMeID));
			modifiedMessage = modifiedMessage.replaceAll("INSTR_ID", "I" + startMeID);
			modifiedMessage = modifiedMessage.replaceAll("E2E_ID", "E" + startMeID);
			modifiedMessage = modifiedMessage.replaceAll("TX_ID", "T" + startMeID);
			System.out.println(modifiedMessage);
			try {
				TextMessage outMessage = session.createTextMessage();
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
			FileInputStream fstream = new FileInputStream(currentDirectory + "/" + "PaymentsAccountList.txt");
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
}