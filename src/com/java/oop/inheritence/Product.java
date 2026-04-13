package com.java.oop.inheritence;

public class Product {
    int id;
    String name;
    int maxRetailPrice;
    float discountPercentage;
    float rating;
    boolean isAvailable;

    public Product(){
        System.out.println("Product constructor called");
    }

    public Product(int id, String name, int maxRetailPrice, float discountPercentage, float rating, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
        this.isAvailable = isAvailable;
    }
    void displayDetails(){
        System.out.println("Id: "+ id);
        System.out.println("Name: " + name);
        System.out.println("MRP: " + maxRetailPrice);
        System.out.println("Discount: " + discountPercentage);
        System.out.println("Rating: " + rating);
        System.out.println("Available: " + isAvailable);
    }

    void displayDetails(String company){
        System.out.println("Company: "+company);
    }

    void displayDetails(String company, int year){
        System.out.println("Company: "+company + " Year: "+year);
    }
}
