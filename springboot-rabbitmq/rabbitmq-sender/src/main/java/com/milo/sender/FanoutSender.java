package com.milo.sender;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: Milogenius
 * @create: 2019-06-12 17:38
 * @description: Fanout模式生产者
 * <p>
 *     Fanout是路由广播的形式,将会把消息发给绑定它的全部队列,即便设置了key,也会被忽略.
 * </p>
 **/
@Component
public class FanoutSender {

    @Autowired
    private AmqpTemplate template;

    public void send() {
        template.convertAndSend("fanoutExchange","","hello world");
    }
}
