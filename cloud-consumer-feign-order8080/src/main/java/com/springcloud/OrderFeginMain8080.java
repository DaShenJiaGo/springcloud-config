package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author 小韦
 * @Date 2022/10/15 13:39
 * @Version 1.0
 */
@SpringBootApplication
@EnableFeignClients
public class OrderFeginMain8080 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeginMain8080.class,args);
    }
}
