import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Enumeration;
import java.util.Properties;

public class ReadCurrentBuild implements CurrentBuildProvider {

    // Build Number
    public static int BFP_Curr_Build;

    public static int CBS_Curr_Build;

    public static int BFAM_Curr_Build;

    public static int BFPM_Curr_Build;

    public static int BFAO_Curr_Build;

    public static int WIF_Curr_Build;

    public static int UB_Curr_Build;

    public static int PTY_Curr_Build;

    public static int BFT_Curr_Build;

    // Full Build Number
    public static String BFP_Full_Build;

    public static String CBS_Full_Build;

    public static String BFAM_Full_Build;

    public static String BFPM_Full_Build;

    public static String BFAO_Full_Build;

    public static String WIF_Full_Build;

    public static String UB_Full_Build;

    public static String PTY_Full_Build;

    public static String BFT_Full_Build;

    // Symbolic Path
    public static String BFP_Symbolic_Path;

    public static String CBS_Symbolic_Path;

    public static String BFAM_Symbolic_Path;

    public static String BFPM_Symbolic_Path;

    public static String BFAO_Symbolic_Path;

    public static String WIF_Symbolic_Path;

    public static String UB_Symbolic_Path;

    public static String PTY_Symbolic_Path;

    public static String BFT_Symbolic_Path;

    // Install Path
    public static String BFP_Install_Path;

    public static String CBS_Install_Path;

    public static String BFAM_Install_Path;

    public static String BFPM_Install_Path;

    public static String BFAO_Install_Path;

    public static String WIF_Install_Path;

    public static String UB_Install_Path;

    public static String PTY_Install_Path;

    public static String BFT_Install_Path;

    public static String Install_Location;

