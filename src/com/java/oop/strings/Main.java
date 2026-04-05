package com.java.oop.strings;

import com.java.oop.Customer;

public class Main {
    static String name; // class properties (heap) by default initialized
    String name1; //instance variable (heap) by default initialized
    public static void main(String[] args) {
        String str1 = new String();
        System.out.println(str1);
        String name = null; // local variable (stack) ,local variables are not initialized by default we need to initialized it
        System.out.println(name);
        char[] chars = {'a','b','c','d'};
        String str2 = new String(chars);
        System.out.println(str2);
        String str3 = new String("abcd");
        System.out.println(str3);
        System.out.println(str2 == str3); // checking references
        // for str2 & str3 2 objects are created
        String str4 = "abcd";
        String str5 = "abcd";
        System.out.println(str4 == str5); // java checks in string pool

        //String manipulation
        System.out.println(str5.charAt(3));

        String username = "admin123";
        String password = "admin@123";
        System.out.println(username.compareToIgnoreCase("admin123"));
        System.out.println(password.compareTo("admin@123"));

        String greeting = "Hello";
        greeting.concat(username);
        System.out.println(greeting); //prints only hello because strings are constants
        /*
        String objects are immutable objects
         */
        greeting = greeting.concat(username);
        System.out.println(greeting);

        if(username.equalsIgnoreCase("admin123") && password.equals("admin@123")){
            System.out.println("Login successful");
        }else {
            System.out.println("Login failed");
        }

        if(username.length() > 5 && username.length() < 10){
            System.out.println("username length is valid");
        }else {
            System.out.println("username length is not valid");
        }

        //Regix expression
        //username validation alphanumeric with _
        String regix = "[a-zA-Z0-9_]+$";
        if(username.matches(regix)){
            System.out.println("username is valid");
        }else {
            System.out.println("username is not invalid");
        }

        String customerData = "1,sushmitha,21,bhongir,9849384";
        String[] split = customerData.split(",");

        Customer customer = new Customer(Integer.parseInt(split[0]),split[1],Integer.parseInt(split[2]),split[3],split[4]);
        System.out.println("Id: "+customer.id);
        System.out.println("Name "+customer.name);
        System.out.println("Age: "+customer.age);
        System.out.println("Address: "+customer.address);
        System.out.println("Phone No: "+customer.phoneNumber);

        String email = "  sushi@gmail.com  ";
        if(email.trim().equals("sushi@gmail.com")){
            System.out.println("email is valid");
        }else {
            System.out.println("Email is not valid");
        }

    }

}
