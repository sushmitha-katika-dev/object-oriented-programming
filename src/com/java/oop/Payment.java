package com.java.oop;

public class Payment {

    int paymentId;
    double amount;
    String paymentMethod;
    String paymentStatus;
    String transactionId;

    boolean initiatePayment(Order order,String paymentMethod){
        // payment initiate
        return false;
    }

    boolean validatePayment(double orderAmount){
        //if amount == orderAmount return true;
        return false;
    }
    boolean processPayment(String paymentMode) {
        return false;
    }

    void refundPayment(Order order){
        //pay to order cancelled
    }

    String checkPaymentStatus(){
        return paymentStatus;
    }

}
