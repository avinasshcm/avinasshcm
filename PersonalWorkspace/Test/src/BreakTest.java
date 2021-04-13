public class BreakTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int i = 0;
        int n = 10;
        while (i < n) {
            try {
                switch (i) {
                case 0:
                    System.out.println(i);
                    break;
                case 1:
                    System.out.println(i);
                    break;
                case 2:
                    System.out.println(i);
                    break;
                case 3:
                    System.out.println(i);
                    break;
                case 4:
                    System.out.println(i);
                    String a = null;
                    a.length();
                    break;
                case 5:
                    System.out.println(i);
                    break;
                case 6:
                    System.out.println(i);
                    break;
                case 7:
                    System.out.println(i);
                    break;
                case 8:
                    System.out.println(i);
                    break;
                case 9:
                    System.out.println(i);
                    break;

                }
            } catch (Exception e) {
                e.printStackTrace();
                i=n;
                //break;
            }
            i++;
        }

    }
}
