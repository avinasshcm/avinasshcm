package common;

import java.io.BufferedWriter;
import java.io.File;
import java.text.MessageFormat;
import java.util.HashMap;

import pojo.WebServiceData;

public class FileWriter {
	/*
	public static void writeToFile(BufferedWriter writer, String filePath, HashMap<String, WebServiceData> lineMap) {
	try {
	File inXML = new File(filePath);
	// This will output the full path where the file will be written to...
	System.out.println(inXML.getCanonicalPath());
	writer = new BufferedWriter(new FileWriter(inXML));
	writer.write(template.format(testArgs));
	}
	catch (Exception e) {
	e.printStackTrace();
	}
	finally {
	try {
	// Close the writer regardless of what happens...
	writer.close();
	}
	catch (Exception e) {
	System.out.println("finally block pain002");
	e.printStackTrace();
	}
	}
	}
	*/}
