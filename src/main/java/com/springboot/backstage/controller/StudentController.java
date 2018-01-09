package com.springboot.backstage.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.backstage.entity.Student;
import com.springboot.backstage.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/saveStudent")

    public Student saveStudent(Student student){
        int rs=studentService.save(student);
        System.out.println("rs="+rs);
        return student;
    }

    @RequestMapping("/queryStudentList")
    public PageInfo<Student> queryStudentList(int pageNum, int pageSize,Student student){
        //pageNum页码,pageSize条数

        PageHelper.startPage(pageNum,pageSize);
        List<Student>list=studentService.queryList();
        PageInfo<Student> pageInfo=new PageInfo<Student>(list);
        return pageInfo;
    }

    @RequestMapping("/delect")
    public int ceshi(String id){
        return studentService.removeStudent(id);

    }

}
