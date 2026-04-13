package com.java.oop.inheritence;

public class Book extends Product {
    String author;
    int pages;
    String publisher;

    public Book() {

    }

    public Book(int id, String name, int maxRetailPrice, float discountPercentage, float rating, boolean isAvailable, String author, int pages, String publisher) {
        super(id, name, maxRetailPrice, discountPercentage, rating, isAvailable);
        this.author = author;
        this.pages = pages;
        this.publisher = publisher;
    }

    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Author: "+ author);
        System.out.println("Pages: "+ pages);
        System.out.println("Publisher: "+ publisher);
    }
}