    public static String schema;
    /**
     * @param args
     */
    static {
        Properties info = new Properties();
        String URL = extractCredentials(info);
        Connection conn = getConnection(URL, info);
        try {
            Install_Location = getInstallLocation(conn);
            viewTable(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
    }

    static String extractCredentials(Properties info) {
        String URL = "";
        try {
            File file = new File("resource.xml");
            FileInputStream fileInput = new FileInputStream(file);
            Properties properties = new Properties();
            properties.loadFromXML(fileInput);
            fileInput.close();
            Enumeration enuKeys = properties.keys();
            while (enuKeys.hasMoreElements()) {
                String key = (String) enuKeys.nextElement();
                String value = properties.getProperty(key);
                if (key.equals("userName")) {
                    info.put("user", value);
                }
                if (key.equals("password")) {
                    info.put("password", value);
                }
                if (key.equals("connectionString")) {
                    URL = value;
                }
                if (key.equals("schema")) {
                    schema = value;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return URL;
    }

    static Connection getConnection(String URL, Properties info) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, info);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static ResultSet viewTable(Connection con) throws SQLException {
        ResultSet rs = null;
        Statement stmt = null;
        String schma = (schema != null && schema.isEmpty()) ? "BANKFUSION" : schema;
        String query = "select BFAPPLICATION_ID,BFBUNDLEIDPK from " + schma + ".BFTB_INSTALL_HISTORY where BFSTATE = 'ACTIVE' ";
        BFP_Curr_Build = 0;
        CBS_Curr_Build = 0;
        BFAM_Curr_Build = 0;
        BFPM_Curr_Build = 0;
        BFAO_Curr_Build = 0;
        WIF_Curr_Build = 0;
        BFT_Curr_Build = 0;
        UB_Curr_Build = 0;
        PTY_Curr_Build = 0;
        BFP_Full_Build = "";
        CBS_Full_Build = "";
        BFAM_Full_Build = "";
        BFPM_Full_Build = "";
        BFAO_Full_Build = "";
        WIF_Full_Build = "";
        UB_Full_Build = "";
        PTY_Full_Build = "";
        BFT_Full_Build = "";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                String applicationID = rs.getString("BFAPPLICATION_ID");
                if (applicationID.equals("BankFusion")) {
                    BFP_Full_Build = retreiveBuild(rs);
                    BFP_Curr_Build = extractBuildNumber(BFP_Full_Build);
                    BFP_Install_Path = getInstall("BankFusion", BFP_Full_Build);
                    BFP_Symbolic_Path = getSymbolic("BankFusion");
                }
                if (applicationID.equals("CBS")) {
                    CBS_Full_Build = retreiveBuild(rs);
                    CBS_Curr_Build = extractBuildNumber(CBS_Full_Build);
                    CBS_Install_Path = getInstall("CBS", CBS_Full_Build);
                    CBS_Symbolic_Path = getSymbolic("CBS");
                }
                if (applicationID.equals("BFAM")) {
                    BFAM_Full_Build = retreiveBuild(rs);
                    BFAM_Curr_Build = extractBuildNumber(BFAM_Full_Build);
                    BFAM_Install_Path = getInstall("BFAM", BFAM_Full_Build);
                    BFAM_Symbolic_Path = getSymbolic("BFAM");
                }
                if (applicationID.equals("BFPM")) {
                    BFPM_Full_Build = retreiveBuild(rs);
                    BFPM_Curr_Build = extractBuildNumber(BFPM_Full_Build);
                    BFPM_Install_Path = getInstall("BFPM", BFPM_Full_Build);
                    BFPM_Symbolic_Path = getSymbolic("BFPM");
                }
                if (applicationID.equals("BFAO")) {
                    BFAO_Full_Build = retreiveBuild(rs);
                    BFAO_Curr_Build = extractBuildNumber(BFAO_Full_Build);
                    BFAO_Install_Path = getInstall("BFAO", BFAO_Full_Build);
                    BFAO_Symbolic_Path = getSymbolic("BFAO");
                }
                if (applicationID.equals("WIF")) {
                    WIF_Full_Build = retreiveBuild(rs);
                    WIF_Curr_Build = extractBuildNumber(WIF_Full_Build);
                    WIF_Install_Path = getInstall("WIF", WIF_Full_Build);
                    WIF_Symbolic_Path = getSymbolic("WIF");
                }
                if (applicationID.equals("BFBT")) {
                    BFT_Full_Build = retreiveBuild(rs);
                    BFT_Curr_Build = extractBuildNumber(BFT_Full_Build);
                    BFT_Install_Path = getInstall("BFBT", BFT_Full_Build);
                    BFT_Symbolic_Path = getSymbolic("BFBT");
                }
                if (applicationID.equals("UniversalBanking")) {
                    UB_Full_Build = retreiveBuild(rs);
                    UB_Curr_Build = extractBuildNumber(UB_Full_Build);
                    UB_Install_Path = getInstall("UniversalBanking", UB_Full_Build);
                    UB_Symbolic_Path = getSymbolic("UniversalBanking");
                }
                if (applicationID.equals("Party")) {
                    PTY_Full_Build = retreiveBuild(rs);
                    PTY_Curr_Build = extractBuildNumber(PTY_Full_Build);
                    PTY_Install_Path = getInstall("Party", PTY_Full_Build);
                    PTY_Symbolic_Path = getSymbolic("Party");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
        return rs;
    }

    private static String getInstall(String appName, String buildNumber) {
        return Install_Location + "\\" + appName + "\\INSTALL\\" + buildNumber;
    }

    private static String getSymbolic(String appName) {
        return Install_Location + "\\" + appName + "\\SYMBOLIC";
    }

    public static String getInstallLocation(Connection con) throws SQLException {
        ResultSet rs = null;
        Statement stmt = null;
        String installLocation = "";
        String query = "select BFINSTALLLOCATION,BFINSTALLHOST from BANKFUSION.BFTB_INSTALLER_LOCATION ";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                installLocation = rs.getString("BFINSTALLLOCATION");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                stmt.close();
            }
        }
        return installLocation;
    }

    public static String retreiveBuild(ResultSet rs) throws SQLException {
        String version = rs.getString("BFBUNDLEIDPK");
        return version;
    }

    public static int extractBuildNumber(String version) {
        String build = version.substring(version.lastIndexOf(".") + 1, version.length());
        return Integer.parseInt(build);
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
