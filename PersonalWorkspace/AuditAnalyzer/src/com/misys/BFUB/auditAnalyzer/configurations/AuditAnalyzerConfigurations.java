package com.misys.BFUB.auditAnalyzer.configurations;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.StringTokenizer;

import com.misys.BFUB.auditAnalyzer.AnalyzeAudit;
import com.misys.BFUB.auditAnalyzer.util.AuditAnalyzerUtils;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class AuditAnalyzerConfigurations extends AnalyzeAudit {
	public static void readConfigurations() {
		Boolean splitAuditBasedOnChannels = Boolean.valueOf(false);
		Boolean splitAuditBasedOnUser = Boolean.valueOf(false);
		Boolean splitAuditBasedOnMicroflow = Boolean.valueOf(false);
		Boolean splitAuditBasedonTimeRange = Boolean.valueOf(false);
		Boolean otherPersistenceRecordRequired = Boolean.valueOf(false);
		ArrayList keyList = new ArrayList();
		Timestamp auditStartTime = new Timestamp(new Date(0L).getTime());
		Timestamp auditEndTime = new Timestamp(new Date(0L).getTime());
		Properties prop = new Properties();
		InputStream input = null;
		String channelsName = "";
		String usersName = "";
		String microflowNames = "";
		ArrayList channels = new ArrayList();
		ArrayList users = new ArrayList();
		ArrayList microflows = new ArrayList();
		try {
			input = new FileInputStream("config.properties");
			prop.load(input);
			configDetails.put("auditLocation", prop.getProperty("auditLocation").trim());
			splitAuditBasedOnChannels = Boolean.valueOf(prop.getProperty("splitAuditBasedOnChannels").trim().toLowerCase());
			splitAuditBasedOnMicroflow = Boolean.valueOf(prop.getProperty("splitAuditBasedOnMicroflow").trim().toLowerCase());
			splitAuditBasedonTimeRange = Boolean.valueOf(prop.getProperty("splitAuditBasedonTimeRange").trim().toLowerCase());
			splitAuditBasedOnUser = Boolean.valueOf(prop.getProperty("splitAuditBasedOnUser").trim().toLowerCase());
			otherPersistenceRecordRequired = Boolean.valueOf(prop.getProperty("otherPersistenceRecordRequired").trim().toLowerCase());
			if (splitAuditBasedOnChannels.booleanValue()) {
				channelsName = prop.getProperty("channelsName").trim();
				StringTokenizer tokens = new StringTokenizer(channelsName, "$");
				int tokenCount = tokens.countTokens();
				for (int token = 0; token < tokenCount; token++) {
					channels.add(tokens.nextToken());
				}
			}
			if (splitAuditBasedOnMicroflow.booleanValue()) {
				microflowNames = prop.getProperty("microflowNames").trim();
				StringTokenizer tokens = new StringTokenizer(microflowNames, "$");
				int tokenCount = tokens.countTokens();
				for (int token = 0; token < tokenCount; token++) {
					microflows.add(tokens.nextToken());
				}
			}
			if (splitAuditBasedOnUser.booleanValue()) {
				usersName = prop.getProperty("usersName").trim();
				StringTokenizer tokens = new StringTokenizer(usersName, "$");
				int tokenCount = tokens.countTokens();
				for (int token = 0; token < tokenCount; token++) {
					users.add(tokens.nextToken());
				}
			}
			if (splitAuditBasedonTimeRange.booleanValue()) {
				try {
					auditStartTime = AuditAnalyzerUtils.convertStringTimeStampToTimeStamp(prop.getProperty("startTime").trim());
					auditEndTime = AuditAnalyzerUtils.convertStringTimeStampToTimeStamp(prop.getProperty("endTime").trim());
				}
				catch (Exception e) {
					logger.info("Error Occured in converting the given start time or end time");
					System.exit(0);
				}
			}
			keyList = populateSearchKeys(splitAuditBasedOnChannels, splitAuditBasedOnMicroflow, splitAuditBasedOnUser, microflows, channels, users);
			configDetails.put("auditTime", Integer.valueOf(Integer.parseInt(prop.getProperty("auditTime").trim())));
			configDetails.put("businessTime", Integer.valueOf(Integer.parseInt(prop.getProperty("businessTime").trim())));
			configDetails.put("runTimeMFID", Integer.valueOf(Integer.parseInt(prop.getProperty("runTimeMFID").trim())));
			configDetails.put("microflowID", Integer.valueOf(Integer.parseInt(prop.getProperty("microflowID").trim())));
			configDetails.put("userID", Integer.valueOf(Integer.parseInt(prop.getProperty("userID").trim())));
			configDetails.put("channelID", Integer.valueOf(Integer.parseInt(prop.getProperty("channelID").trim())));
			configDetails.put("sourceBranch", Integer.valueOf(Integer.parseInt(prop.getProperty("sourceBranch").trim())));
			configDetails.put("transactionID", Integer.valueOf(Integer.parseInt(prop.getProperty("transactionID").trim())));
			configDetails.put("categoryName", Integer.valueOf(Integer.parseInt(prop.getProperty("categoryName").trim())));
			configDetails.put("eventType", Integer.valueOf(Integer.parseInt(prop.getProperty("eventType").trim())));
			configDetails.put("operation", Integer.valueOf(Integer.parseInt(prop.getProperty("operation").trim())));
			configDetails.put("primaryData", Integer.valueOf(Integer.parseInt(prop.getProperty("primaryData").trim())));
			configDetails.put("secondaryData", Integer.valueOf(Integer.parseInt(prop.getProperty("secondaryData").trim())));
			configDetails.put("otherPersistenceRecordRequired", otherPersistenceRecordRequired);
			configDetails.put("splitAuditBasedOnChannels", splitAuditBasedOnChannels);
			configDetails.put("splitAuditBasedOnMicroflow", splitAuditBasedOnMicroflow);
			configDetails.put("splitAuditBasedonTimeRange", splitAuditBasedonTimeRange);
			configDetails.put("splitAuditBasedOnUser", splitAuditBasedOnUser);
			configDetails.put("startTime", auditStartTime);
			configDetails.put("endTime", auditEndTime);
			configDetails.put("timeRangeInterval", Integer.valueOf(Integer.parseInt(prop.getProperty("timeRangeInterval").trim())));
			configDetails.put("numberOfArrayToKeepSessions", Integer.valueOf(Integer.parseInt(prop.getProperty("numberOfArrayToKeepSessions").trim())));
			configDetails.put("hourRepresentaionInterval", prop.getProperty("hourRepresentaionInterval").trim());
			configDetails.put("KeyList", keyList);
			configDetails.put("split.ThreadPool", Integer.valueOf(Integer.parseInt(prop.getProperty("split.ThreadPool").trim())));
			configDetails.put("writer.ThreadPool", Integer.valueOf(Integer.parseInt(prop.getProperty("writer.ThreadPool").trim())));
			configDetails.put("split.pageSize", Integer.valueOf(Integer.parseInt(prop.getProperty("split.pageSize").trim())));
			configDetails.put("split.nonAnalyzedPageSize", Integer.valueOf(Integer.parseInt(prop.getProperty("split.nonAnalyzedPageSize").trim())));
			configDetails.put("split.persistencePageSize", Integer.valueOf(Integer.parseInt(prop.getProperty("split.persistencePageSize").trim())));
			configDetails.put("sort.ThreadPool", Integer.valueOf(Integer.parseInt(prop.getProperty("sort.ThreadPool").trim())));
			configDetails.put("isSortedFilesRequired", Boolean.valueOf(prop.getProperty("isSortedFilesRequired").trim().toLowerCase()));
			configDetails.put("locationForSplittedFiles", prop.getProperty("locationForSplittedFiles").trim());
			configDetails.put("locationForAuditAnalysis", prop.getProperty("locationForAuditAnalysis").trim());
		}
		catch (IOException exception) {
			logger.info("Error occured in reading configurations " + exception.getLocalizedMessage());
			logger.info(AuditAnalyzerUtils.logException(exception));
			if (input != null)
				try {
					input.close();
				}
				catch (IOException localIOException1) {
				}
		}
		finally {
			if (input != null)
				try {
					input.close();
				}
				catch (IOException localIOException2) {
				}
		}
	}

	private static ArrayList<String> populateSearchKeys(Boolean splitAuditBasedOnChannels, Boolean splitAuditBasedOnMicroflow, Boolean splitAuditBasedOnUser, ArrayList<String> microflows, ArrayList<String> channels, ArrayList<String> users) {
		ArrayList keyList = new ArrayList();
		Boolean isKeyListPopulated = Boolean.valueOf(false);
		if ((!isKeyListPopulated.booleanValue()) && (splitAuditBasedOnChannels.booleanValue()) && (splitAuditBasedOnUser.booleanValue()) && (splitAuditBasedOnMicroflow.booleanValue())) {
			for (int key2 = 0; key2 < channels.size(); key2++) {
				for (int key1 = 0; key1 < users.size(); key1++) {
					for (int key = 0; key < microflows.size(); key++) {
						keyList.add("$" + ((String) channels.get(key2)).toUpperCase().concat(new StringBuilder("$").append(((String) users.get(key1)).toUpperCase().concat(new StringBuilder("$").append(((String) microflows.get(key)).toUpperCase()).toString())).append("$").toString()));
					}
				}
			}
			isKeyListPopulated = Boolean.valueOf(true);
		}
		if ((!isKeyListPopulated.booleanValue()) && (splitAuditBasedOnChannels.booleanValue()) && (splitAuditBasedOnUser.booleanValue())) {
			for (int key1 = 0; key1 < channels.size(); key1++) {
				for (int key = 0; key < users.size(); key++) {
					keyList.add("$" + ((String) channels.get(key1)).toUpperCase().concat(new StringBuilder("$").append(((String) users.get(key)).toUpperCase()).toString()) + "$");
				}
			}
			isKeyListPopulated = Boolean.valueOf(true);
		}
		if ((!isKeyListPopulated.booleanValue()) && (splitAuditBasedOnChannels.booleanValue()) && (splitAuditBasedOnMicroflow.booleanValue())) {
			for (int key1 = 0; key1 < channels.size(); key1++) {
				for (int key = 0; key < microflows.size(); key++) {
					keyList.add("$" + ((String) channels.get(key1)).toUpperCase().concat(new StringBuilder("$").append(((String) microflows.get(key)).toUpperCase()).toString()) + "$");
				}
			}
			isKeyListPopulated = Boolean.valueOf(true);
		}
		if ((!isKeyListPopulated.booleanValue()) && (splitAuditBasedOnUser.booleanValue()) && (splitAuditBasedOnMicroflow.booleanValue())) {
			for (int key1 = 0; key1 < users.size(); key1++) {
				for (int key = 0; key < microflows.size(); key++) {
					keyList.add("$" + ((String) users.get(key1)).toUpperCase().concat(new StringBuilder("$").append(((String) microflows.get(key)).toUpperCase()).toString()) + "$");
				}
			}
			isKeyListPopulated = Boolean.valueOf(true);
		}
		if ((!isKeyListPopulated.booleanValue()) && (splitAuditBasedOnMicroflow.booleanValue())) {
			for (int key = 0; key < microflows.size(); key++) {
				keyList.add("$" + ((String) microflows.get(key)).toUpperCase() + "$");
			}
			isKeyListPopulated = Boolean.valueOf(true);
		}
		if ((!isKeyListPopulated.booleanValue()) && (splitAuditBasedOnChannels.booleanValue())) {
			for (int key = 0; key < channels.size(); key++) {
				keyList.add("$" + ((String) channels.get(key)).toUpperCase() + "$");
			}
			isKeyListPopulated = Boolean.valueOf(true);
		}
		if ((!isKeyListPopulated.booleanValue()) && (splitAuditBasedOnUser.booleanValue())) {
			for (int key = 0; key < users.size(); key++) {
				keyList.add("$" + ((String) users.get(key)).toUpperCase() + "$");
			}
			isKeyListPopulated = Boolean.valueOf(true);
		}
		return keyList;
	}
}
