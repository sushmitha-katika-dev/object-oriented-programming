package com.java.oop.interfaces;

public class OrderService {
    Payment payment;

    public OrderService(Payment payment){
        this.payment = payment;
    }
    public  boolean processOrder(double amount){
        return payment.pay(amount);
    }
}
