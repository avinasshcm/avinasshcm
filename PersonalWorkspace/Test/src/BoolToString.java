import com.trapedza.bankfusion.servercommon.expression.builder.functions.ConvertToString;

public class BoolToString {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ConvertToString.run(Boolean.TRUE));
		System.out.println(ConvertToString.run(Boolean.FALSE));
	}
}
