package com.milo.schedule;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: Milogenius
 * @create: 2019-06-14 10:26
 * @description: 基于注解的定时任务
 **/
@EnableScheduling //开启定时任务
@Configuration
@Component
public class ScheduledTask {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm: ss");

    /**
     *     对于 @Scheduled 的使⽤可以总结如下⼏种⽅式：
     *     @Scheduled(fixedRate = 5000) ：上⼀次开始执⾏时间点之后5秒再执⾏
     *     @Scheduled(fixedDelay = 5000) ：上⼀次执⾏完毕时间点之后5秒再执⾏
     *     @Scheduled(initialDelay=1000, fixedRate=5000) ：第⼀次延迟1秒后执⾏，之后按fixedRate的规则每5秒执⾏⼀次
     *     @Scheduled(cron="") ：通过cron表达式定义规则
     */
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }
}
