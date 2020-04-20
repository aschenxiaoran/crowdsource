package com.xiaoran.crowdsource.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @ClassName EnableRedisAutoConfiguration
 * Description TODO
 * Author xiaoran
 * Date 2020/4/14 14:00
 * Version 1.0
 **/

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(RedisAutoConfiguration.class)
@Documented
public @interface EnableRedisAutoConfiguration {
}
