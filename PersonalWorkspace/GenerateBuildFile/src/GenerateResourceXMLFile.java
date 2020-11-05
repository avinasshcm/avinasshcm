import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFCell;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class GenerateResourceXMLFile {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception {
		String filename = "Artefacts.xls";
		List oldMFList = new ArrayList();
		List newMFList = new ArrayList();
		List oldScreenList = new ArrayList();
		List newScreenList = new ArrayList();
		List newASDList = new ArrayList();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filename);
			HSSFWorkbook workbook = new HSSFWorkbook(fis);
			HSSFSheet oldMFSheet = workbook.getSheetAt(0);
			HSSFSheet newMFSheet = workbook.getSheetAt(1);
			HSSFSheet oldScreenSheet = workbook.getSheetAt(2);
			HSSFSheet newScreenSheet = workbook.getSheetAt(3);
			HSSFSheet newASDSheet = workbook.getSheetAt(4);
			oldMFList = iterateCells(oldMFSheet);
			newMFList = iterateCells(newMFSheet);
			oldScreenList = iterateCells(oldScreenSheet);
			newScreenList = iterateCells(newScreenSheet);
			newASDList = iterateCells(newASDSheet);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if (fis != null) {
				fis.close();
			}
		}
		/*activityStepPublish(newASDList);
		screenRepublish(oldScreenList);
		screenpublish(newScreenList);
		microflowRepublish(oldMFList);
		microflowpublish(newMFList);*/
		
		System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		System.out.println("<tns:ResourceElement xmlns:tns=\"http://www.example.org/ExportResource\"");
		System.out.println("\txmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
		System.out.println("\txsi:schemaLocation=\"http://www.example.org/ExportResource ExportResource.xsd \">");
		
		microflow(oldMFList);
		microflow(newMFList);
		screen(newScreenList);
		screen(oldScreenList);
		activityStep(newASDList);
		System.out.println("</tns:ResourceElement>");
	}

	private static List iterateCells(HSSFSheet sheet) {
		List sheetData = new ArrayList();
		Iterator rows = sheet.rowIterator();
		while (rows.hasNext()) {
			HSSFRow row = (HSSFRow) rows.next();
			Iterator cells = row.cellIterator();
			List data = new ArrayList();
			while (cells.hasNext()) {
				HSSFCell cell = (HSSFCell) cells.next();
				data.add(cell);
			}
			sheetData.add(data);
		}
		return sheetData;
	}

	private static void microflow(List sheetData) {
		for (int i = 0; i < sheetData.size(); i++) {
			List list = (List) sheetData.get(i);
			for (int j = 0; j < list.size(); j++) {
				HSSFCell cell = (HSSFCell) list.get(j);
				System.out.println("<tns:resource>");
				String mfNameWithExt = (String) cell.getStringCellValue();
				int lastIndex = mfNameWithExt.lastIndexOf(".");
				String artefactName = mfNameWithExt.substring(0, lastIndex);
				System.out.println("<tns:name>" + artefactName + "</tns:name>");
				System.out.println("<tns:type>.bfg</tns:type>");
				System.out.println("<tns:artefactType>1</tns:artefactType>");
				System.out.println("</tns:resource>");
			}
		}
	}

	
	private static void activityStep(List sheetData) {
		for (int i = 0; i < sheetData.size(); i++) {
			List list = (List) sheetData.get(i);
			for (int j = 0; j < list.size(); j++) {
				HSSFCell cell = (HSSFCell) list.get(j);
				System.out.println("<tns:resource>");
				String mfNameWithExt = (String) cell.getStringCellValue();
				int lastIndex = mfNameWithExt.lastIndexOf(".");
				String artefactName = mfNameWithExt.substring(0, lastIndex);
				System.out.println("<tns:name>" + artefactName + "</tns:name>");
				System.out.println("<tns:type>.asd</tns:type>");
				System.out.println("<tns:artefactType>2</tns:artefactType>");
				System.out.println("</tns:resource>");
			}
		}
	}

	private static void screen(List sheetData) {
		for (int i = 0; i < sheetData.size(); i++) {
			List list = (List) sheetData.get(i);
			for (int j = 0; j < list.size(); j++) {
				HSSFCell cell = (HSSFCell) list.get(j);
				System.out.println("<tns:resource>");
				String mfNameWithExt = (String) cell.getStringCellValue();
				int lastIndex = mfNameWithExt.lastIndexOf(".");
				String artefactName = mfNameWithExt.substring(0, lastIndex);
				System.out.println("<tns:name>" + artefactName + "</tns:name>");
				System.out.println("<tns:type>.bfm</tns:type>");
				System.out.println("<tns:artefactType>13</tns:artefactType>");
				System.out.println("</tns:resource>");
			}
		}
	}
}