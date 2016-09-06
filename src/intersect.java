import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.*;
/**
 * Created by Jakob on 01-09-2016.
 */
public class intersect {

    public static void main(String[] args) {

        Map<String, Integer> m1 = new HashMap<>();

        m1.put("Janet",87);
        m1.put("Logan", 62);
        m1.put("Whitaker",46);
        m1.put("Alyssa",100);
        m1.put("Stefanie",80);
        m1.put("Jeff",88);
        m1.put("Kim",52);
        m1.put("Sylvia",95);


        Map<String, Integer> m2 = new HashMap<>();

        m2.put("Logan", 62);
        m2.put("Kim",52);
        m2.put("Whitaker",52);
        m2.put("Jeff",88);
        m2.put("Stefanie",80);
        m2.put("Brian",60);
        m2.put("Lisa",83);
        m2.put("Sylvia",87);

        System.out.println(intersection(m1, m2));
    }

    public static Map<String, Integer> intersection (Map<String, Integer> m1, Map<String, Integer> m2){


            Map<String, Integer> arnold = new HashMap<String, Integer>();

            Iterator<String> keyFirstItr = m1.keySet().iterator();

            while (keyFirstItr.hasNext()) {
                String keyTemp = keyFirstItr.next();

                if (m1.get(keyTemp).equals(m2.get(keyTemp))) {
                    arnold.put(keyTemp, m1.get(keyTemp));
                }

            }
            return arnold;
        }

}
