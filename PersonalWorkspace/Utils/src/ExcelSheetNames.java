import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetNames {
	private static final String FILE_PATH = "D:/My Cloud/OneDrive/MutualFunds/";
	private static final String FILE_NAME = "Mutual Funds.xlsx";
	private static final String FILE_NAME_PATH = FILE_PATH + FILE_NAME;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = null;
		try {
			fileInputStream = new FileInputStream(FILE_NAME_PATH);
			XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
			StringBuilder sb = new StringBuilder();
			sb.append("=");
			// for each sheet in the workbook
			for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
				String sheetName = workbook.getSheetName(i);
				if (!sheetName.equals("Summary") && !sheetName.equals("Historical") && !sheetName.equals("FY Summary") && !sheetName.equals("RPA") && !sheetName.equals("MFPA") && !sheetName.equals("MFPP") && !sheetName.equals("DPA") && !sheetName.equals("TPA") && !sheetName.equals("TPP")) {
					sb.append("SUMIFS('" + sheetName + "'!$C:$C,'" + sheetName + "'!$H:$H,$A2,'" + sheetName + "'!$I:$I,B$1)+");
					System.out.println("Sheet name: " + workbook.getSheetName(i));
				}
			}
			sb.append("0");
			System.out.println(sb.toString());
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if (fileInputStream != null) {
				try {
					fileInputStream.close();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
