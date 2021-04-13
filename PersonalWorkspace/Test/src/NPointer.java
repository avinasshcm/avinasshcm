public class NPointer {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = null;
		try {
			a.length();
		}
		catch (Exception e) {
			if (e.getLocalizedMessage() == null) {
				System.out.println("Object Null");
			}
			System.out.println("getLocalizedMessage " + e.getLocalizedMessage());
			System.out.println("getMessage " + e.getMessage());
			System.out.println("toString " + e.toString());
		}
	}
}
