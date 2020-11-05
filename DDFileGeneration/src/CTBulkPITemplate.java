

public class CTBulkPITemplate {
	public static final String BulkPIHeader = 
					"<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
					"\n<pmtmsgAPI:multipleOutwardCustomerCreditTransferRq xmlns:pmtmsg=\"http://www.misys.com/paymentmessaging/types\" xmlns:pmtmsgAPI=\"http://www.misys.com/paymentmessaging/api/types\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://www.misys.com/paymentmessaging/api/types/MP_API_PaymentMessageTypes.xsd \">"+
					"\n	<pmtmsgAPI:GrpHdr>"+
					"\n		<pmtmsg:MsgId>BulkPI-{0}--{1}</pmtmsg:MsgId>"+
					"\n		<pmtmsg:CreDtTm>{7}T00:01:31.024+05:30</pmtmsg:CreDtTm>"+
					"\n		<pmtmsg:BtchBookg>true</pmtmsg:BtchBookg>"+
					"\n		<pmtmsg:NbOfTxs>{8}</pmtmsg:NbOfTxs>"+
					"\n		<pmtmsg:TtlIntrBkSttlmAmt Ccy=\"EUR\">{9}</pmtmsg:TtlIntrBkSttlmAmt>"+
					"\n		<pmtmsg:IntrBkSttlmDt>{7}+05:30</pmtmsg:IntrBkSttlmDt>"+
					"\n	</pmtmsgAPI:GrpHdr>"+
					"\n	<pmtmsgAPI:sttlmInf>"+
					"\n		<pmtmsg:SttlmMtd>CLRG</pmtmsg:SttlmMtd>"+
					"\n		<pmtmsg:SttlmAcct>"+
					"\n			<pmtmsg:Id>"+
					"\n				<pmtmsg:IBAN>{5}</pmtmsg:IBAN>"+
					"\n			</pmtmsg:Id>"+
					"\n		</pmtmsg:SttlmAcct>"+
					"\n		<pmtmsg:ClrSys>"+
					"\n			<pmtmsg:Prtry>STEP2</pmtmsg:Prtry>"+
					"\n		</pmtmsg:ClrSys>"+
					"\n	</pmtmsgAPI:sttlmInf>";
	
	
	public static final String BulkPIBody =
					"\n	<pmtmsgAPI:cdtTrfTxInf>"+
					"\n		<pmtmsg:PmtId>"+
					"\n			<pmtmsg:InstrId>In1-{0}--{1}</pmtmsg:InstrId>"+
					"\n			<pmtmsg:EndToEndId>endToEnd1-{0}--{1}</pmtmsg:EndToEndId>"+
					"\n			<pmtmsg:TxId>TxId1-{0}--{1}</pmtmsg:TxId>"+
					"\n		</pmtmsg:PmtId>"+
					"\n		<pmtmsg:PmtTpInf>"+
					"\n			<pmtmsg:InstrPrty>NORM</pmtmsg:InstrPrty>"+
					"\n			<pmtmsg:LclInstrm>"+
					"\n				<pmtmsg:Cd>Customer Credit Transfer</pmtmsg:Cd>"+
					"\n			</pmtmsg:LclInstrm>"+
					"\n			<pmtmsg:CtgyPurp>GOVT</pmtmsg:CtgyPurp>"+
					"\n		</pmtmsg:PmtTpInf>"+
					"\n		<pmtmsg:IntrBkSttlmAmt Ccy=\"EUR\">{2}</pmtmsg:IntrBkSttlmAmt>"+
					"\n		<pmtmsg:SttlmTmIndctn>"+
					"\n			<pmtmsg:DbtDtTm>{7}T00:00:00.000+05:30</pmtmsg:DbtDtTm>"+
					"\n			<pmtmsg:CdtDtTm>{7}T00:00:00.000+05:30</pmtmsg:CdtDtTm>"+
					"\n		</pmtmsg:SttlmTmIndctn>"+
					"\n		<pmtmsg:AccptncDtTm>{7}T17:30:00</pmtmsg:AccptncDtTm>"+
					"\n		<pmtmsg:InstdAmt Ccy=\"EUR\">{2}</pmtmsg:InstdAmt>"+
					"\n		<pmtmsg:XchgRate>1.0</pmtmsg:XchgRate>"+
					"\n		<pmtmsg:ChrgBr>SELV</pmtmsg:ChrgBr>"+
					"\n		<pmtmsg:Dbtr>"+
					"\n			<pmtmsg:Nm>Federico o Peluso</pmtmsg:Nm>"+
					"\n			<pmtmsg:Id>"+
					"\n				<pmtmsg:PrvtId>"+
					"\n					<pmtmsg:CstmrNb>{10}</pmtmsg:CstmrNb>"+
					"\n				</pmtmsg:PrvtId>"+
					"\n			</pmtmsg:Id>"+
					"\n		</pmtmsg:Dbtr>"+
					"\n		<pmtmsg:DbtrAcct>"+
					"\n			<pmtmsg:Id>"+
					"\n				<pmtmsg:IBAN>{5}</pmtmsg:IBAN>"+
					"\n			</pmtmsg:Id>"+
					"\n		</pmtmsg:DbtrAcct>"+
					"\n		<pmtmsg:DbtrAgt>"+
					"\n			<pmtmsg:FinInstnId>"+
					"\n				<pmtmsg:BIC>{13}</pmtmsg:BIC>"+
					"\n			</pmtmsg:FinInstnId>"+
					"\n		</pmtmsg:DbtrAgt>"+
					"\n		<pmtmsg:CdtrAgt>"+
					"\n			<pmtmsg:FinInstnId>"+
					"\n				<pmtmsg:BIC>{4}</pmtmsg:BIC>"+
					"\n			</pmtmsg:FinInstnId>"+
					"\n		</pmtmsg:CdtrAgt>"+
					"\n		<pmtmsg:Cdtr>"+
					"\n			<pmtmsg:Nm>Kash</pmtmsg:Nm>"+
					"\n			<pmtmsg:PstlAdr>"+
					"\n				<pmtmsg:AdrTp>ADDR</pmtmsg:AdrTp>"+
					"\n				<pmtmsg:Ctry>NL</pmtmsg:Ctry>"+
					"\n			</pmtmsg:PstlAdr>"+
					"\n			<pmtmsg:CtryOfRes>NL</pmtmsg:CtryOfRes>"+
					"\n		</pmtmsg:Cdtr>"+
					"\n		<pmtmsg:CdtrAcct>"+
					"\n			<pmtmsg:Id>"+
					"\n				<pmtmsg:IBAN>{3}</pmtmsg:IBAN>"+
					"\n			</pmtmsg:Id>"+
					"\n		</pmtmsg:CdtrAcct>"+
					"\n		<pmtmsg:RmtInf>"+
					"\n			<pmtmsg:Ustrd>Payment2</pmtmsg:Ustrd>"+
					"\n		</pmtmsg:RmtInf>"+
					"\n		<pmtmsg:VldtnErrs/>"+
					"\n		<pmtmsg:UsrDfndFlds/>"+
					"\n		<pmtmsg:MPMEvnt/>"+
					"\n	</pmtmsgAPI:cdtTrfTxInf>";
	
	public static final String BulkPIFooter =
					"\n	<pmtmsgAPI:mode>INIT</pmtmsgAPI:mode>"+
					"\n</pmtmsgAPI:multipleOutwardCustomerCreditTransferRq>";
}
