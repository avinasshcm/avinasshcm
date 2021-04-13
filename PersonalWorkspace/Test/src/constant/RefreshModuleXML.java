package constant;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class RefreshModuleXML {
	private static final String SUPPORT_FILE_PREFIX = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + "\n<module xmlns=\"urn:jboss:module:1.3\" name=\"com.misys.fbp.support\">" + "\n\t<properties>" + "\n\t\t<property name=\"jboss.api\" value=\"public\"/>" + "\n\t</properties>" + "\n\t<resources>" + "\n\t\t<!-- Please make entries as below for all third party jars with correct versions if any -->";
	private static final String SUPPORT_FILE_SUFFIX = "\t</resources>" + "\n\t<dependencies>" + "\n\t\t<module name=\"com.misys.fbp.dups\"/>" + "\n\t\t<module name=\"sun.jdk\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.activation.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.servlet.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.xml.registry.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.transaction.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"org.apache.commons.logging\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.mail.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.xml.bind.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"com.ibm.db2.jdbc\" export=\"TRUE\"/>" + "\n\t\t<module name=\"org.jboss.vfs\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.ws.rs.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.validation.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.persistence.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.xml.ws.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"org.jboss.as.web\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.annotation.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"org.eclipse.jdt.ecj\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.jws.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"com.misys.fbp.mq\" export=\"TRUE\"/>" + "\n\t\t<module name=\"com.misys.fbp.crystal\" export=\"TRUE\"/>" + "\n\t\t<module name=\"org.hibernate\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.websocket.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"org.apache.xerces\" export=\"TRUE\"/>" + "\n\t</dependencies> " + "\n</module>";
	private static final String APPLICATION_FILE_PREFIX = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + "\n<module xmlns=\"urn:jboss:module:1.3\" name=\"com.misys.fbp.support\">" + "\n\t<properties>" + "\n\t\t<property name=\"jboss.api\" value=\"public\"/>" + "\n\t</properties>" + "\n\t<resources>" + "\n\t\t<!-- Please make entries as below for all third party jars with correct versions if any -->";
	private static final String APPLICATION_FILE_SUFFIX = "\t</resources>" + "\n\t<dependencies>" + "\n\t\t<module name=\"com.misys.fbp.dups\"/>" + "\n\t\t<module name=\"sun.jdk\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.activation.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.servlet.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.xml.registry.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.transaction.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"org.apache.commons.logging\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.mail.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.xml.bind.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"com.ibm.db2.jdbc\" export=\"TRUE\"/>" + "\n\t\t<module name=\"org.jboss.vfs\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.ws.rs.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.validation.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.persistence.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.xml.ws.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"org.jboss.as.web\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.annotation.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"org.eclipse.jdt.ecj\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.jws.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"com.misys.fbp.mq\" export=\"TRUE\"/>" + "\n\t\t<module name=\"com.misys.fbp.crystal\" export=\"TRUE\"/>" + "\n\t\t<module name=\"org.hibernate\" export=\"TRUE\"/>" + "\n\t\t<module name=\"javax.websocket.api\" export=\"TRUE\"/>" + "\n\t\t<module name=\"org.apache.xerces\" export=\"TRUE\"/>" + "\n\t</dependencies> " + "\n</module>";
	private static final String INSTALL_LOCATION = "D:/Essence/INSTALL-LOCATION/FBE55";
	private static final String RELATIVE_PATH = "../../../../../../../../../..";
	//Do not change the below values
	private static final String PREFIX = "<resource-root path=\"";
	private static final String SUFFIX = "\"/>";
	private static final String BANKFUSION_BF_HELPER_JARS = "/BankFusion/SYMBOLIC/BFHelper-Jars/";
	private static final String BANKFUSION_SUPPORT_JARS = "/BankFusion/SYMBOLIC/Support-jars/";
	private static final String UB_HELPER_JARS = "/UniversalBanking/SYMBOLIC/helperjars/";
	private static final String PARTY_HELPER_JARS = "/Party/SYMBOLIC/helperjars/";
	private static final String CBS_DEVICE_SUPPORT_JARS = "/CBS/SYMBOLIC/DeviceSupportJars/";
	private static final String CBS_HELPER_JARS = "/CBS/SYMBOLIC/helperjars/";
	private static final String BANKSUFION_JBOSS_JARS = "/BankFusion/SYMBOLIC/JBoss-jars/";

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		generateSupportModuleXml();
	}

	private static void generateSupportModuleXml() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream(new File("module.xml_Support"));
		//Files.writeString(Paths.get("module.xml_Support"), FILE_PREFIX , StandardOpenOption.APPEND);
		fos.write(SUPPORT_FILE_PREFIX.getBytes());
		listFiles(fos, UB_HELPER_JARS);
		listFiles(fos, PARTY_HELPER_JARS);
		listFiles(fos, CBS_DEVICE_SUPPORT_JARS);
		listFiles(fos, CBS_HELPER_JARS);
		listFiles(fos, BANKSUFION_JBOSS_JARS);
		listFiles(fos, BANKFUSION_SUPPORT_JARS);
		listFiles(fos, BANKFUSION_BF_HELPER_JARS);
		fos.write(SUPPORT_FILE_SUFFIX.getBytes());
	}

	private static void generateApplicationModuleXml() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream(new File("module.xml_Application"));
		//Files.writeString(Paths.get("module.xml_Support"), FILE_PREFIX , StandardOpenOption.APPEND);
		fos.write(APPLICATION_FILE_PREFIX.getBytes());
		listFiles(fos, UB_HELPER_JARS);
		listFiles(fos, PARTY_HELPER_JARS);
		listFiles(fos, CBS_DEVICE_SUPPORT_JARS);
		listFiles(fos, CBS_HELPER_JARS);
		listFiles(fos, BANKSUFION_JBOSS_JARS);
		listFiles(fos, BANKFUSION_SUPPORT_JARS);
		listFiles(fos, BANKFUSION_BF_HELPER_JARS);
		fos.write(APPLICATION_FILE_SUFFIX.getBytes());
	}

	private static void listFiles(FileOutputStream fos, String folder) throws IOException {
		String[] pathnames = new File(INSTALL_LOCATION + folder).list();
		for (String pathname : pathnames) {
			fos.write(("\n\t\t" + PREFIX + RELATIVE_PATH + folder + pathname + SUFFIX).getBytes());
		}
	}
}
