package com.cocacola.bmp.domain.entity;


import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;

@TableName("MD_Person")
public class PersonEntity implements Serializable {
    @TableId("PersonID")
    private String personID;
    @TableField("UserID")
    private String userID;
    @TableField("Code")
    private String code;
    @TableField("Name")
    private String name;
    @TableField("Gender")
    private String gender;
    @TableField("Mobile")
    private String mobile;
    @TableField("Email")
    private String email;
    @TableField(
            exist = false
    )
    private String nestlePosition;
    @TableField("Position")
    private String position;
    @TableField(
            exist = false
    )
    private String positionName;
    @TableField(
            exist = false
    )
    private String clientPosition;
    @TableField("SAPUserCode")
    private String sapUserCode;
    @JsonIgnore
    @TableField("PicIDCard")
    private String picIDCard;
    @JsonIgnore
    @TableField("IsThirdParty")
    private String isThirdParty;
    @JsonIgnore
    @TableField("Company")
    private String company;
    @TableField("InDate")
    @JsonFormat(
            pattern = "yyyy-MM-dd",
            timezone = "GMT+8"
    )
    private Date inDate;
    @TableField("OutDate")
    @JsonFormat(
            pattern = "yyyy-MM-dd",
            timezone = "GMT+8"
    )
    private Date outDate;
    @TableField("TrainingDate")
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date trainingDate;
    @JsonIgnore
    @TableField("IdentityCard")
    private String identityCard;
    @TableField("Status")
    private String status;
    @JsonIgnore
    @TableField("Birthday")
    private String birthday;
    @TableField("IsDeleted")
    private String isDeleted;
    @JsonIgnore
    @TableField("OwnerID")
    private String ownerID;
    @JsonIgnore
    @TableField(
            value = "CreateBy",
            fill = FieldFill.INSERT
    )
    private String createBy;
    @JsonIgnore
    @TableField(
            value = "CreateTime",
            fill = FieldFill.INSERT
    )
    private String createTime;
    @JsonIgnore
    @TableField(
            value = "LastModifiedBy",
            fill = FieldFill.INSERT_UPDATE
    )
    private String lastModifiedBy;
    @JsonIgnore
    @TableField(
            value = "LastModifiedTime",
            fill = FieldFill.INSERT_UPDATE
    )
    private String lastModifiedTime;

    public PersonEntity() {
    }

    public String getPersonID() {
        return this.personID;
    }

