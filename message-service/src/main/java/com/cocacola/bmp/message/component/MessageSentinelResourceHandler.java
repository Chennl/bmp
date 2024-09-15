package com.cocacola.bmp.message.component;

import org.springframework.stereotype.Component;

//@Component
public class MessageSentinelResourceHandler {
    public static String sendWeComResource(Throwable throwable){
        System.out.println("触发熔断，服务不可用");
        return "触发熔断，服务不可用";
    }
}
