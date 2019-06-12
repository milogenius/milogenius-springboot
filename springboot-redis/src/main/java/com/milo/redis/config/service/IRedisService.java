package com.milo.redis.config.service;

import java.util.concurrent.TimeUnit;

/**
 * @author: Milogenius
 * @create: 2019-06-11 18:00
 * @description:
 **/
public interface IRedisService {
    /**
     * 根据key获取缓存中的val
     * @param key
     * @return
     */
     String get(String key);

    /**
     * 向redis里存入数据
     * @param key
     * @param value
     * @return
     */
    void set(String key, String value);

    /**
     * 向redis里存入数据和设置缓存时间
     * @param key
     * @param value
     * @param var3
     * @param var5
     * @return
     */
     void set(String key,String value, long var3, TimeUnit var5);

    /**
     * 根据key删除缓存
     * @param key
     * @return
     */
     Boolean delete(String key);

    /**
     * 检查key是否存在，返回boolean值
     * @param key
     * @return
     */
     Boolean hasKey(String key);

}
