package com.java.oop.inheritence;

public class Service {
    void validate(Product product){
        System.out.println("Validating product");
    }
    void validate(Laptop laptop){
        System.out.println("Validating laptop");
    }
    void validate(Book book){
        System.out.println("Validating book");
    }
    void validate(WindowsLaptop windowsLaptop){
        System.out.println("Validating windows laptop");;
    }
    void displayDetails(Product product){
        System.out.println("1");
        product.displayDetails();
    }
}
