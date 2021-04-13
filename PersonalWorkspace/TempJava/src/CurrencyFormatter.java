import java.text.DecimalFormat;

public class CurrencyFormatter {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double amount = 2000000.1;
		System.out.println(String.format("%,.2f", amount));
		System.out.println(priceWithoutDecimal(amount));
	}
	
	public static String priceWithoutDecimal (Double price) {
	    DecimalFormat formatter = new DecimalFormat("###,###,###.##");
	    return formatter.format(price);
	}
}
