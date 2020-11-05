import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class CreateSymbolicLinks {
	CreateSymbolicLinks() {
	}

	static String installLocation = "";

	public void execute() {
		ReadCurrentBuild rcb = new ReadCurrentBuild();
		Properties info = new Properties();
		String URL = rcb.extractCredentials(info);
		Connection conn = rcb.getConnection(URL, info);
		try {
			rcb.viewTable(conn);
			installLocation = rcb.getInstallLocation(conn);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			conn.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			PrintWriter out = new PrintWriter(new FileWriter("SymbolicCreator.bat", false));
			out.println("mklink /j " + rcb.BFP_Symbolic_Path + " " + rcb.BFP_Install_Path);
			out.println("mklink /j " + rcb.CBS_Symbolic_Path + " " + rcb.CBS_Install_Path);
			out.println("mklink /j " + rcb.BFAM_Symbolic_Path + " " + rcb.BFAM_Install_Path);
			out.println("mklink /j " + rcb.BFPM_Symbolic_Path + " " + rcb.BFPM_Install_Path);
			out.println("mklink /j " + rcb.BFAO_Symbolic_Path + " " + rcb.BFAO_Install_Path);
			out.println("mklink /j " + rcb.WIF_Symbolic_Path + " " + rcb.WIF_Install_Path);
			out.println("mklink /j " + rcb.UB_Symbolic_Path + " " + rcb.UB_Install_Path);
			out.println("mklink /j " + rcb.PTY_Symbolic_Path + " " + rcb.PTY_Install_Path);
			out.println("mklink /j " + rcb.BFT_Symbolic_Path + " " + rcb.BFT_Install_Path);
			out.println("exit");
			out.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		try {
			Runtime.getRuntime().exec("cmd /c start \"\" SymbolicCreator.bat");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) {
		CreateSymbolicLinks csl = new CreateSymbolicLinks();
		csl.execute();
	}
}
