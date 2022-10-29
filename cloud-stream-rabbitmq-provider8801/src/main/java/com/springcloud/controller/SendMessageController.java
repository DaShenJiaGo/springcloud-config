package com.springcloud.controller;

import com.springcloud.server.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author 小韦
 * @Date 2022/10/28 23:22
 * @Version 1.0
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider message;

    @GetMapping("/sendMessage")
    public String sendMessage(){
        return message.send();
    }
}
