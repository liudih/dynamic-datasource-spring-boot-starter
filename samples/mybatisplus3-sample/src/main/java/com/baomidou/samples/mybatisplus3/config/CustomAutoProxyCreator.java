package com.baomidou.samples.mybatisplus3.config;

import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义对mapper的增强.
 * 用于测试： 当mapper存在嵌套的代理时,需要拿到最原始的 InvocationHandler 才能处理
 */
@Configuration
public class CustomAutoProxyCreator {
    @Bean
    public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
        DefaultAdvisorAutoProxyCreator proxyCreator = new DefaultAdvisorAutoProxyCreator();
        proxyCreator.setProxyTargetClass(true);
        return proxyCreator;
    }
}
