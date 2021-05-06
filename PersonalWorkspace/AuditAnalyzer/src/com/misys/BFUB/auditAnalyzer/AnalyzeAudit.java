package com.misys.BFUB.auditAnalyzer;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import com.misys.BFUB.auditAnalyzer.analyzer.AnalyzeSessions;
import com.misys.BFUB.auditAnalyzer.analyzer.mfExecution.AuditMF;
import com.misys.BFUB.auditAnalyzer.configurations.AuditAnalyzerConfigurations;
import com.misys.BFUB.auditAnalyzer.deleteAndCreateFolders.AuditRefreshFolders;
import com.misys.BFUB.auditAnalyzer.listAuditFiles.ListAuditFiles;
import com.misys.BFUB.auditAnalyzer.sorter.AuditSorter;
import com.misys.BFUB.auditAnalyzer.splitter.AuditSplitter;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class AnalyzeAudit {
	public static Logger logger = Logger.getLogger("Log");
	public static HashMap<String, Object> configDetails = new HashMap();
	public static ArrayList<String> auditFileList = new ArrayList();
	public static ArrayList<String> sessionsList = new ArrayList();

	public static void main(String[] args) {
		initializeLogger();
		logger.info("Started at " + new Date());
		AuditAnalyzerConfigurations.readConfigurations();
		AuditRefreshFolders.deleteAndCreateFolders();
		ListAuditFiles.listFilesAndFilesSubDirectories((String) configDetails.get("auditLocation"));
		AuditSplitter.process(args);
		listThreadFiles((String) configDetails.get("locationForSplittedFiles"));
		if (((Boolean) configDetails.get("isSortedFilesRequired")).booleanValue())
			AuditSorter.sortFiles();
		System.gc();
		AnalyzeSessions.analyseSessions();
		AuditMF.process();
		logger.info("Completed at " + new Date());
	}

	public static void listThreadFiles(String directoryName) {
		File directory = new File(directoryName);
		File[] fList = directory.listFiles();
		for (File file : fList)
			if (file.isFile()) {
				sessionsList.add(file.getName().substring(0, file.getName().indexOf(".")));
			}
			else if (file.isDirectory())
				listThreadFiles(file.getAbsolutePath());
	}

	private static void initializeLogger() {
		File currentDirectory = new File(".");
		Date date = new Date();
		String dateText = date.toLocaleString();
		dateText = dateText.replaceAll(" ", "");
		dateText = dateText.replaceAll(":", "_");
		FileHandler fh = null;
		try {
			fh = new FileHandler(currentDirectory + "/auditAnalysisLog" + dateText + ".log");
		}
		catch (SecurityException exception) {
			logger.info(logException(exception));
		}
		catch (IOException exception) {
			logger.info(logException(exception));
		}
		logger.addHandler(fh);
		SimpleFormatter formatter = new SimpleFormatter();
		fh.setFormatter(formatter);
	}

	private static String logException(Throwable ex) {
		StringWriter exWriter = new StringWriter();
		ex.printStackTrace(new PrintWriter(exWriter));
		return exWriter.toString();
	}
}
