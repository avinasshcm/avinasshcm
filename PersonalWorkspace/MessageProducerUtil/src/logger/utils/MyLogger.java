package logger.utils;

import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
	static private Logger logger = Logger.getLogger("com.companyName.app");
	private Properties properties;
	private static final MyLogger INSTANCE = new MyLogger();

	public static MyLogger getInstance() {
		return INSTANCE;
	}

	/** Creates a new instance of Class */
	private MyLogger() {
		//properties = ContextHelper.getProps();
		//String filename = properties.getProperty("prod.config.app.logdir");
		try {
			FileHandler fh = new FileHandler("app.log", 1000000, 10, false);
			SimpleFormatter sf = new SimpleFormatter();
			fh.setFormatter(sf);
			logger.addHandler(fh);
			logger.setLevel(Level.ALL);
		}
		catch (java.io.IOException ie) {
			logger.severe("Filehandler exception " + ie.toString());
			//System.exit (0);
		}
	}
}