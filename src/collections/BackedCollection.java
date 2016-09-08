package collections;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class BackedCollection {
    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<String, String>();
        HashMap<String, Integer> hash = new LinkedHashMap<String, Integer>();
        Hashtable<String, Integer> hashTable = new Hashtable<String, Integer>();
        hash.put("FB", 1);
        hash.put(null, 1);
        map.put("a", "ant");
        map.put("d", "dog");
        map.put("h", "horse");
        hashTable.put("Ea", 1);
        System.out.println(map +"0--------" );
        SortedMap<String, String> submap;
        submap = map.subMap("a", "z"); // #1 create a backed collection RANGE ON KEY FROM B-M
        System.out.println(map + " " + submap +"1--------"); // #2 show contents
        map.put("b", "bat"); // #3 add to original
        submap.put("f", "fish"); // #4 add to copy
        map.put("r", "raccoon"); // #5 add to original - out of range
        // submap.put("p", "pig"); // #6 add to copy - out of range
        System.out.println(map + " " + submap+"2--------"); // #7 show final contents
        System.out.println(map + " map--------"); // #7 show final contents
        System.out.println(submap+"submap--------"); // #7 show final contents
        map.put("g", "gireafe");
        submap.put("ha", "gireafe");
        System.out.println(map + " map--------"); // #7 show final contents
        System.out.println(submap+"submap--------"); // #7 show final contents
        
        BigDecimal a = new BigDecimal(1);
        BigDecimal b = new BigDecimal(0.2f);

        
        Set<String> set = new LinkedHashSet<String>();
        set.add("FB");
        set.add("Ea");
    }
}
