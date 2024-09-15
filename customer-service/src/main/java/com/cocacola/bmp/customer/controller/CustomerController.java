package com.cocacola.bmp.customer.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cocacola.bmp.common.ResultData;
import com.cocacola.bmp.customer.component.CustomerSentinelResourceHandler;
import com.cocacola.bmp.customer.entity.Customer;
import com.cocacola.bmp.customer.service.CustomerService;
import com.cocacola.bmp.customer.service.MessageServiceApi;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.env.Environment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@RestController
@RefreshScope
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @Value("${pattern.dateformat}")
    private String format;
    @Value("${pattern.envSharedValue}")
    private String envSharedValue;

    @Autowired
    MessageServiceApi messageServiceApi;
    @Autowired
    private Environment env;

    @GetMapping("/now")
    public String now() {
        System.out.println(env.getProperty("current.environment"));
        return envSharedValue + LocalDateTime.now().format(DateTimeFormatter.ofPattern(format));
    }
    @GetMapping("/{id}")
    @SentinelResource(value = "getCustomerById")
    public ResultData getCustomerById(@PathVariable Long id) {
        if (customerService.findCustomerById(id).isPresent())
            return ResultData.ok(customerService.findCustomerById(id));
        else
            return ResultData.err("Customer not found");

    }

    @GetMapping("/sc")
    @SentinelResource(value="sc" )
    public String sc(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我是sentinelA");
        return "我是sentinelA";
    }
    @GetMapping("/sendsms")
    public String sms(){
        return messageServiceApi.sendSMS();
    }
    @GetMapping("/")
    @SentinelResource("getAllCustomers")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }
    @GetMapping("/channel/{channel}")
    @SentinelResource("getCustomersByChannel")
    public List<Customer> getCustomersByChannel(@PathVariable String channel) {
        return customerService.getCustomersByChannel(channel);
    }
}
