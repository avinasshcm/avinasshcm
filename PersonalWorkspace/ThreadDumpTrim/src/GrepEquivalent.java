import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GrepEquivalent {

    public static void main(String[] args) {
        System.out.println("Start");
        String findString = "FAILED";
        String FILEPATH =
            "C:\\Users\\amanjuna\\Desktop\\Belize_HL_Imbal\\01850062_HoldingLocationImbalance\\SFDC\\Profile1Audit\\audit-20170802202756\\";
        String FILENAME = "Persistence_HLT_Consolidated_sorted.txt";
        try {
            String FILENAME_WITHPATH = FILEPATH + FILENAME;
            String sCurrentLine;
            String outputFile = FILEPATH + findString + "_" + FILENAME;
            List<String> words =
                Files.lines(Paths.get(FILENAME_WITHPATH)).filter(word -> word.contains(findString)).collect(Collectors.toList());

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
