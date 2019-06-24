package com.milo.thread.service.impl;

import com.milo.thread.service.IAsyncService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author: Milogenius
 * @create: 2019-06-24 11:43
 * @description:
 **/
@Slf4j
@Service
public class AsyncServiceImpl implements IAsyncService {

    @Override
    @Async("asyncServiceExecutor")
    public void executeAsync() {
        log.info("start executeAsync");
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
        log.info("end executeAsync");
    }

}
