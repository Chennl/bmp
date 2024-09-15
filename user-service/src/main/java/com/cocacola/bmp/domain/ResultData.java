package com.cocacola.bmp.domain;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.cocacola.bmp.domain.constant.BizStatus;
import com.cocacola.bmp.domain.exception.BaseException;
import com.cocacola.bmp.domain.i18n.MessageUtils;
import com.cocacola.bmp.domain.page.Pagenation;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ObjectUtils;

import java.text.MessageFormat;
import java.util.List;

//@ApiModel( value = "响应参数(带分页)", description = "响应参数(带分页)")
@JsonIgnoreProperties({"pageIndex", "pageSize"})
public class ResultData<T> extends Pagenation {
    private static final Logger log = LoggerFactory.getLogger(ResultData.class);
   // @ApiModelProperty("返回数据的总行数")
    private long rows;
   // @ApiModelProperty("返回的代码")
    private Integer code = 0;
  //  @ApiModelProperty("返回的错误消息")
    private String message = "";
  //  @ApiModelProperty("返回的实体对象")
    private T data;

    public ResultData() {
    }

    public ResultData(String code) {
        this.code = Integer.parseInt(code);
        this.message = MessageUtils.get(code);
    }

    public ResultData(Integer code) {
        this.code = code;
    }

    public ResultData(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResultData(Integer code, String message, String arguments) {
        this.code = code;
        this.message = MessageFormat.format(message, arguments);
    }

    public ResultData(String code, String message) {
        this.code = Integer.parseInt(code);
        this.message = message;
    }

    public ResultData(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResultData(long rows, Integer code, String message, T data) {
        this.rows = rows;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResultData setCode(Integer code) {
        this.code = code;
        return this;
    }

    public ResultData setCode(String code) {
        this.code = Integer.parseInt(code);
        return this;
    }

    public static ResultData SUCCESS() {
        return new ResultData(BizStatus.SUCCESS.getStatus());
    }

    public static ResultData SUCCESS(Object data) {
        ResultData resultData = new ResultData(BizStatus.SUCCESS.getStatus());
        resultData.setData(data);
        if (data instanceof List) {
            resultData.setRows((long)((List)data).size());
            resultData.setLimit((long)((List)data).size());
            resultData.setOffset((long)((List)data).size());
        } else if (data instanceof IPage) {
            IPage pageInfo = (IPage)data;
            resultData.setData(pageInfo.getRecords());
            resultData.setLimit(pageInfo.getTotal());
            resultData.setRows(pageInfo.getRecords() == null ? 0L : (long)pageInfo.getRecords().size());
            resultData.setPageIndex(pageInfo.getCurrent());
            resultData.setPageSize(pageInfo.getSize());
            resultData.setOffset(pageInfo.offset());
        }

        return resultData;
    }

    public static ResultData FAIL() {
        return new ResultData(BizStatus.FAIL.getStatus(), BizStatus.FAIL.getMessage());
    }

    public static ResultData FAIL(String message) {
        return new ResultData(BizStatus.FAIL.getStatus(), message);
    }

    public static ResultData FAIL(Exception e) {
        if (e instanceof BaseException) {
            BaseException be = (BaseException)e;
            return new ResultData(be.getCode().toString(), be.getMessage());
        } else {
            return new ResultData(BizStatus.FAIL.getStatus(), BizStatus.FAIL.getMessage());
        }
    }

    public static ResultData FAIL(BizStatus status) {
        return new ResultData(status.getStatus(), status.getMessage());
    }

    public ResultData setIPage(IPage iPage) {
        this.setPageIndex(iPage.getCurrent());
        this.setPageSize(iPage.getSize());
        this.setLimit(iPage.getTotal());
        if (iPage.getRecords() != null) {
           
            this.setData((T)iPage.getRecords());
            this.setRows((long)iPage.getRecords().size());
        }

        return this;
    }

    public ResultData setIPageTow(IPage iPage) {
        this.setPageIndex(iPage.getCurrent());
        this.setPageSize(iPage.getSize());
        if (iPage.getRecords() != null) {
            this.setRows((long)iPage.getRecords().size());
        }

        return this;
    }

    public ResultData setPage(Pagenation page) {
        if (page != null) {
            this.setPageIndex(page.getPageIndex());
            this.setPageSize(page.getPageSize());
        } else {
            this.setPageIndex(1L);
            this.setPageSize(10L);
        }

        return this;
    }

    public static boolean isNotListEmpty(ResultData resultData) {
        return isNotEmpty(resultData) && !ObjectUtils.isEmpty(resultData.getData());
    }

    public static boolean isNotEmpty(ResultData resultData) {
        checkResponse(resultData);
        return resultData.getData() != null;
    }

    public static boolean checkResultData(ResultData resultData) {
        return resultData != null && resultData.getCode() == BizStatus.SUCCESS.getStatus();
    }

    public static void checkResponse(ResultData resultData) {
        if (resultData == null) {
            throw new BaseException(BizStatus.RESULTDATA_NULL);
        } else if (resultData.getCode() != BizStatus.SUCCESS.getStatus()) {
           // log.error("checkResponse:" + JsonUtils.toJsonString(resultData, new String[0]));
            throw new BaseException(resultData.getCode(), resultData.getMessage());
        }
    }

    public long getRows() {
        return this.rows;
    }

    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public T getData() {
        return this.data;
    }

    public ResultData<T> setRows(long rows) {
        this.rows = rows;
        return this;
    }

    public ResultData<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public ResultData<T> setData(T data) {
        this.data = data;
        return this;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ResultData)) {
            return false;
        } else {
            ResultData<?> other = (ResultData)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getRows() != other.getRows()) {
                return false;
            } else {
                label49: {
                    Object this$code = this.getCode();
                    Object other$code = other.getCode();
                    if (this$code == null) {
                        if (other$code == null) {
                            break label49;
                        }
                    } else if (this$code.equals(other$code)) {
                        break label49;
                    }

                    return false;
                }

                Object this$message = this.getMessage();
                Object other$message = other.getMessage();
                if (this$message == null) {
                    if (other$message != null) {
                        return false;
                    }
                } else if (!this$message.equals(other$message)) {
                    return false;
                }

                Object this$data = this.getData();
                Object other$data = other.getData();
                if (this$data == null) {
                    if (other$data != null) {
                        return false;
                    }
                } else if (!this$data.equals(other$data)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof ResultData;
    }

    public int hashCode() {
        int PRIME = 1;
        int result = 1;
        long $rows = this.getRows();
        result = result * 59 + (int)($rows >>> 32 ^ $rows);
        Object $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        Object $message = this.getMessage();
        result = result * 59 + ($message == null ? 43 : $message.hashCode());
        Object $data = this.getData();
        result = result * 59 + ($data == null ? 43 : $data.hashCode());
        return result;
    }

    public String toString() {
        return "ResultData(rows=" + this.getRows() + ", code=" + this.getCode() + ", message=" + this.getMessage() + ", data=" + this.getData() + ")";
    }
}
