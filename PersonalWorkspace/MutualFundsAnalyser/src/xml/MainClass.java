package xml;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class MainClass {
  public static void main(String[] args) throws Exception{
    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    DocumentBuilder db = dbf.newDocumentBuilder();

    Document document = db.newDocument();

    Element book = document.createElement("book"); 
    book.setAttribute("id", "javanut4");           
    document.appendChild(book);                    
    for(int i = 1; i <= 3; i++) {                  
        Element chapter = document.createElement("chapter");
        Element title = document.createElement("title");
        title.appendChild(document.createTextNode("Chapter " + i));
        chapter.appendChild(title);
        chapter.appendChild(document.createElement("para"));
        book.appendChild(chapter);
    }

    TransformerFactory tf = TransformerFactory.newInstance();
    Transformer transformer = tf.newTransformer();

    DOMSource source = new DOMSource(document);          
    StreamResult result = new StreamResult(System.out);  

    transformer.transform(source, result);
  }
}
