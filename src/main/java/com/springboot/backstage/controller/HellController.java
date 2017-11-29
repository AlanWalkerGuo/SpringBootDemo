package com.springboot.backstage.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//SpringBoot提供了refult风格
// @RestController相当于@Controller和@ResponseBody
@RestController
public class HellController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
