import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.misys.fusion.utils.XMLParsingErrorHandler;
import com.misys.fusion.utils.constants.IConstants;

public class ValidateDeleteMapping {
	public static void main(String args[]) {
		try {
			InputStream xsd = new FileInputStream(new File("D:\\Essence\\Workspace\\SVN\\4261_Support\\Tools426_Release\\MisysPD\\BankFusion\\FusionUtils\\configuration\\conf\\DeleteFileMappingSchema.xsd"));
			InputStream xml = new FileInputStream(new File("D:\\OneDrive - Finastra\\Desktop\\DeleteFileMapping.xml"));
			System.out.println(isValidXML(xml, xsd));
		}
		catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static boolean isValidXML(InputStream xmlFileStream, InputStream xsdFileStream) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = createDocumentBuilderFactory();
		factory.setAttribute(IConstants.SCHEMA_SOURCE, xsdFileStream);
		DocumentBuilder builder = factory.newDocumentBuilder();
		XMLParsingErrorHandler xmlParsingErrorHandler = new XMLParsingErrorHandler();
		builder.setErrorHandler(xmlParsingErrorHandler);
		builder.parse(xmlFileStream);
		if (XMLParsingErrorHandler.errorFound) {
			return false;
		}
		return true;
	}

	private static DocumentBuilderFactory createDocumentBuilderFactory() {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		factory.setValidating(true);
		factory.setAttribute(IConstants.SCHEMA_LANGUAGE, IConstants.XML_SCHEMA);
		return factory;
	}
}
