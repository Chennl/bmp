package com.cocacola.bmp.domain.dto.person;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor
public class PersonSearchDto implements Serializable {
    private List<String> personIDList;
    private List<String> userIDList;
    private String birthday;
    private String clientPosition;
    private String code;
    private String company;
    private String createBy;
    private String email;
    private String gender;
    private String identityCard;
    private String inDate;
    private String isDeleted;
    private String isThirdParty;
    private String lastModifiedBy;
    private String mobile;
    private String name;
    private String nestlePosition;
    private String outDate;
    private String ownerID;
    private String personID;
    private String picIDCard;
    private String position;
    private String status;
    private String userID;
}
