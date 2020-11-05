import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadTemplate {

    public static String readFileAsString(String fileName) {
        String text = "";
        try {
            text = new String(Files.readAllBytes(Paths.get("file.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    public static void main(String args[]) {

    }
}
