package com.java.oop.streams;

import com.java.oop.model.Customer;
import com.java.oop.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    public List<Product> getProductsFromCsv() throws IOException {

        //CSV file path
        File file = new File("C:/java-workspace/object-oriented-programming/products.csv");

        BufferedReader br = new BufferedReader(new FileReader(file));

        //skip header
        br.readLine();

        String productData = br.readLine();

        List<Product> productsList = new ArrayList<>();
        while (productData != null) {
            //System.out.println(productData);
            String[] data = productData.split(",");
            Product product = new Product();
            product.setId(Integer.parseInt(data[0]));
            product.setName(data[1]);
            product.setMaxRetailPrice(Integer.parseInt(data[2]));
            product.setDiscountPercentage(Byte.parseByte(data[3]));
            product.setAvailable(Boolean.parseBoolean(data[4]));
            product.setCompany(data[5]);
            product.setCategory(data[6]);
            product.setManufacturedYear(Integer.parseInt(data[7]));

            productsList.add(product);
            productData = br.readLine();
        }
        return productsList;
    }

    public List<Customer> getCustomersFromCsv() throws IOException {

        //CSV file path
        File file = new File("C:/java-workspace/object-oriented-programming/customer.csv");

        List<Customer> customerList = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(file));
        br.readLine();//skip header

        String customerData = br.readLine();
        while (customerData != null){
            String[] data = customerData.split(",");

            Customer customer = new Customer();
            customer.setId(Integer.parseInt(data[0]));
            customer.setName(data[1]);
            customer.setAge(Integer.parseInt(data[2]));
            customer.setGender(data[3]);
            customer.setEmail(data[4]);
            customer.setPassword(data[5]);
            customer.setPhoneNumber(data[6]);
            customer.setCity(data[7]);

            customerList.add(customer);
            customerData = br.readLine();
        }
        return customerList;
    }
}
