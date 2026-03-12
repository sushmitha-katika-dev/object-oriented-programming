package com.java.oop;

public class Order {

    int id;
    String restaurantName;
    String customerName;
    String deliveryAddress;

    String foodItem;
    int quantity;
    double price;

    double gst;
    double deliveryFee;
    double platformFee;
    double grandTotal;

    String paymentMethod;
    String orderStatus;
    String orderTime;
    String deliveryPartnerName;

    public Order (){
        System.out.println("No-arg constructor with some values");
    }

    public Order(int id, String restaurantName, String customerName, String deliveryAddress, String foodItem, int quantity, double price, double gst, double deliveryFee, double platformFee, double grandTotal, String paymentMethod, String orderStatus, String orderTime, String deliveryPartnerName) {
        this.id = id;
        this.restaurantName = restaurantName;
        this.customerName = customerName;
        this.deliveryAddress = deliveryAddress;
        this.foodItem = foodItem;
        this.quantity = quantity;
        this.price = price;
        this.gst = gst;
        this.deliveryFee = deliveryFee;
        this.platformFee = platformFee;
        this.grandTotal = price * quantity + gst + deliveryFee + platformFee;
        this.paymentMethod = paymentMethod;
        this.orderStatus = orderStatus;
        this.orderTime = orderTime;
        this.deliveryPartnerName = deliveryPartnerName;

        System.out.println("----------------------------");
        System.out.println("Arg- constructor");
    }
}
