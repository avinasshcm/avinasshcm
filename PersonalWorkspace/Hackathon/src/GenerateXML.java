import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Calendar;

public class GenerateXML {

    static String templateHeader = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>" + "<batchTxns>" + "<controlSum>{0}</controlSum>";

    static String templateBody = "<legs><fixedRate1>{1}</fixedRate1><fixedRate2>{2}</fixedRate2></legs>";

    static String templateFooter = "</batchTxns>";

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StringBuilder sb = new StringBuilder();
        Double txnAmount = 10.00;
        Double chargeAmount = 2.00;
        int noOfTransactions = 1000;
        Double controlSum = (txnAmount + chargeAmount) * noOfTransactions;
        String strCtrlSum = controlSum.toString().replace(",", "");

        Object[] testArgs = { strCtrlSum, txnAmount, chargeAmount };

        MessageFormat header = new MessageFormat(templateHeader);
        sb.append(header.format(testArgs));

        MessageFormat body = new MessageFormat(templateBody);

        for (int i = 0; i < noOfTransactions; i++)

            sb.append(body.format(testArgs));

        MessageFormat footer = new MessageFormat(templateFooter);
        sb.append(footer.format(testArgs));
        String outputFileName = "C:\\Hackathon\\InFiles\\Hackathon_" + Calendar.getInstance().getTimeInMillis() + ".txt";

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(outputFileName));
            writer.append(sb.toString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
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
