package com.example.micruservicecloudprovidedept;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@MapperScan(value = "com.example.micruservicecloudprovidedept.mapper")
@EnableEurekaClient
@SpringBootApplication
public class MicruservicecloudProvideDeptApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicruservicecloudProvideDeptApplication.class, args);
    }

}
