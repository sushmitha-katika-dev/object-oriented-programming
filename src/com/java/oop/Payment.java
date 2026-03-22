package com.java.oop;

public class Payment {

    int paymentId;
    double amount;
    String paymentMethod;
    String paymentStatus;
    String transactionId;

    public Payment(){
        System.out.println("===== Payment Class =====");
    }

    boolean initiatePayment(Order order, String paymentMethod){
        // payment initiate
        if (order != null && paymentMethod != null){
            this.paymentMethod = paymentMethod;
            this.amount = order.grandTotal;
            this.paymentStatus = "Initiated";
            System.out.println("Payment initiated for amount: "+amount);
            return true;
        }
        return false;
    }

    boolean validatePayment(double orderAmount){
        //if amount == orderAmount return true;
        if(this.amount == orderAmount){
            System.out.println("Pament amount is valid");
            return true;
        }
        System.out.println("Payment amount mismatch");
        return false;
    }
    boolean processPayment(String paymentMode) {
        if(paymentMode != null){
            this.paymentMethod = paymentMethod;
            this.paymentStatus = "Success";
            System.out.println("Payment processed successfully");
            return true;
        }
        this.paymentStatus = "Failed";
        return false;
    }

    boolean refundPayment(Order order){
        //pay to order cancelled
        if(order != null && order.orderStatus.equalsIgnoreCase("Cancelled")){
            this.paymentStatus = "Refunded";
            System.out.println("Payment refunded successfully");
            return true;
        }
        System.out.println("Refunded not applicable");
        return  false;
    }

    String checkPaymentStatus(){
        return paymentStatus;
    }

}
