import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class ReadCurrentBuildFromFile implements CurrentBuildProvider {

    public static String UB_Full_Build;

    private static final Logger LOGGER = Logger.getLogger(ReadCurrentBuildFromFile.class.getName());
    /**
     * @param args
     */
    static {
        Properties props = new Properties();
        try {
            props.load(new FileInputStream("CurrentBuild.properties"));

            UB_Full_Build = props.getProperty("UB");

        } catch (IOException e) {
            e.printStackTrace();
            LOGGER.severe("Problem in loading CurrentBuild.properties file");
        }
    }

    public static void main(String[] args) {
    }

    @Override
    public String getUB_Full_Build() {
        // TODO Auto-generated method stub
        return UB_Full_Build;
    }
}
