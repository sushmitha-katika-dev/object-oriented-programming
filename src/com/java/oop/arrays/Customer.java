package com.java.oop.arrays;

public class Customer {
    public int id;
    public String name;
    public String email;
    public String phoneNumber;
    public byte age;
    public char gender;

    public Customer(int id, String name, String email, String phoneNumber, byte age, char gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.gender = gender;
    }

    public void getCustomers(){
        System.out.println("----------Customer Profile Display----------");
        System.out.println("Customer Id: "+id);
        System.out.println("Customer Name: "+name);
        System.out.println("Customer Email: "+email);
        System.out.println("Customer Phone Number: "+phoneNumber);
        System.out.println("Customer Age: "+age);
        System.out.println("Customer Gender: "+gender);

    }
}
