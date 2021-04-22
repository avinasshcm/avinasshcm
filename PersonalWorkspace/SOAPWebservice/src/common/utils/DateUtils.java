package common.utils;

import java.sql.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateUtils {
	public static XMLGregorianCalendar getGregorianDate(Date date) {
		XMLGregorianCalendar startDate = null;
		try {
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(date);
			startDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
		}
		catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return startDate;
	}
}
