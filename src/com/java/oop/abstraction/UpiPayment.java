package com.java.oop.abstraction;

public class UpiPayment extends Payment{
    public UpiPayment(String id, String customerName, String paymentDate, String mode) {
        super(id, customerName, paymentDate, mode);
    }

    @Override
    public boolean pay(double amount) {
        super.paymentDetails();
        System.out.println("Payment successful using UPI ");
        return true;
    }
}
