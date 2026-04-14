package com.java.oop.interfaces;

public class UpiPayment implements Payment{
    @Override
    public boolean pay(double amount) {
        Payment.validTranscation(4,amount);
        System.out.println("Payment successful using UPI: " + amount);
        return true;
    }

    @Override
    public boolean pay(String customerId, double amount) {
        return false;
    }
}
