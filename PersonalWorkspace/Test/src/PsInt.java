

public class PsInt {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String numbe = "999999999";
        Double nu = Double.valueOf(numbe);

        System.out.println(String.valueOf(nu));
        Double num = Double.valueOf(String.valueOf(nu));

        System.out.println(num);
        System.out.println(String.valueOf(num.intValue()));
        /*
         * String msgId = "7.2580126E7"; int mgId = Integer.parseInt(msgId); System.out.println(mgId);
         */

    }

}
