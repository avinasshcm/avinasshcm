package logger.utils;

import java.util.logging.FileHandler;

public class LogHelper {
	static int SIZE = 10240;
	static int ROTATIONCOUNT = 10;
	public String fileName = "SystemOut.log";

	public LogHelper(String fileName) {
		this.fileName = fileName;
	}

	public FileHandler getLogHandler() {
		System.setProperty("jdk.internal.FileHandlerLogging.maxLocks", "200");
		boolean append = true;
		FileHandler handler = null;
		try {
			handler = new FileHandler(fileName, /*SIZE, ROTATIONCOUNT,*/ append);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		handler.setFormatter(new LogFormatter());
		return handler;
	}
}
