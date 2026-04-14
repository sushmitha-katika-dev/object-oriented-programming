package com.java.oop.abstraction;

public class DebitCardPayment extends Payment {

    public DebitCardPayment(String id, String customerName, String paymentDate, String mode) {
        super(id, customerName, paymentDate, mode);
    }

    @Override
    public boolean pay(double amount){
        super.paymentDetails();
       System.out.println("Payment successful using debit card");
       return true;
    }
}
