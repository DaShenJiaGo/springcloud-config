package com.springcloud.contorller;

import com.springcloud.entity.CommonResult;
import com.springcloud.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author 小韦
 * @Date 2022/10/7 13:30
 * @Version 1.0
 */
@RestController
@RequestMapping("/consumer")
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    private static  final String PAYMENT_URL="http://cloud-payment-service";

    @GetMapping("/payment/selectOne/{id}")
    public CommonResult<Payment>  selectOne(@PathVariable("id") Long id){

        return restTemplate.getForObject(PAYMENT_URL+"/payment/selectOne/"+id,CommonResult.class);
    }

    @GetMapping("/payment/inster")
    public CommonResult<Payment> inster(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/inster",payment,CommonResult.class,payment);
    }

    @GetMapping("/payment/selectOne/getForEntity/{id}")
    public CommonResult<Payment> EntitySelectOne(@PathVariable("id") Long id){
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL + "/payment/selectOne/" + id, CommonResult.class);
        if(entity.getStatusCode().is2xxSuccessful()){
            return entity.getBody();
        }else {
            return new CommonResult<>(500,"请求失败");
        }
    }
}
