package part1;

public class ElementUtils {

    static int eChecker(String s1, String s2) {
        int contains = 0;
        if (s1.contains("e") && !s2.contains("e")) {
            contains = -1;
        } else if (s2.contains("e") && !s1.contains("e")) {
            contains = 1;
        }
        return (contains);
    }

    static <T> T betterEntry(T s1, T s2, TwoElementPredicate predicate) {
        if (predicate.better(s1, s2))
            return s1;
        else
            return s2;
    }
}
