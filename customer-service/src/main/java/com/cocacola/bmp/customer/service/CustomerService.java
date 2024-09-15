package com.cocacola.bmp.customer.service;

import com.cocacola.bmp.customer.entity.Customer;
import java.util.Optional;
import java.util.List;


public interface CustomerService {
    Optional<Customer> findCustomerById(Long id);
    List<Customer> getCustomers();
    List<Customer>  getCustomersByChannel(String channel);
}

