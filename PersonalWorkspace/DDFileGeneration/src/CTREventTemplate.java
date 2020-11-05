
public class CTREventTemplate {

	public static final String OutCancellationTemplate =
		  	  "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
		  	  "\n<S2SCTScf:SCTScfBlkCredTrf xsi:schemaLocation=\"urn:S2SCTScf:xsd:$SCTScfBlkCredTrf SCTScfBlkCredTrf.xsd\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:S2SCTScf=\"urn:S2SCTScf:xsd:$SCTScfBlkCredTrf\">"+
			  "\n	<S2SCTScf:SndgInst>ZYDOFRP0</S2SCTScf:SndgInst>"+
			  "\n	<S2SCTScf:RcvgInst>GENOLUD1</S2SCTScf:RcvgInst>"+
			  "\n	<S2SCTScf:SrvcId>SCT</S2SCTScf:SrvcId>"+
			  "\n	<S2SCTScf:TstCode>T</S2SCTScf:TstCode>"+
			  "\n	<S2SCTScf:FType>SCF</S2SCTScf:FType>"+
			  "\n	<S2SCTScf:FileRef>NSCT100713000020</S2SCTScf:FileRef>"+
			  "\n	<S2SCTScf:RoutingInd>RET</S2SCTScf:RoutingInd>"+
			  "\n	<S2SCTScf:FileBusDt>{7}</S2SCTScf:FileBusDt>"+
			  "\n	<S2SCTScf:FileCycleNo>01</S2SCTScf:FileCycleNo>"+
			  "\n	<S2SCTScf:PmtRtr xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.004.001.02\">"+
			  "\n		<GrpHdr>"+
			  "\n			<MsgId>PositiveAnswer-{0}--{1}</MsgId>"+
			  "\n			<CreDtTm>{7}T14:52:03</CreDtTm>"+
			  "\n			<NbOfTxs>1</NbOfTxs>"+
			  "\n			<TtlRtrdIntrBkSttlmAmt Ccy=\"EUR\">{2}</TtlRtrdIntrBkSttlmAmt>"+
			  "\n			<IntrBkSttlmDt>{7}</IntrBkSttlmDt>"+
			  "\n			<SttlmInf>"+
			  "\n				<SttlmMtd>CLRG</SttlmMtd>"+
			  "\n				<ClrSys>"+
			  "\n					<Prtry>ST2</Prtry>"+
			  "\n				</ClrSys>"+
			  "\n			</SttlmInf>"+
			  "\n			<InstdAgt>"+
			  "\n				<FinInstnId>"+
			  "\n					<BIC>CCRIES2A</BIC>"+
			  "\n				</FinInstnId>"+
			  "\n			</InstdAgt>"+
			  "\n		</GrpHdr>"+
			  "\n		<TxInf>"+
			  "\n			<RtrId>Returned-{0}-{1}</RtrId>"+
			  "\n			<OrgnlGrpInf>"+
			  "\n				<OrgnlMsgId>Original_Transaction_MPM</OrgnlMsgId>"+
			  "\n				<OrgnlMsgNmId>pacs.008</OrgnlMsgNmId>"+
			  "\n			</OrgnlGrpInf>"+
			  "\n			<OrgnlInstrId>Original_Transaction_MPM</OrgnlInstrId>"+
			  "\n			<OrgnlEndToEndId>Original_Transaction_MPM</OrgnlEndToEndId>"+
			  "\n			<OrgnlTxId>Original_Transaction_MPM</OrgnlTxId>"+
			  "\n			<OrgnlIntrBkSttlmAmt Ccy=\"EUR\">{2}</OrgnlIntrBkSttlmAmt>"+
			  "\n			<RtrdIntrBkSttlmAmt Ccy=\"EUR\">{2}</RtrdIntrBkSttlmAmt>"+
			  "\n			<RtrdInstdAmt Ccy=\"EUR\">{2}</RtrdInstdAmt>"+
			  "\n			<ChrgBr>SLEV</ChrgBr>"+
			  "\n			<ChrgsInf>"+
			  "\n				<Amt Ccy=\"EUR\">3.00</Amt>"+
			  "\n				<Pty>"+
			  "\n					<FinInstnId>"+
			  "\n						<BIC>LIKIGB2L</BIC>"+
			  "\n					</FinInstnId>"+
			  "\n				</Pty>"+
			  "\n			</ChrgsInf>"+
			  "\n			<InstgAgt>"+
			  "\n				<FinInstnId>"+
			  "\n					<BIC>LIKIGB2L</BIC>"+
			  "\n				</FinInstnId>"+
			  "\n			</InstgAgt>"+
			  "\n			<RtrRsnInf>"+
			  "\n				<Orgtr>"+
			  "\n					<Nm>String</Nm>"+
			  "\n				</Orgtr>"+
			  "\n				<Rsn>"+
			  "\n					<Cd>FOCR</Cd>"+
			  "\n				</Rsn>"+
			  "\n			</RtrRsnInf>"+
			  "\n			<OrgnlTxRef>"+
			  "\n				<IntrBkSttlmDt>{7}</IntrBkSttlmDt>"+
			  "\n				<SttlmInf>"+
			  "\n					<SttlmMtd>CLRG</SttlmMtd>"+
			  "\n				</SttlmInf>"+
			  "\n				<PmtTpInf>"+
			  "\n					<SvcLvl>"+
			  "\n						<Cd>SEPA</Cd>"+
			  "\n					</SvcLvl>"+
			  "\n				</PmtTpInf>"+
			  "\n				<RmtInf>"+
			  "\n					<Ustrd>String</Ustrd>"+
			  "\n				</RmtInf>"+
			  "\n				<Dbtr>"+
			  "\n					<Nm>NPTSAGBPAXXX</Nm>"+
			  "\n					<PstlAdr>"+
			  "\n						<AdrLine>Indirizzo 1 Dbtr</AdrLine>"+
			  "\n					</PstlAdr>"+
			  "\n					<Id>"+
			  "\n						<OrgId>"+
			  "\n							<BICOrBEI>AAAAAAAAAAA</BICOrBEI>"+
			  "\n						</OrgId>"+
			  "\n					</Id>"+
			  "\n				</Dbtr>"+
			  "\n				<DbtrAcct>"+
			  "\n					<Id>"+
			  "\n						<IBAN>{5}</IBAN>"+
			  "\n					</Id>"+
			  "\n				</DbtrAcct>"+
			  "\n				<DbtrAgt>"+
			  "\n					<FinInstnId>"+
			  "\n						<BIC>{13}</BIC>"+
			  "\n					</FinInstnId>"+
			  "\n				</DbtrAgt>"+
			  "\n				<CdtrAgt>"+
			  "\n					<FinInstnId>"+
			  "\n						<BIC>{6}</BIC>"+
			  "\n					</FinInstnId>"+
			  "\n				</CdtrAgt>"+
			  "\n				<Cdtr>"+
			  "\n					<Nm>MAKATI AVENUE</Nm>"+
			  "\n					<PstlAdr>"+
			  "\n						<AdrLine>indirizzo 1 Cdtr</AdrLine>"+
			  "\n					</PstlAdr>"+
			  "\n					<Id>"+
			  "\n						<OrgId>"+
			  "\n							<BICOrBEI>AAAAAAAAAAA</BICOrBEI>"+
			  "\n						</OrgId>"+
			  "\n					</Id>"+
			  "\n				</Cdtr>"+
			  "\n				<CdtrAcct>"+
			  "\n					<Id>"+
			  "\n						<IBAN>{3}</IBAN>"+
			  "\n					</Id>"+
			  "\n				</CdtrAcct>"+
			  "\n			</OrgnlTxRef>"+
			  "\n		</TxInf>"+
			  "\n	</S2SCTScf:PmtRtr>"+
			  "\n</S2SCTScf:SCTScfBlkCredTrf>";
 
  
  public static final String OutRejectTemplate = 
		  "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
		  "\n<S2SCTCvf:SCTCvfBlkCredTrf xsi:schemaLocation=\"urn:S2SCTCvf:xsd:$SCTCvfBlkCredTrf SCTCvfBlkCredTrf.xsd\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:S2SCTCvf=\"urn:S2SCTCvf:xsd:$SCTCvfBlkCredTrf\">"+
		  "\n	<S2SCTCvf:SndgInst>TRIONL2U</S2SCTCvf:SndgInst>"+
		  "\n	<S2SCTCvf:RcvgInst>SOGENL2A</S2SCTCvf:RcvgInst>"+
		  "\n	<S2SCTCvf:SrvcId>SCT</S2SCTCvf:SrvcId>"+
		  "\n	<S2SCTCvf:TstCode>T</S2SCTCvf:TstCode>"+
		  "\n	<S2SCTCvf:FType>CVF</S2SCTCvf:FType>"+
		  "\n	<S2SCTCvf:FileRef>VSCT100713001095</S2SCTCvf:FileRef>"+
		  "\n	<S2SCTCvf:FileDtTm>{7}T09:51:33</S2SCTCvf:FileDtTm>"+
		  "\n	<S2SCTCvf:OrigFRef>1307100951260131</S2SCTCvf:OrigFRef>"+
		  "\n	<S2SCTCvf:OrigFName>S202SCTPTSAGBPP140808164555010.I</S2SCTCvf:OrigFName>"+
		  "\n	<S2SCTCvf:OrigDtTm>{7}T08:30:47</S2SCTCvf:OrigDtTm>"+
		  "\n	<S2SCTCvf:FileRjctRsn>A01</S2SCTCvf:FileRjctRsn>"+
		  "\n	<S2SCTCvf:FileBusDt>{7}</S2SCTCvf:FileBusDt>"+
		  "\n	<S2SCTCvf:FileCycleNo>01</S2SCTCvf:FileCycleNo>"+
		  "\n	<S2SCTCvf:FIToFIPmtStsRptS2 xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.002.001.03S2\">"+
		  "\n		<GrpHdr>"+
		  "\n			<MsgId>Reject-{0}--{1}</MsgId>"+
		  "\n			<CreDtTm>{7}T09:51:33</CreDtTm>"+
		  "\n		</GrpHdr>"+
		  "\n		<OrgnlGrpInfAndSts>"+
		  "\n			<OrgnlMsgId>Original_Transaction_MPM</OrgnlMsgId>"+
		  "\n			<OrgnlMsgNmId>camt.029</OrgnlMsgNmId>"+
		  "\n			<OrgnlNbOfTxs>1</OrgnlNbOfTxs>"+
		  "\n			<OrgnlCtrlSum>{2}</OrgnlCtrlSum>"+
		  "\n			<GrpSts>PART</GrpSts>"+
		  "\n			<StsRsnInf>"+
		  "\n				<Orgtr>"+
		  "\n					<Id>"+
		  "\n						<OrgId>"+
		  "\n							<BICOrBEI>TRIONL2U</BICOrBEI>"+
		  "\n						</OrgId>"+
		  "\n					</Id>"+
		  "\n				</Orgtr>"+
		  "\n				<Rsn>"+
		  "\n					<Prtry>B01</Prtry>"+
		  "\n				</Rsn>"+
		  "\n			</StsRsnInf>"+
		  "\n			<NbOfTxsPerSts>"+
		  "\n				<DtldNbOfTxs>1</DtldNbOfTxs>"+
		  "\n				<DtldSts>ACCP</DtldSts>"+
		  "\n				<DtldCtrlSum>{2}</DtldCtrlSum>"+
		  "\n			</NbOfTxsPerSts>"+
		  "\n			<NbOfTxsPerSts>"+
		  "\n				<DtldNbOfTxs>1</DtldNbOfTxs>"+
		  "\n				<DtldSts>RJCT</DtldSts>"+
		  "\n				<DtldCtrlSum>{2}</DtldCtrlSum>"+
		  "\n			</NbOfTxsPerSts>"+
		  "\n		</OrgnlGrpInfAndSts>"+
		  "\n		<TxInfAndSts>"+
		  "\n			<StsId>STSID26</StsId>"+
		  "\n			<OrgnlInstrId>Original_Transaction_MPM</OrgnlInstrId>"+
		  "\n			<OrgnlEndToEndId>Original_Transaction_MPM</OrgnlEndToEndId>"+
		  "\n			<OrgnlTxId>Original_Transaction_MPM</OrgnlTxId>"+
		  "\n			<TxSts>RJCT</TxSts>"+
		  "\n			<StsRsnInf>"+
		  "\n				<Orgtr>"+
		  "\n					<Id>"+
		  "\n						<OrgId>"+
		  "\n							<BICOrBEI>TRIONL2U</BICOrBEI>"+
		  "\n						</OrgId>"+
		  "\n					</Id>"+
		  "\n				</Orgtr>"+
		  "\n				<Rsn>"+
		  "\n					<Cd>AM05</Cd>"+
		  "\n				</Rsn>"+
		  "\n			</StsRsnInf>"+
		  "\n			<OrgnlTxRef>"+
		  "\n				<IntrBkSttlmAmt Ccy=\"EUR\">{2}</IntrBkSttlmAmt>"+
		  "\n				<IntrBkSttlmDt>{7}</IntrBkSttlmDt>"+
		  "\n				<DbtrAgt>"+
		  "\n					<FinInstnId>"+
		  "\n						<BIC>{13}</BIC>"+
		  "\n					</FinInstnId>"+
		  "\n				</DbtrAgt>"+
		  "\n				<CdtrAgt>"+
		  "\n					<FinInstnId>"+
		  "\n						<BIC>{6}</BIC>"+
		  "\n					</FinInstnId>"+
		  "\n				</CdtrAgt>"+
		  "\n			</OrgnlTxRef>"+
		  "\n		</TxInfAndSts>"+
		  "\n	</S2SCTCvf:FIToFIPmtStsRptS2>"+
		  "\n</S2SCTCvf:SCTCvfBlkCredTrf>";
  
  
  
