
// Java Program to illustrate reading from
// FileReader using FileReader
import java.io.FileReader;

public class ReadingFromFile {
	public static void main(String[] args) throws Exception {
		// pass the path to the file as a parameter
		FileReader fr = new FileReader("C:\\Users\\amanjuna\\Desktop\\SCV_Permission.txt");
		int i;
		while ((i = fr.read()) != -1)
			System.out.print((char) i);
	}
}