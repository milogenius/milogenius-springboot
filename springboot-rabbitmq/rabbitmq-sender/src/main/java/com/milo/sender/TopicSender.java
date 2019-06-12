package com.milo.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: Milogenius
 * @create: 2019-06-12 17:38
 * @description: Topic模式生产者
 * <p>
 *     topic转发信息主要是依据通配符,队列和交换机的绑定主要是依据一种模式(通配符+字符串),而当发送消息的时候,
 *     只有指定的Key和该模式相匹配的时候,消息才会被发送到该消息队列中.
 * </p>
 **/
@Component
public class TopicSender {

    @Autowired
    private AmqpTemplate template;

    public void send() {
        template.convertAndSend("exchange","topic.message","hello world");
    }
}
