package com.springcloud.Feign;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 小韦
 * @Date 2022/10/15 14:20
 * @Version 1.0
 */
@Configuration
public class FeginConfig {

/* 日志级别
NONE：默认的，不显示任何日志;
BASIC：仅记录请求方法、URL、响应状态码及执行时间;
HEADERS：除了BASIC中定义的信息之外，还有请求和响应的头信息;
FULL：除了HEADERS中定义的信息之外，还有请求和响应的正文及元数据。
YML文件里需要开启日志的Feign客户端
* */
    @Bean
    Logger.Level feignLoggerLevel()
    {
        return Logger.Level.FULL;
    }
}
