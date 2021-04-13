package com.finastra.payment;

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

public class CTMessage implements Runnable {
	ArrayList<String> accountList = new ArrayList();
	Long s = (long) 0;
	String startMessageID = this.s.toString();
	String numberOfTxns = "1";

	public CTMessage() {
	}

	public CTMessage(String numberOfTxns) {
		this.numberOfTxns = numberOfTxns;
	}

	public void run() {
		String originalMessage = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><MeridianMessage MessageType=\"ISO20022_MPMPayment\" Timestamp=\"2018-05-04 18:48:07.462\" MessageFormat=\"StandardXML\" System=\"ISO20022\">   <MessageID>21660</MessageID>    <CustomerID>1</CustomerID>  <MeridianMessageType>ISO20022_MPMPayment</MeridianMessageType>  <ExternalMessageType>MPMPayment</ExternalMessageType>   <InternalMessageType>P</InternalMessageType>    <HostID>MPM</HostID>    <HostReference>Instr-SUP001-0</HostReference>   <TRNO>TxId-SUP001-0</TRNO>  <Direction>I</Direction>    <TransactionReference>IncomingCT-SUP001</TransactionReference>  <Queue>Posting</Queue>  <MessageStatus>U</MessageStatus>    <SystemArrivalTime>2018/05/04 18:48:04</SystemArrivalTime>  <ValueDate>20180504</ValueDate> <CurrencyCode>EUR</CurrencyCode>    <Amount>100</Amount>    <Network>STEP2</Network>    <SenderAddress>CCRIES2A029</SenderAddress>  <DestinationAddress>CCRIES2A029</DestinationAddress>    <BatchFileID>4651</BatchFileID> <PaymentPriority>9999</PaymentPriority> <BookingAction>Generate Posting</BookingAction> <TransactionID>TxId-SUP001-0</TransactionID>    <BatchMsgID>IncomingCT-SUP001</BatchMsgID>  <PostingMethod>Dual Leg</PostingMethod> <urn:Document xmlns:urn=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.01MPM\">      <urn:pacs.008.001.01>           <urn:GrpHdr>                <urn:MsgId>IncomingCT-SUP001</urn:MsgId>                <urn:CreDtTm>2018-05-04T15:41:10</urn:CreDtTm>              <urn:NbOfTxs>1</urn:NbOfTxs>                <urn:TtlIntrBkSttlmAmt Ccy=\"EUR\">1.0</urn:TtlIntrBkSttlmAmt>              <urn:IntrBkSttlmDt>2018-05-04</urn:IntrBkSttlmDt>               <urn:SttlmInf>                  <urn:SttlmMtd>CLRG</urn:SttlmMtd>                   <urn:ClrSys>                        <urn:Prtry>ST2</urn:Prtry>                  </urn:ClrSys>               </urn:SttlmInf>             <urn:InstdAgt>                  <urn:FinInstnId>                        <urn:BIC>CCRIES2A029</urn:BIC>                  </urn:FinInstnId>               </urn:InstdAgt>         </urn:GrpHdr>           <urn:CdtTrfTxInf>               <urn:PmtId>                 <urn:InstrId>Instr-SUP001-0</urn:InstrId>                   <urn:EndToEndId>End-SUP001-0</urn:EndToEndId>                   <urn:TxId>TxId-SUP001-0</urn:TxId>              </urn:PmtId>                <urn:PmtTpInf>                  <urn:SvcLvl>                        <urn:Cd>SEPA</urn:Cd>                   </urn:SvcLvl>               </urn:PmtTpInf>             <urn:IntrBkSttlmAmt Ccy=\"EUR\">1.0</urn:IntrBkSttlmAmt>                <urn:ChrgBr>SLEV</urn:ChrgBr>               <urn:InstgAgt>                  <urn:FinInstnId>                        <urn:BIC>LIKIGB2L</urn:BIC>                 </urn:FinInstnId>               </urn:InstgAgt>             <urn:Dbtr>                  <urn:Nm>Arbind</urn:Nm>                 <urn:PstlAdr>                       <urn:AdrLine>Indirizzo 1 Dbtr</urn:AdrLine>                     <urn:AdrLine>Indirizzo 2 Dbtr</urn:AdrLine>                     <urn:Ctry>NL</urn:Ctry>                 </urn:PstlAdr>                  <urn:Id>                        <urn:OrgId>                         <urn:BIC>AAAAAAAAAAA</urn:BIC>                      </urn:OrgId>                    </urn:Id>               </urn:Dbtr>             <urn:DbtrAcct>                  <urn:Id>                        <urn:IBAN>NL39RABO0300065264</urn:IBAN>                 </urn:Id>               </urn:DbtrAcct>             <urn:DbtrAgt>                   <urn:FinInstnId>                        <urn:BIC>CCRIES2A029</urn:BIC>                  </urn:FinInstnId>               </urn:DbtrAgt>              <urn:CdtrAgt>                   <urn:FinInstnId>                        <urn:BIC>CCRIES2A029</urn:BIC>                  </urn:FinInstnId>               </urn:CdtrAgt>              <urn:Cdtr>                  <urn:Nm>Supreeth</urn:Nm>                   <urn:PstlAdr>                       <urn:AdrLine>indirizzo 1 Cdtr</urn:AdrLine>                     <urn:AdrLine>indirizzo 2 Cdtr</urn:AdrLine>                     <urn:Ctry>PT</urn:Ctry>                 </urn:PstlAdr>                  <urn:Id>                        <urn:OrgId>                         <urn:BIC>AAAAAAAAAAA</urn:BIC>                      </urn:OrgId>                    </urn:Id>               </urn:Cdtr>             <urn:CdtrAcct>                  <urn:Id>                        <urn:IBAN>PT50019300001050009250634</urn:IBAN>                  </urn:Id>               </urn:CdtrAcct>             <urn:RmtInf>                    <urn:Ustrd>String</urn:Ustrd>               </urn:RmtInf>               <urn:MPMEvnt>                   <urn:name>BFUB_CT_RECV</urn:name>                   <urn:description>Credit Transfer is received.</urn:description>                 <urn:source>SYSTEM</urn:source>             </urn:MPMEvnt>          </urn:CdtTrfTxInf>      </urn:pacs.008.001.01>  </urn:Document></MeridianMessage>";
		QueueConnection connection = null;
		QueueSession session = null;
		Queue queue = null;
		QueueSender sender = null;
		populateValues();
		int noOfTxns = Integer.parseInt(this.numberOfTxns);
		int startMeID = Integer.parseInt(this.startMessageID);
		try {
			String mqserver = "BLR2UBLP070";
			String port = "1441";
			String queuemgr = "CTT_4261_MPM";
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
			modifiedMessage = modifiedMessage.replaceAll("21660", Integer.toString(startMeID));
			modifiedMessage = modifiedMessage.replaceAll("Instr-SUP001-0", "I" + startMeID);
			modifiedMessage = modifiedMessage.replaceAll("End-SUP001-0", "E" + startMeID);
			modifiedMessage = modifiedMessage.replaceAll("TxId-SUP001-0", "T" + startMeID);
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
}