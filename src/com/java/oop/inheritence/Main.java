package com.java.oop.inheritence;

public class Main {
    public static void main(String[] args) {
       /* InheritedCustomer inheritCustomer = new InheritedCustomer(1,"sushmitha",
                "katika@gmail","9396929429",
                (byte) 21,'F',"Gold",
                15.5,200);
        inheritCustomer.displayCustomerDetails();*/

        Product product = new Product();

        product.displayDetails();
        Product product2 = new Product(2,"Product 2", 100, 10, 2.3f, true);
        product2.displayDetails();

        Book book = new Book(2,"Book 1", 100, 10, 2.3f,true,"Author 1", 300, "Publisher 1");
        book.displayDetails();

        Laptop laptop = new Laptop();
        System.out.println(laptop.operatingSystem);
        System.out.println(laptop.hardDiskSize);
        System.out.println(laptop.ram);

        Laptop laptop2 = new Laptop(1, "Lenovo", 40000,12, 4.6f, true, 512, 8, "Windows");
        laptop2.displayDetails(); //(overridden)

        WindowsLaptop windowsLaptop = new WindowsLaptop();

        windowsLaptop.displayDetails();
        windowsLaptop.displayDetails("Microsoft"); //(overloading)
        windowsLaptop.displayDetails("Microsoft",2020); //(overloading)
        windowsLaptop.displayDetails("Microsoft",2020,false); //(overloading)

        Service service = new Service();
        service.validate(book); // Java chooses method based on reference type

        service.displayDetails(product2);

        /*
        Below is upcasting:
            Reference type → Product
            Object type → Book
         */

        Product product3 = new Book();
        service.displayDetails(product3); // (overridden) Runtime decides → calls Book version
    }
}

/*
    Overloading → Compile Time → Reference Type
    service.validate(product);

    Overriding → Runtime → Object Type
    product.displayDetails();

 */

// 👉 "Parent reference + Child object = Runtime polymorphism"

/*

    Product p = new Book();
    Service s = new Service();
    s.validate(p);

    Answer: Validating product
    Because:
    validate() is overloaded
    Decision at compile-time
    Reference = Product
 */

/*
    Product p = new Book();

    👉 Memory:

    Stack → reference p
    Heap → Book object
    p ─────► Book object
             (also contains Product data)
 */