package xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StaXParser {

    static final String NAME = "name";

    static final String ITEM = "item";

    static final String excelName = "excelName";

    static final String historyPropFileName = "historyPropFileName";

    @SuppressWarnings({ "unchecked", "null" })
    public Global readConfig(String configFile) {
        List<Item> items = new ArrayList<Item>();
        Global global = new Global();
        try {
            // First, create a new XMLInputFactory
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            // Setup a new eventReader
            InputStream in = new FileInputStream(configFile);
            XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
            // read the XML document
            Item item = null;

            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();

                if (event.isStartElement()) {
                    StartElement startElement = event.asStartElement();
                    // If we have an item element, we create a new item
                    if (startElement.getName().getLocalPart().equals("AMFIINDIAURL")) {

                        event = eventReader.nextEvent();
                        global.setAMFIINDIAURL(event.asCharacters().getData());
                        continue;
                    }

                    if (startElement.getName().getLocalPart().equals("FILEPATH")) {

                        event = eventReader.nextEvent();
                        global.setFILEPATH(event.asCharacters().getData());
                        continue;
                    }

                    if (startElement.getName().getLocalPart().equals("historicDataLocation")) {

                        event = eventReader.nextEvent();
                        global.setHistoricData(event.asCharacters().getData());
                        continue;
                    }

                    if (startElement.getName().getLocalPart().equals(ITEM)) {
                        item = new Item();
                        // We read the attributes from this tag and add the date
                        // attribute to our object
                        Iterator<Attribute> attributes = startElement.getAttributes();
                        while (attributes.hasNext()) {
                            Attribute attribute = attributes.next();
                            if (attribute.getName().toString().equals(NAME)) {
                                item.setName(attribute.getValue());
                            }

                        }
                    }

                    if (event.isStartElement()) {
                        if (event.asStartElement().getName().getLocalPart().equals(excelName)) {
                            event = eventReader.nextEvent();
                            item.setExcelName(event.asCharacters().getData());
                            continue;
                        }
                    }
                    if (event.asStartElement().getName().getLocalPart().equals(historyPropFileName)) {
                        event = eventReader.nextEvent();
                        item.setHistoryPropFileName(event.asCharacters().getData());
                        continue;
                    }

                }
                // If we reach the end of an item element, we add it to the list
                if (event.isEndElement()) {
                    EndElement endElement = event.asEndElement();
                    if (endElement.getName().getLocalPart().equals(ITEM)) {
                        items.add(item);
                    }
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }

        global.setItem(items);
        return global;
    }

}