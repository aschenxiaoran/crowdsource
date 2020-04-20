package com.xiaoran.crowdsource.config;

/**
 * @ClassName Description TODO
 * Author xiaoran
 * Date 2020/4/14 11:31
 * Version 1.0
 **/
public class RedisService {

    private String redisName;

    public void setRedisName(String redisName){
        this.redisName=redisName;
    }

    public String getRedisConfig(){
        return redisName;
    }
}
