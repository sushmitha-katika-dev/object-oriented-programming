package com.java.oop;

public class Customer {
    public int id;
    public String name;
    public int age;
    public String address;
    public String phoneNumber;
    public String accountNumber;
    public boolean isActive;

    public Customer(){
        System.out.println("No-Arg constructor with somevalues");
    }

    public Customer(int id, String name, int age, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;

        System.out.println("--------------------");
        System.out.println("Arg-constructor");

    }

    void printCustomerDetails(){
        System.out.println("Customer Profile Display");
        System.out.println("Customer Id: "+id);
        System.out.println("Customer Name: "+name);
        System.out.println("Customer Age: "+age);
        System.out.println("Customer Address: "+address);
        System.out.println("Customer Phone Number: "+phoneNumber);
        System.out.println();

    }

    void updateCustomerAddress(String updateAddressTo){
        address = updateAddressTo;
        System.out.println("updated Customer Address to: "+updateAddressTo);
        System.out.println();
    }

    boolean isCustomerActive(){
        return isActive;
    }

    void accountDeactivate(String deactivateAccountNumber){
        System.out.println("Account Deactivated..");
   }

    boolean validateContactDetails() {
        return false;
    }

}
