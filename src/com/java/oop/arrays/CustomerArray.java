package com.java.oop.arrays;

public class CustomerArray {
    public static void main(String[] args) {

        Customer[] customers = new Customer[5];
        customers[0] = new Customer(101,"Sushmitha","sush@gmail.com","9849733177", (byte) 21,'F');
        customers[1] = new Customer(102,"Ravi","ravi@gmail.com","9876543210",(byte) 25,'M');
        customers[2] = new Customer(103,"Anjali","anjali@gmail.com","9123456780",(byte) 22,'F');
        customers[3] = new Customer(104,"Kiran","kiran@gmail.com","9988776655",(byte) 30,'M');
        customers[4] = new Customer(105,"Priya","priya@gmail.com","9090909090",(byte) 34,'F');

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
        Customer customerById = getCustomerById(customers,104);
        if(customerById != null){
            customerById.getCustomers();
        }else {
            System.out.println("Customers not found..");
        }

        //Sort Customers by name
        Customer[] sortByName = sortCustomersByName(customers);
        System.out.println("===== ** Sorted Customer List ** =====");
        for (Customer customer: sortByName){
            customer.getCustomers();
        }

        //Find number of Customers with age greater than
        int greaterAge = customerWithAgeGreaterThan(customers,20);
        System.out.println("Number of Customers Greater than 20 Age: "+greaterAge);

        //Find number of Customers with age b/w
        int start = 30;
        int end = 40;
        int betweenAge = customerWithAgeBetween(customers,start,end);
        System.out.println("Number of Customers with Age Between "+start+" & "+end+":"+betweenAge);

        //Get Customers age below
        Customer[] belowAgeCustomers = getCustomersBelowAge(customers,30);
        System.out.println("===== ** Customers with age below 30 ** =====");
        for (Customer customer : belowAgeCustomers){
            customer.getCustomers();
        }
    }

    public static void getHighestAgeCustomer(Customer[] customers){
        if(customers == null || customers.length == 0){
            System.out.println("No customers available");
            return;
        }
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

    public static Customer getCustomerById(Customer[] customers,int id){
        for (Customer customer : customers){
            if (customer.id == id){
                System.out.println("Display Customer By ID - "+id);
               return customer;
            }
        }
        return null;
    }

    public  static Customer[] sortCustomersByName(Customer[] customers){
        for(int i = 0; i < customers.length-1; i++){
            for (int j = i+1; j < customers.length; j++){
                if(customers[i].name.compareToIgnoreCase(customers[j].name) > 0){
                    Customer temp = customers[i];
                    customers[i] = customers[j];
                    customers[j] = temp;
                }
            }
        }
        return customers;
    }

    public static int customerWithAgeGreaterThan(Customer[] customers,int age){
        int count = 0;
        for(Customer customer : customers){
            if(customer.age > age){
                count++;
            }
        }
        return count;
    }

    public static int customerWithAgeBetween(Customer[] customers,int start,int end){
        int count = 0;
        for(Customer customer : customers){
            if(customer.age >= start && customer.age <=end){
                count++;
            }
        }
        return count;
    }

    public  static Customer[] getCustomersBelowAge(Customer[] customers,int age){
        int count = 0;
        for(Customer customer : customers){
            if(customer.age < age){
                count++;
            }
        }
        Customer[] result = new Customer[count];
        int i = 0;
        for(Customer customer : customers){
            if(customer.age < age){
                result[i++] =customer;
            }
        }
        return result;
    }
}
