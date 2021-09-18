package com.spring.cloud.testfreemarker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Controller
@RequestMapping("freemarker")
public class FreemarkerController {
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/test1")
    public String freemarker(Map<String, Object> map){
        map.put("name","java 开发工程师");
        map.put("age","10");
        map.put("money","保密");
        return "test1";
    }
}
