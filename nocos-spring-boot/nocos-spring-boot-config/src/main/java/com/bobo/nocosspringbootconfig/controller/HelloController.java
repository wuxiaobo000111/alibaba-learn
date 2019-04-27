package com.bobo.nocosspringbootconfig.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 * @create 2019-01-16 14:47
 **/
@RestController
public class HelloController {

    /**
     * 通过这个注解拿到name
     */
    @NacosValue(value = "${name:default}")
    private String name;

    @GetMapping(value = "/getName")
    public String getName() {
        return name;
    }
}
