package com.springboot.backstage.service;

import com.springboot.backstage.entity.Student;

import java.util.List;


public interface StudentService {

    public int save(Student student);
    public List<Student> queryList();
    public int removeStudent(String id);
}
