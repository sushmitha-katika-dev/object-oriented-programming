package com.java.oop.model;

import java.util.Objects;

public class Customer implements Comparable<Customer>{
    private int id;
    private String name;
    private int age;
    private String gender;
    private String email;
    private String password;
    private String phoneNumber;
    private String city;

    public Customer() {
    }

    public Customer(int id, String name, int age, String gender, String email, String password, String phoneNumber, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public Customer setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Customer setAge(int age) {
        this.age = age;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Customer setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Customer setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Customer setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Customer setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Customer setCity(String city) {
        this.city = city;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && age == customer.age && Objects.equals(name, customer.name) && Objects.equals(gender, customer.gender) && Objects.equals(email, customer.email) && Objects.equals(password, customer.password) && Objects.equals(phoneNumber, customer.phoneNumber) && Objects.equals(city, customer.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, gender, email, password, phoneNumber, city);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        return o.name.compareTo(this.name);
        /*
        Ascending
        return this.name.compareTo(o.name);
        Descending
        return o.name.compareTo(this.name);
         */
    }
}