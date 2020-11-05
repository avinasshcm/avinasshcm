import java.io.FileReader;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.stax.StAXSource;

import org.w3c.dom.Node;

public class ReadXMLStaxparser {

  public static void main(String[] args) throws Exception {
    XMLInputFactory xif = XMLInputFactory.newInstance();
    XMLStreamReader xsr = xif.createXMLStreamReader(new FileReader("input.xml"));
    xsr.nextTag(); // Advance to statements element

    TransformerFactory tf = TransformerFactory.newInstance();
    Transformer t = tf.newTransformer();
    while(xsr.nextTag() == XMLStreamConstants.START_ELEMENT) {
        DOMResult result = new DOMResult();
        t.transform(new StAXSource(xsr), result);
        Node domNode = result.getNode();
    }

  }

}
