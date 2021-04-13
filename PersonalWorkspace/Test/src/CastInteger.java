public class CastInteger {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Object userDefinedfld = 1234;
		int documentNumber = ((Integer) userDefinedfld).intValue();
		System.out.println(documentNumber);
	}
}
