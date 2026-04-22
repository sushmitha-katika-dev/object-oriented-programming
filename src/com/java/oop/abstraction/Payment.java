package com.java.oop.abstraction;

public abstract class Payment {

    String id;
    String customerName;
    String paymentDate;
    String mode;

    public Payment(String id, String customerName, String paymentDate, String mode) {
        this.id = id;
        this.customerName = customerName;
        this.paymentDate = paymentDate;
        this.mode = mode;
    }
    /*
    🛒 E-commerce (Amazon-like) System
👉 Models an online shopping system with cart, discount, and payment flow.

Features:

Product hierarchy (Electronics, Clothing)
Cart system with multiple products
Discount strategies (Festival, Premium)
Payment integration (UPI, Card)
OrderService to manage checkout process Final Project: Mini Amazon System (Products + Orders + Payments)
👉 This will make you placement ready 💯
     */

    public abstract boolean pay(double amount);

    //concrete methods (non-abstract method)
    public void otpValidation(int otp){
        System.out.println("OTP validation done..");
    }

    public  void paymentDetails(){
        System.out.println("-------------------");
        System.out.println("Payment Id: " + id);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Payment Date: " + paymentDate);
        System.out.println("Mode: " + mode);
        System.out.println("-------------------");
    }
}

// abstract class cant be instantiated(can't create object)
// can have constructor
/*
    //  how the payment is done is not needed, payment is done or not done is required

    public boolean pay(double amount){
        System.out.println("Payment done using cash: "+ amount);
        return true;
    }*/