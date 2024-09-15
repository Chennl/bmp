package com.cocacola.bmp.message.service;

import com.cocacola.bmp.common.ResultData;

public interface SMSService {
    Integer send(String phone, String message, Integer type);
}
