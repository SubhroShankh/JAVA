import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        // LinkedHashMap
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);

        // HashMap
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        // print
        System.out.println(lhm);
        System.out.println(hm);
    }
}
