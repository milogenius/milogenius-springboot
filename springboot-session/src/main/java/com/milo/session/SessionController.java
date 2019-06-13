package com.milo.session;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author: Milogenius
 * @create: 2019-06-13 08:59
 * @description:
 **/
@RestController
public class SessionController {

    @Value("${server.port}")
    Integer port;

    @GetMapping("set")
    public String set(HttpSession session){
        session.setAttribute("user","milo");
        return String.valueOf(port);
    }

    @GetMapping("get")
    public String get(HttpSession session){
        return session.getAttribute("user")+":"+ port;
    }
}
