package com.springboot.backstage.service.impl;

import com.springboot.backstage.dao.UserStudentMapper;
import com.springboot.backstage.entity.UserStudent;
import com.springboot.backstage.service.StudentService;
import com.springboot.backstage.service.UserStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserStudentServiceImpl   implements UserStudentService {
    @Autowired
    private UserStudentMapper userStudentMapper;

    @Override
    public List<UserStudent> queryAll(UserStudent userStudent) {
        Example example = new Example(UserStudent.class);
        example.setOrderByClause("id desc");
        example.createCriteria()
               .andLike("name","%"+userStudent.getName()+"%").andEqualTo("id","5");
        List<UserStudent> countries = userStudentMapper.selectByExample(example);
        return countries;
    }

    @Override
    public int addStudent(UserStudent userStudent) {
        return userStudentMapper.insert(userStudent);
    }
}
