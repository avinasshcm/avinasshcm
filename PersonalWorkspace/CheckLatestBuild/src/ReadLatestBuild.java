import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class ReadLatestBuild {
	public static int BFP_Latest_Build;
	public static int CBS_Latest_Build;
	public static int BFAM_Latest_Build;
	public static int BFPM_Latest_Build;
	public static int BFAO_Latest_Build;
	public static int WIF_Latest_Build;
	public static int UB_Latest_Build;
	public static int PTY_Latest_Build;
	public static int BFT_Latest_Build;
	private static final Logger LOGGER = Logger.getLogger(ReadLatestBuild.class.getName());
	/**
	 * @param args
	 */
	static {
		Properties props = new Properties();
		try {
			props.load(new FileInputStream("LatestBuild.properties"));
			BFP_Latest_Build = Integer.parseInt(props.getProperty("BFP"));
			CBS_Latest_Build = Integer.parseInt(props.getProperty("CBS"));
			BFAM_Latest_Build = Integer.parseInt(props.getProperty("FBAM"));
			BFPM_Latest_Build = Integer.parseInt(props.getProperty("FBPM"));
			BFAO_Latest_Build = Integer.parseInt(props.getProperty("FBAO"));
			WIF_Latest_Build = Integer.parseInt(props.getProperty("WIF"));
			UB_Latest_Build = Integer.parseInt(props.getProperty("UB"));
			PTY_Latest_Build = Integer.parseInt(props.getProperty("Party"));
			BFT_Latest_Build = Integer.parseInt(props.getProperty("BFT"));
		}
		catch (IOException e) {
			e.printStackTrace();
			LOGGER.severe("Problem in loading build.properties file");
		}
		catch (Exception e) {
			e.printStackTrace();
			LOGGER.severe("Problem in loading build.properties file");
		}
	}

	public static void main(String[] args) {
	}
}
