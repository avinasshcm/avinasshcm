package ctt;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import utils.ReadTemplate;

public class GenerateIncomingCancFile {

    private static final String CdtrIBAN = "PT50019300001010177571535";
    private static final String TPTBIC = "BCOMPTPL";
    private static final String CTTBIC = "CTTVPTPLXXX";
    private static final String SIBSBIC = "SISRPTPL";

    public static void main(String[] args) {

        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        String timestamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        //System.out.println(date);
        //System.out.println(timestamp);
        String mainTemplate = ReadTemplate.readFileAsString("Templates\\S2SCT06-20200221.S_Main_009.xml");
        String cancTemplate = ReadTemplate.readFileAsString("Templates\\S2SCT06-20200221.S_Canc_009.xml");
        BufferedWriter writer = null;
        writeToFile(writer, "C:\\Users\\amanjuna\\Desktop\\MPM_SIT\\Deloitte_QUA\\S2SCT06.M." + timestamp + ".xml",
            replaceParameters(mainTemplate, date, timestamp));

        writeToFile(writer, "C:\\Users\\amanjuna\\Desktop\\MPM_SIT\\Deloitte_QUA\\S2SCT06.C." + timestamp + ".xml",
            replaceParameters(cancTemplate, date, timestamp));

        // System.out.println(mainTemplate);
    }

    private static String replaceParameters(String template, String date, String timestamp) {

        template = template.replaceAll("\\{SIBSBIC\\}", SIBSBIC);
        template = template.replaceAll("\\{CTTBIC\\}", CTTBIC);
        template = template.replaceAll("\\{UniqueID\\}", timestamp);
        template = template.replaceAll("\\{Date\\}", date);
        template = template.replaceAll("\\{TPTBIC\\}", TPTBIC);
        template = template.replaceAll("\\{CdtrIBAN\\}", CdtrIBAN);
        return template;
    }

    public static void writeToFile(BufferedWriter writer, String filePath, String message) {
        try {
            File inXML = new File(filePath);
            // This will output the full path where the file will be written to...
            System.out.println(inXML.getCanonicalPath());
            writer = new BufferedWriter(new FileWriter(inXML));
            writer.write(message);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the writer regardless of what happens...
                writer.close();
            } catch (Exception e) {
                System.out.println("finally block pain002");
                e.printStackTrace();
            }
        }
    }
}
