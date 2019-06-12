package com.milo.redis.config.service.impl;

import com.milo.redis.config.service.IRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author: Milogenius
 * @create: 2019-06-11 18:01
 * @description:
 **/
@Service
public class RedisServiceImpl implements IRedisService {

    /**
     * 存储字符串类型
     */
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 存储对象类型
     */
    @Autowired
    private RedisTemplate redisTemplate;


    /**
     * 根据key获取缓存中的val
     * @param key
     * @return
     */
    @Override
    public String get(String key){
        return stringRedisTemplate.opsForValue().get(key);
    }

    @Override
    public void set(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
    }

    /**
     * 向redis里存入数据和设置缓存时间
     * @param key
     * @return
     */
    @Override
    public void set(String key,String value, long var3, TimeUnit var5){
        stringRedisTemplate.opsForValue().set(key, value,var3, var5);
    }

    /**
     * 根据key删除缓存
     * @param key
     * @return
     */
    @Override
    public Boolean delete(String key){
       return stringRedisTemplate.delete(key);
    }

    /**
     * 检查key是否存在，返回boolean值
     * @param key
     * @return
     */
    @Override
    public Boolean hasKey(String key){
       return stringRedisTemplate.hasKey(key);
    }

}