  public static final String OutReturnTemplate = 
			 	  "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
				  "\n<S2SCTScf:SCTScfBlkCredTrf xmlns:S2SCTScf=\"urn:S2SCTScf:xsd:$SCTScfBlkCredTrf\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"urn:S2SCTScf:xsd:$SCTScfBlkCredTrf SCTScfBlkCredTrf.xsd\">"+
				  "\n	<S2SCTScf:SndgInst>TRIONL2U</S2SCTScf:SndgInst>"+
				  "\n	<S2SCTScf:RcvgInst>SOGENL2A</S2SCTScf:RcvgInst>"+
				  "\n	<S2SCTScf:SrvcId>SCT</S2SCTScf:SrvcId>"+
				  "\n	<S2SCTScf:TstCode>T</S2SCTScf:TstCode>"+
				  "\n	<S2SCTScf:FType>SCF</S2SCTScf:FType>"+
				  "\n	<S2SCTScf:FileRef>NSCT100629001366</S2SCTScf:FileRef>"+
				  "\n	<S2SCTScf:RoutingInd>ALL</S2SCTScf:RoutingInd>"+
				  "\n	<S2SCTScf:FileBusDt>{7}</S2SCTScf:FileBusDt>"+
				  "\n	<S2SCTScf:FileCycleNo>01</S2SCTScf:FileCycleNo>"+
				  "\n	<S2SCTScf:PmtRtr xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.004.001.02\">"+
				  "\n		<GrpHdr>"+
				  "\n			<MsgId>Return-{0}--{1}</MsgId>"+
				  "\n			<CreDtTm>{7}T11:00:00</CreDtTm>"+
				  "\n			<NbOfTxs>1</NbOfTxs>"+
				  "\n			<TtlRtrdIntrBkSttlmAmt Ccy=\"EUR\">{2}</TtlRtrdIntrBkSttlmAmt>"+
				  "\n			<IntrBkSttlmDt>{7}</IntrBkSttlmDt>"+
				  "\n			<SttlmInf>"+
				  "\n				<SttlmMtd>CLRG</SttlmMtd>"+
				  "\n				<ClrSys>"+
				  "\n					<Prtry>ST2</Prtry>"+
				  "\n				</ClrSys>"+
				  "\n			</SttlmInf>"+
				  "\n			<InstdAgt>"+
				  "\n				<FinInstnId>"+
				  "\n					<BIC>SOGENL2A</BIC>"+
				  "\n				</FinInstnId>"+
				  "\n			</InstdAgt>"+
				  "\n		</GrpHdr>"+
				  "\n		<TxInf>"+
				  "\n			<RtrId>Returned-{0}-{1}</RtrId>"+
				  "\n			<OrgnlGrpInf>"+
				  "\n				<OrgnlMsgId>Original_Transaction_MPM</OrgnlMsgId>"+
				  "\n				<OrgnlMsgNmId>pacs.008</OrgnlMsgNmId>"+
				  "\n			</OrgnlGrpInf>"+
				  "\n			<OrgnlInstrId>Original_Transaction_MPM</OrgnlInstrId>"+
				  "\n			<OrgnlEndToEndId>Original_Transaction_MPM</OrgnlEndToEndId>"+
				  "\n			<OrgnlTxId>Original_Transaction_MPM</OrgnlTxId>"+
				  "\n			<OrgnlIntrBkSttlmAmt Ccy=\"EUR\">{2}</OrgnlIntrBkSttlmAmt>"+
				  "\n			<RtrdIntrBkSttlmAmt Ccy=\"EUR\">{2}</RtrdIntrBkSttlmAmt>"+
				  "\n			<ChrgBr>SLEV</ChrgBr>"+
				  "\n			<InstgAgt>"+
				  "\n				<FinInstnId>"+
				  "\n					<BIC>SOGENL2A</BIC>"+
				  "\n				</FinInstnId>"+
				  "\n			</InstgAgt>"+
				  "\n			<RtrRsnInf>"+
				  "\n				<Orgtr>"+
				  "\n					<Nm>String</Nm>"+
				  "\n				</Orgtr>"+
				  "\n				<Rsn>"+
				  "\n					<Cd>AC04</Cd>"+
				  "\n				</Rsn>"+
				  "\n			</RtrRsnInf>"+
				  "\n			<OrgnlTxRef>"+
				  "\n				<IntrBkSttlmDt>{7}</IntrBkSttlmDt>"+
				  "\n				<SttlmInf>"+
				  "\n					<SttlmMtd>CLRG</SttlmMtd>"+
				  "\n				</SttlmInf>"+
				  "\n				<PmtTpInf>"+
				  "\n					<SvcLvl>"+
				  "\n						<Cd>SEPA</Cd>"+
				  "\n					</SvcLvl>"+
				  "\n				</PmtTpInf>"+
				  "\n				<RmtInf>"+
				  "\n					<Ustrd>String</Ustrd>"+
				  "\n				</RmtInf>"+
				  "\n				<Dbtr>"+
				  "\n					<Nm>Jim Recaller</Nm>"+
				  "\n					<PstlAdr>"+
				  "\n						<AdrLine>Indirizzo 1 Dbtr</AdrLine>"+
				  "\n					</PstlAdr>"+
				  "\n					<Id>"+
				  "\n						<OrgId>"+
				  "\n							<BICOrBEI>AAAAAAAAAAA</BICOrBEI>"+
				  "\n						</OrgId>"+
				  "\n					</Id>"+
				  "\n				</Dbtr>"+
				  "\n				<DbtrAcct>"+
				  "\n					<Id>"+
				  "\n						<IBAN>{5}</IBAN>"+
				  "\n					</Id>"+
				  "\n				</DbtrAcct>"+
				  "\n				<DbtrAgt>"+
				  "\n					<FinInstnId>"+
			  	  "\n						<BIC>{13}</BIC>"+
				  "\n					</FinInstnId>"+
				  "\n				</DbtrAgt>"+
				  "\n				<CdtrAgt>"+
				  "\n					<FinInstnId>"+
			 	  "\n						<BIC>{6}</BIC>"+
				  "\n					</FinInstnId>"+
				  "\n				</CdtrAgt>"+
				  "\n				<Cdtr>"+
				  "\n					<Nm>Mr Plumblee</Nm>"+
				  "\n					<PstlAdr>"+
				  "\n						<AdrLine>indirizzo 1 Cdtr</AdrLine>"+
				  "\n					</PstlAdr>"+
				  "\n					<Id>"+
				  "\n						<OrgId>"+
				  "\n							<BICOrBEI>AAAAAAAAAAA</BICOrBEI>"+
				  "\n						</OrgId>"+
				  "\n					</Id>"+
				  "\n				</Cdtr>"+
				  "\n				<CdtrAcct>"+
				  "\n					<Id>"+
			 	  "\n						<IBAN>{3}</IBAN>"+
				  "\n					</Id>"+
				  "\n				</CdtrAcct>"+
				  "\n			</OrgnlTxRef>"+
				  "\n		</TxInf>"+
				  "\n	</S2SCTScf:PmtRtr>"+
				  "\n</S2SCTScf:SCTScfBlkCredTrf>";
  
