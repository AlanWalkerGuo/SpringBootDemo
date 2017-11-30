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
        return "hello";
    }

    /**
     * Springbootm默认使用jackson解析json
     * @return
     */
    @RequestMapping("/getStudent")
    public Student getStudent(){
        Student student =new Student();
        student.setId("1");
        student.setName("张三");
        student.setBirthdate(new Date());
        return student;
    }

}
