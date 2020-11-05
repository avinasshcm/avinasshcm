package xml;

import java.io.IOException;
import java.io.StringWriter;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;

public class Main {

    public static void main(String[] args) throws Exception {
        XMLOutputFactory factory = XMLOutputFactory.newInstance();
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        try {

            StringWriter sw = new StringWriter();

            XMLEventWriter writer = factory.createXMLEventWriter(sw);

            XMLEvent event = eventFactory.createStartDocument("utf-8");
            writer.add(event);

            event = eventFactory.createStartElement("", "", "test");
            writer.add(event);
            event = eventFactory.createEndElement("", "", "test");
            writer.add(event);
            writer.flush();
            writer.close();

            sw.close();
            System.out.println(sw.toString());

        } catch (XMLStreamException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}