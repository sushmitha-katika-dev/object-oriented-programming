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
        this.grandTotal = grandTotal;
        this.paymentMethod = paymentMethod;
        this.orderStatus = orderStatus;
        this.orderTime = orderTime;
        this.deliveryPartnerName = deliveryPartnerName;

        System.out.println("===== Order Class =====");
    }

    double calculateTotalAmount(){
        this.grandTotal = (price * quantity) + gst + deliveryFee + platformFee;
        return grandTotal;
    }

    void updateOrderStatus(String status){
        if(status != null && !status.isEmpty()){
            this.orderStatus = status;
            System.out.println("Order status updated to: "+status);
        }

    }

    boolean isOrderPaid(){
        return paymentMethod != null;
    }

    boolean cancelOrder(){
        if (orderStatus != null && !orderStatus.equalsIgnoreCase("Delivered")){
            this.orderStatus = "Cancelled";
            System.out.println("Order Cancelled..");
            return true;
        }
        return false;
    }
    void displayOrderSummary() {
        System.out.println("------ *** Order Summary *** ------");
        System.out.println("Order ID: " + id);
        System.out.println("Customer: " + customerName);
        System.out.println("Restaurant: " + restaurantName);
        System.out.println("Food Item: " + foodItem);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + grandTotal);
        System.out.println("Status: " + orderStatus);
        System.out.println("-----------------------------------");
    }

}
