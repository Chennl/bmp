package com.cocacola.bmp.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class GatewayServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(GatewayServiceApplication.class,args);
    }
    @GetMapping("/health")
    public String health(){
        return "The gateway-service is health!";
    }
}
