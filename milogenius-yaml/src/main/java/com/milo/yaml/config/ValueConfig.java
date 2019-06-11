package com.milo.yaml.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author: Milogenius
 * @create: 2019-06-11 11:26
 * @description: 
 **/
@Component
@Getter
@Setter
@ToString
public class ValueConfig {

    @Value("${value}")
    private String value;

    @Value("#{'${list}'.split(',')}")
    private List<String> list;

    @Value("#{${maps}}")
    private Map<String,String> maps;

}
