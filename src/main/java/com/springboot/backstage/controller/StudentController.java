package com.springboot.backstage.controller;

import com.springboot.backstage.entity.Student;
import com.springboot.backstage.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@Controller
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
    public List<Student> queryStudentList(){
        return studentService.queryList();
    }

    @RequestMapping("/ceshi")
    public String ceshi(){
        return "/backstage/cesh.html";

    }

}
