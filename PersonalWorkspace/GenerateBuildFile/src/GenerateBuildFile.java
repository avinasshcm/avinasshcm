import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class GenerateBuildFile {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        PrintWriter out = new PrintWriter(new FileWriter("BuildFile.txt", false));
        out.close();
        Properties prop = new Properties();
//        prop
        String filename = "Artefacts.xls";
        List oldMFList = new ArrayList();
        List newMFList = new ArrayList();
        List oldScreenList = new ArrayList();
        List newScreenList = new ArrayList();
        List newASDList = new ArrayList();
        List xsdList = new ArrayList();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(filename);
            HSSFWorkbook workbook = new HSSFWorkbook(fis);
            HSSFSheet oldMFSheet = workbook.getSheet("Microflow Old");
            HSSFSheet newMFSheet = workbook.getSheet("Microflow New");
            HSSFSheet oldScreenSheet = workbook.getSheet("BFM Old");
            HSSFSheet newScreenSheet = workbook.getSheet("BFM New");
            HSSFSheet newASDSheet = workbook.getSheet("ActivitySteps New");
            HSSFSheet xsdSheet = workbook.getSheet("XSD");
            oldMFList = iterateCells(oldMFSheet);
            newMFList = iterateCells(newMFSheet);
            oldScreenList = iterateCells(oldScreenSheet);
            newScreenList = iterateCells(newScreenSheet);
            newASDList = iterateCells(newASDSheet);
            xsdList = iterateCells(xsdSheet);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                fis.close();
            }
        }
        xsdPublish(xsdList);
        activityStepPublish(newASDList);
        microflowRepublish(oldMFList);
        microflowpublish(newMFList);
        screenRepublish(oldScreenList);
        screenpublish(newScreenList);

        // System.out.println("File Generated......!!!!");
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
                // System.out.println("Cell Number" + cell.getCellNum());
                if (!cell.getStringCellValue().isEmpty())
                    data.add(cell);
            }
            sheetData.add(data);
        }
        return sheetData;
    }

    private static void microflowRepublish(List sheetData) throws IOException {
        publish(true, sheetData, "[GenerateMicroFlowCode]", "[RePublishMicroFlow]");
    }

    private static void microflowpublish(List sheetData) throws IOException {
        publish(true, sheetData, "[GenerateMicroFlowCode]", "[PublishMicroFlow]");
    }

    private static void activityStepPublish(List sheetData) throws IOException {
        publish(true, sheetData, "[GenerateActivityStepCode]", "[PublishActivityStep]");
    }

    private static void screenpublish(List sheetData) throws IOException {
        publish(false, sheetData, "", "[PublishScreen]");
    }

    private static void screenRepublish(List sheetData) throws IOException {
        publish(false, sheetData, "", "[RePublishScreen]");
    }

    private static void xsdPublish(List sheetData) throws IOException {
        publish(false, sheetData, "", "[PublishAttributeTypeDescriptor]");
    }

    private static void publish(Boolean generate, List sheetData, String generateTagName, String publishTagName) throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("BuildFile.txt", true));
        for (int i = 0; i < sheetData.size(); i++) {
            List list = (List) sheetData.get(i);
            for (int j = 0; j < list.size(); j++) {
                HSSFCell cell = (HSSFCell) list.get(j);
                if (generate) {
                    out.println(generateTagName);
                    out.println("/" + (String) cell.getStringCellValue());
                }
                out.println(publishTagName);
                out.println("/" + (String) cell.getStringCellValue());
            }
        }
        out.close();
    }
}