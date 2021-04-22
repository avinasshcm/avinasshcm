package common.utils;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnmarshallHelper {
	public UnmarshallHelper() {
	}

	@SuppressWarnings("rawtypes")
	public Object initializeObject(Class clazz, String xmlTemplate) {
		Object header = null;
		try {
			StringReader sr = new StringReader(xmlTemplate);
			JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			header = unmarshaller.unmarshal(sr);
		}
		catch (JAXBException e) {
			e.printStackTrace();
		}
		return header;
	}
}
