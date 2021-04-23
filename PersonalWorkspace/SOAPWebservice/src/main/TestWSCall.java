package main;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.List;

import com.trapedza.bankfusion.webservices.UBRCBACCRetrieveAccountMovementsSRVResponseType;
import com.trapedza.bankfusion.webservices.security.LoginResponseType;

import com.misys.cbs.types.AcctMovement;

import services.Login;
import services.UBRCBACCRetrieveAccountMovementsSRV;

public class TestWSCall {
	private static final int MAX_RETRY = 6;
	public static String tgt = "";
	static String WSDL_LOGIN = "http://blrl10tl5y2:9083/bfweb/services/LoginService?wsdl";
	static String WSDL_RTRV_TXN = "http://blrl10tl5y2:9083/bfweb/services/UB_R_CB_ACC_RetrieveAccountMovements_SRVWS?wsdl";

	public static void main(String[] args) {
		URL loginURL = getURL(WSDL_LOGIN);
		URL txnURL = getURL(WSDL_RTRV_TXN);
		doLogin(loginURL, "brad", "brad");
		boolean tgtExpired = false;
		long startTime = Calendar.getInstance().getTimeInMillis();
		UBRCBACCRetrieveAccountMovementsSRVResponseType resp = new UBRCBACCRetrieveAccountMovementsSRVResponseType();
		int maxCounter = 5;
		int counter = 0;
		do {
			try {
				String modifiedTGT = tamperTGT(counter);
				UBRCBACCRetrieveAccountMovementsSRV retrieveAccountMovements = new UBRCBACCRetrieveAccountMovementsSRV(txnURL);
				resp = retrieveAccountMovements.invoke(modifiedTGT);
				tgtExpired = false;
			}
			catch (javax.xml.ws.soap.SOAPFaultException e) {
				String faultCode = e.getFault().getFaultCode();
				if (faultCode.contains("11500025")) {
					System.out.println("Invalid TGT. Logging in Again");
					tgtExpired = true;
					doLogin(loginURL, "brad", "brad");
				}
			}
			counter++;
		}
		while (tgtExpired && counter<maxCounter);
		//String respStatus = resp.getRetrieveAcctMvmntRs().getRsHeader().getStatus().getOverallStatus().toString();
		//System.out.println(respStatus);
		List<AcctMovement> acctMvmts = resp.getRetrieveAcctMvmntRs().getAccountMovements();
		long endTime = Calendar.getInstance().getTimeInMillis();
		processResult(acctMvmts);
		System.out.println("\n\n\n");
		System.out.println("Time taken to get Transactions with maximum " + MAX_RETRY + " login retries : " + (endTime - startTime) + "ms");
	}

	private static URL getURL(String strURL) {
		URL url = null;
		try {
			url = new URL(strURL);
		}
		catch (MalformedURLException ex) {
			ex.printStackTrace();
		}
		return url;
	}

	private static String tamperTGT(int counter) {
		String tgtSuffix = "";
		if (counter < MAX_RETRY) {
			tgtSuffix = "1";
		}
		String modifiedTGT = tgt + tgtSuffix;
		return modifiedTGT;
	}

	private static void doLogin(URL url, String user, String pwd) {
		long startTime = Calendar.getInstance().getTimeInMillis();
		Login loginService = new Login(url);
		LoginResponseType response = loginService.invoke(user, pwd);
		long endTime = Calendar.getInstance().getTimeInMillis();
		tgt = response.getReturn();
		System.out.println("Refreshed TGT : " + tgt + "\t\t\t Time taken to get TGT : " + (endTime - startTime) + "ms");
	}

	private static void processResult(List<AcctMovement> acctMvmts) {
		System.out.println("\n\n\n");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("-----------------------------------Processing Result------------------------------------");
		System.out.println("----------------------------------------------------------------------------------------");
		StringBuilder sb = new StringBuilder();
		sb.append("Date").append("\t");
		sb.append("Reference").append("\t");
		sb.append("Amount").append("\t");
		sb.append("Narrative").append("\t");
		System.out.println(sb.toString());
		for (AcctMovement movement : acctMvmts) {
			sb = new StringBuilder();
			sb.append(movement.getPostingDate()).append("\t");
			sb.append(movement.getTransactionRef()).append("\t");
			sb.append(movement.getAmount()).append("\t");
			sb.append(movement.getNarrative()).append("\t");
			System.out.println(sb.toString());
		}
	}
}
