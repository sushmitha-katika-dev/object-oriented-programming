package com.java.oop;

public class Customer {
    public int id;
    public String name;
    public int age;
    public String address;
    public String phoneNumber;

    public Customer(){
        System.out.println("No-Arg constructor with somevalues");
    }

    public Customer(int id, String name, int age, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        System.out.println("Arg-constructor");
    }
}
