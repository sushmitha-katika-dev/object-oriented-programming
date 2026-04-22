package com.java.oop.streams;

import com.java.oop.model.Customer;
import com.java.oop.model.Product;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        CsvReader csvReader = new CsvReader();
        List<Product> products = csvReader.getProductsFromCsv();
        for (Product product : products){
        //    System.out.println(product);
        }

        List<Customer> customers = csvReader.getCustomersFromCsv();
        for (Customer customer : customers){
            System.out.println(customer);
        }
    }
}
