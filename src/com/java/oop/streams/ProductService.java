package com.java.oop.streams;

import com.java.oop.model.Product;

import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductService {
    CsvReader csvReader = new CsvReader();

    // 1. Get products by availability
    public List<Product> getProductsByAvailability(boolean isAvailable) throws IOException {
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
    //9. Get all unique categories.
    public List<String> getUniqueCategories() throws IOException {
        return csvReader.getProductsFromCsv()
                .stream()
                .map( Product::getCategory)
                .distinct()
                .toList();
    }
    //10. Get top N most expensive products.
    public List<Product> getTopNExpensiveProducts(int n) throws IOException {
        return csvReader.getProductsFromCsv()
                .stream()
                .sorted((p1,p2) -> Double.compare(p2.getMaxRetailPrice(), p1.getMaxRetailPrice()))
                .limit(n)
                .toList();
    }
    //11. Sort products by price in ascending order.
    public List<Product> sortProductsByPrice() throws IOException {
        return csvReader.getProductsFromCsv()
                .stream()
                .sorted((p1,p2) ->Double.compare(p1.getMaxRetailPrice(), p2.getMaxRetailPrice()))
                .toList();
    }
    //12. sort products by name in descending order
    public List<Product> sortProductsByName() throws IOException {
        return csvReader.getProductsFromCsv()
                .stream()
                .sorted((p1,p2) -> p2.getName().compareToIgnoreCase(p1.getName()))
                .toList();
    }
    //13. Get total inventory value (sum of all product prices).
    public double getTotalInventoryValue() throws IOException {
        return csvReader.getProductsFromCsv()
                .stream()
                .mapToDouble(Product::getMaxRetailPrice)
                .sum();
    }
    //14. Get total price after applying discounts.
    public double getPriceAfterDiscount() throws IOException {
        return csvReader.getProductsFromCsv()
                .stream()
                .mapToDouble(product -> {
                    double price = product.getMaxRetailPrice();
                    double discount = product.getDiscountPercentage();
                    return price - (price * discount /100);
                })
                .sum();
    }
    //15. Get all products manufactured after a given year.
    public List<Product> getProductsAfterYear(int year) throws IOException {
        return csvReader.getProductsFromCsv()
                .stream()
                .filter(product -> product.getManufacturedYear() > year)
                .toList();
    }
    //16. Get all products that are:
    //- available and price greater than a given value

    public List<Product> getAvailableProductsAbovePrice(double price) throws IOException {
        return csvReader.getProductsFromCsv()
                .stream()
                .filter(product -> product.isAvailable() && product.getMaxRetailPrice() > price)
                .toList();
    }
    //17. Count number of products in each category.
    public Map<String, Long> countProdcutsByCategory() throws IOException {
        return csvReader.getProductsFromCsv()
                .stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory, Collectors.counting()
                ));
    }
    //18. Group all products by category.
    public Map<String, List<Product>> groupProductsByCategory() throws IOException {
        return csvReader.getProductsFromCsv()
                .stream()
                .collect(Collectors.groupingBy(Product::getCategory));
    }
    //19. Group all products by company.
    public Map<String, List<Product>> groupProductsByCompany() throws IOException {
        return csvReader.getProductsFromCsv()
                .stream()
                .collect(Collectors.groupingBy(Product::getCompany));
    }
    //20. Partition products into:
    //available & unavailable
    public Map<Boolean, List<Product>> partitionProductsByAvailability() throws IOException {
        return csvReader.getProductsFromCsv()
                .stream()
                .collect(Collectors.partitioningBy(Product::isAvailable));
    }
    //21. Find the most expensive product.
    public Optional<Product> getmostExpensiveProduct() throws IOException {
        return csvReader.getProductsFromCsv()
                .stream()
                .max(Comparator.comparingDouble(Product::getMaxRetailPrice));

    }
    //22. Find the cheapest product.
    public Optional<Product> getCheapestProduct() throws IOException {
        return csvReader.getProductsFromCsv()
                .stream()
                .min(Comparator.comparingDouble(Product::getMaxRetailPrice));
    }
    //23. Create a Map of product ID to Product.
    public Map<Integer, Product> getProductMapById() throws IOException {
        return csvReader.getProductsFromCsv()
                .stream()
                .collect(Collectors.toMap(
                        Product::getId,                 //key
                        product -> product      //value
                ));
    }
    //24. Find the average price of products per category.
    public Map<String, Double> getAveragePricePerCategory() throws IOException {
        return csvReader.getProductsFromCsv()
                .stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.averagingDouble(Product::getMaxRetailPrice)
                ));
    }
    //25. Get top 3 most expensive products in each category.
    public Map<String,List<Product>> getTop3ExpensiveProductsByCategory() throws IOException {
        return csvReader.getProductsFromCsv()
                .stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.collectingAndThen(Collectors.toList(),
                                list -> list.stream()
                                        .sorted((p1,p2) ->
                                                Double.compare(p2.getMaxRetailPrice(), p1.getMaxRetailPrice())
                                        )
                                        .limit(3)
                                        .toList()
                        )
                ));
    }

}
