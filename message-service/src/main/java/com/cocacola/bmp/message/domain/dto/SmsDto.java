package com.cocacola.bmp.message.domain.dto;

import lombok.Data;


@Data
public class SmsDto {

    private String type="SMS";

    private String to;

    private String message;
}
