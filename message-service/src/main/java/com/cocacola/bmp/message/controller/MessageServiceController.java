package com.cocacola.bmp.message.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.cocacola.bmp.common.DateTimeUtil;
import com.cocacola.bmp.message.component.MessageSentinelResourceHandler;
import com.cocacola.bmp.message.domain.dto.SmsDto;
import com.cocacola.bmp.message.service.SMSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;

@RestController
@RequestMapping("/api")
public class MessageServiceController {

    @Autowired
    SMSService smsService;

    @RequestMapping("/send/{phone}/{msg}")
    public String sendSMS(@PathVariable("phone") String phone, @PathVariable("msg") String msg){
        System.out.printf("send message %s to %s%n",msg,phone);
        return String.format("send message %s to %s",msg,phone);
    }
    @RequestMapping("/wx/{wxId}/{msg}")
    @SentinelResource(value="sendWXResource",blockHandler = "sendWXBlockHandler", blockHandlerClass = MessageServiceController.class)
    public String sendWX(@PathVariable(value="wxId") String wxId, @PathVariable("msg") String msg){
        System.out.printf("send message %s to %s%n",msg,wxId);
        return String.format("send message %s to %s",msg,wxId);
    }
    /**
     * 限流后续操作方法
     */
    public static String sendWXBlockHandler(String wxId, String msg, BlockException e){
        return  "不好意思，前方拥挤，请您稍后再试";
    }
    @RequestMapping("/wecom/{wxId}/{msg}")
    @SentinelResource(value = "sendWeComResource" )
    public String sendWeCom(@PathVariable(value="wxId") String wxId, @PathVariable("msg") String msg){
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println("我是sendWeComResource");
        return "我是sendWeComResource";

    }

     


    @RequestMapping("/now")
    public String now(){
        System.out.printf("Time is: %s",DateTimeUtil.getCurrentTime());
        return String.format("Time is: %s",DateTimeUtil.getCurrentTime());
    }
}
