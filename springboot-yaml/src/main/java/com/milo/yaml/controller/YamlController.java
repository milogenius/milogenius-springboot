package com.milo.yaml.controller;

import com.milo.yaml.config.ValueConfig;
import com.milo.yaml.config.YamlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: Milogenius
 * @create: 2019-06-11 11:05
 * @description:
 **/
@Controller
@RequestMapping("/yaml")
public class YamlController {

    @Autowired
    private YamlConfig yamlConfig;

    @Autowired
    private ValueConfig valueConfig;

    @RequestMapping("/index1")
    @ResponseBody
    public String index1(){
        return yamlConfig.toString();
    }

    @RequestMapping("/index2")
    @ResponseBody
    public String index2(){
        return valueConfig.toString();
    }
}
