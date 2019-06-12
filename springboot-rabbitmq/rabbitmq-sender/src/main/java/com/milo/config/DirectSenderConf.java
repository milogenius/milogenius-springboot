package com.milo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Milogenius
 * @create: 2019-06-12 16:49
 * @description: Direct模式生产者配置类
 **/
@Configuration
public class DirectSenderConf {

    @Bean
    public Queue queue() {
        return new Queue("queue");
    }
}
