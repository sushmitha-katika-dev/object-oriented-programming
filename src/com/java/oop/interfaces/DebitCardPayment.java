package com.java.oop.interfaces;

public class DebitCardPayment implements Payment{
    @Override
    public boolean pay(double amount) {
        System.out.println("Payment successful using debit card: " + amount);
        return true;
    }

    @Override
    public boolean pay(String customerId, double amount) {
        return false;
    }
}
