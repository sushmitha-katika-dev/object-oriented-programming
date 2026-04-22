package com.java.oop.collection;

import com.java.oop.model.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(1111)
                .setName("customer1")
                .setAge(23)
                .setGender("female")
                .setEmail("katika@gmail.com")
                .setPassword("sushmitha@123")
                .setCity("hd");



        System.out.println("Id : " + customer.getId());
        System.out.println("Name :" + customer.getName());
        System.out.println("Email : " + customer.getEmail());
        System.out.println("Phone No : " + customer.getAge());
        System.out.println("Address : " + customer.getCity());

        System.out.println(customer);
        /* classtype@hashcode
         * com.java.oop.model.Customer@448139f0
         * */


    }
}