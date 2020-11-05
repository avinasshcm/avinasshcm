
public interface SettlementTamplate {

  public static final String RSFtemplate ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+
      "<S2SDDRsf:MPEDDRsfBlkDirDeb xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:S2SDDRsf=\"urn:S2SDDRsf:xsd:$MPEDDRsfBlkDirDeb\" xsi:schemaLocation=\"urn:S2SDDRsf:xsd:$MPEDDRsfBlkDirDeb MPEDDRsfBlkDirDeb.xsd\">\n"+
      "   <S2SDDRsf:SndgInst>BACRIT21</S2SDDRsf:SndgInst>\n"+
      "   <S2SDDRsf:RcvgInst>SOGENL2A</S2SDDRsf:RcvgInst>\n"+
      "   <S2SDDRsf:SrvcId>{12}</S2SDDRsf:SrvcId>\n"+
      "   <S2SDDRsf:TstCode>T</S2SDDRsf:TstCode>\n"+
      "   <S2SDDRsf:FType>RSF</S2SDDRsf:FType>\n"+
      "   <S2SDDRsf:FileRef>VSCT100713000095</S2SDDRsf:FileRef>\n"+
      "   <S2SDDRsf:RoutingInd>ALL</S2SDDRsf:RoutingInd>\n"+
      "   <S2SDDRsf:FileBusDt>{7}</S2SDDRsf:FileBusDt>\n"+
      "   <S2SDDRsf:FileCycleNo>01</S2SDDRsf:FileCycleNo>\n"+
      "   <S2SDDRsf:FIToFIPmtStsRptS2 xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.002.001.03S2\">\n"+
      "       <GrpHdr>\n"+
      "           <MsgId>rsf-settlement-{0}--{1}</MsgId>\n"+
      "           <CreDtTm>{7}T09:51:33</CreDtTm>\n"+
      "           <InstgAgt>\n"+
      "               <FinInstnId>\n"+
      "                   <BIC>SOGENL2A</BIC>\n"+
      "               </FinInstnId>\n"+
      "           </InstgAgt>\n"+
      "       </GrpHdr>\n"+
      "       <OrgnlGrpInfAndSts>\n"+
      "           <OrgnlMsgId>MPM_GeneratedID</OrgnlMsgId> \n"+
      "           <OrgnlMsgNmId>pacs.003</OrgnlMsgNmId> \n"+
      "           <OrgnlNbOfTxs>{8}</OrgnlNbOfTxs> \n"+
      "           <OrgnlCtrlSum>{9}</OrgnlCtrlSum> \n"+
      "           <GrpSts>ACSC</GrpSts> \n"+
      "           <StsRsnInf>\n"+
      "               <Orgtr>\n"+
      "                   <Id>\n"+
      "                       <OrgId>\n"+
      "                           <BICOrBEI>BACRIT21</BICOrBEI> \n"+
      "                       </OrgId>\n"+
      "                   </Id>\n"+
      "               </Orgtr>\n"+
      "               <Rsn>\n"+
      "                   <Prtry>B01</Prtry> \n"+
      "               </Rsn>\n"+
      "           </StsRsnInf>\n"+
      "       </OrgnlGrpInfAndSts>\n"+
      "   </S2SDDRsf:FIToFIPmtStsRptS2>\n"+
      "</S2SDDRsf:MPEDDRsfBlkDirDeb>";
  
  
  public static final String CancRSFtemplate ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+
	      "<S2SDDRsf:MPEDDRsfBlkDirDeb xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:S2SDDRsf=\"urn:S2SDDRsf:xsd:$MPEDDRsfBlkDirDeb\" xsi:schemaLocation=\"urn:S2SDDRsf:xsd:$MPEDDRsfBlkDirDeb MPEDDRsfBlkDirDeb.xsd\">\n"+
	      "   <S2SDDRsf:SndgInst>BACRIT21</S2SDDRsf:SndgInst>\n"+
	      "   <S2SDDRsf:RcvgInst>SOGENL2A</S2SDDRsf:RcvgInst>\n"+
	      "   <S2SDDRsf:SrvcId>{12}</S2SDDRsf:SrvcId>\n"+
	      "   <S2SDDRsf:TstCode>T</S2SDDRsf:TstCode>\n"+
	      "   <S2SDDRsf:FType>RSF</S2SDDRsf:FType>\n"+
	      "   <S2SDDRsf:FileRef>VSCT100713000095</S2SDDRsf:FileRef>\n"+
	      "   <S2SDDRsf:RoutingInd>ALL</S2SDDRsf:RoutingInd>\n"+
	      "   <S2SDDRsf:FileBusDt>{7}</S2SDDRsf:FileBusDt>\n"+
	      "   <S2SDDRsf:FileCycleNo>01</S2SDDRsf:FileCycleNo>\n"+
	      "   <S2SDDRsf:FIToFIPmtStsRptS2 xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.002.001.03S2\">\n"+
	      "       <GrpHdr>\n"+
	      "           <MsgId>rsf-settlement-{0}--{1}</MsgId>\n"+
	      "           <CreDtTm>{7}T09:51:33</CreDtTm>\n"+
	      "           <InstgAgt>\n"+
	      "               <FinInstnId>\n"+
	      "                   <BIC>SOGENL2A</BIC>\n"+
	      "               </FinInstnId>\n"+
	      "           </InstgAgt>\n"+
	      "       </GrpHdr>\n"+
	      "       <OrgnlGrpInfAndSts>\n"+
	      "           <OrgnlMsgId>MPM_GeneratedID</OrgnlMsgId> \n"+
	      "           <OrgnlMsgNmId>pacs.007</OrgnlMsgNmId> \n"+
	      "           <OrgnlNbOfTxs>{8}</OrgnlNbOfTxs> \n"+
	      "           <OrgnlCtrlSum>{9}</OrgnlCtrlSum> \n"+
	      "           <GrpSts>ACSC</GrpSts> \n"+
	      "           <StsRsnInf>\n"+
	      "               <Orgtr>\n"+
	      "                   <Id>\n"+
	      "                       <OrgId>\n"+
	      "                           <BICOrBEI>BACRIT21</BICOrBEI> \n"+
	      "                       </OrgId>\n"+
	      "                   </Id>\n"+
	      "               </Orgtr>\n"+
	      "               <Rsn>\n"+
	      "                   <Prtry>B01</Prtry> \n"+
	      "               </Rsn>\n"+
	      "           </StsRsnInf>\n"+
	      "       </OrgnlGrpInfAndSts>\n"+
	      "   </S2SDDRsf:FIToFIPmtStsRptS2>\n"+
	      "</S2SDDRsf:MPEDDRsfBlkDirDeb>";
  
