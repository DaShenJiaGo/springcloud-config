package com.springcloud.controller;

import com.springcloud.Feign.PaymentFeign;
import com.springcloud.entity.CommonResult;
import com.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author 小韦
 * @Date 2022/10/15 13:46
 * @Version 1.0
 */

@RestController
@Slf4j
public class OrderFeginController {

    @Resource
    private PaymentFeign paymentFeign;

    @GetMapping("/consumer/payment/selectOne/{id}")
    public CommonResult<Payment> selectOne(@PathVariable("id") Long id){
        return paymentFeign.selectOne(id);
    }

    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        // OpenFeign客户端一般默认等待1秒钟,但是我设置了等待3秒，所以会报个500错误
        return paymentFeign.paymentFeignTimeout();
    }
}
