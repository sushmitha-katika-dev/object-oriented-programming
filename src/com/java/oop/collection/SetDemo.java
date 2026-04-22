package com.java.oop.collection;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        /*
        =========================================
        🔹 1. HashSet
        =========================================
        // Use: Fast operations (default)
        // Advantage: O(1) performance
        // Disadvantage: No order ❌ → LinkedHashSet solves this
        */

        // 1. Create Set
        Set<String> set = new HashSet<>();

        // 2. add() → Add elements
        set.add("Ravi");
        set.add("Anita");
        set.add("John");
        set.add("Ravi"); // duplicate (ignored)

        System.out.println("Set: " + set);

        // 3. contains()
        System.out.println("Contains Ravi: " + set.contains("Ravi"));

        // 4. remove()
        set.remove("John");
        System.out.println("After remove: " + set);

        // 5. size()
        System.out.println("Size: " + set.size());

        // 6. isEmpty()
        System.out.println("Is empty: " + set.isEmpty());

        //iterator
        /*Iterator iterator = set.iterator();
        //hasNext() -> check if there is next element
        //next() -> get next element
        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name.toUpperCase());
        }*/

        // 7. Iteration
        System.out.println("\nIterating:");
        for (String name : set) {
            System.out.println(name);
        }

        // 8. clear()
        set.clear();
        System.out.println("After clear: " + set);


        /*
        =========================================
        🔹 2. LinkedHashSet
        =========================================
        // Use: Maintain insertion order
        // Advantage: Ordered
        // Disadvantage: Slightly slower → HashSet faster
        */

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Ravi");
        linkedHashSet.add("Anita");
        linkedHashSet.add("John");

        System.out.println("\nLinkedHashSet (Ordered): " + linkedHashSet);


        /*
        =========================================
        🔹 3. TreeSet
        =========================================
        // Use: Sorted elements
        // Advantage: Automatic sorting
        // Disadvantage: Slower (O(log n)) → HashSet faster
        */

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Ravi");
        treeSet.add("Anita");
        treeSet.add("John");

        System.out.println("TreeSet (Sorted): " + treeSet);


        /*
        =========================================
        🔹 4. EnumSet
        =========================================
        // Use: Enum elements only
        // Advantage: Very fast + memory efficient
        // Disadvantage: Only enum allowed
        */

        enum Role { ADMIN, USER }

        Set<Role> enumSet = EnumSet.of(Role.ADMIN, Role.USER);
        System.out.println("EnumSet: " + enumSet);


        /*
        =========================================
        🔹 5. CopyOnWriteArraySet (Thread-safe)
        =========================================
        // Use: Thread-safe
        // Advantage: Safe in multithreading
        // Disadvantage: Slower → HashSet faster
        */

        Set<String> threadSafeSet = new java.util.concurrent.CopyOnWriteArraySet<>();
        threadSafeSet.add("Ravi");
        threadSafeSet.add("Anita");

        System.out.println("Thread-safe Set: " + threadSafeSet);


        /*
        =========================================
        🔥 FINAL RULE
        =========================================

        Default:
        Set<T> set = new HashSet<>();

        If:
        Need order      → LinkedHashSet
        Need sorting    → TreeSet
        Need enum       → EnumSet
        Need threads    → CopyOnWriteArraySet

        =========================================
        */
    }
}