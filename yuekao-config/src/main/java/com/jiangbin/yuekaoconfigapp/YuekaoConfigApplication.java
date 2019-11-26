package com.jiangbin.yuekaoconfigapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class YuekaoConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(YuekaoConfigApplication.class,args);
    }
}
