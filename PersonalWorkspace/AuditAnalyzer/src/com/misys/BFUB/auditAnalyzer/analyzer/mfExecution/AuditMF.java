package com.misys.BFUB.auditAnalyzer.analyzer.mfExecution;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import com.misys.BFUB.auditAnalyzer.AnalyzeAudit;
import com.misys.BFUB.auditAnalyzer.util.AuditAnalyzerUtils;

public class AuditMF extends AnalyzeAudit {
	static String micfName = "";
	static String eventType = "";

	public static void process() {
		analyzeMFNames();
	}

	private static void analyzeMFNames() {
		HashMap MFMap = new HashMap();
		ArrayList mfNames = new ArrayList();
		try {
			for (int i = 0; i < sessionsList.size(); i++) {
				if (sessionsList.get(i) == null) {
					continue;
				}
				FileInputStream fstream = new FileInputStream(configDetails.get("locationForSplittedFiles") + "/" + (String) sessionsList.get(i) + ".txt");
				DataInputStream in = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				String strLine = br.readLine();
				while (strLine != null)
					if (strLine.trim().equals("")) {
						strLine = br.readLine();
					}
					else {
						splitAuditRecord(strLine);
						if ((!micfName.equals("")) && (eventType.equals("ExecuteMF"))) {
							if (mfNames.contains(micfName)) {
								int count = ((Integer) MFMap.get(micfName)).intValue();
								count++;
								MFMap.put(micfName, Integer.valueOf(count));
							}
							else {
								mfNames.add(micfName);
								MFMap.put(micfName, Integer.valueOf(1));
							}
						}
						strLine = br.readLine();
					}
			}
			writeAnalysisHeader();
			writeAnalysis(MFMap, mfNames);
		}
		catch (Exception exception) {
			logger.info("Error in analyzing microflows executed " + exception.getMessage());
			AuditAnalyzerUtils.logException(exception);
		}
	}

	private static void writeAnalysis(HashMap<String, Integer> sessionMap, ArrayList<String> mfNames) throws IOException {
		String str = "\n";
		FileWriter auditWriter = null;
		String responseFile = "";
		try {
			responseFile = configDetails.get("locationForAuditAnalysis") + "/" + "AuditExecutedMicroflows" + ".csv";
			auditWriter = new FileWriter(responseFile, true);
		}
		catch (Exception e) {
			File newResponseFile = new File(responseFile);
			newResponseFile.createNewFile();
			auditWriter = new FileWriter(responseFile, true);
		}
		for (int i = 0; i < mfNames.size(); i++) {
			auditWriter.write((String) mfNames.get(i) + "," + sessionMap.get(mfNames.get(i)));
			auditWriter.write(str);
			auditWriter.flush();
		}
		auditWriter.close();
	}

	private static void writeAnalysisHeader() throws IOException {
		String str = "\n";
		FileWriter auditWriter = null;
		String responseFile = "";
		try {
			responseFile = configDetails.get("locationForAuditAnalysis") + "/" + "AuditExecutedMicroflows" + ".csv";
			auditWriter = new FileWriter(responseFile, true);
		}
		catch (Exception e) {
			File newResponseFile = new File(responseFile);
			newResponseFile.createNewFile();
			auditWriter = new FileWriter(responseFile, true);
		}
		auditWriter.write("Executed Microflow Name,Number of Executions");
		auditWriter.write(str);
		auditWriter.flush();
		auditWriter.close();
	}

	private static String splitAuditRecord(String audit) throws ParseException {
		StringTokenizer tokens = new StringTokenizer(audit, "||");
		for (int token = 0; token < ((Integer) configDetails.get("secondaryData")).intValue(); token++) {
			String value = tokens.nextToken();
			if (token == ((Integer) configDetails.get("microflowID")).intValue()) {
				micfName = value.replaceAll("'", "");
			}
			if (token == ((Integer) configDetails.get("eventType")).intValue()) {
				eventType = value.replaceAll("'", "");
			}
		}
		return micfName;
	}
}
