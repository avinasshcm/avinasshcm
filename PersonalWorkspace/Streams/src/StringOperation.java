import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;


public class StringOperation {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "good morning", "talk to you later", "will be right back");
       
        syso("Words with Space");
        words.stream().forEach(e -> System.out.println("  "+ e));
        
        syso("Words without Space");
        words.stream().forEach(System.out::println);
        
        syso("Exciting Words");
        words.stream().map(e -> e+"!").forEach(System.out::println);  
        
        syso("Eye Words");
        words.stream().map(e -> e.replace("i", "eye")).forEach(System.out::println);  
        
        syso("Uppercase Words");
        words.stream().map(e -> e.toUpperCase()).forEach(System.out::println);  
        
        syso("Words with less than 4 chars");
        words.stream().filter(e -> e.length() < 4).forEach(System.out::println);  
        
        syso("Words containing b");
        words.stream().filter(e -> e.contains("b")).forEach(System.out::println);  
        
        syso("Words with even length");
        words.stream().filter(e -> e.length() %2 == 0).forEach(System.out::println);  
        
        syso("Concat using Reduce");
        String concat = words.stream().reduce((e1,e2) -> e1.concat(e2).toUpperCase()).get();  
        System.out.println(concat);
        
        syso("Concat using Reduce with Comma");
        String concatWithComma = words.stream().collect(Collectors.joining(",")).toString();  
        System.out.println(concatWithComma);
        
        syso("Concat using Reduce with Comma");
        double[]  randomArray = new Random().doubles(5,0,1).toArray();  
        
        DoubleStream.of(randomArray).forEach(System.out::println);
        
        double[] num = {1.0,4.0,9.0,25.0,36.0,50.0};
        
        syso("Square Root");
        DoubleStream.of(num).map( Math::sqrt).forEach(System.out::println);;
        
        syso("Square Root in Parallel");
        DoubleStream.of(num).parallel().map( Math::sqrt).forEach(System.out::println);;
        
    }
    static void syso(String msg){
        System.out.println("\n---------------------------------------");
        System.out.println(msg);
        System.out.println("---------------------------------------");
    }
}
