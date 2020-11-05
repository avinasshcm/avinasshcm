import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestMessageFormat {

  public static void main(String[] args) {
    Double planet = 700.12D* 18D;
    String event = "a disturbance in the Force";

    String result = MessageFormat.format(
        "At {1,time} on {1,date}, there was {2} on planet {0}.",
        String.valueOf(planet), new Date(), event);
    
        
    String modifiedDate= new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    
    System.out.println(modifiedDate);

  }

}
