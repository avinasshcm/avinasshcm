package part2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ElementUtils {

    static <T> List<T> allMatches(List<T> l, Predicate<T> p) {
        List<T> newList = new ArrayList<T>();
        for (T item : l) {
            if (p.test(item))
                newList.add(item);
        }
        return newList;
    }
}
