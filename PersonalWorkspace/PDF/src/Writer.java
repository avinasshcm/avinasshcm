import java.io.IOException;

import com.gnostice.pdfone.*;

public class Writer {
	// Create a PdfDocument instance
	public static void main(String args[]) {
		PdfDocument doc = new PdfDocument();
		try {
			// Write some text on page 1
			doc.writeText("Hello, World!"); // automatically creates a blank page
			// Save document to file
			doc.save("sample_doc1.pdf");
			doc.close();
		}
		catch (IOException | PdfException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
