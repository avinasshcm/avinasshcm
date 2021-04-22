package main;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.trapedza.bankfusion.webservices.Authentication;
import com.trapedza.bankfusion.webservices.Bfgenericsoapheader;
import com.trapedza.bankfusion.webservices.UBRCBACCRetrieveAccountMovementsSRVRequestType;
import com.trapedza.bankfusion.webservices.UBRCBACCRetrieveAccountMovementsSRVResponseType;
import com.trapedza.bankfusion.webservices.security.ApplicationID;
import com.trapedza.bankfusion.webservices.security.LoginResponseType;
import com.trapedza.bankfusion.webservices.security.LoginSerivce;
import com.trapedza.bankfusion.webservices.security.LoginService;
import com.trapedza.bankfusion.webservices.security.OSUserID;
import com.trapedza.bankfusion.webservices.security.PassCode;
import com.trapedza.bankfusion.webservices.security.Password;
import com.trapedza.bankfusion.webservices.security.Request;
import com.trapedza.bankfusion.webservices.security.UserName;

import com.misys.bankfusion.attributes.PagedQuery;
import com.misys.bankfusion.attributes.PagingRequest;
import com.misys.cbs.msgs.v1r0.RetrieveAcctMvmntRq;
import com.misys.cbs.types.AcctMovement;
import com.misys.cbs.types.AcctMovementInput;

import ub_r_cb_acc_retrieveaccountmovements_srvws.UBRCBACCRetrieveAccountMovementsSRVWSPortType;
import ub_r_cb_acc_retrieveaccountmovements_srvws.UBRCBACCRetrieveAccountMovementsSRVWSService;

public class TestWSCall {
	private static final int MAX_RETRY = 1;
	public static String tgt = "";

	public static void main(String[] args) {
		doLogin("brad", "brad");
		boolean tgtExpired = false;
		long startTime = Calendar.getInstance().getTimeInMillis();
		UBRCBACCRetrieveAccountMovementsSRVResponseType resp = null;
		int counter = 0;
		do {
			try {
				String modifiedTGT = tamperTGT(counter);
				resp = getAccountMovements(modifiedTGT);
				tgtExpired = false;
			}
			catch (javax.xml.ws.soap.SOAPFaultException e) {
				String faultCode = e.getFault().getFaultCode();
				if (faultCode.contains("11500025")) {
					System.out.println("Invalid TGT. Logging in Again");
					tgtExpired = true;
					doLogin("brad", "brad");
				}
			}
			counter++;
		}
		while (tgtExpired);
		//String respStatus = resp.getRetrieveAcctMvmntRs().getRsHeader().getStatus().getOverallStatus().toString();
		//System.out.println(respStatus);
		List<AcctMovement> acctMvmts = resp.getRetrieveAcctMvmntRs().getAccountMovements();
		long endTime = Calendar.getInstance().getTimeInMillis();
		processResult(acctMvmts);
		System.out.println("\n\n\n");
		System.out.println("Time taken to get Transactions with maximum " + MAX_RETRY + " login retries : " + (endTime - startTime) + "ms");
	}

	private static String tamperTGT(int counter) {
		String tgtSuffix = "";
		if (counter < MAX_RETRY) {
			tgtSuffix = "1";
		}
		String modifiedTGT = tgt + tgtSuffix;
		return modifiedTGT;
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

	private static UBRCBACCRetrieveAccountMovementsSRVResponseType getAccountMovements(String tgt) throws javax.xml.ws.soap.SOAPFaultException {
		UBRCBACCRetrieveAccountMovementsSRVWSService retreiveAccMvmt = new UBRCBACCRetrieveAccountMovementsSRVWSService();
		UBRCBACCRetrieveAccountMovementsSRVWSPortType port = retreiveAccMvmt.getUBRCBACCRetrieveAccountMovementsSRVWSPort();
		//
		UBRCBACCRetrieveAccountMovementsSRVRequestType request = new UBRCBACCRetrieveAccountMovementsSRVRequestType();
		request.setRetrieveAcctMvmntRq(prepareRetrieveAcctMvmntRq());
		Bfgenericsoapheader header = prepareGenericHeader(tgt);
		//
		UBRCBACCRetrieveAccountMovementsSRVResponseType resp = port.ubRCBACCRetrieveAccountMovementsSRV(request, header);
		return resp;
	}

	private static Bfgenericsoapheader prepareGenericHeader(String tgt) {
		Bfgenericsoapheader header = new Bfgenericsoapheader();
		Authentication auth = new Authentication();
		auth.setUserLocator(tgt);
		header.setAuthentication(auth);
		return header;
	}

	private static RetrieveAcctMvmntRq prepareRetrieveAcctMvmntRq() {
		RetrieveAcctMvmntRq retrieveAcctMvmntRq = new RetrieveAcctMvmntRq();
		retrieveAcctMvmntRq.setAccountMovementInput(prepareAccountMovementInput());
		retrieveAcctMvmntRq.setPagedQuery(preparePagedQuery());
		return retrieveAcctMvmntRq;
	}

	private static PagedQuery preparePagedQuery() {
		PagedQuery pagedQuery = new PagedQuery();
		PagingRequest pagingRequest = new PagingRequest();
		pagingRequest.setNumberOfRows(10);
		pagingRequest.setRequestedPage(1);
		pagedQuery.setPagingRequest(pagingRequest);
		return pagedQuery;
	}

	private static AcctMovementInput prepareAccountMovementInput() {
		AcctMovementInput accountMovementInput = new AcctMovementInput();
		accountMovementInput.setAccountId("10100038156");
		accountMovementInput.setStartDate(getDate(new Date(120, 1, 1)));
		accountMovementInput.setEndDate(getDate(new Date(121, 1, 1)));
		return accountMovementInput;
	}

	private static XMLGregorianCalendar getDate(Date date) {
		XMLGregorianCalendar startDate = null;
		try {
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(date);
			startDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		}
		catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return startDate;
	}

	private static void doLogin(String user, String pwd) {
		long startTime = Calendar.getInstance().getTimeInMillis();
		LoginService loginService = new LoginService();
		LoginSerivce ls = loginService.getLoginPort();
		UserName userName = new UserName();
		userName.setValue(user);
		Password password = new Password();
		password.setValue(pwd);
		PassCode passCode = new PassCode();
		passCode.setValue("");
		OSUserID oSUserID = new OSUserID();
		oSUserID.setValue("");
		ApplicationID applicationID = new ApplicationID();
		applicationID.setValue("");
		Request request = new Request();
		LoginResponseType response = ls.login(password, userName, passCode, oSUserID, applicationID, request);
		long endTime = Calendar.getInstance().getTimeInMillis();
		tgt = response.getReturn();
		System.out.println("Refreshed TGT : " + tgt + "\t\t\t Time taken to get TGT : " + (endTime - startTime) + "ms");
	}
}
