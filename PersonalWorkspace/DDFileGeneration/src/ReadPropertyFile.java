import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import oracle.jdbc.proxy.annotation.GetCreator;

public class ReadPropertyFile {
	public static String Counter;
	public static String Amount;
	public static String CreditorIBAN;
	public static String CreditorBICFI;
	public static String DebitorIBAN;
	public static String DebitorBICFI;
	public static String InitiatingPartyId;
	public static String PartyCreditorProfileId;
	public static String SchemeType;
	public static String TotalTransactions;
	public static String Pain008_Location;
	public static String Pain002_Location;
	public static String DVF_RSF_Location;
	public static Boolean IsPain008;
	public static String CreditTransferBICFI;
	public static String IN_CT_FileLocation;
	public static String Man_CDTR_Acc;
	public static String Mandate_FileLocation;
	public static String MandateType;
	public static String MandateID;
	public static String MandateGroup;
	public static String CT_R_EVENTSLocation;
	public static String BulkPILocation;
	public static String OutDDSettlementPath;
	public static String IBANAccountsFileName;
	public static String DDTxnInfoFileName;
	/**
	 * @param args
	 */
	static {
		//create an instance of properties class
		Properties props = new Properties();
		//try retrieve data from file
		try {
			props.load(new FileInputStream("message.properties"));
			IsPain008 = Boolean.valueOf(props.getProperty("Pain008_Location"));
			Pain008_Location = props.getProperty("Pain008_Location");
			Pain002_Location = props.getProperty("Pain002_Location");
			DVF_RSF_Location = props.getProperty("DVF_RSF_Location");
			Counter = props.getProperty("Counter");
			Amount = props.getProperty("Amount");
			CreditorIBAN = props.getProperty("CreditorIBAN");
			CreditorBICFI = props.getProperty("CreditorBICFI");
			DebitorIBAN = props.getProperty("DebitorIBAN");
			DebitorBICFI = props.getProperty("DebitorBICFI");
			InitiatingPartyId = props.getProperty("InitiatingPartyId");
			PartyCreditorProfileId = props.getProperty("PartyCreditorProfileId");
			SchemeType = props.getProperty("SchemeType");
			TotalTransactions = props.getProperty("TotalTransactions");
			CreditTransferBICFI = props.getProperty("CreditTransferBIC");
			IN_CT_FileLocation = props.getProperty("IN_CT_FileLocation");
			Man_CDTR_Acc = props.getProperty("Man_CDTR_Acc");
			Mandate_FileLocation = props.getProperty("Mandate_FileLocation");
			MandateType = props.getProperty("MandateType");
			MandateID= props.getProperty("MandateID");
			MandateGroup=props.getProperty("MandateGroup");
			CT_R_EVENTSLocation=props.getProperty("CT_R_EVENTSLocation");
			BulkPILocation=props.getProperty("BulkPILocation");
			
			OutDDSettlementPath=props.getProperty("OutDDSettlementPath");
			IBANAccountsFileName=props.getProperty("IBANAccountsFileName");
			DDTxnInfoFileName=props.getProperty("DDTxnInfoFileName");
			
		}
		//catch exception in case properties file does not exist
		catch (IOException e) {
			e.printStackTrace();
			System.err.println("Problem in loading build.properties file");
		}
	}

	public static void main(String[] args) {
	}
}
