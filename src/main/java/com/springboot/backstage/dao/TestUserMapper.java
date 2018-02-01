package com.springboot.backstage.dao;

import com.springboot.backstage.entity.TestUser;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface TestUserMapper extends Mapper<TestUser> {
    public List<TestUser> queryAll();
}