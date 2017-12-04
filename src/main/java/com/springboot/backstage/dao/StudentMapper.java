package com.springboot.backstage.dao;

import com.springboot.backstage.entity.Student;

import java.util.List;

public interface StudentMapper {

    public int insertStudent(Student student);

    public List<Student> selectStudentList();

    public int delectStudent(String id);
}
