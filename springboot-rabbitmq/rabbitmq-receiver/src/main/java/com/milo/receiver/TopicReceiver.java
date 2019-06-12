package com.milo.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: Milogenius
 * @create: 2019-06-12 17:37
 * @description: Topic模式消费者
 **/
@Component
public class TopicReceiver {

    /**
     * 监听器监听指定的Queue
     * @param str
     */
    @RabbitListener(queues="topic.message")
    public void process1(String str) {
        System.out.println("message:"+str);
    }

    /**
     * 监听器监听指定的Queue
     * @param str
     */
    @RabbitListener(queues="topic.messages")
    public void process2(String str) {
        System.out.println("messages:"+str);
    }
}
