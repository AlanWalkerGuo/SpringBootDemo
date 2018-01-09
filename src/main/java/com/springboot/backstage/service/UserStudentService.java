package com.springboot.backstage.service;

import com.springboot.backstage.entity.UserStudent;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserStudentService {
    public List<UserStudent> queryAll(UserStudent userStudent);
    public int addStudent(UserStudent userStudent);
}
