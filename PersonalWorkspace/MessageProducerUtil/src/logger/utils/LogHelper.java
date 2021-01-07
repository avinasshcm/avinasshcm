package logger.utils;

import java.util.logging.FileHandler;

public class LogHelper {
	static int SIZE = 10240;
	static int ROTATIONCOUNT = 10;

	public static FileHandler getLogHandler() {
		boolean append = true;
		FileHandler handler = null;
		try {
			handler = new FileHandler("SystemOut.log", /*SIZE, ROTATIONCOUNT,*/ append);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		handler.setFormatter(new LogFormatter());
		return handler;
	}
}
