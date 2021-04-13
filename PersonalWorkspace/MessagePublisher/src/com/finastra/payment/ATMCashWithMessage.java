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

public class ATMCashWithMessage implements Runnable {
	ArrayList<String> accountList = new ArrayList();
	Long s = Long.valueOf(System.currentTimeMillis());
	String startMessageID = this.s.toString();
	String numberOfTxns = "1";

	public ATMCashWithMessage() {
	}

	public ATMCashWithMessage(String numberOfTxns) {
		this.numberOfTxns = numberOfTxns;
	}

	public void run() {
		String originalMessage = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><MeridianMessage MessageType=\"ISO20022_MPMDebit\" Timestamp=\"2018-06-01 10:27:07.276\" MessageFormat=\"StandardXML\" System=\"ISO20022\"><MessageID>14745</MessageID><CustomerID>1</CustomerID><MeridianMessageType>ISO20022_MPMDebit</MeridianMessageType><ExternalMessageType>MPMDebit</ExternalMessageType><InternalMessageType>P</InternalMessageType><HostID>MPM</HostID><TRNO>S20180426608302231TPT1PT06765938702</TRNO><Direction>I</Direction><TransactionReference>S201804260001998000000000000000001</TransactionReference><Queue>WarehouseInCSM</Queue><MessageStatus>S</MessageStatus><SystemArrivalTime>2018/04/26 10:26:01</SystemArrivalTime><ValueDate>20180426</ValueDate><CurrencyCode>EUR</CurrencyCode><Amount>100001</Amount><Network>STEP2</Network><SenderAddress>DEUTPTPLXXX</SenderAddress><DestinationAddress>CTTVPTPL</DestinationAddress><PaymentBeneficiary>PT50004300010321383120172</PaymentBeneficiary><BatchFileID>49802</BatchFileID><PaymentPriority>9999</PaymentPriority><BookingAction>Generate Posting</BookingAction><TransactionID>S20180426608302231TPT1PT06765938702</TransactionID><FeedbackTransactionID>14745-RSF</FeedbackTransactionID><BatchMsgID>S201804260001998000000000000000001</BatchMsgID><CSMStatus>ACSC</CSMStatus><PostingMethod>Dual Leg</PostingMethod><LocalInstrumentType>CORE</LocalInstrumentType><urn:Document xmlns:urn=\"urn:iso:std:iso:20022:tech:xsd:pacs.003.001.01MPM\">    <urn:pacs.003.001.01>        <urn:GrpHdr>            <urn:MsgId>S201804260001998000000000000000001</urn:MsgId>            <urn:CreDtTm>2016-05-19T15:24:25</urn:CreDtTm>            <urn:NbOfTxs>1</urn:NbOfTxs>            <urn:TtlIntrBkSttlmAmt Ccy=\"EUR\">1.00</urn:TtlIntrBkSttlmAmt>            <urn:IntrBkSttlmDt>2018-06-01</urn:IntrBkSttlmDt>            <urn:SttlmInf>                <urn:SttlmMtd>CLRG</urn:SttlmMtd>                <urn:ClrSys>                    <urn:Prtry>SBS</urn:Prtry>                </urn:ClrSys>            </urn:SttlmInf>            <urn:InstdAgt>                <urn:FinInstnId>                    <urn:BIC>CTTVPTP0XXX</urn:BIC>                </urn:FinInstnId>            </urn:InstdAgt>        </urn:GrpHdr>        <urn:DrctDbtTxInf>            <urn:PmtId>                <urn:EndToEndId>S20180426002</urn:EndToEndId>                <urn:TxId>S20180426608302231TPT1PT06765938702</urn:TxId>            </urn:PmtId>            <urn:PmtTpInf>                <urn:SvcLvl>                    <urn:Cd>SEPA</urn:Cd>                </urn:SvcLvl>                <urn:LclInstrm>                    <urn:Cd>CORE</urn:Cd>                </urn:LclInstrm>                <urn:SeqTp>FRST</urn:SeqTp>            </urn:PmtTpInf>            <urn:IntrBkSttlmAmt Ccy=\"EUR\">1.00</urn:IntrBkSttlmAmt>            <urn:ChrgBr>SLEV</urn:ChrgBr>            <urn:ReqdColltnDt>2016-05-24</urn:ReqdColltnDt>            <urn:DrctDbtTx>                <urn:MndtRltdInf>                    <urn:MndtId>S2018042648102</urn:MndtId>                    <urn:DtOfSgntr>2016-04-23</urn:DtOfSgntr>                    <urn:AmdmntInd>false</urn:AmdmntInd>                </urn:MndtRltdInf>                <urn:CdtrSchmeId>                    <urn:Id>                        <urn:PrvtId>                            <urn:Othr>                                <urn:Id>S201804261602</urn:Id>                                <urn:SchmeNm>                                    <urn:Prtry>SEPA</urn:Prtry>                                </urn:SchmeNm>                            </urn:Othr>                        </urn:PrvtId>                    </urn:Id>                </urn:CdtrSchmeId>            </urn:DrctDbtTx>            <urn:Cdtr>                <urn:Nm>EDP</urn:Nm>                <urn:PstlAdr>                    <urn:AdrLine>PRC MARQUES POMBAL 12</urn:AdrLine>                    <urn:AdrLine>Portugal</urn:AdrLine>                    <urn:Ctry>PT</urn:Ctry>                </urn:PstlAdr>            </urn:Cdtr>            <urn:CdtrAcct>                <urn:Id>                    <urn:IBAN>PT50004300010321383120172</urn:IBAN>                </urn:Id>            </urn:CdtrAcct>            <urn:CdtrAgt>                <urn:FinInstnId>                    <urn:BIC>DEUTPTPLXXX</urn:BIC>                </urn:FinInstnId>            </urn:CdtrAgt>            <urn:UltmtCdtr>                <urn:Nm>EDP Comercial S.A.</urn:Nm>            </urn:UltmtCdtr>            <urn:InstgAgt>                <urn:FinInstnId>                    <urn:BIC>DEUTDEFF</urn:BIC>                </urn:FinInstnId>            </urn:InstgAgt>            <urn:Dbtr>                <urn:Nm>JOAO PEDRO CATAPIRRA RAMOS</urn:Nm>                <urn:PstlAdr>                    <urn:AdrLine>ESTR PARQ IND COIMBROES</urn:AdrLine>                    <urn:AdrLine>3500-887 VISEU-CUMIEIRA</urn:AdrLine>                    <urn:Ctry>PT</urn:Ctry>                </urn:PstlAdr>            </urn:Dbtr>            <urn:DbtrAcct>                <urn:Id>                    <urn:IBAN>PT50019300001050009250634</urn:IBAN>                </urn:Id>            </urn:DbtrAcct>            <urn:DbtrAgt>                <urn:FinInstnId>                    <urn:BIC>CTTVPTPL</urn:BIC>                </urn:FinInstnId>            </urn:DbtrAgt>            <urn:Purp>                <urn:Cd>OTHR</urn:Cd>            </urn:Purp>            <urn:RmtInf>                <urn:Ustrd>NOTPROVIDED</urn:Ustrd>            </urn:RmtInf>            <urn:UsrDfndFlds>                <urn:UsrDfndFld>                    <urn:name>PseudoMessageType</urn:name>                    <urn:value>SettlementConfirmed</urn:value>                </urn:UsrDfndFld>            </urn:UsrDfndFlds>            <urn:MPMEvnt>                <urn:name>DIRECT_DEBIT_RECEIVED</urn:name>                <urn:description>Direct Debit is received.</urn:description>                <urn:source>SYSTEM</urn:source>            </urn:MPMEvnt>        </urn:DrctDbtTxInf>    </urn:pacs.003.001.01></urn:Document></MeridianMessage>";
		QueueConnection connection = null;
		QueueSession session = null;
		Queue queue = null;
		QueueSender sender = null;
		populateValues();
		int noOfTxns = Integer.parseInt(this.numberOfTxns);
		int startMeID = Integer.parseInt(this.startMessageID);
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
}