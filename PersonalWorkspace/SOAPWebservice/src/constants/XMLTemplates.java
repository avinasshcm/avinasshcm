package constants;

public class XMLTemplates {
	
	
	public static String bfgenericsoapheader = 
			//@formatter:off
			  "<web:bfgenericsoapheader xmlns:web=\"http://webservices.bankfusion.trapedza.com\" xmlns:att=\"http://www.misys.com/bankfusion/attributes\">\r\n"
			+ "	<web:authentication>\r\n"
			+ "		<web:userLocator></web:userLocator>\r\n"
			+ "	</web:authentication>\r\n"
			+ "	<web:BFHeader>\r\n"
			+ "		<att:correlationID/>\r\n"
			+ "		<att:autoAuthorize/>\r\n"
			+ "		<att:applicationContext/>\r\n"
			+ "		<att:cachedBPMUsers/>\r\n"
			+ "		<att:extension/>\r\n"
			+ "	</web:BFHeader>\r\n"
			+ "</web:bfgenericsoapheader>\r\n";
			//@formatter:on
	
	
	String xmlString = 
			//@formatter:off
			  "<att:pagedQuery xmlns:att=\"http://www.misys.com/bankfusion/attributes\" xmlns:att1=\"http://www.misys.com/Bankfusion/Attributes\">\r\n"
			+ "	<att1:QueryData/>\r\n"
			+ "	<att1:PagingRequest>\r\n"
			+ "		<att1:NumberOfRows>10</att1:NumberOfRows>\r\n"
			+ "		<att1:RequestedPage>1</att1:RequestedPage>\r\n"
			+ "		<att1:TotalPages/>\r\n"
			+ "	</att1:PagingRequest>\r\n"
			+ "</att:pagedQuery>";
			//@formatter:on
	
	
	
	
	
	public static String UB_R_CB_ACC_RetrieveAccountMovements_SRVRequest = 
			  "<web:UB_R_CB_ACC_RetrieveAccountMovements_SRVRequest \r\n"
			+ "	xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" \r\n"
			+ "	xmlns:web=\"http://webservices.bankfusion.trapedza.com\" \r\n"
			+ "	xmlns:att=\"http://www.misys.com/bankfusion/attributes\" \r\n"
			+ "	xmlns:v1r0=\"http://www.misys.com/cbs/msgs/v1r0\" \r\n"
			+ "	xmlns:head=\"http://www.misys.com/cbs/types/header\" \r\n"
			+ "	xmlns:typ=\"http://www.misys.com/cbs/types\" \r\n"
			+ "	xmlns:att1=\"http://www.misys.com/Bankfusion/Attributes\">\r\n"
			+ "	<web:retrieveAcctMvmntRq>\r\n"
			+ "		<v1r0:rqHeader>\r\n"
			+ "			<head:version/>\r\n"
			+ "			<head:orig>\r\n"
			+ "				<head:channelId/>\r\n"
			+ "				<head:appId/>\r\n"
			+ "				<head:appVer/>\r\n"
			+ "				<head:origLocale/>\r\n"
			+ "				<head:origId/>\r\n"
			+ "				<head:origBranchCode/>\r\n"
			+ "				<head:origCtxtId/>\r\n"
			+ "				<head:zoneId/>\r\n"
			+ "				<head:offlineMode>false</head:offlineMode>\r\n"
			+ "			</head:orig>\r\n"
			+ "			<head:messageType/>\r\n"
			+ "			<head:overrides>\r\n"
			+ "				<head:forcePost>false</head:forcePost>\r\n"
			+ "				<head:authCodes>\r\n"
			+ "					<typ:eventCode/>\r\n"
			+ "					<typ:supervisorIds/>\r\n"
			+ "				</head:authCodes>\r\n"
			+ "				<head:eventCodes>\r\n"
			+ "					<typ:eventCode/>\r\n"
			+ "				</head:eventCodes>\r\n"
			+ "				<head:lastSupervisorId/>\r\n"
			+ "				<head:authRequired/>\r\n"
			+ "			</head:overrides>\r\n"
			+ "			<head:transReference>\r\n"
			+ "				<head:uIdTransReference/>\r\n"
			+ "				<head:subTransReference/>\r\n"
			+ "				<head:transRepairLoc/>\r\n"
			+ "			</head:transReference>\r\n"
			+ "		</v1r0:rqHeader>\r\n"
			+ "		<v1r0:pagedQuery>\r\n"
			+ "			<att1:QueryData/>\r\n"
			+ "			<att1:PagingRequest>\r\n"
			+ "				<att1:NumberOfRows>10</att1:NumberOfRows>\r\n"
			+ "				<att1:RequestedPage>1</att1:RequestedPage>\r\n"
			+ "				<att1:TotalPages/>\r\n"
			+ "			</att1:PagingRequest>\r\n"
			+ "		</v1r0:pagedQuery>\r\n"
			+ "		<v1r0:accountMovementInput>\r\n"
			+ "			<typ:accountFormatType/>\r\n"
			+ "			<typ:accountId></typ:accountId>\r\n"
			+ "			<typ:startDate></typ:startDate>\r\n"
			+ "			<typ:endDate></typ:endDate>\r\n"
			+ "			<typ:narrativeContent/>\r\n"
			+ "			<typ:sinceStatementDate/>\r\n"
			+ "			<typ:miniStatement/>\r\n"
			+ "			<typ:noOffMovements/>\r\n"
			+ "			<typ:channel/>\r\n"
			+ "			<typ:transactionRef/>\r\n"
			+ "			<typ:futureMvmntOnly/>\r\n"
			+ "			<typ:txnRefOther/>\r\n"
			+ "			<typ:txnDataType/>\r\n"
			+ "			<typ:lastMvmntOnly>false</typ:lastMvmntOnly>\r\n"
			+ "			<typ:descendingSortOrder>false</typ:descendingSortOrder>\r\n"
			+ "			<typ:finTxnsOnly>false</typ:finTxnsOnly>\r\n"
			+ "			<typ:userExtension/>\r\n"
			+ "			<typ:hostExtension/>\r\n"
			+ "		</v1r0:accountMovementInput>\r\n"
			+ "	</web:retrieveAcctMvmntRq>\r\n"
			+ "</web:UB_R_CB_ACC_RetrieveAccountMovements_SRVRequest>";
}