    public String getUserID() {
        return this.userID;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNestlePosition() {
        return this.nestlePosition;
    }

    public String getPosition() {
        return this.position;
    }

    public String getPositionName() {
        return this.positionName;
    }

    public String getClientPosition() {
        return this.clientPosition;
    }

    public String getSapUserCode() {
        return this.sapUserCode;
    }

    public String getPicIDCard() {
        return this.picIDCard;
    }

    public String getIsThirdParty() {
        return this.isThirdParty;
    }

    public String getCompany() {
        return this.company;
    }

    public Date getInDate() {
        return this.inDate;
    }

    public Date getOutDate() {
        return this.outDate;
    }

    public Date getTrainingDate() {
        return this.trainingDate;
    }

    public String getIdentityCard() {
        return this.identityCard;
    }

    public String getStatus() {
        return this.status;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public String getIsDeleted() {
        return this.isDeleted;
    }

    public String getOwnerID() {
        return this.ownerID;
    }

    public String getCreateBy() {
        return this.createBy;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public PersonEntity setPersonID(String personID) {
        this.personID = personID;
        return this;
    }

    public PersonEntity setUserID(String userID) {
        this.userID = userID;
        return this;
    }

    public PersonEntity setCode(String code) {
        this.code = code;
        return this;
    }

    public PersonEntity setName(String name) {
        this.name = name;
        return this;
    }

    public PersonEntity setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public PersonEntity setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public PersonEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public PersonEntity setNestlePosition(String nestlePosition) {
        this.nestlePosition = nestlePosition;
        return this;
    }

    public PersonEntity setPosition(String position) {
        this.position = position;
        return this;
    }

    public PersonEntity setPositionName(String positionName) {
        this.positionName = positionName;
        return this;
    }

    public PersonEntity setClientPosition(String clientPosition) {
        this.clientPosition = clientPosition;
        return this;
    }

    public PersonEntity setSapUserCode(String sapUserCode) {
        this.sapUserCode = sapUserCode;
        return this;
    }

    @JsonIgnore
    public PersonEntity setPicIDCard(String picIDCard) {
        this.picIDCard = picIDCard;
        return this;
    }

    @JsonIgnore
    public PersonEntity setIsThirdParty(String isThirdParty) {
        this.isThirdParty = isThirdParty;
        return this;
    }

    @JsonIgnore
    public PersonEntity setCompany(String company) {
        this.company = company;
        return this;
    }

    @JsonFormat(
            pattern = "yyyy-MM-dd",
            timezone = "GMT+8"
    )
    public PersonEntity setInDate(Date inDate) {
        this.inDate = inDate;
        return this;
    }

    @JsonFormat(
            pattern = "yyyy-MM-dd",
            timezone = "GMT+8"
    )
    public PersonEntity setOutDate(Date outDate) {
        this.outDate = outDate;
        return this;
    }

    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    public PersonEntity setTrainingDate(Date trainingDate) {
        this.trainingDate = trainingDate;
        return this;
    }

    @JsonIgnore
    public PersonEntity setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
        return this;
    }

    public PersonEntity setStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonIgnore
    public PersonEntity setBirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public PersonEntity setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    @JsonIgnore
    public PersonEntity setOwnerID(String ownerID) {
        this.ownerID = ownerID;
        return this;
    }

    @JsonIgnore
    public PersonEntity setCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    @JsonIgnore
    public PersonEntity setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    @JsonIgnore
    public PersonEntity setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    @JsonIgnore
    public PersonEntity setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public String toString() {
        return "PersonEntity(personID=" + this.getPersonID() + ", userID=" + this.getUserID() + ", code=" + this.getCode() + ", name=" + this.getName() + ", gender=" + this.getGender() + ", mobile=" + this.getMobile() + ", email=" + this.getEmail() + ", nestlePosition=" + this.getNestlePosition() + ", position=" + this.getPosition() + ", positionName=" + this.getPositionName() + ", clientPosition=" + this.getClientPosition() + ", sapUserCode=" + this.getSapUserCode() + ", picIDCard=" + this.getPicIDCard() + ", isThirdParty=" + this.getIsThirdParty() + ", company=" + this.getCompany() + ", inDate=" + this.getInDate() + ", outDate=" + this.getOutDate() + ", trainingDate=" + this.getTrainingDate() + ", identityCard=" + this.getIdentityCard() + ", status=" + this.getStatus() + ", birthday=" + this.getBirthday() + ", isDeleted=" + this.getIsDeleted() + ", ownerID=" + this.getOwnerID() + ", createBy=" + this.getCreateBy() + ", createTime=" + this.getCreateTime() + ", lastModifiedBy=" + this.getLastModifiedBy() + ", lastModifiedTime=" + this.getLastModifiedTime() + ")";
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof PersonEntity)) {
            return false;
        } else {
            PersonEntity other = (PersonEntity)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label335: {
                    Object this$personID = this.getPersonID();
                    Object other$personID = other.getPersonID();
                    if (this$personID == null) {
                        if (other$personID == null) {
                            break label335;
                        }
                    } else if (this$personID.equals(other$personID)) {
                        break label335;
                    }

                    return false;
                }

                Object this$userID = this.getUserID();
                Object other$userID = other.getUserID();
                if (this$userID == null) {
                    if (other$userID != null) {
                        return false;
                    }
                } else if (!this$userID.equals(other$userID)) {
                    return false;
                }

                Object this$code = this.getCode();
                Object other$code = other.getCode();
                if (this$code == null) {
                    if (other$code != null) {
                        return false;
                    }
                } else if (!this$code.equals(other$code)) {
                    return false;
                }

                label314: {
                    Object this$name = this.getName();
                    Object other$name = other.getName();
                    if (this$name == null) {
                        if (other$name == null) {
                            break label314;
                        }
                    } else if (this$name.equals(other$name)) {
                        break label314;
                    }

                    return false;
                }

                label307: {
                    Object this$gender = this.getGender();
                    Object other$gender = other.getGender();
                    if (this$gender == null) {
                        if (other$gender == null) {
                            break label307;
                        }
                    } else if (this$gender.equals(other$gender)) {
                        break label307;
                    }

                    return false;
                }

                Object this$mobile = this.getMobile();
                Object other$mobile = other.getMobile();
                if (this$mobile == null) {
                    if (other$mobile != null) {
                        return false;
                    }
                } else if (!this$mobile.equals(other$mobile)) {
                    return false;
                }

                Object this$email = this.getEmail();
                Object other$email = other.getEmail();
                if (this$email == null) {
                    if (other$email != null) {
                        return false;
                    }
                } else if (!this$email.equals(other$email)) {
                    return false;
                }

                label286: {
                    Object this$nestlePosition = this.getNestlePosition();
                    Object other$nestlePosition = other.getNestlePosition();
                    if (this$nestlePosition == null) {
                        if (other$nestlePosition == null) {
                            break label286;
                        }
                    } else if (this$nestlePosition.equals(other$nestlePosition)) {
                        break label286;
                    }

                    return false;
                }

                label279: {
                    Object this$position = this.getPosition();
                    Object other$position = other.getPosition();
                    if (this$position == null) {
                        if (other$position == null) {
                            break label279;
                        }
                    } else if (this$position.equals(other$position)) {
                        break label279;
                    }

                    return false;
                }

                Object this$positionName = this.getPositionName();
                Object other$positionName = other.getPositionName();
                if (this$positionName == null) {
                    if (other$positionName != null) {
                        return false;
                    }
                } else if (!this$positionName.equals(other$positionName)) {
                    return false;
                }

                label265: {
                    Object this$clientPosition = this.getClientPosition();
                    Object other$clientPosition = other.getClientPosition();
                    if (this$clientPosition == null) {
                        if (other$clientPosition == null) {
                            break label265;
                        }
                    } else if (this$clientPosition.equals(other$clientPosition)) {
                        break label265;
                    }

                    return false;
                }

                Object this$sapUserCode = this.getSapUserCode();
                Object other$sapUserCode = other.getSapUserCode();
                if (this$sapUserCode == null) {
                    if (other$sapUserCode != null) {
                        return false;
                    }
                } else if (!this$sapUserCode.equals(other$sapUserCode)) {
                    return false;
                }

                label251: {
                    Object this$picIDCard = this.getPicIDCard();
                    Object other$picIDCard = other.getPicIDCard();
                    if (this$picIDCard == null) {
                        if (other$picIDCard == null) {
                            break label251;
                        }
                    } else if (this$picIDCard.equals(other$picIDCard)) {
                        break label251;
                    }

                    return false;
                }

                Object this$isThirdParty = this.getIsThirdParty();
                Object other$isThirdParty = other.getIsThirdParty();
                if (this$isThirdParty == null) {
                    if (other$isThirdParty != null) {
                        return false;
                    }
                } else if (!this$isThirdParty.equals(other$isThirdParty)) {
                    return false;
                }

                Object this$company = this.getCompany();
                Object other$company = other.getCompany();
                if (this$company == null) {
                    if (other$company != null) {
                        return false;
                    }
                } else if (!this$company.equals(other$company)) {
                    return false;
                }

                label230: {
                    Object this$inDate = this.getInDate();
                    Object other$inDate = other.getInDate();
                    if (this$inDate == null) {
                        if (other$inDate == null) {
                            break label230;
                        }
                    } else if (this$inDate.equals(other$inDate)) {
                        break label230;
                    }

                    return false;
                }

                label223: {
                    Object this$outDate = this.getOutDate();
                    Object other$outDate = other.getOutDate();
                    if (this$outDate == null) {
                        if (other$outDate == null) {
                            break label223;
                        }
                    } else if (this$outDate.equals(other$outDate)) {
                        break label223;
                    }

                    return false;
                }

                Object this$trainingDate = this.getTrainingDate();
                Object other$trainingDate = other.getTrainingDate();
                if (this$trainingDate == null) {
                    if (other$trainingDate != null) {
                        return false;
                    }
                } else if (!this$trainingDate.equals(other$trainingDate)) {
                    return false;
                }

                Object this$identityCard = this.getIdentityCard();
                Object other$identityCard = other.getIdentityCard();
                if (this$identityCard == null) {
                    if (other$identityCard != null) {
                        return false;
                    }
                } else if (!this$identityCard.equals(other$identityCard)) {
                    return false;
                }

                label202: {
                    Object this$status = this.getStatus();
                    Object other$status = other.getStatus();
                    if (this$status == null) {
                        if (other$status == null) {
                            break label202;
                        }
                    } else if (this$status.equals(other$status)) {
                        break label202;
                    }

                    return false;
                }

                label195: {
                    Object this$birthday = this.getBirthday();
                    Object other$birthday = other.getBirthday();
                    if (this$birthday == null) {
                        if (other$birthday == null) {
                            break label195;
                        }
                    } else if (this$birthday.equals(other$birthday)) {
                        break label195;
                    }

                    return false;
                }

                Object this$isDeleted = this.getIsDeleted();
                Object other$isDeleted = other.getIsDeleted();
                if (this$isDeleted == null) {
                    if (other$isDeleted != null) {
                        return false;
                    }
                } else if (!this$isDeleted.equals(other$isDeleted)) {
                    return false;
                }

                Object this$ownerID = this.getOwnerID();
                Object other$ownerID = other.getOwnerID();
                if (this$ownerID == null) {
                    if (other$ownerID != null) {
                        return false;
                    }
                } else if (!this$ownerID.equals(other$ownerID)) {
                    return false;
                }

                label174: {
                    Object this$createBy = this.getCreateBy();
                    Object other$createBy = other.getCreateBy();
                    if (this$createBy == null) {
                        if (other$createBy == null) {
                            break label174;
                        }
                    } else if (this$createBy.equals(other$createBy)) {
                        break label174;
                    }

                    return false;
                }

                label167: {
                    Object this$createTime = this.getCreateTime();
                    Object other$createTime = other.getCreateTime();
                    if (this$createTime == null) {
                        if (other$createTime == null) {
                            break label167;
                        }
                    } else if (this$createTime.equals(other$createTime)) {
                        break label167;
                    }

                    return false;
                }

                Object this$lastModifiedBy = this.getLastModifiedBy();
                Object other$lastModifiedBy = other.getLastModifiedBy();
                if (this$lastModifiedBy == null) {
                    if (other$lastModifiedBy != null) {
                        return false;
                    }
                } else if (!this$lastModifiedBy.equals(other$lastModifiedBy)) {
                    return false;
                }

                Object this$lastModifiedTime = this.getLastModifiedTime();
                Object other$lastModifiedTime = other.getLastModifiedTime();
                if (this$lastModifiedTime == null) {
                    if (other$lastModifiedTime != null) {
                        return false;
                    }
                } else if (!this$lastModifiedTime.equals(other$lastModifiedTime)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof PersonEntity;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $personID = this.getPersonID();
        result = result * 59 + ($personID == null ? 43 : $personID.hashCode());
        Object $userID = this.getUserID();
        result = result * 59 + ($userID == null ? 43 : $userID.hashCode());
        Object $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        Object $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $gender = this.getGender();
        result = result * 59 + ($gender == null ? 43 : $gender.hashCode());
        Object $mobile = this.getMobile();
        result = result * 59 + ($mobile == null ? 43 : $mobile.hashCode());
        Object $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        Object $nestlePosition = this.getNestlePosition();
        result = result * 59 + ($nestlePosition == null ? 43 : $nestlePosition.hashCode());
        Object $position = this.getPosition();
        result = result * 59 + ($position == null ? 43 : $position.hashCode());
        Object $positionName = this.getPositionName();
        result = result * 59 + ($positionName == null ? 43 : $positionName.hashCode());
        Object $clientPosition = this.getClientPosition();
        result = result * 59 + ($clientPosition == null ? 43 : $clientPosition.hashCode());
        Object $sapUserCode = this.getSapUserCode();
        result = result * 59 + ($sapUserCode == null ? 43 : $sapUserCode.hashCode());
        Object $picIDCard = this.getPicIDCard();
        result = result * 59 + ($picIDCard == null ? 43 : $picIDCard.hashCode());
        Object $isThirdParty = this.getIsThirdParty();
        result = result * 59 + ($isThirdParty == null ? 43 : $isThirdParty.hashCode());
        Object $company = this.getCompany();
        result = result * 59 + ($company == null ? 43 : $company.hashCode());
        Object $inDate = this.getInDate();
        result = result * 59 + ($inDate == null ? 43 : $inDate.hashCode());
        Object $outDate = this.getOutDate();
        result = result * 59 + ($outDate == null ? 43 : $outDate.hashCode());
        Object $trainingDate = this.getTrainingDate();
        result = result * 59 + ($trainingDate == null ? 43 : $trainingDate.hashCode());
        Object $identityCard = this.getIdentityCard();
        result = result * 59 + ($identityCard == null ? 43 : $identityCard.hashCode());
        Object $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
        Object $birthday = this.getBirthday();
        result = result * 59 + ($birthday == null ? 43 : $birthday.hashCode());
        Object $isDeleted = this.getIsDeleted();
        result = result * 59 + ($isDeleted == null ? 43 : $isDeleted.hashCode());
        Object $ownerID = this.getOwnerID();
        result = result * 59 + ($ownerID == null ? 43 : $ownerID.hashCode());
        Object $createBy = this.getCreateBy();
        result = result * 59 + ($createBy == null ? 43 : $createBy.hashCode());
        Object $createTime = this.getCreateTime();
        result = result * 59 + ($createTime == null ? 43 : $createTime.hashCode());
        Object $lastModifiedBy = this.getLastModifiedBy();
        result = result * 59 + ($lastModifiedBy == null ? 43 : $lastModifiedBy.hashCode());
        Object $lastModifiedTime = this.getLastModifiedTime();
        result = result * 59 + ($lastModifiedTime == null ? 43 : $lastModifiedTime.hashCode());
        return result;
    }
}
