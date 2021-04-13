import java.text.SimpleDateFormat;
import java.util.Date;

public class NullDate {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Date d = new Date();

        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm");
        System.out.println(sdf.format(d))
        ;
        
    }

}
