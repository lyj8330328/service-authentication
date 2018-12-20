package com.service.called.becalled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: 98050
 * @Time: 2018-12-20 15:10
 * @Feature:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BeCalledServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(BeCalledServiceApplication.class,args);
    }
}
