package com.springboot.backstage.service.impl;

import com.springboot.backstage.dao.StudentMapper;
import com.springboot.backstage.entity.Student;
import com.springboot.backstage.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    @Transactional
    public int save(Student student) {
        return studentMapper.insertStudent(student);
    }
}
