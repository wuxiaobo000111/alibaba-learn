package com.bobo.nacosdubboconsumer.controller;

import com.bobo.nacosdubboconsumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuxiaobo@didachuxing.com
 * @create 2018-12-15 13:16
 **/
@RestController
public class NacosController {

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping(value = "/hello")
    public String sayHello(String name) {
        return consumerService.sayName(name);
    }
}
