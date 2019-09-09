package com.sakura.userdao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@RefreshScope
public class UserDaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserDaoApplication.class, args);
    }

}
