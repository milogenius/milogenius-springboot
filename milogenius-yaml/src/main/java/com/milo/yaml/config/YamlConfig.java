package com.milo.yaml.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: Milogenius
 * @create: 2019-06-11 10:33
 * @description:
 **/
@Component
@Getter
@Setter
@ConfigurationProperties(prefix = "milo-attributes")
@ToString
 public class YamlConfig {
    private String value;
    private String[] valueArray;
    private List<String> valueList;
    private HashMap<String, String> valueMap;
    private List<Map<String, String>> valueMapList;
}

