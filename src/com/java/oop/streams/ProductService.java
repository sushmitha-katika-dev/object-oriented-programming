package com.java.oop.streams;

import com.java.oop.model.Product;

import java.io.*;
import java.util.List;
import java.util.Optional;

public class ProductService {
    CsvReader csvReader = new CsvReader();

    // 1. Get products by availability
    public List<Product> getProductsByAvaialability(boolean isAvailable) throws IOException {
        List<Product> getProducts = csvReader.getProductsFromCsv()
                .stream()
                .filter(product -> product.isAvailable() == isAvailable)
                .toList();

        return getProducts;
    }

    //2. Get all products belonging to a given category.
    public List<Product> getProductsOfCategory(String category) throws IOException {
        List<Product> getProducts = csvReader.getProductsFromCsv()
                .stream()
                .filter(product -> product.getCategory().equals(category))
                .toList();
        return getProducts;
    }

    //3. Get all products with price greater than a given value.
    public List<Product> getProductsByPriceGreaterThan(int price) throws IOException {
        List<Product> getProducts = csvReader.getProductsFromCsv()
                .stream()
                .filter(product -> product.getMaxRetailPrice() > price)
                .toList();
        return getProducts;
    }
    //4. Get all products names
    public List<String> getAllProductsNames() throws IOException {
        List<String> getProducts = csvReader.getProductsFromCsv()
                .stream()
                .map(Product::getName)
                .toList();
        return getProducts;
    }
    //5. Count how many products are available.
    public long countOfProducts(boolean isAvailable) throws IOException {
        long countOfProducts = csvReader.getProductsFromCsv()
                .stream()
                .filter(product -> product.isAvailable() == isAvailable)
                .count();
        return countOfProducts;
    }
    //6. Check if there is any product from a given company.
    public boolean isProductFromCompany(String company) throws IOException {
        return csvReader.getProductsFromCsv()
                .stream()
                .anyMatch(product -> product.getCompany().equalsIgnoreCase(company));
    }
    //7. Check if all products are available.
    public boolean areAllProductsAvailable() throws IOException {
        return csvReader.getProductsFromCsv()
                .stream()
                .allMatch(Product::isAvailable);
    }
    //8. Get the first product safely.
    public Optional<Product> firstProduct() throws IOException {
        return csvReader.getProductsFromCsv()
                .stream()
                .findFirst();
    }

}
