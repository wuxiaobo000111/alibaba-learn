package com.bobo.nacosspringcloudconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @create 2019-01-16 19:42
 **/
@RestController
@RefreshScope
public class HelloController {
    @Value("${name:default}")
    private String name;

    @RequestMapping("/get")
    public String get() {
        return name;
    }
}
