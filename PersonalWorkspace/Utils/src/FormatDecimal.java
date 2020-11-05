import java.math.BigDecimal;
import java.text.DecimalFormat;

public class FormatDecimal {

    public static void main(String[] args) {
        String amt = "1989.7220";

float amt1 = Float.valueOf(amt);
        
     
        String str3 = String.format("My answer is %15.5f", amt1); 
        System.out.println(str3);

    }

}
