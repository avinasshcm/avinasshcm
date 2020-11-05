package part1;
import java.util.Arrays;

public class StringSorting {

    public static void main(String[] args) {
        // String[] input = { "A", "DEF", "BC", "GHIJ", "KLMNO", "PQRSTU", "VWXYZ012" };

        String[] input = { "English", "German", "Italian", "Korean", "Blablablabla..","Egyptian" };


        System.out.println("Shortest to Longest");
        Arrays.sort(input, (s1, s2) -> s1.length() -s2.length());
        System.out.println(Arrays.asList(input));
        
        System.out.println("-----------------------------------");
        System.out.println("Longest to Shortest");
        Arrays.sort(input, (s1, s2) -> s2.length() -s1.length());
        System.out.println(Arrays.asList(input));
        
        System.out.println("-----------------------------------");
        System.out.println("Alphabetical Order");
        Arrays.sort(input);
        System.out.println(Arrays.asList(input));
        
        System.out.println("-----------------------------------");
        System.out.println("contains e firsts");
        Arrays.sort(input, (s1, s2) -> StringUtils.eChecker(s1, s2));
        
        
        System.out.println(Arrays.asList(input));
        
        
        System.out.println("-----------------------------------");
        System.out.println("Better String Longest");
        System.out.println(StringUtils.betterString("Avinash", "Avinash C M", (s1, s2) -> s1.length() > s2.length()));
        
        

        System.out.println("-----------------------------------");
        System.out.println("Better String Always First String");
        System.out.println(StringUtils.betterString("Avinash", "Avi", (s1, s2) -> true));

        
        
        System.out.println("-----------------------------------");
        System.out.println("Better Element Longest");
        System.out.println(ElementUtils.betterEntry  ("Avinash", "Avi", (s1, s2) -> true));

        
        System.out.println("-----------------------------------");
        System.out.println("Better Element Expensive Cars");
        Cars car1 = new Cars();
        car1.setName("Maruti");
        car1.setPrice(10000);
        Cars car2 = new Cars();
        car2.setName("Hyundai");
        car2.setPrice(20000);
        System.out.println(ElementUtils.betterEntry  (car1, car2, (c1, c2) -> car1.getPrice() > car2.getPrice() ).getName());

        
    }

}
