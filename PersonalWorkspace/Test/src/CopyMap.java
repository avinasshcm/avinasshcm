import java.util.HashMap;
import java.util.Map;

public class CopyMap {

    public static void main(String[] args) throws Exception {
        Map<String, String> eventMap = new HashMap<>();
        eventMap.put("1", "1");
        eventMap.put("2", "2");
        eventMap.put("3", null);

        
        System.out.println("******** OldMap *********");
        
        for (Map.Entry<String, String> entry : eventMap.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
        
        
        Map<String, String> newMap = new HashMap<>();

        for (Map.Entry<String, String> entry : eventMap.entrySet()) {
            if (entry.getValue() != null) {
                newMap.put(entry.getKey(), entry.getValue());
            }
        }

        System.out.println("******** NewMap *********");
        
        for (Map.Entry<String, String> entry : newMap.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

    }

}
