import java.io.File;

public class DeleteFiles {
	public static void main(String args[]) {
		clearTempFolder("D:\\Payments\\INSTALL-LOCATION\\CTTSWAT\\4_FINANCIAL_GATEWAY\\Responsefiles\\123.txt");
	}

	public static String clearTempFolder(String responseFile) {
		File parentFolder = new File(responseFile).getParentFile();
		File tempFolder = new File("D:\\Payments\\INSTALL-LOCATION\\CTTSWAT\\4_FINANCIAL_GATEWAY\\ResponseTemp");
		if (tempFolder.exists()) {
			File[] filesList = tempFolder.listFiles();
			for (File file : filesList) {
				try {
					file.deleteOnExit();
					System.out.println(file.getAbsolutePath());
				}
				catch (Exception e) {
					System.out.println("Unable to delete file.");
				}
			}
		}
		return tempFolder.getPath();
	}
}
