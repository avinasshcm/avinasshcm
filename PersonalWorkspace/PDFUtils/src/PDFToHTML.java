import org.w3c.dom.Document;


public class PDFToHTML {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Document pdfDocument = new Document("input.pdf");
        // Instantiate HtmlSaveOptions instance
        HtmlSaveOptions saveOptions = new HtmlSaveOptions();
        // Save the HTML file
        pdfDocument.save("output.html", saveOptions);
    }

}
