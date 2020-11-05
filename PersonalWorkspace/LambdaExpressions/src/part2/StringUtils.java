package part2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StringUtils {

    static int eChecker(String s1, String s2) {
        int contains = 0;
        if (s1.contains("e") && !s2.contains("e")) {
            contains = -1;
        } else if (s2.contains("e") && !s1.contains("e")) {
            contains = 1;
        }
        return (contains);
    }

    static List<String> allMatches(List<String> l, Predicate<String> p) {
        List<String> newList = new ArrayList<String>();
        for (String item : l) {
            if (p.test(item))
                newList.add(item);
        }
        return newList;
    }
    
    
    static <T,R> List<R>  transformedList(List<T> l , Function<T,R> f){
        
        
        List<R> newList = new ArrayList<R>();
        for (T item : l) {
            newList.add(f.apply(item));
        }
        return newList;
    }
    
}