  public static String InCancellationTemplate = 
		  "<?xml version=\"1.0\" encoding=\"UTF-8\"?><S2SCTScf:SCTScfBlkCredTrf xmlns:S2SCTScf=\"urn:S2SCTScf:xsd:$SCTScfBlkCredTrf\">"+
		  "\n	<S2SCTScf:SndgInst>TRIONL2U</S2SCTScf:SndgInst>"+
		  "\n	<S2SCTScf:RcvgInst>CCRIES2A029</S2SCTScf:RcvgInst>"+
		  "\n	<S2SCTScf:SrvcId>SCT</S2SCTScf:SrvcId>"+
		  "\n	<S2SCTScf:TstCode>T</S2SCTScf:TstCode>"+
		  "\n	<S2SCTScf:FType>SCF</S2SCTScf:FType>"+
		  "\n	<S2SCTScf:FileRef>NSCT110727000004</S2SCTScf:FileRef>"+
		  "\n	<S2SCTScf:RoutingInd>ALL</S2SCTScf:RoutingInd>"+
		  "\n	<S2SCTScf:FileBusDt>{7}</S2SCTScf:FileBusDt>"+
		  "\n	<S2SCTScf:FileCycleNo>01</S2SCTScf:FileCycleNo>"+
		  "\n	<S2SCTScf:FIToFIPmtCxlReq xmlns=\"urn:iso:std:iso:20022:tech:xsd:camt.056.001.01\">"+
		  "\n		<Assgnmt>"+
		  "\n			<Id>ICRS-{0}--{1}</Id>"+
		  "\n			<Assgnr>"+
		  "\n				<Agt>"+
		  "\n					<FinInstnId>"+
		  "\n						<BIC>TRIONL2U</BIC>"+
		  "\n					</FinInstnId>"+
		  "\n				</Agt>"+
		  "\n			</Assgnr>"+
		  "\n			<Assgne>"+
		  "\n				<Agt>"+
		  "\n					<FinInstnId>"+
		  "\n						<BIC>CCRIES2A029</BIC>"+
		  "\n					</FinInstnId>"+
		  "\n				</Agt>"+
		  "\n			</Assgne>"+
		  "\n			<CreDtTm>2016-06-21T11:00:00</CreDtTm>"+
		  "\n		</Assgnmt>"+
		  "\n		<CtrlData>"+
		  "\n			<NbOfTxs>1</NbOfTxs>"+
		  "\n			<CtrlSum>35.00</CtrlSum>"+
		  "\n		</CtrlData>"+
		  "\n		<Undrlyg>"+
		  "\n			<TxInf>"+
		  "\n				<CxlId>ICRS-{0}--{1}</CxlId>"+
		  "\n				<OrgnlGrpInf>"+
		  "\n					<OrgnlMsgId>Original_Transaction_MPM</OrgnlMsgId>"+
		  "\n					<OrgnlMsgNmId>pacs.008</OrgnlMsgNmId>"+
		  "\n				</OrgnlGrpInf>"+
		  "\n				<OrgnlEndToEndId>Original_Transaction_MPM</OrgnlEndToEndId>"+
		  "\n				<OrgnlTxId>Original_Transaction_MPM</OrgnlTxId>"+
		  "\n				<OrgnlIntrBkSttlmAmt Ccy=\"EUR\">{2}</OrgnlIntrBkSttlmAmt>"+
		  "\n				<OrgnlIntrBkSttlmDt>{7}</OrgnlIntrBkSttlmDt>"+
		  "\n				<Assgnr>"+
		  "\n					<FinInstnId>"+
		  "\n						<BIC>LIKIGB2L</BIC>"+
		  "\n					</FinInstnId>"+
		  "\n				</Assgnr>"+
		  "\n				<CxlRsnInf>"+
		  "\n					<Orgtr>"+
		  "\n						<Id>"+
		  "\n							<OrgId>"+
		  "\n								<BICOrBEI>AAAAAA23</BICOrBEI>"+
		  "\n							</OrgId>"+
		  "\n						</Id>"+
		  "\n					</Orgtr>"+
		  "\n					<Rsn>"+
		  "\n						<Prtry>TECH</Prtry>"+
		  "\n					</Rsn>"+
		  "\n				</CxlRsnInf>"+
		  "\n				<OrgnlTxRef>"+
		  "\n					<SttlmInf>"+
		  "\n						<SttlmMtd>CLRG</SttlmMtd>"+
		  "\n						<ClrSys>"+
		  "\n							<Prtry>ST2</Prtry>"+
		  "\n						</ClrSys>"+
		  "\n					</SttlmInf>"+
		  "\n					<PmtTpInf>"+
		  "\n						<SvcLvl>"+
		  "\n							<Cd>SEPA</Cd>"+
		  "\n						</SvcLvl>"+
		  "\n						<LclInstrm>"+
		  "\n							<Prtry>FRAD</Prtry>"+
		  "\n						</LclInstrm>"+
		  "\n						<CtgyPurp>"+
		  "\n							<Cd>CTRY</Cd>"+
		  "\n						</CtgyPurp>"+
		  "\n					</PmtTpInf>"+
		  "\n					<RmtInf>"+
		  "\n						<Ustrd>Unstructured</Ustrd>"+
		  "\n					</RmtInf>"+
		  "\n					<UltmtDbtr>"+
		  "\n						<Nm>Odette Mendoza</Nm>"+
		  "\n						<Id>"+
		  "\n							<OrgId>"+
		  "\n								<BICOrBEI>AAAAAA20</BICOrBEI>"+
		  "\n							</OrgId>"+
		  "\n						</Id>"+
		  "\n					</UltmtDbtr>"+
		  "\n					<Dbtr>"+
		  "\n						<Nm>Angel Locsin</Nm>"+
		  "\n						<PstlAdr>"+
		  "\n							<Ctry>GB</Ctry>"+
		  "\n							<AdrLine>Indirizzo 1 Dbtr</AdrLine>"+
		  "\n						</PstlAdr>"+
		  "\n						<Id>"+
		  "\n							<PrvtId>"+
		  "\n								<Othr>"+
		  "\n									<Id>Id-45268508</Id>"+
		  "\n								</Othr>"+
		  "\n							</PrvtId>"+
		  "\n						</Id>"+
		  "\n						<CtryOfRes>NZ</CtryOfRes>"+
		  "\n					</Dbtr>"+
		  "\n					<DbtrAcct>"+
		  "\n						<Id>"+
		  "\n							<IBAN>{5}</IBAN>"+
		  "\n						</Id>"+
		  "\n					</DbtrAcct>"+
		  "\n					<DbtrAgt>"+
		  "\n						<FinInstnId>"+
		  "\n							<BIC>{13}</BIC>"+
		  "\n						</FinInstnId>"+
		  "\n					</DbtrAgt>"+
		  "\n					<CdtrAgt>"+
		  "\n						<FinInstnId>"+
		  "\n							<BIC>{6}</BIC>"+
		  "\n						</FinInstnId>"+
		  "\n					</CdtrAgt>"+
		  "\n					<Cdtr>"+
		  "\n						<Nm>10</Nm>"+
		  "\n						<PstlAdr>"+
		  "\n							<Ctry>NZ</Ctry>"+
		  "\n							<AdrLine>Manila</AdrLine>"+
		  "\n						</PstlAdr>"+
		  "\n						<Id>"+
		  "\n							<PrvtId>"+
		  "\n								<Othr>"+
		  "\n									<Id>Id-45268508</Id>"+
		  "\n								</Othr>"+
		  "\n							</PrvtId>"+
		  "\n						</Id>"+
		  "\n						<CtryOfRes>NZ</CtryOfRes>"+
		  "\n					</Cdtr>"+
		  "\n					<CdtrAcct>"+
		  "\n						<Id>"+
		  "\n							<IBAN>{3}</IBAN>"+
		  "\n						</Id>"+
		  "\n					</CdtrAcct>"+
		  "\n					<UltmtCdtr>"+
		  "\n						<Nm>Red Skull</Nm>"+
		  "\n						<Id>"+
		  "\n							<OrgId>"+
		  "\n								<BICOrBEI>BICTEST7</BICOrBEI>"+
		  "\n							</OrgId>"+
		  "\n						</Id>"+
		  "\n					</UltmtCdtr>"+
		  "\n				</OrgnlTxRef>"+
		  "\n			</TxInf>"+
		  "\n		</Undrlyg>"+
		  "\n	</S2SCTScf:FIToFIPmtCxlReq>"+
		  "\n</S2SCTScf:SCTScfBlkCredTrf>";
  
  
  public String InReversalTemplate = 

