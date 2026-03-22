package com.java.oop.arrays;

public class CustomerArray {
    public static void main(String[] args) {

        Customer[] customers = new Customer[5];
        customers[0] = new Customer(101,"Sushmitha","sush@gmail.com","9849733177", (byte) 21,'F');
        customers[1] = new Customer(102,"Ravi","ravi@gmail.com","9876543210",(byte) 25,'M');
        customers[2] = new Customer(103,"Anjali","anjali@gmail.com","9123456780",(byte) 22,'F');
        customers[3] = new Customer(104,"Kiran","kiran@gmail.com","9988776655",(byte) 30,'M');
        customers[4] = new Customer(105,"Priya","priya@gmail.com","9090909090",(byte) 24,'F');

        for (Customer customer: customers){
            customer.getCustomers();
        }

        //Highest Age customer Details
        getHighestAgeCustomer(customers);
        //get count of male customers
        System.out.println("Male Count: "+getMaleCustomerCount(customers));
        //get count of female customers
        System.out.println("Female Count: "+getFemaleCustomerCount(customers));
        //get the customers by id
        getCustomerById(customers,104);
        //get the customers by name
        getCustomerByName(customers,"Sushmitha");


    }

    public static void getHighestAgeCustomer(Customer[] customers){
        Customer highestAgeCustomer = customers[0];

        for (Customer customer : customers) {
            if (customer.age > highestAgeCustomer.age) {
                highestAgeCustomer = customer;
            }
        }

        System.out.println("Highest Age Customer Details:");
        highestAgeCustomer.getCustomers();
    }

    public static int getMaleCustomerCount(Customer[] customers){
        int maleCount = 0;
        for (Customer customer : customers){
            if(customer.gender == 'M'){
                maleCount++;
            }
        }
        return maleCount;
    }

    public static int getFemaleCustomerCount(Customer[] customers){
        int femaleCount = 0;
        for (Customer customer : customers){
            if(customer.gender == 'F'){
                femaleCount++;
            }
        }
        return femaleCount;
    }

    public static void getCustomerById(Customer[] customers,int id){
        for (Customer customer : customers){
            if (customer.id == id){
               customer.getCustomers();
            }
        }
    }

    public static void getCustomerByName(Customer[] customers,String name){
        for (Customer customer : customers){
            if (customer.name.equals(name)){
                customer.getCustomers();
            }
        }
    }


}
