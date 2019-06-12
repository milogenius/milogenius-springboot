package com.milo.redis.controller;

import com.milo.redis.config.service.IRedisService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: Milogenius
 * @create: 2019-06-11 17:05
 * @description: redis的演示
 **/
@Controller
@RequestMapping("redis")
public class RedisController {


    /**
     * 存储对象类型
     */
    @Autowired
    private IRedisService redisService;


    @RequestMapping("index1")
    @ResponseBody
    public String test1(){
        String s = "milo";
        redisService.set("milo", s);
        return "milo";
    }
}
