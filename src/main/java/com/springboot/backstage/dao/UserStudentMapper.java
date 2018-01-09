package com.springboot.backstage.dao;

import com.springboot.backstage.entity.UserStudent;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import tk.mybatis.mapper.common.Mapper;
@Repository
public interface UserStudentMapper extends Mapper<UserStudent> {
}