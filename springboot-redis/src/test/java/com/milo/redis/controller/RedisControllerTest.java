package com.milo.redis.controller;

import com.milo.MilogeniusRedisApplication;
import com.milo.redis.config.service.IRedisService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MilogeniusRedisApplication.class)
public class RedisControllerTest {

    /**
     * 存储对象类型
     */
    @Autowired
    private IRedisService redisService;

    @Test
    public void test1() throws Exception {
        String s = "milo";
        redisService.set("milo", s);
    }

}