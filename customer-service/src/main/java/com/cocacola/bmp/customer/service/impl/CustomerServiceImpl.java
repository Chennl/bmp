package com.cocacola.bmp.customer.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.cocacola.bmp.customer.entity.Customer;
import com.cocacola.bmp.customer.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service

public class CustomerServiceImpl implements CustomerService {
    private static final List<Customer> CUSTOMER_DATA = new ArrayList<>();

    static {
        CUSTOMER_DATA.add(new Customer(100L, "John Doe", "john.doe@example.com", "A"));
        CUSTOMER_DATA.add(new Customer(200L, "Jane Smith", "jane.smith@example.com", "A"));
        CUSTOMER_DATA.add(new Customer(300L, "ElonMusk", "ElonMusk@example.com", "B"));
    }

    @Override
    public  Optional<Customer> findCustomerById(Long id) {
        return CUSTOMER_DATA.stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst();
    }

    @Override
    public List<Customer> getCustomers() {
       return CUSTOMER_DATA;
    }

    @Override
    public List<Customer> getCustomersByChannel(String channel) {
        // 实现根据分类获取客户的逻辑，这里仅返回一个示例列表
        return CUSTOMER_DATA.stream()
                .filter(customer -> channel.equals(customer.getChannel()))
                .collect(Collectors.toList());
    }

}