  public static final String CancDVFtemplate ="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"+
	      "<S2SDDRsf:MPEDDRsfBlkDirDeb xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:S2SDDRsf=\"urn:S2SDDRsf:xsd:$MPEDDRsfBlkDirDeb\" xsi:schemaLocation=\"urn:S2SDDRsf:xsd:$MPEDDRsfBlkDirDeb MPEDDRsfBlkDirDeb.xsd\">\n"+
	      "   <S2SDDRsf:SndgInst>BACRIT21</S2SDDRsf:SndgInst>\n"+
	      "   <S2SDDRsf:RcvgInst>SOGENL2A</S2SDDRsf:RcvgInst>\n"+
	      "   <S2SDDRsf:SrvcId>{12}</S2SDDRsf:SrvcId>\n"+
	      "   <S2SDDRsf:TstCode>T</S2SDDRsf:TstCode>\n"+
	      "   <S2SDDRsf:FType>RSF</S2SDDRsf:FType>\n"+
	      "   <S2SDDRsf:FileRef>VSCT100713000095</S2SDDRsf:FileRef>\n"+
	      "   <S2SDDRsf:RoutingInd>ALL</S2SDDRsf:RoutingInd>\n"+
	      "   <S2SDDRsf:FileBusDt>{7}</S2SDDRsf:FileBusDt>\n"+
	      "   <S2SDDRsf:FileCycleNo>01</S2SDDRsf:FileCycleNo>\n"+
	      "   <S2SDDRsf:FIToFIPmtStsRptS2 xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.002.001.03S2\">\n"+
	      "       <GrpHdr>\n"+
	      "           <MsgId>dvf-settlement-{0}--{1}</MsgId>\n"+
	      "           <CreDtTm>{7}T09:51:33</CreDtTm>\n"+
	      "           <InstgAgt>\n"+
	      "               <FinInstnId>\n"+
	      "                   <BIC>SOGENL2A</BIC>\n"+
	      "               </FinInstnId>\n"+
	      "           </InstgAgt>\n"+
	      "       </GrpHdr>\n"+
	      "       <OrgnlGrpInfAndSts>\n"+
	      "           <OrgnlMsgId>MPM_GeneratedID</OrgnlMsgId> \n"+
	      "           <OrgnlMsgNmId>pacs.007</OrgnlMsgNmId> \n"+
	      "           <OrgnlNbOfTxs>{8}</OrgnlNbOfTxs> \n"+
	      "           <OrgnlCtrlSum>{9}</OrgnlCtrlSum> \n"+
	      "           <GrpSts>ACSC</GrpSts> \n"+
	      "           <StsRsnInf>\n"+
	      "               <Orgtr>\n"+
	      "                   <Id>\n"+
	      "                       <OrgId>\n"+
	      "                           <BICOrBEI>BACRIT21</BICOrBEI> \n"+
	      "                       </OrgId>\n"+
	      "                   </Id>\n"+
	      "               </Orgtr>\n"+
	      "               <Rsn>\n"+
	      "                   <Prtry>B01</Prtry> \n"+
	      "               </Rsn>\n"+
	      "           </StsRsnInf>\n"+
	      "       </OrgnlGrpInfAndSts>\n"+
	      "   </S2SDDRsf:FIToFIPmtStsRptS2>\n"+
	      "</S2SDDRsf:MPEDDRsfBlkDirDeb>";
  
