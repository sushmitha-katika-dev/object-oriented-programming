package com.java.oop.inheritence;

import com.java.oop.arrays.Customer;

public class InheritedCustomer extends Customer {

    public String membershipType;
    public double discountRate;
    public int rewardPoints;

    public InheritedCustomer(int id, String name, String email, String phoneNumber, byte age, char gender, String membershipType, double discountRate, int rewardPoints) {
        super(id, name, email, phoneNumber, age, gender);
        this.membershipType = membershipType;
        this.discountRate = discountRate;
        this.rewardPoints = rewardPoints;
    }

    public void displayCustomerDetails(){
        getCustomers();
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Discount Rate: " + discountRate);
        System.out.println("Reward Points: " + rewardPoints);
    }
}
