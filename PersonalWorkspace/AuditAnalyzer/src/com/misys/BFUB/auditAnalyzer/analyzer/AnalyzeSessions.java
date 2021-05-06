package com.misys.BFUB.auditAnalyzer.analyzer;

import com.misys.BFUB.auditAnalyzer.AnalyzeAudit;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.logging.Logger;

public class AnalyzeSessions extends AnalyzeAudit {
	static String channelName = "";
	static String micfName = "";
	static String userName = "";
	static int timeRangeInterval = 0;
	static String hourRepInterval = "";

	public static void analyseSessions() {
		timeRangeInterval = ((Integer) configDetails.get("timeRangeInterval")).intValue();
		hourRepInterval = (String) configDetails.get("hourRepresentaionInterval");
		try {
			writeAuditAnalysisHeader();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		HashMap isFinished = new HashMap();
		HashMap timeConsumed = new HashMap();
		HashMap countMFBeginMap = new HashMap();
		HashMap countMFEndMap = new HashMap();
		HashMap countStepBeginMap = new HashMap();
		HashMap countStepEndMap = new HashMap();
		HashMap problem = new HashMap();
		HashMap startTimeMap = new HashMap();
		HashMap endTimeMap = new HashMap();
		HashMap mfName = new HashMap();
		HashMap channel = new HashMap();
		HashMap user = new HashMap();
		try {
			ArrayList tempSe = new ArrayList();
			int counter = 0;
			for (int i = 0; i < sessionsList.size(); i++) {
				if (sessionsList.get(i) == null) {
					continue;
				}
				FileInputStream fstream = new FileInputStream(configDetails.get("locationForSplittedFiles") + "/" + (String) sessionsList.get(i) + ".txt");
				DataInputStream in = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				String previousLine = "";
				String strLine = br.readLine();
				TreeSet<String> map = new TreeSet();
				while (strLine != null)
					if (strLine.trim().equals("")) {
						strLine = br.readLine();
					}
					else {
						map.add(strLine);
						strLine = br.readLine();
					}
				int startFlag = 0;
				String starttime = null;
				String endtime = null;
				int countMFBegin = 0;
				int countMFEnd = 0;
				int countStepBegin = 0;
				int countStepEnd = 0;
				Boolean isMfNamePopulated = Boolean.valueOf(false);
				int valueCounter = 1;
				int valueSize = map.size();
				for (String val : map) {
					strLine = val;
					if (startFlag == 0) {
						starttime = strLine.trim().substring(0, strLine.indexOf("||"));
						startTimeMap.put((String) sessionsList.get(i), starttime);
						startFlag = 1;
					}
					if ((!strLine.contains("'Messaging'||'IN'")) && (!isMfNamePopulated.booleanValue())) {
						splitAuditRecord(strLine);
						mfName.put((String) sessionsList.get(i), micfName);
						channel.put((String) sessionsList.get(i), channelName);
						user.put((String) sessionsList.get(i), userName);
						isMfNamePopulated = Boolean.valueOf(true);
					}
					if (strLine.contains("'MicroFlow'||'ExecuteMF'"))
						countMFBegin++;
					if (strLine.contains("'MicroFlow'||'Finished'"))
						countMFEnd++;
					if (strLine.contains("'Activitystep'||'ExecuteNextStepBegin'"))
						countStepBegin++;
					if (strLine.contains("'Activitystep'||'ExecuteNextStepEnd'"))
						countStepEnd++;
					previousLine = strLine;
					if (valueCounter++ == valueSize) {
						endtime = previousLine.trim().substring(0, previousLine.indexOf("||"));
						if ((previousLine.toUpperCase().contains("'FINISHED'")) || (previousLine.toUpperCase().contains("'MESSAGING'||'OUT'"))) {
							isFinished.put((String) sessionsList.get(i), "Finished");
						}
						else {
							isFinished.put((String) sessionsList.get(i), "Not Finished");
						}
					}
				}
				countMFBeginMap.put((String) sessionsList.get(i), Integer.valueOf(countMFBegin));
				countMFEndMap.put((String) sessionsList.get(i), Integer.valueOf(countMFEnd));
				countStepBeginMap.put((String) sessionsList.get(i), Integer.valueOf(countStepBegin));
				countStepEndMap.put((String) sessionsList.get(i), Integer.valueOf(countStepEnd));
				if ((countMFBegin != countMFEnd) || (countStepBegin != countStepEnd)) {
					problem.put((String) sessionsList.get(i), "False");
				}
				else {
					problem.put((String) sessionsList.get(i), "True");
				}
				String sessionTimeConsumed = calculateTimeConsumed(starttime, endtime);
				endTimeMap.put((String) sessionsList.get(i), endtime);
				timeConsumed.put((String) sessionsList.get(i), sessionTimeConsumed);
				startFlag = 0;
				in.close();
				fstream.close();
				tempSe.add((String) sessionsList.get(i));
				counter++;
				if (counter > 5000) {
					writeAuditAnalysis(isFinished, tempSe, timeConsumed, countMFBeginMap, countMFEndMap, countStepBeginMap, countStepEndMap, problem, startTimeMap, endTimeMap, mfName, channel, user);
					isFinished = new HashMap();
					timeConsumed = new HashMap();
					timeConsumed = new HashMap();
					countMFBeginMap = new HashMap();
					countMFEndMap = new HashMap();
					countStepBeginMap = new HashMap();
					countStepEndMap = new HashMap();
					problem = new HashMap();
					startTimeMap = new HashMap();
					endTimeMap = new HashMap();
					mfName = new HashMap();
					tempSe = new ArrayList();
					logger.info("Analysis Completed for " + i + " sessions.");
					counter = 1;
				}
			}
			writeAuditAnalysis(isFinished, tempSe, timeConsumed, countMFBeginMap, countMFEndMap, countStepBeginMap, countStepEndMap, problem, startTimeMap, endTimeMap, mfName, channel, user);
		}
		catch (Exception exception) {
			System.err.println("Error in session Analysis" + exception.getLocalizedMessage());
			exception.printStackTrace();
		}
	}

	private static void splitAuditRecord(String audit) throws ParseException {
		StringTokenizer tokens = new StringTokenizer(audit, "||");
		for (int token = 0; token < 13; token++)
			if (token == 3)
				micfName = tokens.nextToken().replaceAll("'", "").toUpperCase();
			else if (token == 4)
				userName = tokens.nextToken().replaceAll("'", "").toUpperCase();
			else if (token == 5)
				channelName = tokens.nextToken().replaceAll("'", "").toUpperCase();
			else
				tokens.nextToken();
	}

	private static String calculateTimeConsumed(String starttime, String endtime) throws ParseException {
		DateFormat formatter = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss.SSS");
		starttime = starttime.replaceAll("/", " ");
		endtime = endtime.replaceAll("/", " ");
		return Integer.toString((int) (formatter.parse(endtime).getTime() - formatter.parse(starttime).getTime()));
	}

	private static void writeAuditAnalysis(HashMap<String, String> isFinished, ArrayList<String> sessions, HashMap<String, String> timeConsumed, HashMap<String, Integer> countMFBeginMap, HashMap<String, Integer> countMFEndMap, HashMap<String, Integer> countStepBeginMap, HashMap<String, Integer> countStepEndMap, HashMap<String, String> problem, HashMap<String, String> starttimeMap, HashMap<String, String> endTimeMap, HashMap<String, String> mfName, HashMap<String, String> channel, HashMap<String, String> user) throws IOException {
		String str = "\n";
		FileWriter auditWriter = null;
		String responseFile = "";
		try {
			responseFile = configDetails.get("locationForAuditAnalysis") + "/" + "AuditAnalysis" + ".csv";
			auditWriter = new FileWriter(responseFile, true);
		}
		catch (Exception e) {
			File newResponseFile = new File(responseFile);
			newResponseFile.createNewFile();
			auditWriter = new FileWriter(responseFile, true);
		}
		for (int i = 0; i < sessions.size(); i++) {
			try {
				auditWriter.write((String) sessions.get(i));
				auditWriter.flush();
				auditWriter.write(",");
				auditWriter.flush();
				auditWriter.write((String) isFinished.get(sessions.get(i)));
				auditWriter.flush();
				auditWriter.write(",");
				auditWriter.flush();
				auditWriter.write((String) starttimeMap.get(sessions.get(i)));
				auditWriter.flush();
				auditWriter.write(",");
				auditWriter.flush();
				auditWriter.write((String) endTimeMap.get(sessions.get(i)));
				auditWriter.flush();
				auditWriter.write(",");
				auditWriter.flush();
				auditWriter.write(convertStringTimeStampToTimeStamp((String) starttimeMap.get(sessions.get(i))));
				auditWriter.flush();
				auditWriter.write(",");
				auditWriter.flush();
				auditWriter.write((String) timeConsumed.get(sessions.get(i)));
				auditWriter.flush();
				auditWriter.write(",");
				auditWriter.flush();
				Integer time = Integer.valueOf(Integer.parseInt((String) timeConsumed.get(sessions.get(i))));
				time = Integer.valueOf(time.intValue() / timeRangeInterval + (time.intValue() % timeRangeInterval > 0 ? 1 : 0));
				auditWriter.write(Integer.toString(time.intValue()));
				auditWriter.flush();
				auditWriter.write(",");
				auditWriter.flush();
				auditWriter.write(Integer.toString(((Integer) countMFBeginMap.get(sessions.get(i))).intValue()));
				auditWriter.flush();
				auditWriter.write(",");
				auditWriter.flush();
				auditWriter.write(Integer.toString(((Integer) countMFEndMap.get(sessions.get(i))).intValue()));
				auditWriter.flush();
				auditWriter.write(",");
				auditWriter.flush();
				auditWriter.write(Integer.toString(((Integer) countStepBeginMap.get(sessions.get(i))).intValue()));
				auditWriter.flush();
				auditWriter.write(",");
				auditWriter.flush();
				auditWriter.write(Integer.toString(((Integer) countStepEndMap.get(sessions.get(i))).intValue()));
				auditWriter.flush();
				auditWriter.write(",");
				auditWriter.flush();
				auditWriter.write((String) problem.get(sessions.get(i)));
				auditWriter.flush();
				auditWriter.write(",");
				auditWriter.flush();
				auditWriter.write((String) mfName.get(sessions.get(i)));
				auditWriter.flush();
				auditWriter.write(",");
				auditWriter.flush();
				auditWriter.write((String) channel.get(sessions.get(i)));
				auditWriter.flush();
				auditWriter.write(",");
				auditWriter.flush();
				auditWriter.write((String) user.get(sessions.get(i)));
				auditWriter.flush();
			}
			catch (Exception localException1) {
			}
			auditWriter.write(str);
			auditWriter.flush();
		}
		auditWriter.close();
	}

	private static void writeAuditAnalysisHeader() throws IOException {
		String str = "\n";
		FileWriter auditWriter = null;
		String responseFile = "";
		try {
			responseFile = configDetails.get("locationForAuditAnalysis") + "/" + "AuditAnalysis" + ".csv";
			auditWriter = new FileWriter(responseFile, true);
		}
		catch (Exception e) {
			File newResponseFile = new File(responseFile);
			newResponseFile.createNewFile();
			auditWriter = new FileWriter(responseFile, true);
		}
		auditWriter.write("Session ID or File Name");
		auditWriter.flush();
		auditWriter.write(",");
		auditWriter.flush();
		auditWriter.write("Is MF Finished");
		auditWriter.flush();
		auditWriter.write(",");
		auditWriter.flush();
		auditWriter.write("Session Start Time");
		auditWriter.flush();
		auditWriter.write(",");
		auditWriter.flush();
		auditWriter.write("Session End Time");
		auditWriter.flush();
		auditWriter.write(",");
		auditWriter.flush();
		auditWriter.write("Session Time Range");
		auditWriter.flush();
		auditWriter.write(",");
		auditWriter.flush();
		auditWriter.write("Elapsed Time in Millis");
		auditWriter.flush();
		auditWriter.write(",");
		auditWriter.flush();
		auditWriter.write("Elapsed Time Range");
		auditWriter.flush();
		auditWriter.write(",");
		auditWriter.flush();
		auditWriter.write("MF Opened");
		auditWriter.flush();
		auditWriter.write(",");
		auditWriter.flush();
		auditWriter.write("MF Closed");
		auditWriter.flush();
		auditWriter.write(",");
		auditWriter.flush();
		auditWriter.write("ActivityStep Opened");
		auditWriter.flush();
		auditWriter.write(",");
		auditWriter.flush();
		auditWriter.write("ActivityStep Closed");
		auditWriter.flush();
		auditWriter.write(",");
		auditWriter.flush();
		auditWriter.write("Is MF and AS count mathed");
		auditWriter.flush();
		auditWriter.write(",");
		auditWriter.flush();
		auditWriter.write("Parent MF");
		auditWriter.flush();
		auditWriter.write(",");
		auditWriter.flush();
		auditWriter.write("Channel ID");
		auditWriter.flush();
		auditWriter.write(",");
		auditWriter.flush();
		auditWriter.write("User ID");
		auditWriter.flush();
		auditWriter.write(",");
		auditWriter.flush();
		auditWriter.write(str);
		auditWriter.flush();
		auditWriter.close();
	}

	private static String convertStringTimeStampToTimeStamp(String dateTime) throws ParseException {
		DateFormat formatter = new SimpleDateFormat(hourRepInterval);
		dateTime = dateTime.replaceAll("/", " ");
		return formatter.parse(dateTime).toString();
	}
}
