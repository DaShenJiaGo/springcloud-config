package com.lun;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 小韦
 * @Date 2022/10/15 10:24
 * @Version 1.0
 */
@Configuration
public class Myrule {

    @Bean
    public IRule RandomRule(){
        return new RandomRule();
    }
}
