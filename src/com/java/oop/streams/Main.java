package com.java.oop.streams;

import com.java.oop.model.Customer;
import com.java.oop.model.Product;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        CsvReader csvReader = new CsvReader();
        List<Product> products = csvReader.getProductsFromCsv();
       /* for (Product product : products){
            System.out.println(product);
        }

        List<Customer> customers = csvReader.getCustomersFromCsv();
        for (Customer customer : customers){
          //  System.out.println(customer);
        }*/

        ProductService productService = new ProductService();
        System.out.println("----------Product based on availability(true/false)");
        productService.getProductsByAvaialability(true)
                .forEach(System.out::println);
        System.out.println("----------Products of given category-----------");
        productService.getProductsOfCategory("Clothing")
                .forEach(System.out::println);
        System.out.println("----------All Products With price greater than given value-----------");
        productService.getAllProductsNames()
                .forEach(System.out::println);
        System.out.println("\nCount available products : " + productService.countOfProducts(true));
        System.out.println("Is any Apple company products available : " + productService.isProductFromCompany("Apple"));
        System.out.println("Are all products available? : " + productService.areAllProductsAvailable());
        productService.firstProduct()
                .ifPresentOrElse(product -> System.out.println("First product: \n" + product ), () -> System.out.println("No product exists"));
    }
}
