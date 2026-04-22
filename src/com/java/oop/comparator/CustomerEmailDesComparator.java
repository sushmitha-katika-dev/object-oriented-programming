package com.java.oop.comparator;

import com.java.oop.model.Customer;

import java.util.Comparator;

public class CustomerEmailDesComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return o2.getEmail().compareTo(o1.getEmail());
    }
}
