import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class ReadPropertyFile {
	public static String BFP_Path;
	public static String CBS_Path;
	public static String UB_Path;
	public static String PTY_Path;
	public static String BFT_Path;
	public static String Good_Build_File;
	public static String Destination_Folder;
	public static String BT_Specific;
	public static String AM_PM_Required;
	public static String AO_Required;
	public static String WIF_Required;
	public static String UBOF_Required;
	public static String ServicePack;
	public static String Patch;
	public static String BT_Specific_Required;
	public static String Version;
	public static String CodeLine;
	private static final Logger LOGGER = Logger.getLogger(ReadPropertyFile.class.getName());
	/**
	 * @param args
	 */
	static {
		Properties props = new Properties();
		try {
			props.load(new FileInputStream("build.properties"));
			BFP_Path = props.getProperty("BFP_Path");
			CBS_Path = props.getProperty("CBS_Path");
			UB_Path = props.getProperty("UB_Path");
			PTY_Path = props.getProperty("PTY_Path");
			BFT_Path = props.getProperty("BFT_Path");
			Good_Build_File = "LastGoodBuildNumber.txt";
			Destination_Folder = props.getProperty("Destination_Folder");
			BT_Specific = props.getProperty("BT_Specific");
			BT_Specific_Required = props.getProperty("BT_Specific_Required");
			AM_PM_Required = (props.getProperty("AM_PM_Required") != null) ? props.getProperty("AM_PM_Required") : "false";
			WIF_Required = (props.getProperty("WIF_Required") != null) ? props.getProperty("WIF_Required") : "false";
			AO_Required = (props.getProperty("AO_Required") != null) ? props.getProperty("AO_Required") : "false";
			UBOF_Required = props.getProperty("UBOF_Required");
			ServicePack = props.getProperty("ServicePack");
			Patch = props.getProperty("Patch");
			Version = props.getProperty("Version");
			CodeLine = props.getProperty("CodeLine");
		}
		catch (IOException e) {
			e.printStackTrace();
			LOGGER.severe("Problem in loading build.properties file");
		}
	}
}
