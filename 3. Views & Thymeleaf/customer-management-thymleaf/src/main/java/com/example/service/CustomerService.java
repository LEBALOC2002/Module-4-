package com.example.service;

import com.example.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService{
    private static final Map<Integer , Customer> cutomers ;
    static {
        cutomers = new HashMap<>();
        cutomers.put(2, new Customer(2, "Bill", "bill@codegym.vn", "Danang"));
        cutomers.put(3, new Customer(3, "Alex", "alex@codegym.vn", "Saigon"));
        cutomers.put(4, new Customer(4, "Adam", "adam@codegym.vn", "Beijin"));
        cutomers.put(5, new Customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
        cutomers.put(6, new Customer(6, "Rose", "rose@codegym.vn", "Newyork"));

    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(cutomers.values());
    }

    @Override
    public void save(Customer customer) {
    cutomers.put(customer.getId(),customer);
    }

    @Override
    public Customer findById(int id) {
        return cutomers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
    cutomers.put(id,customer);
    }

    @Override
    public void remove(int id) {
    cutomers.remove(id);
    }
}
