package file.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import pojo.FieldsDescriptor;

public class FileUtilsHelper {

    public static HashMap<String, FieldsDescriptor> readFileAsString(String fileName) {
        HashMap<String, FieldsDescriptor> hm = new HashMap<String, FieldsDescriptor>();
        try {
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
                FieldsDescriptor fd = extractResults(line);
                hm.put(fd.ISIN_Div_Payout, fd);
                stringBuffer.append("\n");
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }

        return hm;
    }

    private static FieldsDescriptor extractResults(String line) {
        FieldsDescriptor fd = new FieldsDescriptor();
        if (line != null && !line.isEmpty() && line.contains(";")) {
            String[] list = line.split(";");
            fd.setSchemeCode(list[0]);
            fd.setISIN_Div_Payout(list[1]);
            fd.setISIN_Div_Reinvestment(list[2]);
            fd.setScheme_Name(list[3]);
            fd.setNetAssetValue(list[4]);
            fd.setDate(list[5]);
        }
        return fd;
    }

    public static void writeToFile(String fileName, String text) {
        try {
            FileWriter fw = new FileWriter(fileName);
            fw.write(text);
            fw.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(0);
        }
    }
}
