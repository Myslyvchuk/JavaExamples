package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class Collections {
    public static void main(String[] args) {
        List<Object> array = new ArrayList<Object>();
        System.out.println("Array " + getTimeMsOfInsert(array));
        List<Object> linked = new LinkedList<Object>();
        System.out.println("linked " + getTimeMsOfInsert(linked));
        List<Object> vector = new Vector<Object>();
        System.out.println("vector " + getTimeMsOfInsert(vector));
        List<Object> stack = new Stack<Object>();
        System.out.println("stack " + getTimeMsOfInsert(stack));

        Set<Object> hashSet = new HashSet<Object>();
        System.out.println("hashSet " + getTimeMsOfInsert(hashSet));
        Set<Object> linkedHashSet = new LinkedHashSet<Object>();
        System.out.println("linkedHashSet " + getTimeMsOfInsert(linkedHashSet));
        // Set<String> treeSet = new TreeSet<String>();
        // System.out.println("treeSet " + getTimeMsOfInsert(treeSet));

        Map<Object, Object> hashMap = new HashMap<Object, Object>();
        System.out.println("hashMap " + getTimeMsOfInsert(hashMap));
        Map<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
        System.out.println("linkedHashMap " + getTimeMsOfInsert(linkedHashMap));
        Map<Object, Object> hashTable = new Hashtable<Object, Object>();
        System.out.println("hashTable " + getTimeMsOfInsert(hashTable));
        // Map<Object, Object> treeMap = new TreeMap<Object, Object>();
        // // System.out.println("treeMap " + getTimeMsOfInsert(treeMap));

        // null insertion and read - NPE it is not allowed to put null in map or set
        List<String> arrayString = new ArrayList<>();
        addToCollection(arrayString);
        List<String> linkedString = new LinkedList<>();
        addToCollection(linkedString);
//        Set<String> hashSetString = new HashSet<>();
//        addToCollection(hashSetString);
//        Set<String> linkedHashSetString = new LinkedHashSet<>();
//        addToCollection(linkedHashSetString);
//        Set<String> treeSetString = new TreeSet<>();
//        addToCollection(treeSetString);
//        Map<String, Object> hashMapString = new HashMap<>();
//        addToMap(hashMapString);
//        Map<String, Object> linkedHashMapString = new LinkedHashMap<>();
//        addToMap(linkedHashMapString);
//        Map<String, Object> treeMapString = new TreeMap<>();
//        addToMap(treeMapString);
    }

    private static void addToMap(Map<String, Object> hashMapString) {
        hashMapString.put(null, null);
        hashMapString.put(null, null);
        hashMapString.put("key", null);
    }

    private static void addToCollection(Collection<String> linkedHashSetString) {
        linkedHashSetString.add(null);
        linkedHashSetString.add(null);
        linkedHashSetString.add("value");
    }

    public static long getTimeMsOfInsert(Collection<? super Object> collection) {
        return getInsertTime(collection);
    }

    public static long getTimeMsOfInsert(Map<Object, Object> map) {
        return getInsertTime(map);
    }

    private static long getInsertTime(Collection<? super Object> collection) {
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            collection.add(new String());
        }
        return (System.nanoTime() - start) / 100;
    }

    private static long getInsertTime(Map<? super Object, ? super Object> map) {
        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            map.put(new Object(), new Object());
        }
        return (System.nanoTime() - start) / 100;
    }
}
