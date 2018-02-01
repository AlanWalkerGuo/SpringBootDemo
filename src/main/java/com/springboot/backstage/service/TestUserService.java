package com.springboot.backstage.service;

import com.springboot.backstage.entity.TestUser;

import java.util.List;

public interface TestUserService {
    public int insertTestUser(TestUser testUser);
    public int updateTestUser();
    public int deleteTestUser();
    public int deleteKeyTestUser();
    public List<TestUser> selectTestUser();
    public TestUser selectOneTestUser();
    public List<TestUser> selectExample();
    public List<TestUser> queryAll();
}
