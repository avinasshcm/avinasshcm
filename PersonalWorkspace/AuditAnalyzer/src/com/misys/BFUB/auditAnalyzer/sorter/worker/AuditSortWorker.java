package com.misys.BFUB.auditAnalyzer.sorter.worker;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

import com.misys.BFUB.auditAnalyzer.AnalyzeAudit;

public class AuditSortWorker extends AnalyzeAudit implements Runnable {
	String fileName = "";

	public AuditSortWorker(String fileName) {
		this.fileName = ((String) configDetails.get("locationForSplittedFiles") + "/" + fileName + ".txt");
	}

	public void run() {
		sortAudit();
	}

	private void sortAudit() {
		try {
			FileInputStream fstream = new FileInputStream(this.fileName);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			Map<String, String> map = new TreeMap();
			String line = "";
			while ((line = reader.readLine()) != null) {
				map.put(getField(line), line);
			}
			in.close();
			fstream.close();
			String details = "";
			for (String val : map.values()) {
				details = details.concat(val).concat("\n");
			}
			writeFile(details);
		}
		catch (Exception exception) {
			logger.info(exception.getLocalizedMessage());
		}
	}

	private void writeFile(String details) {
		FileOutputStream fop = null;
		File file = null;
		try {
			file = new File(this.fileName);
			if (!file.exists()) {
				file.createNewFile();
			}
			fop = new FileOutputStream(file);
		}
		catch (Exception e) {
			File newResponseFile = new File(this.fileName);
			try {
				newResponseFile.createNewFile();
			}
			catch (IOException localIOException) {
			}
		}
		try {
			fop.write(details.getBytes());
			fop.flush();
			fop.close();
		}
		catch (IOException localIOException1) {
		}
	}

	private static String getField(String line) {
		return line.split(" ")[0];
	}
}
