package com.bobo.nocosspringbootdiscovery.configuration;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.spring.context.annotation.EnableNacos;
import org.springframework.context.annotation.Configuration;

/**
 * nacos配置,可以在这个类上添加一些配置，
 * 具体配置可以看一下NacosProperties这个类的实现
 * @author wuxiaobo@didachuxing.com
 * @create 2019-01-16 15:48
 **/
@Configuration
@EnableNacos(globalProperties = @NacosProperties(serverAddr = "127.0.0.1:8848"))
public class NacosConfigration {
}

