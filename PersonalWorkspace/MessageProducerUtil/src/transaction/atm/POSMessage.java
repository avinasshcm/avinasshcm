package transaction.atm;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.TextMessage;

import com.ibm.mq.jms.MQQueueConnectionFactory;

import utils.CommonMethods;

public class POSMessage implements Runnable {
	ArrayList<String> accountList = new ArrayList();
	Long s = Long.valueOf(System.currentTimeMillis());
	String startMessageID = this.s.toString();
	String numberOfTxns = "1";
	CommonMethods commonMethods = new CommonMethods();

	public POSMessage() {
	}

	public POSMessage(String numberOfTxns) {
		this.numberOfTxns = numberOfTxns;
	}

	public void run() {
		String originalMessage = "<?xml version=\"1.0\" encoding=\"UTF-8\"?> <v1r1:atmAccDualPosRq xmlns:v1r1=\"http://www.misys.com/cbs/types/msgs/atm/v1r1\" xmlns:head=\"http://www.misys.com/cbs/types/header\" xmlns:typ=\"http://www.misys.com/cbs/types\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"> <v1r1:rqHeader> <head:version/> <head:orig> <head:channelId>POS</head:channelId> <head:appId/> <head:appVer/> </head:orig> <head:messageType>ATMAccPOS</head:messageType> </v1r1:rqHeader> <v1r1:atmAccDualPosInput> <typ:atmMessageHeader> <typ:versionNum>1</typ:versionNum> <typ:atmMsgType> <typ:messageClass>2</typ:messageClass> <typ:messageFunction/> <typ:txnOriginator>0</typ:txnOriginator> </typ:atmMsgType> <typ:atmMsgReasonCode>0000</typ:atmMsgReasonCode> </typ:atmMessageHeader> <typ:accountHoldDetails> <typ:accountKeys> <typ:inputAccount> <typ:inputAccountId>10100038164</typ:inputAccountId> </typ:inputAccount> </typ:accountKeys> <typ:accountHoldBasicDtls> <typ:holdReference>126500485499</typ:holdReference> <typ:heldAmount> <typ:isoCurrencyCode>978</typ:isoCurrencyCode> <typ:amount>63.74</typ:amount> </typ:heldAmount> <typ:isDebitHold/> </typ:accountHoldBasicDtls> <typ:holdNarrative>485299</typ:holdNarrative> <typ:holdCategory>Trf MBWay p/ 911116172</typ:holdCategory> </typ:accountHoldDetails> <typ:atmDetails> <typ:processingCode> <typ:txnType>00</typ:txnType> <typ:acctType1>00</typ:acctType1> <typ:acctType2>00</typ:acctType2> </typ:processingCode> <typ:amountTrans> <typ:isoCurrencyCode/> <typ:amount>0</typ:amount> </typ:amountTrans> <typ:amountRecon/> <typ:amountCardHldBill> <typ:cardCcyAmt> <typ:amount>0.00</typ:amount> </typ:cardCcyAmt> <typ:valueAmt> <typ:isoCurrencyCode>978</typ:isoCurrencyCode> <typ:amount>63.74</typ:amount> </typ:valueAmt> </typ:amountCardHldBill> <typ:trmDateTime>1970-12-01T22:27:32.000+01:00</typ:trmDateTime> <typ:txnDateTime>2020-01-28T22:27:32.000Z</typ:txnDateTime> <typ:ptofSerDataCd> <typ:crdRdMethod>1100</typ:crdRdMethod> <typ:crdVerifyMethod>0111</typ:crdVerifyMethod> <typ:posEnv>0001</typ:posEnv> </typ:ptofSerDataCd> <typ:msgReason>0</typ:msgReason> <typ:cardSeqNo>0</typ:cardSeqNo> <typ:functionCode>200</typ:functionCode> <typ:accIDC>505107546</typ:accIDC> <typ:track2Data>8181818100000024</typ:track2Data> <typ:retRefNum>0</typ:retRefNum> <typ:apprCode>000000</typ:apprCode> <typ:atmActionCd>000</typ:atmActionCd> <typ:cardAccpTerId>18770782</typ:cardAccpTerId> <typ:cardAccpIdCd>505107546</typ:cardAccpIdCd> <typ:cardAccpName>TRANSFERENCIA MB WAY                  PT</typ:cardAccpName> <typ:adddResCd>0</typ:adddResCd> <typ:track1Data xsi:nil=\"true\"/> <typ:feeAmt> <typ:isoCurrencyCode/> <typ:amount>0</typ:amount> </typ:feeAmt> <typ:pINData>TRANSFERENCIA MB WAY                  PT18770782005469842810100038164</typ:pINData> <typ:originalDataEle> <typ:orgDateTime>2020-01-28T22:27:32.000Z</typ:orgDateTime> </typ:originalDataEle> <typ:aAgentIDC>505107546</typ:aAgentIDC> <typ:cardIssAuthData xsi:nil=\"true\"/> <typ:recvIIC>193</typ:recvIIC> <typ:accIdentification1>10100038164</typ:accIdentification1> <typ:accIdentification2 xsi:nil=\"true\"/> <typ:txnSpecData xsi:nil=\"true\"/> </typ:atmDetails> </v1r1:atmAccDualPosInput> </v1r1:atmAccDualPosRq>";
		QueueConnection connection = null;
		QueueSession session = null;
		Queue queue = null;
		QueueSender sender = null;
		populateValues();
		int noOfTxns = Integer.parseInt(this.numberOfTxns);
		//int startMeID = Integer.parseInt(this.startMessageID);
		try {
			String mqserver = "BLRL10TL5Y2";
			String port = "1439";
			String queuemgr = "CTT_4261_ISO8583";
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
			queue = session.createQueue("UB_POS_POSMSG_REQ");
			sender = session.createSender(queue);
		}
		catch (Exception exception) {
			System.err.println(exception);
		}
		for (int message = 1; message <= noOfTxns; message++) {
			int counter = message % this.accountList.size();
			String modifiedMessage = originalMessage.replaceAll("PT50019300001050009250634", (String) this.accountList.get(counter));
			try {
				modifiedMessage = modifiedMessage.replaceAll("126500485499", getDateString(new Date(Calendar.getInstance().getTimeInMillis())));
			}
			catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// modifiedMessage =
			//     modifiedMessage.replaceAll("S20180426608302231TPT1PT06765938702", "S20180426608302231TPT1PT06765" + startMeID);
			// modifiedMessage = modifiedMessage.replaceAll("S201804260001998000000000000000001", "S201804260001998000000000000" + startMeID);
			// modifiedMessage = modifiedMessage.replaceAll("S20180426002", "S20180426" + startMeID);
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

	public static String getDateString(Date date) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhmmssSSS");
		String parsedDate = dateFormat.format(date);
		// Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
		return parsedDate;
	}
}