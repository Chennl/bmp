package com.cocacola.bmp.customer.component;

import org.springframework.stereotype.Component;

@Component
public class CustomerSentinelResourceHandler {
    public static String sentinelAResource(Throwable throwable){
        System.out.println("触发熔断，服务不可用");
        return "触发熔断，服务不可用";
    }
}
