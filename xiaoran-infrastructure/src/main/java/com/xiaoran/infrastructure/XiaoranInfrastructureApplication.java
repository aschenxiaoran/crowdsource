package com.xiaoran.infrastructure;

import com.xiaoran.crowdsource.config.EnableRedisAutoConfiguration;
import com.xiaoran.crowdsource.config.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRedisAutoConfiguration
public class XiaoranInfrastructureApplication {


    public static void main(String[] args) {
        System.out.println("启动基础应用");

        SpringApplication.run(XiaoranInfrastructureApplication.class, args);
    }

}
