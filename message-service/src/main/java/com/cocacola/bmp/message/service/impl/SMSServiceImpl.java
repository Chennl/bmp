package com.cocacola.bmp.message.service.impl;

import com.cocacola.bmp.common.ResultData;
import com.cocacola.bmp.message.service.SMSService;
import org.springframework.stereotype.Service;

@Service
public class SMSServiceImpl implements SMSService {

    @Override
    public Integer send(String phone, String message, Integer type) {
        return null;
    }
}
