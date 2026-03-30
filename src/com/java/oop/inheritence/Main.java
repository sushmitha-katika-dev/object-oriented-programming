package com.java.oop.inheritence;

public class Main {
    public static void main(String[] args) {
        InheritedCustomer inheritCustomer = new InheritedCustomer(1,"sushmitha",
                "katika@gmail","9396929429",
                (byte) 21,'F',"Gold",
                15.5,200);
        inheritCustomer.displayCustomerDetails();
    }
}
