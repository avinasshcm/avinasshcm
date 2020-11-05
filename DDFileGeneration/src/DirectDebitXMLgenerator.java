import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import dd.perf.AccountInfo;
import dd.perf.TxnInfo;

public class DirectDebitXMLgenerator {

    public static void main(String[] args) {
        System.out.print("\n 1.  Outward DD (Pain008)");
        System.out.print("\n 2.  Inward DD  (Pain002)");
        System.out.print("\n 3.  E-Mandates (Pain009)");
        System.out.print("\n 4.  Inward Credit Transfer");
        System.out.print("\n 5.  Outward CT Cancellation");
        System.out.print("\n 6.  Outward CT Reversal");
        System.out.print("\n 7.  Outward CT Return");
        System.out.print("\n 8.  Outward CT Bulk PI");
        System.out.print("\n 9.  Inward CT Cancellation");
        System.out.print("\n10.  Inward CT Return");
        System.out.print("\n11.  Outward DD Cancellation (MPM UI)");
        System.out.print("\n12.  Outward DD Settlement");
        System.out.print("\n13.  Inward DD Settlement");
        System.out.print("\n14.  Outward DD Return");
        System.out.print("\nEnter Your Selection : ");
        String option = readLine();
        String txnCount = "1";
        String pmtInfoCount = "1";
        if (option.equals("1")) {
            System.out.print("\nEnter Number of Payment Instructions : ");
            pmtInfoCount = readLine();
        }
        if (option.equals("1") || option.equals("2") || option.equals("3") || option.equals("8") || option.equals("4")) {
            System.out.print("\nEnter Number of Transactions : ");
            txnCount = readLine();
        }
        String uniqueCode = new Long(System.currentTimeMillis() / 1000).toString(); // 0 -- take only seconds
        String counter = ReadPropertyFile.Counter; // 1
        Double amount = Double.parseDouble(ReadPropertyFile.Amount); // 2
        String creditorIBAN = ReadPropertyFile.CreditorIBAN;// 3
        String[] creditorIBANArray = creditorIBAN.split(",");
        String creditorBICFI = ReadPropertyFile.CreditorBICFI; // 4
        String debitorIBAN = ReadPropertyFile.DebitorIBAN; // 5
        String[] debitorIBANArray = debitorIBAN.split(",");
        String debitorBICFI = ReadPropertyFile.DebitorBICFI; // 6 for 0006
        String collectionDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date()); // 7
        Integer totalTransactions = Integer.parseInt(txnCount); // 8
        Integer totalPaymentInstructions = Integer.parseInt(pmtInfoCount); // 8
        Double total = totalTransactions * amount; // 9
        String initiatingPartyId = ReadPropertyFile.InitiatingPartyId; // 10
        String[] initiatingPartyIdArray = initiatingPartyId.split(",");
        String partyCreditorProfileId = ReadPropertyFile.PartyCreditorProfileId; // 11 --- CBS.MPTB_CREDITORPROFILE.MPCREDITORIDENTIFIER
                                                                                 // where CBS.MPTB_CREDITORPROFILE.MPPARTYID = "000003"
                                                                                 // //initiatingPartyId
        String[] partyCreditorProfileIdArray = partyCreditorProfileId.split(",");
        String schemeType = ReadPropertyFile.SchemeType; // 12
        String ctBICCode = ReadPropertyFile.CreditTransferBICFI;// {13}
        String Man_CDTR_Acc = ReadPropertyFile.Man_CDTR_Acc;// {14}
        String MandateType = ReadPropertyFile.MandateType;// {15}
        String MandateID = ReadPropertyFile.MandateID;// {16}
        String MandateGroup = ReadPropertyFile.MandateGroup;// {17}
        Object[] testArgs =
            { uniqueCode, new Long(counter), String.valueOf(amount), creditorIBAN, creditorBICFI, debitorIBAN, debitorBICFI,
                collectionDate, String.valueOf(totalTransactions), String.valueOf(total), initiatingPartyId, partyCreditorProfileId,
                schemeType, ctBICCode, Man_CDTR_Acc, MandateType, MandateID, MandateGroup, pmtInfoCount };
        // MessageFormat dvfTemplate = new MessageFormat(SettlementTamplate.DVFtemplate);
        String rsf_filename = "RSFIncoming-" + String.valueOf(totalTransactions) + "_txns-" + uniqueCode + ".xml";
        String dvf_filename = "DVFIncoming-" + String.valueOf(totalTransactions) + "_txns-" + uniqueCode + ".xml";
        MessageFormat rsfTemplate = null;
        // CT R-Events
        BufferedWriter writer = null;
        switch (Integer.parseInt(option)) {
        case 1:
            MessageFormat dbtTrxHeader = new MessageFormat(DebitTrxTemplate.header);
            MessageFormat dbtPmtHeader = new MessageFormat(DebitTrxTemplate.pmtInfo_header);
            MessageFormat dbtTrx = new MessageFormat(DebitTrxTemplate.template);
            MessageFormat dbtPmtFooter = new MessageFormat(DebitTrxTemplate.pmtInfo_footer);
            MessageFormat dbtTrxFooter = new MessageFormat(DebitTrxTemplate.footer);
            String PAIN8filename =
                "DD-" + pmtInfoCount + "-" + String.valueOf(totalTransactions) + "_txns-" + uniqueCode + "_pain008_STEP2.xml";
            rsfTemplate = new MessageFormat(SettlementTamplate.RSFtemplate);
            writeToFile(writer, ReadPropertyFile.DVF_RSF_Location + "/" + dvf_filename, testArgs, rsfTemplate);
            writePain008TxnsToFile(amount, writer, ReadPropertyFile.Pain008_Location + "/" + PAIN8filename, testArgs, dbtTrxHeader,
                dbtPmtHeader, dbtTrx, dbtPmtFooter, dbtTrxFooter, totalTransactions, totalPaymentInstructions, creditorIBANArray,
                debitorIBANArray, initiatingPartyIdArray, partyCreditorProfileIdArray);
            writeToFile(writer, ReadPropertyFile.DVF_RSF_Location + "/" + rsf_filename, testArgs, rsfTemplate);
            break;
        case 2:
            String PAIN2filename = "DNFperf" + String.valueOf(totalTransactions) + "_txns-" + uniqueCode + "_pain002_STEP2.xml";
            rsfTemplate = new MessageFormat(SettlementTamplate.RSFtemplate.replace("MPM_GeneratedID", "IncomingDDGrpId-{0}--hdr"));
            MessageFormat InGrpHeader = new MessageFormat(PCAS003Template.header);
            MessageFormat InDbTrx = new MessageFormat(PCAS003Template.txnTemplate);
            MessageFormat InDbTrxFooter = new MessageFormat(PCAS003Template.footer);
            // files for inward (DNF)
            writeDDTxnsToFile(writer, ReadPropertyFile.Pain002_Location + "/" + PAIN2filename, testArgs, InGrpHeader, InDbTrx,
                InDbTrxFooter, totalTransactions, creditorIBANArray, debitorIBANArray, initiatingPartyIdArray, partyCreditorProfileIdArray);
            writeToFile(writer, ReadPropertyFile.DVF_RSF_Location + "/" + rsf_filename, testArgs, rsfTemplate);
            break;
        case 3:
            MessageFormat mandateHeader = new MessageFormat(MandateTemplate.MandateHeaderTemplate);
            MessageFormat mandateItem = new MessageFormat(MandateTemplate.MandateItemTemplate);
            MessageFormat mandateFooter = new MessageFormat(MandateTemplate.MandateFooterTemplate);
            String MandateFileName = "Mandate-" + totalTransactions + "-" + uniqueCode + ".xml";
            writeDDTxnsToFile(writer, ReadPropertyFile.Mandate_FileLocation + "/" + MandateFileName, testArgs, mandateHeader, mandateItem,
                mandateFooter, totalTransactions, creditorIBANArray, debitorIBANArray, initiatingPartyIdArray, partyCreditorProfileIdArray);
            break;
        // writeToFile(writer, ReadPropertyFile.Mandate_FileLocation + "/" + MandateFileName, testArgs, mandate);
        case 4:
            String InwardCTFileName = "CTIncoming-" + uniqueCode + ".xml";
            MessageFormat inwardCTTemplateHeader = new MessageFormat(InwardCreditTransferTemplate.InwardCTTemplateHeader);
            MessageFormat inwardCTTemplateBody = new MessageFormat(InwardCreditTransferTemplate.InwardCTTemplateBody);
            MessageFormat inwardCTTemplateFooter = new MessageFormat(InwardCreditTransferTemplate.InwardCTTemplateFooter);
            writeDDTxnsToFile(writer, ReadPropertyFile.IN_CT_FileLocation + "/" + InwardCTFileName, testArgs, inwardCTTemplateHeader,
                inwardCTTemplateBody, inwardCTTemplateFooter, totalTransactions, creditorIBANArray, debitorIBANArray,
                initiatingPartyIdArray, partyCreditorProfileIdArray);
            break;
        case 5:
            String CancellationFileName = "PositiveAnswer-" + "-" + uniqueCode + ".xml";
            MessageFormat outCancellation = new MessageFormat(CTREventTemplate.OutCancellationTemplate);
            writeToFile(writer, ReadPropertyFile.CT_R_EVENTSLocation + "/" + CancellationFileName, testArgs, outCancellation);
            break;
        case 6:
            String ReversalFileName = "Reversal-" + "-" + uniqueCode + ".xml";
            MessageFormat outReversal = new MessageFormat(CTREventTemplate.OutRejectTemplate);
            writeToFile(writer, ReadPropertyFile.CT_R_EVENTSLocation + "/" + ReversalFileName, testArgs, outReversal);
            break;
        case 7:
            String ReturnFileName = "Return-" + "-" + uniqueCode + ".xml";
            MessageFormat outReturn = new MessageFormat(CTREventTemplate.OutReturnTemplate);
            writeToFile(writer, ReadPropertyFile.CT_R_EVENTSLocation + "/" + ReturnFileName, testArgs, outReturn);
            break;
        case 8:
            String BulkPIFileName = "BulkPI-" + totalTransactions + "-" + uniqueCode + ".xml";
            // CT Bulk PI
            MessageFormat BulkPIHeader = new MessageFormat(CTBulkPITemplate.BulkPIHeader);
            MessageFormat BulkPIBody = new MessageFormat(CTBulkPITemplate.BulkPIBody);
            MessageFormat BulkPIFooter = new MessageFormat(CTBulkPITemplate.BulkPIFooter);
            writeDDTxnsToFile(writer, ReadPropertyFile.BulkPILocation + "/" + BulkPIFileName, testArgs, BulkPIHeader, BulkPIBody,
                BulkPIFooter, totalTransactions, creditorIBANArray, debitorIBANArray, initiatingPartyIdArray, partyCreditorProfileIdArray);
            break;
        case 9:
            String InCancFileName = "INCanc-" + totalTransactions + "-" + uniqueCode + ".xml";
            MessageFormat inCancellation = new MessageFormat(CTREventTemplate.InCancellationTemplate);
            writeToFile(writer, ReadPropertyFile.CT_R_EVENTSLocation + "/" + InCancFileName, testArgs, inCancellation);
            break;
        case 10:
            rsfTemplate = new MessageFormat(SettlementTamplate.CancRSFtemplate);
            writeToFile(writer, ReadPropertyFile.DVF_RSF_Location + "/" + dvf_filename, testArgs, rsfTemplate);
            writeToFile(writer, ReadPropertyFile.DVF_RSF_Location + "/" + rsf_filename, testArgs, rsfTemplate);
            break;
        case 11:
            rsfTemplate = new MessageFormat(SettlementTamplate.CancDVFtemplate);
            writeToFile(writer, ReadPropertyFile.DVF_RSF_Location + "/" + dvf_filename, testArgs, rsfTemplate);
            rsfTemplate = new MessageFormat(SettlementTamplate.CancRSFtemplate);
            writeToFile(writer, ReadPropertyFile.DVF_RSF_Location + "/" + rsf_filename, testArgs, rsfTemplate);
            break;
        case 12:
            String outDDSettlement_filename = "OutDDSettlement-" + "-" + uniqueCode + ".xml";
            prepareSettlementFile(writer, ReadPropertyFile.OutDDSettlementPath + "/" + outDDSettlement_filename);
            break;
        case 13:
            String inDDSettlement_filename = "InDDSettlement-" + "-" + uniqueCode + ".xml";
            prepareInwardSettlementFile(writer, ReadPropertyFile.OutDDSettlementPath + "/" + inDDSettlement_filename);
            break;
        case 14:

            String return_rsf_filename = "OutReturnRSF-" + "-" + uniqueCode + ".xml";

            String return_dnf_filename = "OutReturnDNF-" + "-" + uniqueCode + ".xml";

            rsfTemplate = new MessageFormat(OutDDREventTemplate.OutReturnDNFTemplate);
            writeToFile(writer, ReadPropertyFile.DVF_RSF_Location + "/" + return_dnf_filename, testArgs, rsfTemplate);
            rsfTemplate = new MessageFormat(OutDDREventTemplate.OutReturnRSFTemplate);
            writeToFile(writer, ReadPropertyFile.DVF_RSF_Location + "/" + return_rsf_filename, testArgs, rsfTemplate);
            break;
        default:
            System.out.println("Invalid Option");
            break;
        }
    } // main end

    public static String readLine() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String option = null;
        try {
            option = br.readLine();
        } catch (IOException ioe) {
            System.out.println("IO error trying to read Input!");
            // System.exit(1);
        }
        return option;
    }

    public static void writeToFile(BufferedWriter writer, String filePath, Object[] testArgs, MessageFormat template) {
        try {
            File inXML = new File(filePath);
            // This will output the full path where the file will be written to...
            System.out.println(inXML.getCanonicalPath());
            writer = new BufferedWriter(new FileWriter(inXML));
            writer.write(template.format(testArgs));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the writer regardless of what happens...
                writer.close();
            } catch (Exception e) {
                System.out.println("finally block pain002");
                e.printStackTrace();
            }
        }
    }

    public static void writeDDTxnsToFile(BufferedWriter writer, String filePath, Object[] testArgs, MessageFormat dbtTrxHeader,
        MessageFormat dbtTrx, MessageFormat dbtTrxFooter, int txnCount, String[] creditorIBANArray, String[] debitorIBANArray,
        String[] initiatingPartyIdArray, String[] partyCreditorProfileIdArray) {
        try {
            File ddXML = new File(filePath);
            // This will output the full path where the file will be written to...
            System.out.println(ddXML.getCanonicalPath());
            writer = new BufferedWriter(new FileWriter(ddXML));
            int seqNum = 1;
            if (partyCreditorProfileIdArray.length > 1) {
                System.out.print("\nEnter Your Choice of Sequence less than " + partyCreditorProfileIdArray.length + " : ");
                seqNum = Integer.parseInt(readLine());
            }
            // int randomNumber = generate(partyCreditorProfileIdArray.length);
            int randomNumber = seqNum - 1;
            testArgs[3] = creditorIBANArray[randomNumber];
            testArgs[5] = debitorIBANArray[randomNumber];
            testArgs[10] = initiatingPartyIdArray[randomNumber];
            testArgs[11] = partyCreditorProfileIdArray[randomNumber];
            // InitiatingPartyId; //10
            // PartyCreditorProfileId; //11
            writer.write(dbtTrxHeader.format(testArgs));
            FileInputStream file = new FileInputStream(new File(ReadPropertyFile.IBANAccountsFileName));
            XSSFSheet sheet = readSheet(file);
            int totalRows = sheet.getLastRowNum();
            for (int i = 0; i < txnCount; i++) {
                int rowNum = i % totalRows;
                AccountInfo bn = readFile(sheet, rowNum);
                testArgs[1] = String.valueOf(i);
                testArgs[3] = bn.getCdtrAcct();
                testArgs[5] = bn.getDbtrAcc();
                writer.write(dbtTrx.format(testArgs));
            }
            writer.write(dbtTrxFooter.format(testArgs));
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the writer regardless of what happens...
                writer.close();
            } catch (Exception e) {
                System.out.println("finally block pain008");
                e.printStackTrace();
            }
        }
    }

    public static void writePain008TxnsToFile(Double amount, BufferedWriter writer, String filePath, Object[] testArgs,
        MessageFormat dbtTrxHeader, MessageFormat dbtPmtHeader, MessageFormat dbtTrx, MessageFormat dbtPmtFooter,
        MessageFormat dbtTrxFooter, int txnCount, int pmtInfoCount, String[] creditorIBANArray, String[] debitorIBANArray,
        String[] initiatingPartyIdArray, String[] partyCreditorProfileIdArray) {
        try {
            File ddXML = new File(filePath);
            // This will output the full path where the file will be written to...
            System.out.println(ddXML.getCanonicalPath());
            writer = new BufferedWriter(new FileWriter(ddXML));
            int seqNum = 1;
            if (partyCreditorProfileIdArray.length > 1) {
                System.out.print("\nEnter Your Choice of Sequence less than " + partyCreditorProfileIdArray.length + " : ");
                seqNum = Integer.parseInt(readLine());
            }
            // int randomNumber = generate(partyCreditorProfileIdArray.length);
            int randomNumber = seqNum - 1;
            testArgs[3] = creditorIBANArray[randomNumber];
            testArgs[5] = debitorIBANArray[randomNumber];
            testArgs[10] = initiatingPartyIdArray[randomNumber];
            testArgs[11] = partyCreditorProfileIdArray[randomNumber];
            // InitiatingPartyId; //10
            // PartyCreditorProfileId; //11
            int pmtTxn = txnCount * pmtInfoCount;
            testArgs[8] = String.valueOf(pmtTxn);
            Double totAmt = amount * txnCount * pmtInfoCount;
            testArgs[9] = String.valueOf(totAmt);
            writer.write(dbtTrxHeader.format(testArgs));
            FileInputStream file = new FileInputStream(new File(ReadPropertyFile.IBANAccountsFileName));
            XSSFSheet sheet = readSheet(file);
            int totalRows = sheet.getLastRowNum();
            for (int pmt = 0; pmt < pmtInfoCount; pmt++) {
                testArgs[1] = String.valueOf(pmt + 1);

                int txn = txnCount;
                testArgs[8] = String.valueOf(txn);
                testArgs[8] = String.valueOf(txnCount);
                totAmt = amount * txnCount;
                testArgs[9] = String.valueOf(totAmt);
                writer.write(dbtPmtHeader.format(testArgs));
                for (int i = 0; i < txnCount; i++) {
                    int rowNum = i % totalRows;
                    AccountInfo bn = readFile(sheet, rowNum);
                    testArgs[1] = String.valueOf(i);
                    testArgs[3] = bn.getCdtrAcct();
                    testArgs[5] = bn.getDbtrAcc();
                    testArgs[18] = String.valueOf(pmt);
                    writer.write(dbtTrx.format(testArgs));
                }
                writer.write(dbtPmtFooter.format(testArgs));
            }
            writer.write(dbtTrxFooter.format(testArgs));
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the writer regardless of what happens...
                writer.close();
            } catch (Exception e) {
                System.out.println("finally block pain008");
                e.printStackTrace();
            }
        }
    }

    static int generate(int maximum) {
        int randomNum = (int) (Math.random() * maximum);
        return randomNum;
    }

    static XSSFSheet readSheet(FileInputStream file) throws IOException {
        // Create Workbook instance holding reference to .xlsx file
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        // Get first/desired sheet from the workbook
        XSSFSheet sheet = workbook.getSheetAt(0);
        return sheet;
    }

    static AccountInfo readFile(XSSFSheet sheet, int index) throws IOException {
        AccountInfo bn = new AccountInfo();
        Row row = sheet.getRow(index);
        bn.setDbtrAcc(extractTagValue(row, 0));
        bn.setCdtrAcct(extractTagValue(row, 1));
        bn.setPartyID(extractTagValue(row, 2));
        bn.setCreditorIdentifier(extractTagValue(row, 3));
        return bn;
    }

    private static String extractTagValue(Row row, int cellNumber) {
        Cell cell = row.getCell(cellNumber);
        int cellType = cell.getCellType();
        if (cellType == cell.CELL_TYPE_NUMERIC)
            return String.valueOf(row.getCell(cellNumber).getNumericCellValue());
        else
            return row.getCell(cellNumber).getStringCellValue();
    }

    static TxnInfo readDDTxnsFromFile(XSSFSheet sheet, int index) throws IOException {
        TxnInfo txnInfo = new TxnInfo();
        Row row = sheet.getRow(index);
        txnInfo.setInstructionID(extractTagValue(row, 0));
        txnInfo.setEndToEndID(extractTagValue(row, 1));
        txnInfo.setCreditorIdentifier(extractTagValue(row, 2));
        txnInfo.setCreditorAccount(extractTagValue(row, 3));
        txnInfo.setDebitorAccount(extractTagValue(row, 4));
        return txnInfo;
    }

    public static void prepareSettlementFile(BufferedWriter writer, String filePath) {
        String collectionDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        Double amount = Double.parseDouble(ReadPropertyFile.Amount);
        Object[] testArgs = { collectionDate, amount, null, null, null, null, null, null, null, null, null, null };
        MessageFormat header = new MessageFormat(DDSettlementTemplate.OutDDSettlementHeader);
        MessageFormat body = new MessageFormat(DDSettlementTemplate.OutDDSettlementBody);
        MessageFormat footer = new MessageFormat(DDSettlementTemplate.OutDDSettlementFooter);
        try {
            File ddXML = new File(filePath);
            writer = new BufferedWriter(new FileWriter(ddXML));
            FileInputStream file = new FileInputStream(new File(ReadPropertyFile.DDTxnInfoFileName));
            XSSFSheet sheet = readSheet(file);
            int totalRows = sheet.getLastRowNum();
            Double totalAmount = amount * totalRows;
            System.out.print("\nEnter Number of Transactions less than " + totalRows + " : ");
            int inputTotalRows = Integer.parseInt(readLine());
            int pages = totalRows / inputTotalRows;
            int offset = 1;
            if (pages > 1) {
                System.out.print("\nEnter Page Number less than " + pages + " : ");
                offset = Integer.parseInt(readLine());
                offset = (offset > pages) ? 1 : offset;
            }
            totalRows = (inputTotalRows > totalRows) ? totalRows : inputTotalRows;
            testArgs[8] = totalRows;
            testArgs[2] = totalAmount;
            writer.write(header.format(testArgs));
            for (int i = 1 + (totalRows * (offset - 1)); i <= (totalRows * offset); i++) {
                int rowNum = i;
                TxnInfo txnInfo = readDDTxnsFromFile(sheet, rowNum);
                // 11 UID
                // 12 Counter
                // String uniqueCode = new Long(System.currentTimeMillis() / 1000).toString();
                testArgs[3] = txnInfo.getInstructionID();
                testArgs[4] = txnInfo.getEndToEndID();
                testArgs[5] = txnInfo.getCreditorIdentifier();
                testArgs[6] = txnInfo.getCreditorAccount();
                testArgs[7] = txnInfo.getDebitorAccount();
                writer.write(body.format(testArgs));
            }
            writer.write(footer.format(testArgs));
            file.close();
            System.out.println(ddXML.getCanonicalPath());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the writer regardless of what happens...
                writer.close();
            } catch (Exception e) {
                System.out.println("finally block pain008");
                e.printStackTrace();
            }
        }
    }

    public static void prepareInwardSettlementFile(BufferedWriter writer, String filePath) {
        String collectionDate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        Double amount = Double.parseDouble(ReadPropertyFile.Amount);
        Object[] testArgs = { collectionDate, amount, null, null, null, null, null, null, null, null, null, null, null };
        String uniqueCode = new Long(System.currentTimeMillis() / 1000).toString();
        testArgs[11] = uniqueCode;
        MessageFormat header = new MessageFormat(DDSettlementTemplate.InDDSettlementHeader);
        MessageFormat body = new MessageFormat(DDSettlementTemplate.InDDSettlementBody);
        MessageFormat footer = new MessageFormat(DDSettlementTemplate.InDDSettlementFooter);
        try {
            File ddXML = new File(filePath);
            writer = new BufferedWriter(new FileWriter(ddXML));
            FileInputStream file = new FileInputStream(new File(ReadPropertyFile.DDTxnInfoFileName));
            XSSFSheet sheet = readSheet(file);
            int totalRows = sheet.getLastRowNum();
            Double totalAmount = amount * totalRows;
            System.out.print("\nEnter Number of Transactions less than " + totalRows + " : ");
            int inputTotalRows = Integer.parseInt(readLine());
            int pages = totalRows / inputTotalRows;
            int offset = 1;
            if (pages > 1) {
                System.out.print("\nEnter Page Number less than " + pages + " : ");
                offset = Integer.parseInt(readLine());
                offset = (offset > pages) ? 1 : offset;
            }
            totalRows = (inputTotalRows > totalRows) ? totalRows : inputTotalRows;
            testArgs[8] = totalRows;
            testArgs[2] = totalAmount;
            writer.write(header.format(testArgs));
            for (int i = 1 + (totalRows * (offset - 1)); i <= (totalRows * offset); i++) {
                int rowNum = i;
                TxnInfo txnInfo = readDDTxnsFromFile(sheet, rowNum);
                // 11 UID
                // 12 Counter

                testArgs[3] = txnInfo.getInstructionID();
                testArgs[4] = txnInfo.getEndToEndID();
                testArgs[5] = txnInfo.getCreditorIdentifier();
                testArgs[6] = txnInfo.getCreditorAccount();
                testArgs[7] = txnInfo.getDebitorAccount();

                testArgs[12] = i;
                writer.write(body.format(testArgs));
            }
            writer.write(footer.format(testArgs));
            file.close();
            System.out.println(ddXML.getCanonicalPath());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the writer regardless of what happens...
                writer.close();
            } catch (Exception e) {
                System.out.println("finally block pain008");
                e.printStackTrace();
            }
        }
    }
} // class end
