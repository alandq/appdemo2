package com.anicert.cloud.test.appdemo2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

// 适配华为云istio，注释掉
@SpringBootApplication
//@EnableDiscoveryClient
@MapperScan("com.anicert.cloud.test.appdemo2.mapper")
public class Appdemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Appdemo2Application.class, args);
    }

}
