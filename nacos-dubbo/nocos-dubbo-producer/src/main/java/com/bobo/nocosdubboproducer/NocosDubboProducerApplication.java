package com.bobo.nocosdubboproducer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.bobo.nocosdubboproducer.service")
@PropertySource(value = "classpath:/dubbo-config.properties")
public class NocosDubboProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NocosDubboProducerApplication.class, args);
    }

}

