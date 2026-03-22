package com.java.oop;

public class Customer {
    public int id;
    public String name;
    public int age;
    public String address;
    public String phoneNumber;
    public String accountNumber;
    public boolean isActive;
    static String companyName = "Amazon";



    public Customer(){
        System.out.println("No-Arg constructor with some values");
    }

    public Customer(int id, String name, int age, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        System.out.println("Arg constructor with some values");
    }

    void displayCustomerDetails(){
        System.out.println("======Customer Profile Display======");
        System.out.println("Customer Id: "+id);
        System.out.println("Customer Name: "+name);
        System.out.println("Customer Age: "+age);
        System.out.println("Customer Address: "+address);
        System.out.println("Customer Phone Number: "+phoneNumber);
        System.out.println("------------------------------------");

    }

    boolean updateCustomerAddress(String newAddress){
        if(newAddress != null && !newAddress.isEmpty()){
            this.address = newAddress;
            return true;
        }
        return  false;
    }

    boolean isCustomerActive(){
        return isActive;
    }

    void deactivateAccount(){
        this.isActive = false;
        System.out.println("Account deactivated successfully");
   }

    boolean validateContactDetails() {
        return phoneNumber != null && phoneNumber.length() ==10;
    }

}
