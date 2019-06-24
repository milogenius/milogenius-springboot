package com.milo.thread.controller;

import com.milo.thread.service.IAsyncService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Milogenius
 * @create: 2019-06-24 11:45
 * @description:
 **/
@Slf4j
@RestController
public class ThreadController {

    @Autowired
    private IAsyncService asyncService;

    @RequestMapping("/")
    public String submit(){
        log.info("start submit");

        //调用service层的任务
        asyncService.executeAsync();

        log.info("end submit");

        return "success";
    }
}
