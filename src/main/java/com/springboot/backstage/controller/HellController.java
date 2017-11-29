package com.springboot.backstage.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController相当于@Controller和@ResponseBody
@RestController
@RequestMapping("/springboot")
public class HellController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
