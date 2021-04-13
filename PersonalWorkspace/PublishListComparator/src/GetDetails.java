import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.StringTokenizer;

public class GetDetails {
	public String uName = null;
	public String password = null;
	public String url = null;
	public String query = null;
	public String xsdquery = null;
	public String querydatentime = null;
	public String projectType = null;
	public String buildType = null;
	public String timestamp = null;

	public void getDetails(String path) throws IOException, NullPointerException {
		BufferedReader bufferedReader = null;
		label411: try {
			File f1 = new File(path + "\\build." + InetAddress.getLocalHost().getHostName().toLowerCase() + ".properties");
			bufferedReader = new BufferedReader(new FileReader(f1.getPath()));
			String line = null;
			String key = null;
			String val = null;
			while ((line = bufferedReader.readLine()) != null) {
				if (line.contains("=")) {
					StringTokenizer st = new StringTokenizer(line, "=");
					if (st.countTokens() == 2) {
						key = st.nextToken();
						val = st.nextToken();
					}
					assignValues(key, val);
				}
			}
			if (this.querydatentime == null) {
				if (this.buildType.trim().equalsIgnoreCase("jenkins")) {
					this.timestamp = System.getenv("BUILD_ID");
					StringTokenizer time = new StringTokenizer(this.timestamp, "_");
					String date = time.nextToken();
					String tagtime = time.nextToken();
					StringTokenizer formattedtime = new StringTokenizer(tagtime, "-");
					String querytime = formattedtime.nextToken();
					querytime = querytime + ":" + formattedtime.nextToken();
					querytime = querytime + ":" + formattedtime.nextToken();
					querytime = querytime + ".00";
					val = date + " " + querytime;
					assignValues("datentime", val);
					break label411;
				}
				Calendar currentDate = Calendar.getInstance();
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				String dateNow = formatter.format(currentDate.getTime());
				val = dateNow + " 09:00:00.00";
				assignValues("datentime", val);
			}
		}
		finally {
			bufferedReader.close();
		}
	}

	public String getXsdquery() {
		String querydatentime2 = this.querydatentime;
		if (GetPublishList.DB_DRIVER.contains("OracleDriver")) {
			querydatentime2 = " TO_CHAR(TIMESTAMP'" + querydatentime2 + "' )";
		}
		if (this.projectType.equalsIgnoreCase("cbs")) {
			this.xsdquery = ("select distinct(BFSCHEMANAME) from BANKFUSION.BFTB_RESOURCE WHERE BFLASTPUBLISHED >" + querydatentime2 + " and BFTYPE=6");
		}
		else {
			this.xsdquery = ("select distinct(BFSCHEMANAME) from BANKFUSION.BFTB_RESOURCE WHERE BFLASTPUBLISHED >" + querydatentime2 + " and BFTYPE=6 and (BFAPPLICATIONID != 'CBS' OR BFAPPLICATIONID != 'BFAM' OR BFAPPLICATIONID != 'BFPM')");
		}
		return this.xsdquery;
	}

	public String getuName() {
		return this.uName;
	}

	public String getPassword() {
		return this.password;
	}

	public String getQuery() {
		String querydatentime2 = this.querydatentime;
		if (GetPublishList.DB_DRIVER.contains("OracleDriver")) {
			querydatentime2 = " TO_CHAR(TIMESTAMP'" + querydatentime2 + "' )";
		}
		if (this.projectType.equalsIgnoreCase("cbs")) {
			this.query = ("SELECT BFLASTPUBLISHED,BFARTEFACTID,BFTYPE FROM BANKFUSION.BFTB_RESOURCE WHERE BFLASTPUBLISHED > " + querydatentime2 + "  and BFTYPE<>6 ORDER BY BFLASTPUBLISHED");
		}
		else {
			this.query = ("SELECT BFLASTPUBLISHED,BFARTEFACTID,BFTYPE FROM BANKFUSION.BFTB_RESOURCE WHERE BFLASTPUBLISHED > " + querydatentime2 + " and BFTYPE<>6 and (BFAPPLICATIONID != 'CBS' OR BFAPPLICATIONID != 'BFAM' OR BFAPPLICATIONID != 'BFPM') ORDER BY BFLASTPUBLISHED");
		}
		return this.query;
	}

	public void assignValues(String keys, String values) {
		if (keys.trim().equalsIgnoreCase("ci.userid"))
			this.uName = values.trim();
		else if (keys.trim().equalsIgnoreCase("ci.password"))
			this.password = values.trim();
		else if (keys.trim().equalsIgnoreCase("ci.url"))
			this.url = values.trim();
		else if (keys.trim().equalsIgnoreCase("datentime"))
			this.querydatentime = values.trim();
		else if (keys.trim().equalsIgnoreCase("project"))
			this.projectType = values.trim();
		else if (keys.trim().equalsIgnoreCase("buildtype"))
			this.buildType = values.trim();
	}

	public String getUrl() {
		return this.url;
	}
}
