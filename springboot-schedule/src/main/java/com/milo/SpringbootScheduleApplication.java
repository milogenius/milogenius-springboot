package com.milo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


/**
 * @author: milogenius
 * @create: 2019/6/14 10:25 
 * @description: 定时任务应用入口
 **/
@SpringBootApplication
public class SpringbootScheduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootScheduleApplication.class, args);
	}

}
