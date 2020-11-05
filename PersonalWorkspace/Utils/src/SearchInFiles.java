import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class SearchInFiles {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO Auto-generated method stub

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        System.out.println("C:\\Users\\amanjuna\\Desktop\\Required_Permissions_SCV.txt");
        searchInFiles("C:\\Users\\amanjuna\\Desktop\\Required_Permissions_SCV.txt",
            "C:\\Users\\amanjuna\\Desktop\\Required_Permissions_SCV.txt");

        System.out.println("\n\nC:\\Users\\amanjuna\\Desktop\\SCV_Permission.txt");
        searchInFiles("C:\\Users\\amanjuna\\Desktop\\Required_Permissions_SCV.txt", "C:\\Users\\amanjuna\\Desktop\\SCV_Permission.txt");
    }

    private static void searchInFiles(String requiredFileName, String referenceFileName) throws IOException, FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader(requiredFileName))) {
            String line;
            while ((line = br.readLine()) != null) {

                try (BufferedReader br_ope = new BufferedReader(new FileReader(referenceFileName))) {
                    String line_ope;
                    while ((line_ope = br_ope.readLine()) != null) {

                        if (line.equals(line_ope)) {
                            System.out.println(line_ope);
                        }

                    }

                }

            }

        }
    }

}
