public class Split {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String accountIdentifier = "%BRANCH%00000001%DDPMTSETTLEMENT1";
		String[] accountTokens = accountIdentifier.split("%");
		String contextValue = accountTokens.length > 0 ? accountTokens[0] : "";
		String pNameComponent = accountTokens.length > 1 ? accountTokens[1] : "";
		System.out.println("Context Value " + contextValue);
		System.out.println("Component " + pNameComponent);
		;
	}
}
