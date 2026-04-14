package com.java.oop.interfaces;

public class CashOnDeliveryPayment implements Payment{
    @Override
    public boolean pay(double amount) {
        System.out.println("Payment successful using cash on delivery: " + amount);
        return true;
    }

    @Override
    public boolean pay(String customerId, double amount) {
        return false;
    }
}
