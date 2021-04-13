import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import org.apache.log4j.Logger;

public class GetPublishList {
	public static final String DB_DRIVER = "oracle.jdbc.OracleDriver";
	public String uname = null;
	public String password = null;
	public String connectionString = null;
	private List<String> DBdiff = null;
	private List<String> filediff = null;
	private List<String> database = null;
	private List<String> file;
	public static Boolean status = Boolean.valueOf(true);
	private ArrayList<String> types = null;
	private String XSDQuery = null;
	String path = null;
	String tempWorkArea = null;
	String query = null;
	private static Logger logger = null;

	public Boolean getStatus() {
		return status;
	}

	public Writer createWriter() {
		BufferedWriter writer = null;
		try {
			logger.info("Creating Difference.txt");
			writer = new BufferedWriter(new FileWriter(this.path + "\\Difference.txt"));
		}
		catch (IOException e) {
			logger.error("File Create Failure");
			logger.error(e);
			status = Boolean.valueOf(false);
		}
		return writer;
	}

	public void closeWriter(Writer writer) throws IOException {
		writer.close();
		logger.info("O/P Socket closed. File Write Completed.");
	}

	public void createDifference() throws IOException {
		Writer writer = null;
		writer = createWriter();
		label315: try {
			if (status.booleanValue()) {
				this.filediff = Compare(this.file, this.database);
				if (!this.filediff.isEmpty()) {
					outputString("1. Extra Artifacts in diff.log are : ", writer);
					outputResult(this.filediff, writer);
					logger.info("File Differences Done and written");
					status = Boolean.valueOf(false);
				}
				else {
					logger.info("No File Differences found");
					outputString("1. SUCCESS.. There are no extra Artifacts in the diff.log : ", writer);
					status = Boolean.valueOf(true);
				}
				this.DBdiff = Compare(this.database, this.file);
				if (!this.DBdiff.isEmpty()) {
					outputString("2. Extra Artifacts in the Database: ", writer);
					outputResult(this.DBdiff, writer);
					logger.info("Database Differences Done and written");
				}
				else {
					logger.info("No Database Differences found");
					outputString("2. There are no extra Artifacts in the database: ", writer);
				}
				if (!this.database.isEmpty()) {
					logger.info("DB Artifacts Queried");
					outputString("3. The Database Artifacts Are: ", writer);
					outputResult(this.database, writer);
				}
				else {
					logger.info("No Database Artifacts returned by the query");
					outputString("3. No Database Artifacts returned by the query ", writer);
				}
				if (!this.file.isEmpty()) {
					logger.info("artf.txt Artifacts Queried");
					outputString("4. The File Artifacts Are: ", writer);
					outputResult(this.file, writer);
					break label315;
				}
				logger.info("No artf.txt Artifacts returned by the query");
				outputString("4. No Diff.log Artifacts returned from the file art.txt", writer);
			}
		}
		finally {
			try {
				closeWriter(writer);
			}
			catch (NullPointerException e) {
				logger.error("Difference.txt File CLose Failed");
				logger.error(e);
				status = Boolean.valueOf(false);
			}
		}
	}

	public List<String> getDiff() throws IOException {
		if (this.DBdiff == null)
			createDifference();
		return this.DBdiff;
	}

	GetPublishList(String connectionString, String uname, String password, String query, String XSDQuery, String path) throws ClassNotFoundException, SQLException, IOException {
		this.connectionString = connectionString;
		this.uname = uname;
		this.password = password;
		this.path = path;
		this.query = query;
		this.XSDQuery = XSDQuery;
		logger = Logger.getLogger(Main.class);
		this.database = getTable(connectionString, uname, password);
		this.file = getArtf();
	}

	public List<String> getTable(String dbstring, String username, String password) throws SQLException, ClassNotFoundException, IOException {
		Connection con = null;
		PreparedStatement stmt = null;
		List list = new ArrayList(10);
		try {
			Class.forName(DB_DRIVER);
			con = DriverManager.getConnection(dbstring, username, password);
			logger.info("Success Connection to DB2 Database");
			stmt = con.prepareStatement(this.query);
			ResultSet rs = stmt.executeQuery();
			try {
				while (rs.next()) {
					String artfName = rs.getString("BFARTEFACTID");
					int type = rs.getInt("BFTYPE");
					String ext = getType(type);
					if (ext == null)
						continue;
					list.add(artfName + "." + getType(type));
				}
			}
			catch (IOException e) {
				logger.error("Error While Fetching the datatypes from artifacttypes.txt");
				logger.error(e);
				status = Boolean.valueOf(false);
			}
			catch (NullPointerException e) {
				status = Boolean.valueOf(false);
				logger.error("artifacttypes.txt Not Found");
				logger.error(e);
			}
			stmt = con.prepareStatement(this.XSDQuery);
			rs = stmt.executeQuery();
			while (rs.next()) {
				String artfName = rs.getString("BFSCHEMANAME");
				if (artfName != null)
					list.add(artfName);
			}
		}
		catch (SQLException e) {
			logger.error("Failed Connection to DB2 Database");
			logger.error(e);
			status = Boolean.valueOf(false);
		}
		finally {
			if (stmt != null)
				stmt.close();
			if (con != null)
				con.close();
		}
		return list;
	}

