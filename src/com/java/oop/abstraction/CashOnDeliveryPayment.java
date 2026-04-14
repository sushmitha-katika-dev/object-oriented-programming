package com.java.oop.abstraction;

public class CashOnDeliveryPayment extends Payment{

    public CashOnDeliveryPayment(String id, String customerName, String paymentDate, String mode) {
        super(id, customerName, paymentDate, mode);
    }

    @Override
    public boolean pay(double amount) {
        super.paymentDetails();
        System.out.println("Payment successful using cash on delivery");
        return true;
    }
}
