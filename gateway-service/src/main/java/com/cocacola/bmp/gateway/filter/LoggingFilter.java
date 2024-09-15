package com.cocacola.bmp.gateway.filter;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class LoggingFilter implements GlobalFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // 打印请求信息
        System.out.println("Request URI: " + exchange.getRequest().getURI());
        // 其他打印操作...

        // 继续执行过滤器链
        return chain.filter(exchange);
    }
}
