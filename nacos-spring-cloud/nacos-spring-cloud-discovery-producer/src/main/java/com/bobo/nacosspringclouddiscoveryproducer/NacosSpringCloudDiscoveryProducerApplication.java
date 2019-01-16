package com.bobo.nacosspringclouddiscoveryproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosSpringCloudDiscoveryProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosSpringCloudDiscoveryProducerApplication.class, args);
    }

}

