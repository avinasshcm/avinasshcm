
public class OutDDREventTemplate {

  public static final String OutReturnRSFTemplate =
		  		  "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
				  "\n<S2SDDRsf:MPEDDRsfBlkDirDeb xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:S2SDDRsf=\"urn:S2SDDRsf:xsd:$MPEDDRsfBlkDirDeb\" xsi:schemaLocation=\"urn:S2SDDRsf:xsd:$MPEDDRsfBlkDirDeb MPEDDRsfBlkDirDeb.xsd\">"+
				  "\n	<S2SDDRsf:SndgInst>BACRIT21</S2SDDRsf:SndgInst>"+
				  "\n	<S2SDDRsf:RcvgInst>SOGENL2A</S2SDDRsf:RcvgInst>"+
				  "\n	<S2SDDRsf:SrvcId>COR1</S2SDDRsf:SrvcId>"+
				  "\n	<S2SDDRsf:TstCode>T</S2SDDRsf:TstCode>"+
				  "\n	<S2SDDRsf:FType>RSF</S2SDDRsf:FType>"+
				  "\n	<S2SDDRsf:FileRef>VSCT100720000095</S2SDDRsf:FileRef>"+
				  "\n	<S2SDDRsf:RoutingInd>ALL</S2SDDRsf:RoutingInd>"+
				  "\n	<S2SDDRsf:FileBusDt>{7}</S2SDDRsf:FileBusDt>"+
				  "\n	<S2SDDRsf:FileCycleNo>01</S2SDDRsf:FileCycleNo>"+
				  "\n	<S2SDDRsf:FIToFIPmtStsRptS2 xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.002.001.03S2\">"+
				  "\n		<GrpHdr>"+
				  "\n			<MsgId>ReturnDNF-{0}-{1}</MsgId>"+
				  "\n			<CreDtTm>{7}T09:51:33</CreDtTm>"+
				  "\n			<InstgAgt>"+
				  "\n				<FinInstnId>"+
				  "\n					<BIC>SOGENL2A</BIC>"+
				  "\n				</FinInstnId>"+
				  "\n			</InstgAgt>"+
				  "\n		</GrpHdr>"+
				  "\n		<OrgnlGrpInfAndSts>"+
				  "\n			<OrgnlMsgId>Owd-Return-{0}-{1}</OrgnlMsgId>"+
				  "\n			<OrgnlMsgNmId>pacs.002</OrgnlMsgNmId>"+
				  "\n			<OrgnlNbOfTxs>1</OrgnlNbOfTxs> "+
				  "\n			<OrgnlCtrlSum>{2}</OrgnlCtrlSum> "+
				  "\n			<GrpSts>ACSC</GrpSts> <!-- ACSC -->"+
				  "\n			<StsRsnInf>"+
				  "\n				<Orgtr>"+
				  "\n					<Id>"+
				  "\n						<OrgId>"+
				  "\n							<BICOrBEI>BACRIT21</BICOrBEI> "+
				  "\n						</OrgId>"+
				  "\n					</Id>"+
				  "\n				</Orgtr>"+
				  "\n				<Rsn>"+
				  "\n					<Prtry>B00</Prtry> "+
				  "\n				</Rsn>"+
				  "\n			</StsRsnInf>"+
				  "\n		</OrgnlGrpInfAndSts>"+
				  "\n	</S2SDDRsf:FIToFIPmtStsRptS2>"+
				  "\n</S2SDDRsf:MPEDDRsfBlkDirDeb>";
 
  
  public static final String OutReturnDNFTemplate =
				  "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+
				  "\n<S2SDDDnf:MPEDDDnfBlkDirDeb xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:S2SDDDnf=\"urn:S2SDDDnf:xsd:$MPEDDDnfBlkDirDeb\" xsi:schemaLocation=\"urn:S2SDDDnf:xsd:$MPEDDDnfBlkDirDeb MPEDDDnfBlkDirDeb.xsd\">"+
				  "\n	<S2SDDDnf:SndgInst>STALNL2GXXX</S2SDDDnf:SndgInst>"+
				  "\n	<S2SDDDnf:RcvgInst>SOGENL2AXXX</S2SDDDnf:RcvgInst>"+
				  "\n	<S2SDDDnf:SrvcId>CORE</S2SDDDnf:SrvcId>"+
				  "\n	<S2SDDDnf:TstCode>T</S2SDDDnf:TstCode>"+
				  "\n	<S2SDDDnf:FType>DNF</S2SDDDnf:FType>"+
				  "\n	<S2SDDDnf:FileRef>VSCT100713000095</S2SDDDnf:FileRef>"+
				  "\n	<S2SDDDnf:FileBusDt>{7}</S2SDDDnf:FileBusDt>"+
				  "\n	<S2SDDDnf:RoutingInd>ALL</S2SDDDnf:RoutingInd>"+
				  "\n	<S2SDDDnf:FileCycleNo>03</S2SDDDnf:FileCycleNo>"+
				  "\n	<S2SDDDnf:NumDDBlk>0</S2SDDDnf:NumDDBlk>"+
				  "\n	<S2SDDDnf:NumPCRBlk>0</S2SDDDnf:NumPCRBlk>"+
				  "\n	<S2SDDDnf:NumREJBlk>0</S2SDDDnf:NumREJBlk>"+
				  "\n	<S2SDDDnf:NumRETBlk>1</S2SDDDnf:NumRETBlk>"+
				  "\n	<S2SDDDnf:NumREVBlk>0</S2SDDDnf:NumREVBlk>"+
				  "\n	<S2SDDDnf:PmtRtr xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.004.001.02\">"+
				  "\n			<GrpHdr>"+
				  "\n				<MsgId>Owd-Return-{0}-{1}</MsgId>"+
				  "\n				<CreDtTm>{7}T15:41:10</CreDtTm>"+
				  "\n				<NbOfTxs>1</NbOfTxs>"+
				  "\n				<TtlRtrdIntrBkSttlmAmt Ccy=\"EUR\">{2}</TtlRtrdIntrBkSttlmAmt>"+
				  "\n				<IntrBkSttlmDt>{7}</IntrBkSttlmDt>"+
				  "\n				<SttlmInf>"+
				  "\n					<SttlmMtd>CLRG</SttlmMtd>"+
				  "\n					<ClrSys>"+
				  "\n						<Prtry>ST2</Prtry>"+
				  "\n					</ClrSys>"+
				  "\n				</SttlmInf>"+
				  "\n			</GrpHdr>"+
				  "\n			<TxInf>"+
				  "\n				<RtrId>ReturnDD2-110117-SAN009</RtrId>"+
				  "\n				<OrgnlGrpInf>"+
				  "\n					<OrgnlMsgId>Original_Transaction_MPM</OrgnlMsgId>"+
				  "\n					<OrgnlMsgNmId>pacs.003.001.01MPM</OrgnlMsgNmId>"+
				  "\n				</OrgnlGrpInf>"+
				  "\n				<OrgnlEndToEndId>Original_Transaction_MPM</OrgnlEndToEndId>"+
				  "\n				<OrgnlTxId>Original_Transaction_MPM</OrgnlTxId>"+
				  "\n				<OrgnlIntrBkSttlmAmt Ccy=\"EUR\">{2}</OrgnlIntrBkSttlmAmt>"+
				  "\n				<RtrdIntrBkSttlmAmt Ccy=\"EUR\">{2}</RtrdIntrBkSttlmAmt>"+
				  "\n				<RtrdInstdAmt Ccy=\"EUR\">{2}</RtrdInstdAmt>"+
				  "\n				<ChrgBr>SLEV</ChrgBr>"+
				  "\n				<ChrgsInf>"+
				  "\n					<Amt Ccy=\"EUR\">10</Amt>"+
				  "\n					<Pty>"+
				  "\n						<FinInstnId>"+
				  "\n							<BIC>PTSAGBPPXXX</BIC>"+
				  "\n						</FinInstnId>"+
				  "\n					</Pty>"+
				  "\n				</ChrgsInf>"+
				  "\n				<RtrRsnInf>"+
				  "\n					<Orgtr>"+
				  "\n						<Nm>Mr Return Originator</Nm>"+
				  "\n					</Orgtr>"+
				  "\n					<Rsn>"+
				  "\n						<Cd>AM05</Cd>"+
				  "\n					</Rsn>"+
				  "\n				</RtrRsnInf>"+
				  "\n				<OrgnlTxRef>"+
				  "\n					<IntrBkSttlmDt>{7}</IntrBkSttlmDt>"+
				  "\n					<ReqdColltnDt>{7}</ReqdColltnDt>"+
				  "\n					<CdtrSchmeId>"+
				  "\n						<Id>"+
				  "\n							<PrvtId>"+
				  "\n								<Othr>"+
				  "\n									<Id>Creditor-Scheme-Id</Id>"+
				  "\n									<SchmeNm>"+
				  "\n										<Prtry>SEPA</Prtry>"+
				  "\n									</SchmeNm>"+
				  "\n								</Othr>"+
				  "\n							</PrvtId>"+
				  "\n						</Id>"+
				  "\n					</CdtrSchmeId>"+
				  "\n					<SttlmInf>"+
				  "\n						<SttlmMtd>CLRG</SttlmMtd>"+
				  "\n					</SttlmInf>"+
				  "\n					<PmtTpInf>"+
				  "\n						<SvcLvl>"+
				  "\n							<Cd>SEPA</Cd>"+
				  "\n						</SvcLvl>"+
				  "\n						<LclInstrm>"+
				  "\n							<Cd>B2B</Cd>"+
				  "\n						</LclInstrm>"+
				  "\n						<SeqTp>OOFF</SeqTp>"+
				  "\n					</PmtTpInf>"+
				  "\n					<MndtRltdInf>"+
				  "\n						<MndtId>GINEBRAOut</MndtId>"+
				  "\n						<DtOfSgntr>{7}</DtOfSgntr>"+
				  "\n						<AmdmntInd>false</AmdmntInd>"+
				  "\n					</MndtRltdInf>"+
				  "\n					<RmtInf>"+
				  "\n						<Ustrd>Remittance Information Unstructured</Ustrd>"+
				  "\n					</RmtInf>"+
				  "\n					<Dbtr>"+
				  "\n						<Nm>DebtorName</Nm>"+
				  "\n					</Dbtr>"+
				  "\n					<DbtrAcct>"+
				  "\n						<Id>"+
				  "\n							<IBAN>NL39RABO0300065264</IBAN>"+
				  "\n						</Id>"+
				  "\n					</DbtrAcct>"+
				  "\n					<DbtrAgt>"+
				  "\n						<FinInstnId>"+
				  "\n							<BIC>SOGENL2AXXX</BIC>"+
				  "\n						</FinInstnId>"+
				  "\n					</DbtrAgt>"+
				  "\n					<CdtrAgt>"+
				  "\n					<FinInstnId>"+
				  "\n						<BIC>STALNL2GXXX</BIC>"+
				  "\n						</FinInstnId>"+
				  "\n					</CdtrAgt>"+
				  "\n					<Cdtr>"+
				  "\n						<Nm>CreditorName</Nm>"+
				  "\n					</Cdtr>"+
				  "\n					<CdtrAcct>"+
				  "\n						<Id>"+
				  "\n							<IBAN>NL39RABO0300065264</IBAN>"+
				  "\n						</Id>"+
				  "\n					</CdtrAcct>"+
				  "\n				</OrgnlTxRef>"+
				  "\n			</TxInf>"+
				  "\n		</S2SDDDnf:PmtRtr>"+
				  "\n</S2SDDDnf:MPEDDDnfBlkDirDeb>";
 

}
