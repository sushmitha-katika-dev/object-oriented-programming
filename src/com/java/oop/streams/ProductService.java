package com.java.oop.streams;

import com.java.oop.model.Product;

import java.io.*;
import java.util.List;

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
    //3. Get all products names
    public List<String> getAllProductsNames() throws IOException {
        List<String> getProducts = csvReader.getProductsFromCsv()
                .stream()
                .map(Product::getName)
                .toList();
        return getProducts;
    }

}