  public static final String DVFtemplate = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n"+
      "<S2SDDDvf:MPEDDDvfBlkDirDeb xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" xmlns:S2SDDDvf=\"urn:S2SDDDvf:xsd:$MPEDDDvfBlkDirDeb\" targetNamespace=\"urn:S2SDDDvf:xsd:$MPEDDDvfBlkDirDeb\" elementFormDefault=\"qualified\">\n"+
      "  <S2SDDDvf:SndgInst>BACRIT21</S2SDDDvf:SndgInst>\n"+
      "  <S2SDDDvf:RcvgInst>SOGENL2A</S2SDDDvf:RcvgInst>\n"+
      "  <S2SDDDvf:SrvcId>MPE</S2SDDDvf:SrvcId>\n"+
      "  <S2SDDDvf:TstCode>T</S2SDDDvf:TstCode>\n"+
      "  <S2SDDDvf:FType>DVF</S2SDDDvf:FType>\n"+
      "  <S2SDDDvf:FileRef>VSCT100713000095</S2SDDDvf:FileRef>\n"+
      "  <S2SDDDvf:FileDtTm>{7}T09:51:33</S2SDDDvf:FileDtTm>\n"+
      "  <S2SDDDvf:OrigFRef>1307100951160131</S2SDDDvf:OrigFRef>\n"+
      "  <S2SDDDvf:OrigFName>S202SCTSCTDITA2.1_F400B.I</S2SDDDvf:OrigFName>\n"+
      "  <S2SDDDvf:OrigDtTm>{7}T09:51:33</S2SDDDvf:OrigDtTm>\n"+
      "  <S2SDDDvf:FileRjctRsn>A01</S2SDDDvf:FileRjctRsn>\n"+
      "  <S2SDDDvf:FileBusDt>{7}</S2SDDDvf:FileBusDt>\n"+
      "  <S2SDDDvf:FileCycleNo>01</S2SDDDvf:FileCycleNo>\n"+
      "  <S2SDDDvf:FIToFIPmtStsRptS2 xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.002.001.03S2\">\n"+
      "    <GrpHdr>\n"+
      "      <MsgId>dvf-settlement-{0}--{1}</MsgId>\n"+
      "      <CreDtTm>{7}T09:51:33</CreDtTm>\n"+
      "    </GrpHdr>\n"+
      "    <OrgnlGrpInfAndSts>\n"+
      "      <OrgnlMsgId>MPM_GeneratedID</OrgnlMsgId>\n"+
      "      <OrgnlMsgNmId>pacs.003</OrgnlMsgNmId>\n"+
      "      <OrgnlNbOfTxs>{8}</OrgnlNbOfTxs>\n"+
      "      <OrgnlCtrlSum>{9}</OrgnlCtrlSum>\n"+
      "      <GrpSts>ACCP</GrpSts>\n"+
      "      <StsRsnInf>\n"+
      "        <Orgtr>\n"+
      "          <Id>\n"+
      "            <OrgId>\n"+
      "              <BICOrBEI>BACRIT21</BICOrBEI>\n"+
      "            </OrgId>\n"+
      "          </Id>\n"+
      "        </Orgtr>\n"+
      "        <Rsn>\n"+
      "          <Prtry>B01</Prtry>\n"+
      "        </Rsn>\n"+
      "      </StsRsnInf>\n"+
      "    </OrgnlGrpInfAndSts>\n"+
      " </S2SDDDvf:FIToFIPmtStsRptS2>\n"+
      "</S2SDDDvf:MPEDDDvfBlkDirDeb>";
  
}
