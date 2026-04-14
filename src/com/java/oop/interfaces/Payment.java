package com.java.oop.interfaces;

public interface Payment {

    //variables -> only public static final(CONSTANTS)
    int MAX_PAYMENT_AMOUNT = 1000;
    int MAX_TRANSACTION_ALLOWED = 3;

    //abstract methods
    //interface have  by default public abstract methods
    boolean pay(double amount);
    boolean pay(String customerId, double amount);
    //concrete methods -> only default or static method can have bodies
    default void otpValidation(int otp){
        System.out.println("OTP validation done : " + otp);
    }

    static boolean validTranscation(int myTransactionCount, double paymentAmount){
     return (myTransactionCount <= MAX_TRANSACTION_ALLOWED) && paymentAmount <= MAX_PAYMENT_AMOUNT;
    }
}
