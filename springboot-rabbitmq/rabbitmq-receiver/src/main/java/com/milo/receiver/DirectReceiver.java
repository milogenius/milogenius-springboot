package com.milo.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: Milogenius
 * @create: 2019-06-12 16:59
 * @description: Direct模式的消费者
 **/
@Component
public class DirectReceiver {

    /**
     * 监听器监听指定的Queue
     * @param str
     */
    @RabbitListener(queues="queue")
    public void receive(String str) {
        System.out.println("Receive:"+str);
    }

}