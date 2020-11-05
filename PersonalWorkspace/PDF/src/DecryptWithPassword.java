import com.snowtide.PDF;
import com.snowtide.pdf.Document;
import com.snowtide.pdf.OutputTarget;
import com.snowtide.pdf.Page;
import com.snowtide.pdf.layout.BlockParent;
 
public class DecryptWithPassword {
    public static void main (String[] args) throws java.io.IOException {
        
        String password = "16121991";
        String pdfFilePath = "D:\\My Cloud\\OneDrive\\Financial\\Credit Reports\\Equifax\\Equifax_20191019.pdf";
        Document pdfts = PDF.open(pdfFilePath, password.getBytes());
       Page p3 =  pdfts.getPage(3);
       
        StringBuilder text = new StringBuilder(1024);
        pdfts.pipe(new OutputTarget(text));
        pdfts.close();
        System.out.println(text);
        //System.out.println(text.indexOf("Acct"));
        //System.out.println(text.indexOf("Credit Account Information Details"));
        System.out.println("Start " + text.indexOf("Acct"));
        System.out.println("End " + text.indexOf("Credit Account Information Details"));
        String newtext = text.substring(text.indexOf("Acct"), text.indexOf("Credit Account Information Details"));
      System.out.println(newtext);
        newtext = newtext.replaceAll("\\r\\n|\\r|\\n", " ");
        //System.out.println(text);
        String[] loans = newtext.split("Acct");
        for(String item : loans){
            
            
            if(!item.isEmpty() && !item.contains("Closed"))
            {
          //System.out.println(item);
                //item = item.replaceAll("\\s{2,}",  "\t");
                item = item.replace("     Auto", " Auto");
                item = item.replaceAll("     ",  "\t");
              System.out.println(item);
            
           /*
            String [] itemDetails = item.split("\t");
            
            System.out.print(itemDetails[1] + "\t" );
            System.out.print(itemDetails[2] + "\t" );
            System.out.print(itemDetails[3] + "\t" );
            System.out.print(itemDetails[4] + "\t" );
            System.out.println(itemDetails[10]);*/
           }
        }
    }
}