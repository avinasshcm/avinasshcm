import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IBANHashCode {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO Auto-generated method stub

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\amanjuna\\Desktop\\ProdIBAN.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {

                int cdtrAcctHashCode = line.hashCode();

                int modRes = cdtrAcctHashCode % 25;
                int queueNum = Math.abs(modRes);
                String accHashCode = String.valueOf(queueNum);
                // System.out.println(accHashCode);

                if (hm.containsKey(accHashCode)) {
                    int counter = hm.get(accHashCode);
                    counter++;
                    hm.put(accHashCode, counter);
                } else {
                    hm.put(accHashCode, 1);
                }

            }
            printHashMap(hm);
        }
    }

    private static void printHashMap(HashMap<String, Integer> hm) {

        Iterator iterator = hm.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            System.out.println(pair.getKey() + "\t" + pair.getValue());
        }
        ;
    }
}
