package com.java.oop.abstraction;

public class CreditCardPayment extends Payment {

    public CreditCardPayment(String id, String customerName, String paymentDate, String mode) {
        super(id, customerName, paymentDate, mode);
    }

    @Override
    public boolean pay(double amount){
        super.paymentDetails();
        System.out.println("Payment successful using credit card amount: "+ amount);
        return true;
    }
}
