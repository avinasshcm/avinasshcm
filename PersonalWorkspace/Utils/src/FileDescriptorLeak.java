import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileDescriptorLeak {
	public static void main(String args[]) {
		readFile();
		try {
			Thread.sleep(20000);
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static BufferedReader readFile() {
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream("Test.txt");
			return new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				inputStream.close();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
}
