package com.zhaoyuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TSServer {
    public static void main(String[] args) {
        SpringApplication.run(TSServer.class);
    }
}