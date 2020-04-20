package com.xiaoran.crowdsource.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName RedisAutoConfiguration
 * Description TODO
 * Author xiaoran
 * Date 2020/4/14 11:28
 * Version 1.0
 **/
@Configuration
@EnableConfigurationProperties(RedisConfigProperties.class)
@ConditionalOnClass(RedisService.class)
@ConditionalOnProperty(prefix = "xiaoran.redis", value = "enable", matchIfMissing = true)
public class RedisAutoConfiguration {

    @Autowired
    private RedisConfigProperties redisProperties;

    @Bean
    @ConditionalOnMissingBean(RedisService.class)
    public RedisService redisService() {

        System.out.println("加载了redis-xiaoran");
        System.out.println("名称："+redisProperties.getServer());
        System.out.println("名称："+redisProperties.getName());
        System.out.println("名称："+redisProperties.getPassword());
        RedisService redisService = new RedisService();
        redisService.setRedisName(redisProperties.getServer());

        return redisService;
    }
}
