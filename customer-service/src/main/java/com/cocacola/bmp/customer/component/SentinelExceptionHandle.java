package com.cocacola.bmp.customer.component;

import com.alibaba.csp.sentinel.adapter.spring.webmvc_v6x.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;

@Component
public class SentinelExceptionHandle implements BlockExceptionHandler{
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse response, String s, BlockException e) throws Exception {
        String msg ="未知异常";
        int status = 429;
        if(e instanceof FlowException){
            msg="请求被限流了";
        }
        else if(e instanceof ParamFlowException) {
            msg="请求被热点参数限流了";
        }
        else if(e instanceof DegradeException){msg="请求被降级了";}
        else if(e instanceof AuthorityException){msg="没有权限访问";status = 401;}
        response.setContentType("application/json;charset=utf-8");
        response.setStatus(status);
        response.getWriter().println("{\"msg\":"+msg +",\"status\":" +status+"}");
    }
}
