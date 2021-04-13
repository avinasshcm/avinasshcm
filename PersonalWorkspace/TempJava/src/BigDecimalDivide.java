import java.math.BigDecimal;


public class BigDecimalDivide {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal USD = new BigDecimal(15);
		BigDecimal exRate = new BigDecimal( 1.9);
		
		BigDecimal EUR = USD.divide(exRate,BigDecimal.ROUND_UNNECESSARY);
		System.out.println(EUR );
	}
}
