import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Trim {

    public static void main(String[] args) {
        BufferedReader br = null;
        FileReader fr = null;
        System.out.println("Start");
        try {
            String FILENAME = "D:\\Clients\\YOMA_Slowness\\29-May-17\\native_stdout2.log";
            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);
            String sCurrentLine;
            String outputFile = "D:\\Clients\\YOMA_Slowness\\29-May-17\\native_stdout2_Result" + LocalDate.now() + ".log";
            br = new BufferedReader(new FileReader(FILENAME));
            List<String> snippet = new ArrayList<String>();
            Files.write(Paths.get(outputFile), snippet, Charset.defaultCharset(), StandardOpenOption.CREATE);
            // snippet.add("\n");
            while ((sCurrentLine = br.readLine()) != null) {
                if (!sCurrentLine.equals("")) {
                    snippet.add(sCurrentLine);
                    // snippet.add("\n");
                } else {
                    if ((snippet.toString().contains("WebContainer") && snippet.toString().contains("PrinterService"))
                        || snippet.toString().contains("Full thread dump Java") || snippet.toString().contains("PSYoungGen")) {
                        System.out.println(snippet);
                        Files.write(Paths.get(outputFile), snippet, Charset.defaultCharset(), StandardOpenOption.APPEND);
                    }
                    snippet = new ArrayList<String>();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("End");
    }
}
