package com.java.oop.collection;

import java.util.*;

public class MapDemo {

    public static void main(String[] args) {

        /*
        =========================================
        🔹 1. HashMap
        =========================================
        // Use: Fast access (default choice)
        // Advantage: O(1) performance
        // Disadvantage: No order ❌ → LinkedHashMap solves this

        /*

         */
        // 1. Create Map
        Map<Integer, String> map = new HashMap<>();

        // 2. put() → Add data
        map.put(1, "Ravi");
        map.put(2, "Anita");
        map.put(3, "John");

        System.out.println("Map: " + map);

        // 3. get() → Get value by key
        System.out.println("Get key 2: " + map.get(2));

        // 4. containsKey()
        System.out.println("Contains key 3: " + map.containsKey(3));

        // 5. containsValue()
        System.out.println("Contains value Ravi: " + map.containsValue("Ravi"));

        // 6. remove()
        map.remove(3);
        System.out.println("After remove: " + map);

        // 7. size()
        System.out.println("Size: " + map.size());

        // 8. isEmpty()
        System.out.println("Is empty: " + map.isEmpty());

        // 9. keySet()
        System.out.println("Keys: " + map.keySet());

        // 10. values()
        System.out.println("Values: " + map.values());

        // 11. entrySet() (IMPORTANT)
        System.out.println("\nIterating using entrySet:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 12. putIfAbsent()
        map.putIfAbsent(2, "NewName");
        map.putIfAbsent(4, "Kiran");
        System.out.println("After putIfAbsent: " + map);

        // 13. replace()
        map.replace(1, "Ravi Updated");
        System.out.println("After replace: " + map);

        // 14. clear()
        map.clear();
        System.out.println("After clear: " + map);

        /*
        =========================================
        🔹 2. LinkedHashMap
        =========================================
        */
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        // Use: Maintain insertion order
        // Advantage: Ordered data
        // Disadvantage: Slightly slower → HashMap faster

        /*
        =========================================
        🔹 3. TreeMap
        =========================================
        */
        Map<Integer, String> treeMap = new TreeMap<>();
        // Use: Sorted keys
        // Advantage: Automatic sorting
        // Disadvantage: Slower (O(log n)) → HashMap faster

        /*
        =========================================
        🔹 4. Hashtable (Legacy)
        =========================================
        */
        Map<Integer, String> hashtable = new Hashtable<>();
        // Use: Thread-safe (old way)
        // Advantage: Safe in multithreading
        // Disadvantage: Slow → ConcurrentHashMap better

        /*
        =========================================
        🔥 FINAL RULE
        =========================================

        Default:
        Map<K,V> map = new HashMap<>();

        If:
        Need order      → LinkedHashMap
        Need sorting    → TreeMap
        Need threads    → ConcurrentHashMap
        Need enum keys  → EnumMap
        Need caching    → WeakHashMap

        =========================================
        */


    }
}