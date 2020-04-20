package com.xiaoran.crowdsource.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName RedisConfigProperties
 * Description TODO
 * Author xiaoran
 * Date 2020/4/14 11:24
 * Version 1.0
 **/
@ConfigurationProperties(prefix = "xiaoran.redis")
@Data
public class RedisConfigProperties {

    private String server;

    private String name;

    private String password;
}
