import java.io.File;

public class TestPDF2HTML
{
   public static void main(String[] args) throws Exception
   {
      if(args.length != 2)
         return;

      File inputFile = new File(args[0]);
      String inputFileName = inputFile.getCanonicalPath();

      File outputFile = new File(args[1]);
      String outputFileName = outputFile.getCanonicalPath();

      PDF2HTML pdf2html = new PDF2HTML();
      try
      {
         pdf2html.ConvertToHTML(inputFileName, outputFileName, "", 0, -1);
      }
      catch(PDF2HTMLException ex)
      {
         System.out.println(ex.getMessage());
      }
      finally
      {
         pdf2html.dispose();
      }
   }
}