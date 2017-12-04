package com.springboot.backstage.controller;

import com.springboot.backstage.entity.Student;
import com.springboot.backstage.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
