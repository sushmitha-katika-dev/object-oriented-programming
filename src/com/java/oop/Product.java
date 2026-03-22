package com.java.oop;

public class Product {

    int id;
    String name;
    float maxRetailPrice;
    int availableStock;
    boolean isAvailable;
    double discountPercentage;
    double stateTax;
    double centralTax;
    int quantitySold;

    public Product(){

        System.out.println("===== Product Class =====");
    }

    // 1.Method with No Parameters & Return Type
    void displayProductDetails(){
        System.out.println("Product Name: "+name);
        System.out.println("M.R.P: "+maxRetailPrice);
        System.out.println("Available Stock: "+availableStock);
        System.out.println("Available: "+isAvailable);
    }

    // 2.Method with No Parameters & Return Type
    double getDiscountAmount(){
        return (maxRetailPrice * discountPercentage) /100;
    }

    // 3.Method with Parameters & No Return Type
    boolean updateStock(int quantitySold){
        if (quantitySold > 0 && quantitySold <= availableStock){
            availableStock -= quantitySold;
            this.quantitySold += quantitySold;

            if(availableStock == 0){
                isAvailable = false;
            }
            System.out.println("Stock Updated ,Available Stock: "+availableStock);
            return true;
        }
        System.out.println("Invalid quantity");
        return false;
    }


}
