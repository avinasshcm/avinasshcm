import java.math.BigDecimal;
import java.util.Currency;

public class MoneyMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Money mn = new Money(new BigDecimal(100), Currency.getInstance("IQD"));
        System.out.println(mn.getAmount());

    }

}
