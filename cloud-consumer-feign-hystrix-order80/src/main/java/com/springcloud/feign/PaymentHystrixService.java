package com.springcloud.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author 小韦
 * @Date 2022/10/17 15:27
 * @Version 1.0
 */
@Component
//如果CLOUD-PROVIDER-HYSTRIX-PAYMENT服务器里面这些方法失败后进行降级除了，就用指定的方法fallback
@FeignClient(value = "CLOUD-PROVIDER-HYSTRIX-PAYMENT"
        ,fallback = PaymentFallbackService.class)//指定PaymentFallbackService类
public interface PaymentHystrixService {
    @GetMapping("/payment/hystrix/ok/{id}")
    String paymentInfo_OK(@PathVariable("id") Integer id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    String paymentInfo_TimeOut(@PathVariable("id") Integer id);

}
