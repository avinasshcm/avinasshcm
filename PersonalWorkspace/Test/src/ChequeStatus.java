public class ChequeStatus {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String status = "OUTCOMPLETED";
		if ((!status.equals("OUTCOMPLETED")) && (!status.equals("OUTENTERED")) && (!status.equals("OUTPRESENTED")))
			System.out.println("Success");
		System.out.println("Error");
	}
}
