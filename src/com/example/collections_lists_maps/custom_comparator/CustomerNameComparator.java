package com.example.collections_lists_maps.custom_comparator;

import java.util.Comparator;

public class CustomerNameComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        return c1.getName().compareTo(c2.getName());
    }
}