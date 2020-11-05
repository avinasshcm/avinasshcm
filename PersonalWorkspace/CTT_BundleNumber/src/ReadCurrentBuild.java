import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
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

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;

public class ReadCurrentBuild implements CurrentBuildProvider {

    // Full Build Number

    public static String UB_Full_Build;

    // Symbolic Path

    public static String UB_Symbolic_Path;

    // Install Path

    public static String UB_Install_Path;

    public static String schema;

    /**
     * @param args
     */
    static {
        Properties info = new Properties();
        String URL = extractCredentials(info);
        Connection conn = getConnection(URL, info);
        try {
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
        boolean readPasswordFromXml = true;
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
                if (key.equals("readPasswordFromXml")) {
                    readPasswordFromXml = Boolean.parseBoolean(value);
                }
                if (key.equals("password")) {
                    info.put("password", value);
                }
                if (key.equals("userName")) {
                    info.put("user", value);
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

        if (!readPasswordFromXml) {
            final JPasswordField jpf = new JPasswordField();
            JOptionPane jop = new JOptionPane(jpf, JOptionPane.QUESTION_MESSAGE, JOptionPane.OK_CANCEL_OPTION);
            JDialog dialog = jop.createDialog("Password :");
            dialog.addComponentListener(new ComponentAdapter() {

                @Override
                public void componentShown(ComponentEvent e) {
                    SwingUtilities.invokeLater(new Runnable() {

                        @Override
                        public void run() {
                            jpf.requestFocusInWindow();
                        }
                    });
                }
            });
            dialog.setVisible(true);
            int result = (Integer) jop.getValue();
            dialog.dispose();
            char[] password = null;
            if (result == JOptionPane.OK_OPTION) {
                password = jpf.getPassword();
            }
            info.put("password", new String(password));
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

    private static ResultSet viewTable(Connection con) throws SQLException {
        ResultSet rs = null;
        Statement stmt = null;
        String schma = (schema != null && schema.isEmpty()) ? "BANKFUSION" : schema;
        String query = "select BFAPPLICATION_ID,BFBUNDLEIDPK from " + schma + ".BFTB_INSTALL_HISTORY where BFSTATE = 'ACTIVE' ";
        UB_Full_Build = "";

        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            while (rs.next()) {
                String applicationID = rs.getString("BFAPPLICATION_ID");

                if (applicationID.equals("UniversalBanking")) {
                    UB_Full_Build = retreiveBuild(rs);
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

    private static String retreiveBuild(ResultSet rs) throws SQLException {
        String version = rs.getString("BFBUNDLEIDPK");
        return version;
    }

    @Override
    public String getUB_Full_Build() {
        return UB_Full_Build;
    }

}
