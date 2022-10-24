package com.springcloud.server;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author 小韦
 * @Date 2022/10/17 14:54
 * @Version 1.0
 */
public interface PaymentService {

    String paymentInfo_OK(Integer id);

    String paymentInfo_TimeOut(Integer id);

    String paymentCircuitBreaker(@PathVariable("id") Integer id);
}
