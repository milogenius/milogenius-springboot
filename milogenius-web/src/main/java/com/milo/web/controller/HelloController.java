package com.milo.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Milogenius
 * @create: 2019-05-17 14:32
 * @description:
 **/
@RestController
public class HelloController {

    @RequestMapping("/hello")
    private String index(){
        return "Hello World!";
    }

}
