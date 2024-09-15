package com.cocacola.bmp.domain.constant;

public class BizStatus {
    public static final BizStatus SUCCESS = new BizStatus(0, "");
    public static final BizStatus FAIL = new BizStatus(1, "其他错误");
    public static final BizStatus SYSTEM_ERROR = new BizStatus(9999, "系统错误");
    public static final BizStatus VALIDATION_ERROR = new BizStatus(9998, "参数校验错误");
    public static final BizStatus MISSING_PARAM_ERROR = new BizStatus(9997, "参数缺失");
    public static final BizStatus ILLEGAL_STATE_ERROR = new BizStatus(9996, "逻辑状态不正确");
    public static final BizStatus REACH_MAXIMUN_RETRY_COUNT = new BizStatus(9995, "达到最大重试次数");
    public static final BizStatus ROLLBACK = new BizStatus(8998, "业务错误，数据回滚");
    public static final BizStatus BIZ_ERROR = new BizStatus(8999, "业务错误");
    public static final BizStatus INTERNAL_ERROR = new BizStatus(7999, "内部错误");
    public static final BizStatus SURVEY_DESC_BEEN_EXISTED = new BizStatus(7999, "问卷标题已经存在");
    public static final BizStatus RESULTDATA_NULL = new BizStatus(7999, "ResultData对象为null");
    public static final BizStatus FINDDATA_NULL = new BizStatus(7999, "查询数据为空");
    public static final BizStatus FINDDATAL_ORGUSER_NUL = new BizStatus(7999, "查询此销售区域无可选人员");
    public static final BizStatus REDIS_POSITION_NULL = new BizStatus(7999, "Redis缓存数据暂无");
    public static final BizStatus DATA_EXISTED = new BizStatus(7999, "数据已经存在");
    public static final BizStatus REDIS_ERROR = new BizStatus(7999, "Redis服务异常");
    public static final BizStatus WX_SECMSGCHECK_ERROR = new BizStatus(6001, "提交信息包含敏感信息，请修改后重试");
    public static final BizStatus IS_OCCUPIED = new BizStatus(6999, "当前信息已被使用");
    public static final BizStatus NAME_EXISTED = new BizStatus(2001, "名字已经存在");
    public static final BizStatus LOGIN_NAME_EXISTED = new BizStatus(2001, "该账号已经存在");
    public static final BizStatus TYPE_EXISTED = new BizStatus(2001, "该类型已经存在");
    public static final BizStatus VALUE_EXISTED = new BizStatus(2001, "Value已经存在");
    public static final BizStatus NAMECN_EXISTED = new BizStatus(2001, "中文名称已经存在");
    public static final BizStatus NAMEEN_EXISTED = new BizStatus(2001, "英文名称已经存在");
    public static final BizStatus SHORT_NAMECN_EXISTED = new BizStatus(2001, "中文简称已经存在");
    public static final BizStatus SHORT_NAMEEN_EXISTED = new BizStatus(2001, "英文简称已经存在");
    public static final BizStatus FULL_NAMECN_EXISTED = new BizStatus(2001, "中文全称已经存在");
    public static final BizStatus FULL_NAMEEN_EXISTED = new BizStatus(2001, "英文全称已经存在");
    public static final BizStatus MOBILE_EXISTED = new BizStatus(2001, "该手机号已经存在");
    public static final BizStatus EMAIL_EXISTED = new BizStatus(2001, "该邮箱已经存在");
    public static final BizStatus CODE_EXISTED = new BizStatus(2001, "编码已经存在");
    public static final BizStatus CODENAME_EXISTED = new BizStatus(2001, "编码已经存在");
    public static final BizStatus LEVEL_EXISTED = new BizStatus(2001, "等级已经存在");
    public static final BizStatus TIME_LENGTH_EXISTED = new BizStatus(2001, "时长重复");
    public static final BizStatus DESC_EXISTED = new BizStatus(2001, "描述信息重复");
    public static final BizStatus LOGINACCOUNT_IS_DELETED = new BizStatus(2003, "登录账号已被删除，请找管理人员找回");
    public static final BizStatus LOGINACCOUNT_IS_LOCKED = new BizStatus(2003, "登录账号已被锁定，请找管理人员解锁");
    public static final BizStatus LOGINACCOUNT_VALID_FALSE = new BizStatus(2003, "登录账号无效，请找管理人员激活");
    public static final BizStatus LOGINACCOUNT_NAME_NOT_EXISTED = new BizStatus(2003, "登录账号不存在");
    public static final BizStatus LOGINACCOUNT_NAME_OR_PWD_NOT_EXISTED = new BizStatus(2003, "登录账号或密码错误");
    public static final BizStatus LOGINACCOUNT_IS_NOT_OPEN = new BizStatus(2003, "登录账号未开通，请联系您的企业微信管理员进行处理");
    public static final BizStatus LOGINACCOUNT_PWD_NOT_RIGHT = new BizStatus(2003, "登录密码错误");
    public static final BizStatus LOGINACCOUNT_PWD_NOT_RIGHT2 = new BizStatus(2003, "登录密码错误，还有{0}次机会！");
    public static final BizStatus LOGINACCOUNT_PWD_NOT_RIGHT3 = new BizStatus(2003, "登录账号或密码错误，还有{0}次机会！");
    public static final BizStatus LOGIN_TIME_FILE = new BizStatus(2003, "当前系统正在维护中，请7点后登录使用");
    public static final BizStatus LOG_MDM_STATUS_FILE = new BizStatus(2009, "您的设备不符合公司的安全策略，无法正常运行乐销通。请提交12580报障，或联系厂房IT团队！");
    public static final BizStatus LOGIN_ERROR_SEARCH_USER = new BizStatus(2003, "租户数据库中未查询到登录人信息");
    public static final BizStatus LOGIN_ERROR_TENANT_NOT_EXISTED = new BizStatus(2003, "该企业租户信息不存在");
    public static final BizStatus LOGIN_ERROR_TENANT_REPATE = new BizStatus(2003, "租户昵称已存在");
    public static final BizStatus LOGIN_ERROR_ENCRYPTEDDATA = new BizStatus(2003, "解析加密信息失败");
    public static final BizStatus LOGIN_NOT_EXISTED_USER_MOBLIE = new BizStatus(2003, "未找到此手机号的用户");
    public static final BizStatus PWD_LEVEL_SET_IS_INVALID = new BizStatus(2003, "密码等级未设置");
    public static final BizStatus PWD_VALUE_IS_INVALID = new BizStatus(2003, "密码强度未通过验证");
    public static final BizStatus DATA_MOBLIE_ERROR = new BizStatus(2003, "手机号格式不正确");
    public static final BizStatus LOGIN_CORP_ID_ERROR = new BizStatus(2003, "所属企业ID与校验参数中的CorpID不一致");
    public static final BizStatus PWD_OLD_VALUE_IS_ERROR = new BizStatus(2003, "旧密码输入错误");
    public static final BizStatus USER_ROLE_UPDATE_ERROR = new BizStatus(2003, "修改人员角色信息时出错");
    public static final BizStatus USER_ORG_UPDATE_ERROR = new BizStatus(2003, "修改人员角色信息时出错");
    public static final BizStatus USER_ROLE_CREATE_ERROR = new BizStatus(2003, "创建人员角色信息时出错");
    public static final BizStatus USER_ORG_CREATE_ERROR = new BizStatus(2003, "创建人员角色信息时出错");
    public static final BizStatus ROLE_NAME_NOT_NULL = new BizStatus(2003, "角色名称不能为空");
    public static final BizStatus ROLE_CODE_NOT_NULL = new BizStatus(2003, "角色编号不能为空");
    public static final BizStatus OBJECT_NOT_EXISTED = new BizStatus(2003, "object数据不存在");
    public static final BizStatus OBJECT_FIELD_NOT_NULL = new BizStatus(2003, "字段{0}不能为空");
    public static final BizStatus ID_INVALID = new BizStatus(2004, "id参数无效");
    public static final BizStatus USERID_INVALID = new BizStatus(2004, "参数人员ID无效或不存在");
    public static final BizStatus ROLEID_INVALID = new BizStatus(2004, "参数角色ID无效或不存在");
    public static final BizStatus CORPID_INVALID = new BizStatus(2004, "企微ID异常");
    public static final BizStatus TENANTID_INVALID = new BizStatus(2004, "租户ID异常");
    public static final BizStatus ID_NOT_EXISTED = new BizStatus(2004, "id参数不存在，id是必填项");
    public static final BizStatus CUSTOMER_ID_NOT_EXISTED = new BizStatus(2004, "CustomerID参数不存在，id是必填项");
    public static final BizStatus ID_IDS_MEANWHILE_NOT_EXISTED = new BizStatus(2004, "id和ids参数不可以同时为空");
    public static final BizStatus OBJECT_NAME_NOT_EMPTY = new BizStatus(2005, "objectName参数不能为空，id是必填项");
    public static final BizStatus WX_USER_ID_NOT_EXISTED = new BizStatus(2006, "企业微信UserID读取失败");
    public static final BizStatus FIELD_NAME_NOT_EXISTED = new BizStatus(2006, "字段{0}不存在");
    public static final BizStatus FIELD_TYPE_NOT_NULL = new BizStatus(2006, "字段类型不能为空");
    public static final BizStatus FIELD_TYPE_NOT_VALID = new BizStatus(2006, "字段类型不对");
    public static final BizStatus FIELD_NAME_HAVE_BEEN_EXISTED = new BizStatus(2006, "字段{0}已经存在");
    public static final BizStatus TEMPLATE_URL_NOT_EXISTED = new BizStatus(2006, "未找到该类型的模版URL");
    public static final BizStatus IMPORT_TYPE_NOT_TEMPLATE = new BizStatus(2006, "请下载最新模板，再重新导入！");
    public static final BizStatus TEMPLATE_TYPE_NOT_EXISTED = new BizStatus(2006, "未找到该类型的模版");
    public static final BizStatus TEMPLATE_DOWNLOAD_ERROR = new BizStatus(2006, "模版下载失败，请联系管理人员");
    public static final BizStatus FIELD_LABEL_NAME_CN_HAVE_BEEN_EXISTED = new BizStatus(2006, "字段说明“{0}”已经存在");
    public static final BizStatus FIELD_NAME_NEED_BEEN_REQUIRED = new BizStatus(2006, "自定义字段{0}是必填的，字段动态配置也必须为必填的");
    public static final BizStatus KEY_NAME_HAVE_BEEN_EXISTED = new BizStatus(2006, "字段名称{0}已经存在");
    public static final BizStatus SEQUENCE_HAVE_BEEN_EXISTED = new BizStatus(2006, "序号为{0}的值已经存在");
    public static final BizStatus KEY_NAME_NOT_EXISTED = new BizStatus(2006, "字段名称{0}不存在");
    public static final BizStatus ID_IS_NUMBER = new BizStatus(2007, "id必须为整数");
    public static final BizStatus FIELD_LENTH_TOO_LONG = new BizStatus(2006, "字段{0}的长度超过了设置的长度");
    public static final BizStatus FIELD_NOT_IS_LIST = new BizStatus(2006, "字段{0}不可以为List类型");
    public static final BizStatus DATA_ERROR_USER_DEPT = new BizStatus(2008, "该部门下未关联任何人员");
    public static final BizStatus DATA_ERROR_USER_ORG = new BizStatus(2008, "该销售区域下未关联任何人员");
    public static final BizStatus DATA_ERROR_ORG_USER_ROLE = new BizStatus(2008, "该销售区域下人员未关联此角色");
    public static final BizStatus DATA_ERROR_TENANT = new BizStatus(2008, "该租户数据异常");
    public static final BizStatus DATA_USER_TENANT_NOT_EXISTED = new BizStatus(2008, "未找到使用此手机号的租户信息，请联系管理员");
    public static final BizStatus LONGITUDE_NOT_NULL = new BizStatus(2008, "Longitude不能为空");
    public static final BizStatus LATITUDE_NOT_NULL = new BizStatus(2008, "Latitude不能为空");
    public static final BizStatus RADIUS_NOT_NULL = new BizStatus(2008, "Radius不能为空");
    public static final BizStatus ORDER_PRODUCT_QTY_NOT_NULL = new BizStatus(2008, "订单至少选中一样商品");
    public static final BizStatus PRODUCT_WAREHOUSE_DATA_NULL = new BizStatus(2008, "库存中无此商品");
    public static final BizStatus PRODUCT_WAREHOUSE_NUM_INSUFF = new BizStatus(2008, "商品库存不足");
    public static final BizStatus REBATE_NUM_INSUFF = new BizStatus(2008, "返利额度不足");
    public static final BizStatus SAP_ORDERNO_INSUFF = new BizStatus(2008, "生产SaqOrderNo失败");
    public static final BizStatus REFUND_ERROR = new BizStatus(2008, "退款申请失败");
    public static final BizStatus REFUND_ERROR_IN_ACTIVE = new BizStatus(2008, "退款申请动作中断");
    public static final BizStatus ORDER_QUERY_ERROR_IN_ACTIVE = new BizStatus(2008, "支付结果查询动作中断");
    public static final BizStatus ORDER_NOT_EXISTED = new BizStatus(2008, "未查询到此订单");
    public static final BizStatus MSG_ERROR = new BizStatus(2008, "信息服务出现错误");
    public static final BizStatus VALIDATE_CODE_ERROR = new BizStatus(2004, "验证码错误");
    public static final BizStatus VALIDATE_PASSWORD_ERROR = new BizStatus(2004, "密码错误");
    public static final BizStatus VALIDATE_CODE_INVALID = new BizStatus(2004, "验证码失效");
    public static final BizStatus WXGZ_UNSUBSCRIBE = new BizStatus(2004, "未关注公众号");
    public static final BizStatus HOUSE_OPTIMISTIC_LOCK = new BizStatus(3001, "库存被锁定，请重新选择产品数量");
    public static final BizStatus APPLY_REPEAT = new BizStatus(4001, "已存在相同申请");
    public static final BizStatus DATE_ISNOTNULL = new BizStatus(4002, "开始日期和结束日期不能为空");
    public static final BizStatus VERIFICATIONCODE_ISNULL = new BizStatus(10002, "验证码不能为空");
    public static final BizStatus VERIFICATIONCODE_WRONG = new BizStatus(10003, "验证码错误");
    public static final BizStatus AUTHCODE_ISNOTEXISTS = new BizStatus(10007, "图片验证码不存在");
    public static final BizStatus AUTHCODE_ISWRONG = new BizStatus(10008, "图片验证码错误");
    private int status;
    private String message;

    protected BizStatus(int status, String message) {
        this.setStatus(status);
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}