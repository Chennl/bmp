package com.cocacola.bmp.domain.exception;

import com.cocacola.bmp.domain.constant.BizStatus;

import java.text.MessageFormat;

public class BaseException extends RuntimeException {
    private Integer code = 0;

    public BaseException() {
    }

    public BaseException(Integer code) {
        //super(MessageUtils.get(String.valueOf(code)));
        super(String.valueOf(code));
        this.code = code;
    }

    public BaseException(BizStatus bizStatus) {
        super(String.valueOf(bizStatus.getMessage()));
        this.code = bizStatus.getStatus();
    }

    public BaseException(Object arguments, BizStatus bizStatus) {
        super(MessageFormat.format(bizStatus.getMessage(), arguments));
        this.code = bizStatus.getStatus();
    }

    public BaseException(BizStatus bizStatus, String arguments) {
        super(bizStatus.getMessage() + arguments);
        this.code = bizStatus.getStatus();
    }

    public BaseException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public BaseException(String message) {
        super(message);
        this.code = 1;
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof BaseException)) {
            return false;
        } else {
            BaseException other = (BaseException)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$code = this.getCode();
                Object other$code = other.getCode();
                if (this$code == null) {
                    if (other$code != null) {
                        return false;
                    }
                } else if (!this$code.equals(other$code)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof BaseException;
    }

    public int hashCode() {
        int PRIME = 1;
        int result = 1;
        Object $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        return result;
    }

    public String toString() {
        return "BaseException(code=" + this.getCode() + ")";
    }
}
