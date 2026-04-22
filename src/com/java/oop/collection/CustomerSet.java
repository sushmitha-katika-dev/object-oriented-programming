package com.java.oop.collection;

import com.java.oop.comparator.CustomerEmailAscComparator;
import com.java.oop.comparator.CustomerIdAscComparator;
import com.java.oop.comparator.CustomerIdDescComparator;

import java.util.*;

import com.java.oop.model.Customer;
import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.Set;

public class CustomerSet {
    public static void main(String[] args) {
        Set<Customer> customers = new TreeSet<>(new CustomerEmailAscComparator());

        Customer customer1 = new Customer();
        customer1.setId(1111)
                .setName("customer1")
                .setAge(23)
                .setGender("female")
                .setEmail("katika@gmail.com")
                .setPassword("sushmitha@123")
                .setCity("hd");
        Customer customer2 = new Customer();
        customer2.setId(2222)
                .setName("customer2")
                .setAge(22)
                .setGender("female")
                .setEmail("katik2ea@gmail.com")
                .setPassword("Mani@123")
                .setCity("hd");
        Customer customer3 = new Customer();
        customer3.setId(3333)
                .setName("customer1")
                .setAge(23)
                .setGender("female")
                .setEmail("katika@gmail.com")
                .setPassword("sushmitha@123")
                .setCity("hd");

        Customer customer4 = new Customer();
        customer4.setId(4444)
                .setName("customer1")
                .setAge(23)
                .setGender("female")
                .setEmail("katika@gmail.com")
                .setPassword("sushmitha@123")
                .setCity("uppal");
        Customer customer5 = new Customer();
        customer5.setId(1111)
                .setName("customer1")
                .setAge(23)
                .setGender("female")
                .setEmail("katika@gmail.com")
                .setPassword("sushmitha@123")
                .setCity("uppal");

        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        System.out.println(customers);
        System.out.println(customers.size());

        //need insertion order use linkedHashSet
        //need natural sorting order use treeset
    }
}
