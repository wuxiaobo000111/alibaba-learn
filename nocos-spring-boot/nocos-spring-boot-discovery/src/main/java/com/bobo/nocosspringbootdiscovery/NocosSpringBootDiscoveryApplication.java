package com.bobo.nocosspringbootdiscovery;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NacosPropertySource(dataId = "nocos-spring-boot-discovery", autoRefreshed = true)
public class NocosSpringBootDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(NocosSpringBootDiscoveryApplication.class, args);
    }

}

