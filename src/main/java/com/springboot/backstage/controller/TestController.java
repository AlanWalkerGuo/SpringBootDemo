package com.springboot.backstage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/hehe")
    public String hehe(){
        return "hehe";
    }
}
