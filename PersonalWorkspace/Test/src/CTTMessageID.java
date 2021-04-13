import java.text.DecimalFormat;

public class CTTMessageID {

    // private static long lNum = 123456789011234L;

    // private static final String numberr = "123456789123456";

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        float floatNum = 123456789011234L;
        System.out.println("Float");
        extractMessageId(floatNum);

        long longNum = 123456789011234L;
        System.out.println("\n\nLong");
        extractMessageId(longNum);

        // System.out.println("Before Fix : " + beforeFix(numberr));
        // System.out.println("After  Fix : " + afterFix(numberr));
    }

    private static void extractMessageId(float lNum) {
        System.out.println("int To String " + Double.toString((double) lNum));

        DecimalFormat df = new DecimalFormat("#");
        df.setMaximumFractionDigits(8);
        System.out.println(lNum);
        System.out.println(df.format((long) lNum));
    }

    private static void extractMessageId(long lNum) {
        System.out.println("int To String " + Double.toString((double) lNum));

        DecimalFormat df = new DecimalFormat("#");
        df.setMaximumFractionDigits(8);
        System.out.println(lNum);
        System.out.println(df.format((long) lNum));
    }

    static String beforeFix(String number) {

        Long num = Long.valueOf(number);
        System.out.println(num);
        String messageid = String.valueOf(num);
        String msgIdValue = String.valueOf(messageid).split("\\.")[0];
        return msgIdValue;
    }

    static String afterFix(String number) {
        int num = Integer.valueOf(number);
        System.out.println(num);
        Double messageidDouble = new Double(num);

        String msgIdValue = String.valueOf(messageidDouble.intValue());
        return msgIdValue;
    }
}
