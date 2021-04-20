package file.excel;

import java.sql.Timestamp;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;

public class ExcelUtils {
	public static Cell createCell(CreationHelper creationHelper, CellStyle style, Row row, int colIndex, Object value) {
		Cell cell = row.createCell(colIndex);
		if (value instanceof String) {
			cell.setCellValue((String) value);
		}
		else if (value instanceof Integer) {
			cell.setCellValue((Integer) value);
		}
		else if (value instanceof Long) {
			cell.setCellValue((Long) value);
		}
		else if (value instanceof Timestamp) {
			cell.setCellValue((Date) value);
			style.setDataFormat(creationHelper.createDataFormat().getFormat("yyyy-MM-dd HH:mm:ss"));
			cell.setCellStyle(style);
		}
		return cell;
	}
}
