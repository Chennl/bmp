package com.cocacola.bmp.customer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Component
@FeignClient(name = "message-service")
public interface MessageServiceApi {
    @RequestMapping(value = "/sendSMS", method = RequestMethod.POST)
    public String sendSMS();

    @RequestMapping(value = "/receiveSMS", method = RequestMethod.POST)
    public String receiveSMS();
}
