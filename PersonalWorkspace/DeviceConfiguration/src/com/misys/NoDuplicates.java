package com.misys;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NoDuplicates {

    private static final String FILE_NAME = "C:\\Users\\amanjuna\\Desktop\\09May17\\Client_IP.xlsx";

    public static void main(String[] args) {
        List<String> ipList = new ArrayList<String>();
        try {
            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheet("Sheet2");
            Iterator<Row> iterator = datatypeSheet.iterator();

            while (iterator.hasNext()) {
                Row currentRow = iterator.next();
                // System.out.println(currentRow.getCell(0).toString());
                ipList.add(currentRow.getCell(0).toString());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ipList.stream().distinct().sorted().parallel().forEach(System.out::println);
    }

}
