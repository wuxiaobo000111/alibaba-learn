package com.bobo.nacos.spring.discovery.config;

import com.alibaba.nacos.api.annotation.NacosProperties;
import com.alibaba.nacos.spring.context.annotation.discovery.EnableNacosDiscovery;
import org.springframework.context.annotation.Configuration;

/**
 * nocos配置
 * @create 2019-01-12 17:39
 **/
@Configuration
@EnableNacosDiscovery(globalProperties = @NacosProperties(serverAddr = "127.0.0.1:8848"))
public class NacosConfiguration {
}
