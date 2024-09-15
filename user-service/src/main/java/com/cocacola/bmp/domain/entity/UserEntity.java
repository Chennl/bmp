package com.cocacola.bmp.domain.entity;


import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@TableName("MD_User")
@Data
@NoArgsConstructor
public class UserEntity implements Serializable {
        @TableId("UserID")
        private String userID;
        @TableField("PersonID")
        private String personID;
        @TableField("UserCode")
        private String userCode;
        @TableField("CompanyCode")
        private String companyCode;
        @TableField("RouteNo")
        private String routeNo;
        @TableField("NextMonthRouteNo")
        private String nextMonthRouteNo;
        @TableField("WXuserID")
        private String wxuserID;
        @TableField("WXcorpID")
        private String wxcorpID;
        @TableField("LoginName")
        private String loginName;
        @TableField("Password")
        private String password;
        @TableField("LineManager")
        private String lineManager;
        @TableField("IsMobileUser")
        private String isMobileUser;
        @TableField("IsLocked")
        private String isLocked;
        @TableField("LastLoginTime")
        private String lastLoginTime;
        @TableField("PicAvatar")
        private String picAvatar;
        @TableField("FailLoginCount")
        private Integer failLoginCount;
        @TableField("BUcode")
        private String bucode;
        @TableField("IsDeleted")
        private String isDeleted;
        @TableField("OrgJson")
        private String orgJson;
        @TableField("OrgJsonSixLevel")
        private String orgJsonSixLevel;
        @TableField("DisableReason")
        private String disableReason;
        @TableField("WXdeviceID")
        private String wxdeviceID;
        @TableField("CurrentUserCode")
        private String currentUserCode;
        @TableField("RouteNoFlag")
        private String routeNoFlag;
        @TableField("MgrRouteNo")
        private String mgrRouteNo;
        @TableField("DomainAccount")
        private String domainAccount;
        @TableField("OwnerID")
        private String ownerID;
        @TableField("Tenant")
        private String tenant;
        @TableField(
                value = "CreateBy",
                fill = FieldFill.INSERT
        )
        private String createBy;
        @TableField(
                value = "CreateTime",
                fill = FieldFill.INSERT
        )
        private String createTime;
        @TableField(
                value = "LastModifiedBy",
                fill = FieldFill.INSERT_UPDATE
        )
        private String lastModifiedBy;
        @TableField(
                value = "LastModifiedTime",
                fill = FieldFill.INSERT_UPDATE
        )
        private String lastModifiedTime;


    public String toString() {
            return "UserEntity(userID=" + this.getUserID() + ", personID=" + this.getPersonID() + ", userCode=" + this.getUserCode() + ", companyCode=" + this.getCompanyCode() + ", routeNo=" + this.getRouteNo() + ", nextMonthRouteNo=" + this.getNextMonthRouteNo() + ", wxuserID=" + this.getWxuserID() + ", wxcorpID=" + this.getWxcorpID() + ", loginName=" + this.getLoginName() + ", password=" + this.getPassword() + ", lineManager=" + this.getLineManager() + ", isMobileUser=" + this.getIsMobileUser() + ", isLocked=" + this.getIsLocked() + ", lastLoginTime=" + this.getLastLoginTime() + ", picAvatar=" + this.getPicAvatar() + ", failLoginCount=" + this.getFailLoginCount() + ", bucode=" + this.getBucode() + ", isDeleted=" + this.getIsDeleted() + ", orgJson=" + this.getOrgJson() + ", orgJsonSixLevel=" + this.getOrgJsonSixLevel() + ", disableReason=" + this.getDisableReason() + ", wxdeviceID=" + this.getWxdeviceID() + ", currentUserCode=" + this.getCurrentUserCode() + ", routeNoFlag=" + this.getRouteNoFlag() + ", mgrRouteNo=" + this.getMgrRouteNo() + ", domainAccount=" + this.getDomainAccount() + ", ownerID=" + this.getOwnerID() + ", tenant=" + this.getTenant() + ", createBy=" + this.getCreateBy() + ", createTime=" + this.getCreateTime() + ", lastModifiedBy=" + this.getLastModifiedBy() + ", lastModifiedTime=" + this.getLastModifiedTime() + ")";
        }
}
