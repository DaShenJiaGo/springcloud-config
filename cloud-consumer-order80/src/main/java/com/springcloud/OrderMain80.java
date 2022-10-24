package com.springcloud;

import com.lun.Myrule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Author 小韦
 * @Date 2022/10/7 13:20
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
// (这个自定义配置类Myrule不能放在@ComponentScan所扫描的当前包下以及子包下，
//否则我们自定义的这个配置类就会被所有的Ribbon客户端所共享，达不到特殊化定制的目的了。)
//@RibbonClient(name="CLOUD-PAYMENT-SERVICE",configuration = Myrule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
