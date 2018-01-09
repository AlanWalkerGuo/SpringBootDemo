package com.springboot.backstage.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.backstage.entity.Student;
import com.springboot.backstage.entity.UserStudent;
import com.springboot.backstage.service.UserStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;


@RestController
public class UserStudentController {
    @Autowired
    private UserStudentService userStudentService;

    @RequestMapping("/queryUserStudent")

    public PageInfo<UserStudent> queryUserStudent(UserStudent userStudent,int pageNum,int pageSize){

        PageHelper.startPage(pageNum,pageSize);
        List<UserStudent> list=userStudentService.queryAll(userStudent);
        PageInfo<UserStudent> pageInfo=new PageInfo<UserStudent>(list);
        return pageInfo;

    }



    @RequestMapping("/addUserStudent")
    public int addUserStudent(UserStudent userStudent){
        return userStudentService.addStudent(userStudent);
    }
}
