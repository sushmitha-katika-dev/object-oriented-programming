package com.java.oop.interfaces;

public class CreditCardPayment implements Payment{
    @Override
    public boolean pay(double amount) {
        if(Payment.validTranscation(4,amount)) {
            System.out.println("Payment successful using credit card amount: " + amount);
            return true;
        }
        System.out.println("Transaction failed");
        return false;
    }

    @Override
    public boolean pay(String customerId, double amount) {
        return false;
    }
}
