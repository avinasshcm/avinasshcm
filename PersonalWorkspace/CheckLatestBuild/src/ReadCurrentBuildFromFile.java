import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class ReadCurrentBuildFromFile implements CurrentBuildProvider {
	public static int BFP_Curr_Build;
	public static int CBS_Curr_Build;
	public static int BFAM_Curr_Build;
	public static int BFPM_Curr_Build;
	public static int BFAO_Curr_Build;
	public static int WIF_Curr_Build;
	public static int UB_Curr_Build;
	public static int PTY_Curr_Build;
	public static int BFT_Curr_Build;
	private static final Logger LOGGER = Logger.getLogger(ReadCurrentBuildFromFile.class.getName());
	/**
	 * @param args
	 */
	static {
		Properties props = new Properties();
		try {
			props.load(new FileInputStream("CurrentBuild.properties"));
			BFP_Curr_Build = Integer.parseInt(props.getProperty("BFP"));
			CBS_Curr_Build = Integer.parseInt(props.getProperty("CBS"));
			BFAM_Curr_Build = Integer.parseInt(props.getProperty("BFAM") != null ? props.getProperty("BFAM") : "0");
			BFPM_Curr_Build = Integer.parseInt(props.getProperty("BFPM") != null ? props.getProperty("BFPM") : "0");
			BFAO_Curr_Build = Integer.parseInt(props.getProperty("BFAO") != null ? props.getProperty("BFAO") : "0");
			WIF_Curr_Build = Integer.parseInt(props.getProperty("WIF") != null ? props.getProperty("WIF") : "0");
			UB_Curr_Build = Integer.parseInt(props.getProperty("UB"));
			PTY_Curr_Build = Integer.parseInt(props.getProperty("Party"));
			BFT_Curr_Build = Integer.parseInt(props.getProperty("BFT"));
		}
		catch (IOException e) {
			e.printStackTrace();
			LOGGER.severe("Problem in loading CurrentBuild.properties file");
		}
	}

	public static void main(String[] args) {
	}

	@Override
	public int getBFP_Curr_Build() {
		return BFP_Curr_Build;
	}

	@Override
	public int getUB_Curr_Build() {
		return UB_Curr_Build;
	}

	@Override
	public int getCBS_Curr_Build() {
		return CBS_Curr_Build;
	}

	@Override
	public int getPTY_Curr_Build() {
		return PTY_Curr_Build;
	}

	@Override
	public int getBFT_Curr_Build() {
		return BFT_Curr_Build;
	}

	@Override
	public int getBFAM_Curr_Build() {
		return BFAM_Curr_Build;
	}

	@Override
	public int getBFPM_Curr_Build() {
		return BFPM_Curr_Build;
	}

	@Override
	public int getBFAO_Curr_Build() {
		return BFAO_Curr_Build;
	}

	@Override
	public int getWIF_Curr_Build() {
		return WIF_Curr_Build;
	}
}