		  "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
		  "\n<S2SDDDnf:MPEDDDnfBlkDirDeb xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:S2SDDDnf=\"urn:S2SDDDnf:xsd:$MPEDDDnfBlkDirDeb\" xsi:schemaLocation=\"urn:S2SDDDnf:xsd:$MPEDDDnfBlkDirDeb MPEDDDnfBlkDirDeb.xsd\">"+
		  "\n	<S2SDDDnf:SndgInst>TRIONL2U</S2SDDDnf:SndgInst>"+
		  "\n	<S2SDDDnf:RcvgInst>CCRIES2A029</S2SDDDnf:RcvgInst>"+
		  "\n	<S2SDDDnf:SrvcId>B2B</S2SDDDnf:SrvcId>"+
		  "\n	<S2SDDDnf:TstCode>T</S2SDDDnf:TstCode>"+
		  "\n	<S2SDDDnf:FType>DNF</S2SDDDnf:FType>"+
		  "\n	<S2SDDDnf:FileRef>NSCT110727000004</S2SDDDnf:FileRef>"+
		  "\n	<S2SDDDnf:FileBusDt>{7}</S2SDDDnf:FileBusDt>"+
		  "\n	<S2SDDDnf:RoutingInd>ALL</S2SDDDnf:RoutingInd>"+
		  "\n	<S2SDDDnf:FileCycleNo>01</S2SDDDnf:FileCycleNo>"+
		  "\n	<S2SDDDnf:NumDDBlk>0</S2SDDDnf:NumDDBlk>"+
		  "\n	<S2SDDDnf:NumPCRBlk>0</S2SDDDnf:NumPCRBlk>"+
		  "\n	<S2SDDDnf:NumREJBlk>0</S2SDDDnf:NumREJBlk>"+
		  "\n	<S2SDDDnf:NumRETBlk>0</S2SDDDnf:NumRETBlk>"+
		  "\n	<S2SDDDnf:NumREVBlk>1</S2SDDDnf:NumREVBlk>"+
		  "\n	<S2SDDDnf:FIToFIPmtRvsl xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.007.001.02\">"+
		  "\n		<GrpHdr>"+
		  "\n			<MsgId>IncomingRvsl-{0}--{1}</MsgId>"+
		  "\n			<CreDtTm>2016-10-19T09:51:33</CreDtTm>"+
		  "\n			<NbOfTxs>1</NbOfTxs>"+
		  "\n			<GrpRvsl>false</GrpRvsl>"+
		  "\n			<TtlRvsdIntrBkSttlmAmt Ccy=\"EUR\">100</TtlRvsdIntrBkSttlmAmt>"+
		  "\n			<IntrBkSttlmDt>2016-10-19</IntrBkSttlmDt>"+
		  "\n			<SttlmInf>"+
		  "\n				<SttlmMtd>CLRG</SttlmMtd>"+
		  "\n				<ClrSys>"+
		  "\n					<Prtry>ST2</Prtry>"+
		  "\n				</ClrSys>"+
		  "\n			</SttlmInf>"+
		  "\n			<InstdAgt>"+
		  "\n				<FinInstnId>"+
		  "\n					<BIC>TRIONL2U</BIC>"+
		  "\n				</FinInstnId>"+
		  "\n			</InstdAgt>"+
		  "\n		</GrpHdr>"+
		  "\n		<OrgnlGrpInf>"+
		  "\n			<OrgnlMsgId>Original_Transaction_MPM</OrgnlMsgId>"+ 
		  "\n			<OrgnlMsgNmId>pacs.003</OrgnlMsgNmId>"+
		  "\n		</OrgnlGrpInf>"+
		  "\n		<TxInf>"+
		  "\n			<RvslId>Instr-{0}--{1}</RvslId>"+
		  "\n			<OrgnlEndToEndId>Original_Transaction_MPM</OrgnlEndToEndId>"+
		  "\n			<OrgnlTxId>Original_Transaction_MPM</OrgnlTxId>"+
		  "\n			<OrgnlIntrBkSttlmAmt Ccy=\"EUR\">{2}</OrgnlIntrBkSttlmAmt>"+
		  "\n			<RvsdIntrBkSttlmAmt Ccy=\"EUR\">{2}</RvsdIntrBkSttlmAmt>"+
		  "\n			<ChrgsInf>"+
		  "\n				<Amt Ccy=\"EUR\">10</Amt>"+
		  "\n				<Pty>"+
		  "\n					<FinInstnId>"+
		  "\n						<BIC>GENOLUD1</BIC>"+
		  "\n					</FinInstnId>"+
		  "\n				</Pty>"+
		  "\n			</ChrgsInf>"+
		  "\n			<InstgAgt>"+
		  "\n				<FinInstnId>"+
		  "\n					<BIC>LIKIFR2L</BIC>"+
		  "\n				</FinInstnId>"+
		  "\n			</InstgAgt>"+
		  "\n			<RvslRsnInf>"+
		  "\n				<Orgtr>"+
		  "\n					<Id>"+
		  "\n						<OrgId>"+
		  "\n							<BICOrBEI>LIKIFR2L</BICOrBEI>"+
		  "\n						</OrgId>"+
		  "\n					</Id>"+
		  "\n				</Orgtr>"+
		  "\n				<Rsn>"+
		  "\n					<Cd>AM05</Cd>"+
		  "\n				</Rsn>"+
		  "\n			</RvslRsnInf>"+
		  "\n			<OrgnlTxRef>"+
		  "\n				<IntrBkSttlmAmt Ccy=\"EUR\">100</IntrBkSttlmAmt>"+
		  "\n				<IntrBkSttlmDt>{7}</IntrBkSttlmDt>"+
		  "\n				<ReqdColltnDt>{7}</ReqdColltnDt>"+
		  "\n				<CdtrSchmeId>"+
		  "\n					<Id>"+
		  "\n						<PrvtId>"+
		  "\n							<Othr>"+
		  "\n								<Id>CDTRSCHMEID-TEST001</Id>"+
		  "\n								<SchmeNm>"+
		  "\n									<Prtry>SEPA</Prtry>"+
		  "\n								</SchmeNm>"+
		  "\n							</Othr>"+
		  "\n						</PrvtId>"+
		  "\n					</Id>"+
		  "\n				</CdtrSchmeId>"+
		  "\n				<PmtTpInf>"+
		  "\n					<SvcLvl>"+
		  "\n						<Cd>SEPA</Cd>"+
		  "\n					</SvcLvl>"+
		  "\n					<LclInstrm>"+
		  "\n						<Cd>B2B</Cd>"+
		  "\n					</LclInstrm>"+
		  "\n					<SeqTp>FRST</SeqTp>"+
		  "\n				</PmtTpInf>"+
		  "\n				<MndtRltdInf>"+
		  "\n					<MndtId>GinebraIn</MndtId>"+
		  "\n					<DtOfSgntr>{7}</DtOfSgntr>"+
		  "\n				</MndtRltdInf>"+
		  "\n				<Dbtr>"+
		  "\n					<Nm>Mr. Debtor</Nm>"+
		  "\n				</Dbtr>"+
		  "\n				<DbtrAcct>"+
		  "\n					<Id>"+
		  "\n						<IBAN>{5}</IBAN>"+
		  "\n					</Id>"+
		  "\n				</DbtrAcct>"+
		  "\n				<DbtrAgt>"+
		  "\n					<FinInstnId>"+
		  "\n						<BIC>{13}</BIC>"+
		  "\n					</FinInstnId>"+
		  "\n				</DbtrAgt>"+
		  "\n				<CdtrAgt>"+
		  "\n					<FinInstnId>"+
		  "\n						<BIC>{6}</BIC>"+
		  "\n					</FinInstnId>"+
		  "\n				</CdtrAgt>"+
		  "\n				<Cdtr>"+
		  "\n					<Nm>Mr. Creditor</Nm>"+
		  "\n				</Cdtr>"+
		  "\n				<CdtrAcct>"+
		  "\n					<Id>"+
		  "\n						<IBAN>{3}</IBAN>"+
		  "\n					</Id>"+
		  "\n				</CdtrAcct>"+
		  "\n			</OrgnlTxRef>"+
		  "\n		</TxInf>"+
		  "\n	</S2SDDDnf:FIToFIPmtRvsl>"+
		  "\n</S2SDDDnf:MPEDDDnfBlkDirDeb>";
}
