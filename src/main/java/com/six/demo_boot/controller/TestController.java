package com.six.demo_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class TestController {
    @GetMapping("/test/hello")
    public String hello(){
        HashMap<String, String> map = new HashMap<>();
        map.put("性别","男");
        map.put("爱好","女");
        ///jjjjjj
        return map.toString();
    }
    @GetMapping
    public String shouye(){
        return "首页";
    }
}
