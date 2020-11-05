import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class AuditAnalyser {

    public static void main(String[] args) {
        System.out.println("Start");
        String findString = "YB_CMN_RPTBranchPrivilege_SRV";
        String FILEPATH = "C:\\Users\\amanjuna\\Desktop\\1500\\";
        String FILENAME = "1500.txt";
        try {
            String FILENAME_WITHPATH = FILEPATH + FILENAME;
            String sCurrentLine;
            String outputFile = FILEPATH + findString + "_" + FILENAME;
            List<String> words =
                Files.lines(Paths.get(FILENAME_WITHPATH))
                .filter(word -> word.contains(findString))
                .collect(Collectors.toList());
            
            words = words.stream().sorted().collect(Collectors.toList());
            Files.write(Paths.get(outputFile), words, Charset.defaultCharset());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("End");
    }

}
