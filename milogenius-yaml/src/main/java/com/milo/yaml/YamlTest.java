package com.milo.yaml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author: Milogenius
 * @create: 2019-06-05 13:25
 * @description:
 **/
public class YamlTest {

    @Value("${my.secret}")
    private String secret ;


    public void test1() {
        System.out.println(secret);
    }
}
