package com.java.oop.streams;

import com.java.oop.model.Customer;
import com.java.oop.model.Product;

import java.io.IOException;
import java.util.List;
import java.util.Map;

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
        printHeader("Products by Availability");
        productService.getProductsByAvailability(true)
                .forEach(System.out::println);

        printHeader("Products of Category");
        productService.getProductsOfCategory("Clothing")
                .forEach(System.out::println);
        System.out.println("Products With price greater than given value-----------");
        productService.getAllProductsNames()
                .forEach(System.out::println);
        System.out.println("\nCount available products : " + productService.countOfProducts(true));
        System.out.println("Is any Apple company products available : " + productService.isProductFromCompany("Apple"));
        System.out.println("Are all products available? : " + productService.areAllProductsAvailable());
        productService.firstProduct()
                .ifPresentOrElse(product -> System.out.println("First product: \n" + product ), () -> System.out.println("No product exists"));

        printHeader("Unique Categories");
        productService.getUniqueCategories()
                .forEach(System.out::println);

        printHeader("Top 5 Expensive Products");
        productService.getTopNExpensiveProducts(5)
                .forEach(System.out::println);

        printHeader("Sorted by Price");
        productService.sortProductsByPrice()
                .forEach(System.out::println);

        printHeader("Sorted by Name Desc");
        productService.sortProductsByName()
                .forEach(System.out::println);

        System.out.println("Total Price : " + productService.getTotalInventoryValue());
        System.out.println("Total Price after discount : " + productService.getPriceAfterDiscount());

        printHeader("Products After 2021");
        productService.getProductsAfterYear(2021)
                .forEach(System.out::println);

        printHeader("Available Products Above 23000");
        productService.getAvailableProductsAbovePrice(23000)
                .forEach(System.out::println);

        printHeader("Count by Category");
        productService.countProdcutsByCategory()
                        .forEach((category,count) -> System.out.println(category + " : " + count));

        printHeader("Grouped by category");
        productService.groupProductsByCategory()
                        .forEach((category, productsList) -> {
                            System.out.println("Category: " + category);
                            productsList.forEach(System.out::println);
                            System.out.println();
        });
        printHeader("Grouped by company");
        productService.groupProductsByCompany()
                .forEach((company,productList) -> {
                    System.out.println("Company: " + company);
                    productList.forEach(System.out::println);
                    System.out.println();
                });
        printHeader("Partition By Availability");
        productService.partitionProductsByAvailability()
                .forEach((isAvailable, productsList) ->{
                    System.out.println(isAvailable ? "\nAvailable Products:" : "\nUnavailable Prod :");
                    productsList.forEach(System.out::println);
        });
        printHeader("Most Expensive Product");
        productService.getmostExpensiveProduct()
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("No product found")
                );
        printHeader("Cheapest Product");
        productService.getCheapestProduct()
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("No product found")
                );
        printHeader("Product Map By ID");
        productService.getProductMapById()
                .forEach((id, product) ->
                        System.out.println(id + " -> " + product)
                );
        printHeader("Average price of products by category");
        productService.getAveragePricePerCategory()
                .forEach((category, avg) -> {
                    System.out.println(category + " : " + avg);
                });
        printHeader("Top 3 most expensive products in each category");
        productService.getTop3ExpensiveProductsByCategory()
                .forEach((category, productsList) -> {
                    System.out.println("category : " + category);
                    productsList.forEach(System.out::println);
                });
    }

    private static void printHeader(String title) {
        System.out.println("\n==== " + title + " ====");
    }
}
