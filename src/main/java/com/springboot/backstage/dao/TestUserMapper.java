package com.springboot.backstage.dao;

import com.springboot.backstage.entity.TestUser;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
@Repository
public interface TestUserMapper extends Mapper<TestUser> {
}