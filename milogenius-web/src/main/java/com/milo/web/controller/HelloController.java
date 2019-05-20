package com.milo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Milogenius
 * @create: 2019-05-17 14:32
 * @description:
 **/
@Controller
public class HelloController {

    @RequestMapping("/hello")
    private String hello(){
        return "Hello World!";
    }

    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
