package com.cocacola.bmp.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
@EnableFeignClients //启用OpenFeign
public class CustomerServiceApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(CustomerServiceApplication.class, args);
        String env = applicationContext.getEnvironment().getProperty("current.environment");
        String ver = applicationContext.getEnvironment().getProperty("current.version");
        System.out.println("environment:" + env + "; version: " + ver);
    }
    @GetMapping("/health")
    public String health(){
        return " The customer-service is health!";
    }
}
