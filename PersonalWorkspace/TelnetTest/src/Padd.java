import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Padd {
	/**
	 * @param args
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 */
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		String paddedIndex = String.format("%02d", 1);
		System.out.println(paddedIndex);
		Padd p = new Padd();
		p.listMethods();
	}

	public Padd() {
	}

	public void listMethods() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Method[] getter = this.getClass().getDeclaredMethods();
		for (Method item : getter) {
			System.out.println(item.getName());
			if (item.getName().contains("met")) {
				item.invoke(this);
			}
			if (item.getName().contains("set")) {
				item.invoke(this, 100);
			}
		}
		for (int i = 1; i <= 3; i++) {
			Method getter1 = this.getClass().getMethod("met" + i, new Class[] {});
			String.valueOf(getter1.invoke(this));
		}
		Method setter1 = this.getClass().getMethod("set", new Class[] {});
		String.valueOf(setter1.invoke(this));
	}

	public static void met1() {
		System.out.println("1");
	}

	public static void met2() {
		System.out.println("2");
	}

	public static void met3() {
		System.out.println("3");
	}

	public static void set1(int i) {
		System.out.println(i);
	}
}
