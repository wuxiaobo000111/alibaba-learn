package com.bobo.nacosdubboconsumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableDubbo
@PropertySource(value = "classpath:/consumer-config.properties")
public class NacosDubboConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosDubboConsumerApplication.class, args);
    }

}

