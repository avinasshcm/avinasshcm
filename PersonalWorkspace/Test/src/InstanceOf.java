import java.util.Calendar;

public class InstanceOf {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String a = "Test";
        String b = "Test";
        long startInstance = Calendar.getInstance().getTimeInMillis();
        if (a instanceof String) {
            System.out.println("Instance Of");
        }
        long EndInstance = Calendar.getInstance().getTimeInMillis();
        long startGetName = Calendar.getInstance().getTimeInMillis();
        if (b.getClass().getName().equals(String.class.getName())) {
            System.out.println("Get Name");
        }
        long endGetName = Calendar.getInstance().getTimeInMillis();

        System.out.println("InstanceOf " + (EndInstance - startInstance));
        System.out.println("Get Name " + (endGetName - startGetName));
    }

}
