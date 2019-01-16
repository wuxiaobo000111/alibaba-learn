package com.bobo.nocosspringbootconfig;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NacosPropertySource(dataId = "nocos-spring-boot-config", autoRefreshed = true)
public class NocosSpringBootConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(NocosSpringBootConfigApplication.class, args);
    }
}

