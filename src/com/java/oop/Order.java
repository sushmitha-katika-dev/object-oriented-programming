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

    void totalOrderAmount(){
        System.out.println("Total order Amount: ");
    }

    String updateOrderStatus(String updateStatus){
        return null;
    }

    boolean isOrderPaid(){
        return false;
    }

    boolean cancelOrder(String orderStatus){
        if (orderStatus != "Delivered"){
            orderStatus = "Cancelled";
            System.out.println("Order Cancelled..");
            return true;
        }
        return false;
    }
    void getOrder() {
        System.out.println("Order Summary");
        System.out.println("-------------");
        System.out.println("Order ID: " + id);
        System.out.println("Customer: " + customerName);
        System.out.println("Restaurant: " + restaurantName);
        System.out.println("Food Item: " + foodItem);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + grandTotal);
        System.out.println("Status: " + orderStatus);
    }

}
