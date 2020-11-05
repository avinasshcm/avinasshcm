
public class PCAS003Template {
  
  public static final String header = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+
      "<S2SDDDnf:MPEDDDnfBlkDirDeb xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:S2SDDDnf=\"urn:S2SDDDnf:xsd:$MPEDDDnfBlkDirDeb\" xsi:schemaLocation=\"urn:S2SDDDnf:xsd:$MPEDDDnfBlkDirDeb MPEDDDnfBlkDirDeb.xsd\">\n"+
      "   <S2SDDDnf:SndgInst>TRIONL2U</S2SDDDnf:SndgInst>\n"+
      "   <S2SDDDnf:RcvgInst>SOGENL2A</S2SDDDnf:RcvgInst>\n"+
      "   <S2SDDDnf:SrvcId>{12}</S2SDDDnf:SrvcId>\n"+
      "   <S2SDDDnf:TstCode>T</S2SDDDnf:TstCode>\n"+
      "   <S2SDDDnf:FType>DNF</S2SDDDnf:FType>\n"+
      "   <S2SDDDnf:FileRef>VSCT100713000095</S2SDDDnf:FileRef>\n"+
      "   <S2SDDDnf:FileBusDt>{7}</S2SDDDnf:FileBusDt>\n"+
      "   <S2SDDDnf:RoutingInd>ALL</S2SDDDnf:RoutingInd>\n"+
      "   <S2SDDDnf:FileCycleNo>03</S2SDDDnf:FileCycleNo>\n"+
      "   <S2SDDDnf:NumDDBlk>1</S2SDDDnf:NumDDBlk>\n"+
      "   <S2SDDDnf:NumPCRBlk>0</S2SDDDnf:NumPCRBlk>\n"+
      "   <S2SDDDnf:NumREJBlk>0</S2SDDDnf:NumREJBlk>\n"+
      "   <S2SDDDnf:NumRETBlk>0</S2SDDDnf:NumRETBlk>\n"+
      "   <S2SDDDnf:NumREVBlk>0</S2SDDDnf:NumREVBlk>\n"+
      "   <S2SDDDnf:FIToFICstmrDrctDbt xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.003.001.02\">\n"+
      "       <GrpHdr>\n"+
      "           <MsgId>IncomingDDGrpId-{0}--hdr</MsgId>\n"+
      "           <CreDtTm>{7}T15:41:10</CreDtTm>\n"+
      "           <NbOfTxs>{8}</NbOfTxs>\n"+
      "           <TtlIntrBkSttlmAmt Ccy=\"EUR\">{9}</TtlIntrBkSttlmAmt>\n"+
      "           <IntrBkSttlmDt>{7}</IntrBkSttlmDt>\n"+
      "           <SttlmInf>\n"+
      "               <SttlmMtd>CLRG</SttlmMtd>\n"+
      "               <ClrSys>\n"+
      "                   <Prtry>STEP2</Prtry>\n"+
      "               </ClrSys>\n"+
      "           </SttlmInf>\n"+
      "           <InstdAgt>\n"+
      "               <FinInstnId>\n"+
      "                   <BIC>SOGENL2A</BIC>\n"+
      "               </FinInstnId>\n"+
      "           </InstdAgt>\n"+
      "       </GrpHdr>\n";
  
  public static final String txnTemplate = "<DrctDbtTxInf>\n"+
      "           <PmtId>\n"+
      "               <EndToEndId>End-InwardId-{0}--{1}</EndToEndId>\n"+
      "               <TxId>InwDDtxnid--{0}--{1}</TxId>\n"+
      "           </PmtId>\n"+
      "           <PmtTpInf>\n"+
      "               <SvcLvl>\n"+
      "                   <Cd>SEPA</Cd>\n"+
      "               </SvcLvl>\n"+
      "               <LclInstrm>\n"+
      "                   <Cd>{12}</Cd>\n"+
      "               </LclInstrm>\n"+
      "               <SeqTp>OOFF</SeqTp>\n"+
      "               <CtgyPurp>\n"+
      "                   <Cd>CORT</Cd>\n"+
      "               </CtgyPurp>\n"+
      "           </PmtTpInf>\n"+
      "           <IntrBkSttlmAmt Ccy=\"EUR\">{2}</IntrBkSttlmAmt>\n"+
      "           <ChrgBr>SLEV</ChrgBr>\n"+
      "           <ReqdColltnDt>{7}</ReqdColltnDt>\n"+
      "           <DrctDbtTx>\n"+
      "               <MndtRltdInf>\n"+
      "                   <MndtId>{16}</MndtId>\n"+
      "                   <DtOfSgntr>{7}</DtOfSgntr>\n"+
      "                   <AmdmntInd>false</AmdmntInd>\n"+
      "               </MndtRltdInf>\n"+
      "               <CdtrSchmeId>\n"+
      "                   <Id>\n"+
      "                       <PrvtId>\n"+
      "                           <Othr>\n"+
      "                               <Id>{11}</Id>\n"+
      "                               <SchmeNm>\n"+
      "                                   <Prtry>SEPA</Prtry>\n"+
      "                               </SchmeNm>\n"+
      "                           </Othr>\n"+
      "                       </PrvtId>\n"+
      "                   </Id>\n"+
      "               </CdtrSchmeId>\n"+
      "           </DrctDbtTx>\n"+
      "           <Cdtr>\n"+
      "               <Nm>CreditorName</Nm> \n"+
      "               <PstlAdr>\n"+
      "                   <Ctry>GB</Ctry> \n"+
      "                   <AdrLine>Creditor Postal Address Line 1</AdrLine> \n"+
      "                   <AdrLine>Creditor Postal Address Line 2</AdrLine> \n"+
      "               </PstlAdr>\n"+
      "           </Cdtr>\n"+
      "           <CdtrAcct>\n"+
      "               <Id>\n"+
      "                   <IBAN>{5}</IBAN> \n"+
      "               </Id>\n"+
      "           </CdtrAcct>\n"+
      "           <CdtrAgt>\n"+
      "               <FinInstnId>\n"+
      "                   <BIC>{6}</BIC> \n"+
      "               </FinInstnId>\n"+
      "           </CdtrAgt>\n"+
      "           <Dbtr>\n"+
      "               <Nm>DebtorName</Nm> \n"+
      "               <PstlAdr>\n"+
      "                   <Ctry>GB</Ctry> \n"+
      "                   <AdrLine>Debtor Postal Address Line 1</AdrLine> \n"+
      "                   <AdrLine>Debtor Postal Address Line 2</AdrLine> \n"+
      "               </PstlAdr>\n"+
      "           </Dbtr>\n"+
      "           <DbtrAcct>\n"+
      "               <Id>\n"+
      "                   <IBAN>{3}</IBAN>\n"+
      "               </Id>\n"+
      "           </DbtrAcct>\n"+
      "           <DbtrAgt>\n"+
      "               <FinInstnId>\n"+
      "                   <BIC>{4}</BIC> \n"+
      "               </FinInstnId>\n"+
      "           </DbtrAgt>\n"+
      "           <Purp>\n"+
      "               <Prtry>Purpose Choice Proprietary</Prtry> \n"+
      "           </Purp>\n"+
      "           <RmtInf>\n"+
      "               <Ustrd>RmtInf Unstructured</Ustrd> \n"+
      "           </RmtInf>\n"+
      "       </DrctDbtTxInf>\n";
  
  public static final String footer = " </S2SDDDnf:FIToFICstmrDrctDbt>\n"+
"</S2SDDDnf:MPEDDDnfBlkDirDeb>";
  
}
