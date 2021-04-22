package services;

import java.net.URL;
import java.sql.Date;

import com.trapedza.bankfusion.webservices.Authentication;
import com.trapedza.bankfusion.webservices.Bfgenericsoapheader;
import com.trapedza.bankfusion.webservices.UBRCBACCRetrieveAccountMovementsSRVRequestType;
import com.trapedza.bankfusion.webservices.UBRCBACCRetrieveAccountMovementsSRVResponseType;

import common.utils.DateUtils;
import common.utils.UnmarshallHelper;
import constants.XMLTemplates;
import ub_r_cb_acc_retrieveaccountmovements_srvws.UBRCBACCRetrieveAccountMovementsSRVWSPortType;
import ub_r_cb_acc_retrieveaccountmovements_srvws.UBRCBACCRetrieveAccountMovementsSRVWSService;

public class UBRCBACCRetrieveAccountMovementsSRV {
	private URL url;
	private UnmarshallHelper unmarshallHelper = new UnmarshallHelper();

	public UBRCBACCRetrieveAccountMovementsSRV(URL url) {
		this.url = url;
	}

	public UBRCBACCRetrieveAccountMovementsSRVResponseType invoke(String tgt) {
		UBRCBACCRetrieveAccountMovementsSRVWSService retreiveAccMvmt = new UBRCBACCRetrieveAccountMovementsSRVWSService(url);
		UBRCBACCRetrieveAccountMovementsSRVWSPortType port = retreiveAccMvmt.getUBRCBACCRetrieveAccountMovementsSRVWSPort();
		//
		UBRCBACCRetrieveAccountMovementsSRVRequestType request = prepareRetreiveAccountMovementRequest();
		Bfgenericsoapheader header = prepareGenericHeader(tgt);
		//
		UBRCBACCRetrieveAccountMovementsSRVResponseType resp = port.ubRCBACCRetrieveAccountMovementsSRV(request, header);
		return resp;
	}

	private Bfgenericsoapheader prepareGenericHeader(String tgt) {
		Bfgenericsoapheader header = (Bfgenericsoapheader) unmarshallHelper.initializeObject(Bfgenericsoapheader.class, XMLTemplates.bfgenericsoapheader);
		header.getAuthentication().setUserLocator(tgt);
		Authentication auth = new Authentication();
		auth.setUserLocator(tgt);
		header.setAuthentication(auth);
		return header;
	}

	private UBRCBACCRetrieveAccountMovementsSRVRequestType prepareRetreiveAccountMovementRequest() {
		UBRCBACCRetrieveAccountMovementsSRVRequestType request = (UBRCBACCRetrieveAccountMovementsSRVRequestType) unmarshallHelper.initializeObject(UBRCBACCRetrieveAccountMovementsSRVRequestType.class, XMLTemplates.UB_R_CB_ACC_RetrieveAccountMovements_SRVRequest);
		//
		request.getRetrieveAcctMvmntRq().getPagedQuery().getPagingRequest().setNumberOfRows(10);
		request.getRetrieveAcctMvmntRq().getPagedQuery().getPagingRequest().setRequestedPage(1);
		//
		request.getRetrieveAcctMvmntRq().getAccountMovementInput().setAccountId("10100038156");
		request.getRetrieveAcctMvmntRq().getAccountMovementInput().setStartDate(DateUtils.getGregorianDate(new Date(120, 1, 1)));
		request.getRetrieveAcctMvmntRq().getAccountMovementInput().setEndDate(DateUtils.getGregorianDate(new Date(121, 1, 1)));
		request.getRetrieveAcctMvmntRq().getAccountMovementInput().setLastMvmntOnly(false);
		request.getRetrieveAcctMvmntRq().getAccountMovementInput().setDescendingSortOrder(false);
		request.getRetrieveAcctMvmntRq().getAccountMovementInput().setFinTxnsOnly(false);
		return request;
	}
}
