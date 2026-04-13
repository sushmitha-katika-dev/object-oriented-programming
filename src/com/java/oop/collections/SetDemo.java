package com.java.oop.collections;

import java.util.Set;
import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(23);
        set.add(25);
        set.add(34);

        set.add(43);
        System.out.println(set);
        set.remove(23);
        System.out.println(set);

        for(int num : set){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.println(set.isEmpty());
        System.out.println(set.size());
    }
}
