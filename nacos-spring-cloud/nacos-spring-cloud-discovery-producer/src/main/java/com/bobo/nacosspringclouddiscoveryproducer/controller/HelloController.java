package com.bobo.nacosspringclouddiscoveryproducer.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务提供方
 * @author wuxiaobo@didachuxing.com
 * @create 2019-01-16 20:19
 **/
@RestController
public class HelloController {

    @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
    public String echo(@PathVariable String string) {
        return "Hello Nacos Discovery " + string;
    }
}
