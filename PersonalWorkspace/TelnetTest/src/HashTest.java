

public class HashTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printHashCode("A1");
		printHashCode("A2");
		printHashCode("A3");
		printHashCode("A4");
		printHashCode("A5");
		printHashCode("A6");
		printHashCode("A7");
		printHashCode("A8");
		printHashCode("A9");
		printHashCode("A10");
	}
 public  static  void printHashCode (String str){
	 int hashCode = str.hashCode();
     hashCode = hashCode < 0 ? (-1 * hashCode) : hashCode;
     int consumerId = hashCode % 10;
     System.out.println(str + " G" + consumerId);
 }
}
