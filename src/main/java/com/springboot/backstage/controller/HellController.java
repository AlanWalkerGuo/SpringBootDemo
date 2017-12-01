package com.springboot.backstage.controller;


import com.springboot.backstage.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

//SpringBoot提供了refult风格
// @RestController相当于@Controller和@ResponseBody
@RestController
public class HellController {

    @RequestMapping("/hello")
    public String hello(){
        return "hellows";
    }

    /**
     * Springbootm默认使用jackson解析json
     * @return
     */
    @RequestMapping("/getStudent")
    public Student getStudent(){
        Student student =new Student();
        student.setId("1");
        student.setName("李四");
        student.setBirthdate(new Date());
        return student;
    }

    /**
     * Springbootm默认使用jackson解析json
     * @return
     */
    @RequestMapping("/test")
    public String test(){
        return "test";
    }

    /**
     * Springbootm默认使用jackson解析json
     * @return
     */
    @RequestMapping("/test2")
    public String test2(){
        return "test5";
    }



}
