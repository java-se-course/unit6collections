package com.epam.course.java.se;

import org.junit.Test;

import java.util.*;

public class Maps {
    @Test
    public void test1() {
        final Map<String, String> map = new HashMap<>();

        // []
        System.out.println(map.put("key1", "value1_1"));
        // ["key1" -> "value1_1"]
        System.out.println(map.put("key1", "value1_2"));
        // ["key1" -> "value1_2"]
        System.out.println(map.get("key1"));

        map.put("key1", null);
        System.out.println(map.containsKey("key1"));
        System.out.println(map.get("key1"));
        System.out.println(map.get("key_not_exists"));
        System.out.println(map.remove("key_not_exists"));

    }

    @Test
    public void test2() {
        final Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        map.put("key4444", "value4");
        map.put("key4445", "value4");
        map.put("key5", "value5");

        for (String key : map.keySet()) {
            System.out.printf("%s -> %s\n", key, map.get(key));
//            if (key.length() > 4) {
//                map.put(key, "new value");
//            }
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.printf("%s -> %s\n", entry.getKey(), entry.getValue());
            if (entry.getKey().length() > 4) {
//                map.put(entry.getKey(), entry.getKey() + "#" + entry.getValue());
                entry.setValue(entry.getKey() + "#" + entry.getValue());
            }
        }
    }

    @Test
    public void linked() {
        final LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("D", "1");
        map.put("A", "2");
        map.put("C", "3");
        map.put("B", "4");
        map.put("D", "5");
        map.put("F", "6");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    @Test
    public void treeMap_nulls() {
        final TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put(null, "null");
        System.out.println(treeMap);
    }

    @Test
    public void hashMap_nulls() {
        final Map<String, String> treeMap = new HashMap<>();
        treeMap.put(null, "null");
        System.out.println(treeMap);
    }

    @Test
    public void treeSet_nulls() {
        final TreeSet<String> set = new TreeSet<>();
        set.add(null);
        System.out.println(set);
    }

    @Test
    public void hashSet_nulls() {
        final Set<String> set = new HashSet<>();
        set.add(null);
        System.out.println(set);
    }
}
