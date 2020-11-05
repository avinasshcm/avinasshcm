package xml;

import java.io.FileOutputStream;

import javax.xml.stream.XMLEventFactory;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartDocument;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import org.w3c.dom.Element;

public class StaxWriter {

    private String configFile;

    public void setFile(String configFile) {
        this.configFile = configFile;
    }

    public void saveConfig() throws Exception {
        // create an XMLOutputFactory
        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        // create XMLEventWriter
        XMLEventWriter eventWriter = outputFactory.createXMLEventWriter(new FileOutputStream(configFile));
        // create an EventFactory
        XMLEventFactory eventFactory = XMLEventFactory.newInstance();

        XMLEvent end = eventFactory.createDTD("\n");
        // create and write Start Tag
        StartDocument startDocument = eventFactory.createStartDocument("UTF-8", "1.0");
        eventWriter.add(startDocument);

        // create config open tag
        StartElement configStartElement = eventFactory.createStartElement("", "", "config");
        eventWriter.add(configStartElement);
        eventWriter.add(end);

        createNode(eventWriter, "AMFIINDIAURL", "https://www.amfiindia.com/spages/NAVAll.txt");
        createNode(eventWriter, "FILEPATH", "D:/My Cloud/OneDrive/MutualFunds/");
        createNode(eventWriter, "historicDataLocation", "Historic_Data");

        // StartElement AMFIINDIAURL = eventFactory.createStartElement("", "", "AMFIINDIAURL");

        StartElement itemStartElement = eventFactory.createStartElement("", "", "item");

        insertElement(eventWriter, eventFactory, end, itemStartElement, "Shruthi1", "Mutual Funds Shru1.xlsx",
            "History/History_Shru.properties", "2018-01-03", "101");
        insertElement(eventWriter, eventFactory, end, itemStartElement, "Shruthi2", "Mutual Funds Shru2.xlsx",
            "History/History_Shru.properties", "2018-01-03", "101");
        insertElement(eventWriter, eventFactory, end, itemStartElement, "Shruthi3", "Mutual Funds Shru3.xlsx",
            "History/History_Shru.properties", "2018-01-03", "101");

        eventWriter.add(eventFactory.createEndElement("", "", "config"));
        eventWriter.add(end);
        eventWriter.add(eventFactory.createEndDocument());
        eventWriter.close();
    }

    private void insertElement(XMLEventWriter eventWriter, XMLEventFactory eventFactory, XMLEvent end, StartElement itemStartElement,
        String name, String excelName, String historyPropFileName, String lastEvaluatedOn, String columnNumber) throws XMLStreamException {
        eventWriter.add(itemStartElement);
        eventWriter.add(end);
        // Write the different nodes
        createNode(eventWriter, "name", name);
        createNode(eventWriter, "excelName", excelName);
        createNode(eventWriter, "historyPropFileName", historyPropFileName);
        createNode(eventWriter, "lastEvaluatedOn", lastEvaluatedOn);
        createNode(eventWriter, "columnNumber", columnNumber);
        eventWriter.add(eventFactory.createEndElement("", "", "item"));
    }

    private void createNode(XMLEventWriter eventWriter, String name, String value) throws XMLStreamException {

        XMLEventFactory eventFactory = XMLEventFactory.newInstance();
        XMLEvent end = eventFactory.createDTD("\n");
        XMLEvent tab = eventFactory.createDTD("\t");
        // create Start node
        StartElement sElement = eventFactory.createStartElement("", "", name);
        eventWriter.add(tab);
        eventWriter.add(sElement);
        // create Content
        Characters characters = eventFactory.createCharacters(value);
        eventWriter.add(characters);
        // create End node
        EndElement eElement = eventFactory.createEndElement("", "", name);
        eventWriter.add(eElement);
        eventWriter.add(end);

    }

}