	public ArrayList<String> getArtf() throws IOException {
		BufferedReader bufferedReader = null;
		ArrayList list = null;
		try {
			list = new ArrayList(10);
			bufferedReader = new BufferedReader(new FileReader(this.path + "\\artf.txt"));
			logger.info("Success Connection to artf File");
			String line = null;
			try {
				while ((line = bufferedReader.readLine()) != null) {
					StringTokenizer st = new StringTokenizer(line, ".");
					if (st.countTokens() != 2)
						continue;
					String key = st.nextToken();
					String val = st.nextToken();
					String ext = getType(val);
					if (ext != null) {
						list.add(line);
					}
				}
			}
			catch (IOException e) {
				logger.error("Error While Fetching the datatypes from artifacttypes.txt");
				logger.error(e);
				status = Boolean.valueOf(false);
			}
			catch (NullPointerException e) {
				status = Boolean.valueOf(false);
				logger.error("artifacttypes.txt Not Found");
				logger.error(e);
			}
		}
		catch (FileNotFoundException fnfex) {
			logger.error("Fail artf File not Found");
			logger.error(fnfex.getMessage());
			status = Boolean.valueOf(false);
			try {
				if (bufferedReader != null)
					bufferedReader.close();
				logger.info("Input Sockets Closed for the artifacts file");
			}
			catch (IOException ioex) {
				logger.error("Error Closing Input Sockets for artifacts file");
				logger.error(ioex.getMessage());
				status = Boolean.valueOf(false);
			}
			catch (NullPointerException npex) {
				logger.error("Error Closing Input Sockets for artifacts file");
				logger.error("Status = Null");
				logger.error(npex.getMessage());
				status = Boolean.valueOf(false);
			}
		}
		catch (IOException ex) {
			logger.error("Error Not able to read file artf.txt");
			logger.error(ex.getMessage());
			status = Boolean.valueOf(false);
			try {
				if (bufferedReader != null)
					bufferedReader.close();
				logger.info("Input Sockets Closed for the artifacts file");
			}
			catch (IOException ioex) {
				logger.error("Error Closing Input Sockets for artifacts file");
				logger.error(ioex.getMessage());
				status = Boolean.valueOf(false);
			}
			catch (NullPointerException npex) {
				logger.error("Error Closing Input Sockets for artifacts file");
				logger.error("Status = Null");
				logger.error(npex.getMessage());
				status = Boolean.valueOf(false);
			}
		}
		finally {
			try {
				if (bufferedReader != null)
					bufferedReader.close();
				logger.info("Input Sockets Closed for the artifacts file");
			}
			catch (IOException ex) {
				logger.error("Error Closing Input Sockets for artifacts file");
				logger.error(ex.getMessage());
				status = Boolean.valueOf(false);
			}
			catch (NullPointerException ex) {
				logger.error("Error Closing Input Sockets for artifacts file");
				logger.error("Status = Null");
				logger.error(ex.getMessage());
				status = Boolean.valueOf(false);
			}
		}
		return list;
	}

	public String getType(int type) throws IOException {
		String ext = null;
		GetType typeclass = new GetType();
		this.types = typeclass.getDetails(this.path);
		for (int i = 0; i < this.types.size(); i += 2) {
			if (Integer.parseInt((String) this.types.get(i + 1)) != type) {
				continue;
			}
			ext = (String) this.types.get(i);
		}
		return ext;
	}

	public String getType(String type) throws IOException, NullPointerException {
		String ext = null;
		GetType typeclass = new GetType();
		this.types = typeclass.getDetails(this.path);
		for (int i = 0; i < this.types.size(); i += 2) {
			if (!((String) this.types.get(i)).equals(type)) {
				continue;
			}
			ext = type;
		}
		return ext;
	}

	public List<String> Compare(List<String> list1, List<String> list2) {
		int j = 0;
		List difference = new ArrayList(10);
		while (j < list1.size()) {
			int i = 0;
			int k = 0;
			String element = (String) list1.get(j);
			while (i < list2.size()) {
				if (element.equals((String) list2.get(i))) {
					k = 1;
					break;
				}
				i++;
			}
			if (k == 0) {
				difference.add(element);
			}
			j++;
		}
		return difference;
	}

	public void outputResult(List<String> input, Writer writer) throws IOException {
		for (String line : input) {
			writer.append(line);
			((BufferedWriter) writer).newLine();
		}
		((BufferedWriter) writer).newLine();
		((BufferedWriter) writer).newLine();
	}

	public void outputString(String input, Writer writer) throws IOException {
		writer.append(input);
		((BufferedWriter) writer).newLine();
		((BufferedWriter) writer).newLine();
	}
}
