package com.bobo.nacosdubboconsumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bobo.nacos.dubbo.api.NacosDubboIface;
import org.springframework.stereotype.Service;

/**
 * @author wuxiaobo@didachuxing.com
 * @create 2018-12-15 13:14
 **/
@Service
public class ConsumerService {

    @Reference(version = "${demo.service.version}")
    private NacosDubboIface nacosService;


    public String sayName(String name) {
        return nacosService.sayName(name);
    }
}
