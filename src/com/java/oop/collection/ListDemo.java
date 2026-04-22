package com.java.oop.collection;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        /*
        =========================================
        🔹 1. ArrayList
        =========================================
        // Use: Fast random access
        // Advantage: O(1) get()
        // Disadvantage: Slow insert/delete in middle ❌ → LinkedList solves this
        */

        // 1. Create List
        List<String> list = new ArrayList<>();

        // 2. add()
        list.add("Ravi");
        list.add("Anita");
        list.add("John");
        list.add("Ravi"); // duplicates allowed

        System.out.println("List: " + list);

        // 3. get()
        System.out.println("Get index 1: " + list.get(1));

        // 4. set()
        list.set(1, "Anita Updated");
        System.out.println("After set: " + list);

        // 5. remove()
        list.remove(2); // by index
        System.out.println("After remove: " + list);

        // 6. contains()
        System.out.println("Contains Ravi: " + list.contains("Ravi"));

        // 7. size()
        System.out.println("Size: " + list.size());

        // 8. isEmpty()
        System.out.println("Is empty: " + list.isEmpty());

        // 9. iteration
        System.out.println("\nIterating:");
        for (String name : list) {
            System.out.println(name);
        }

        // 10. clear()
        list.clear();
        System.out.println("After clear: " + list);


        /*
        =========================================
        🔹 2. LinkedList
        =========================================
        // Use: Frequent insert/delete
        // Advantage: Fast insert/delete
        // Disadvantage: Slow random access ❌ → ArrayList faster
        */

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Ravi");
        linkedList.add("Anita");
        linkedList.add("John");

        System.out.println("\nLinkedList: " + linkedList);


        /*
        =========================================
        🔹 3. Vector (Legacy)
        =========================================
        // Use: Thread-safe (old way)
        // Advantage: Synchronized
        // Disadvantage: Slow ❌ → ArrayList faster
        */

        List<String> vector = new Vector<>();
        vector.add("Ravi");
        vector.add("Anita");

        System.out.println("Vector: " + vector);


        /*
        =========================================
        🔹 4. Stack (LIFO)
        =========================================
        // Use: Last-In-First-Out
        // Advantage: Stack operations
        // Disadvantage: Legacy → use Deque instead
        */

        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Stack: " + stack);
        System.out.println("Pop: " + stack.pop());


        /*
        =========================================
        🔥 FINAL RULE
        =========================================

        Default:
        List<T> list = new ArrayList<>();

        If:
        Need fast access     → ArrayList
        Need frequent insert → LinkedList
        Need thread-safe     → Vector (or better use Collections.synchronizedList)
        Need stack behavior  → Stack (or Deque)

        =========================================
        */
    }
}