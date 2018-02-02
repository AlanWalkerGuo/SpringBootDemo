package com.springboot.backstage.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.backstage.entity.TestUser;
import com.springboot.backstage.service.TestUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestUserController {
    private Logger logger=LoggerFactory.getLogger(TestUserController.class);
    @Autowired
    private TestUserService testUserService;

    @RequestMapping("/insertTestUser")
    public int insertTestUser(TestUser testUser){
        logger.info("logger==============="+testUser.toString());
       return testUserService.insertTestUser(testUser);

    }

    @RequestMapping("/updateTestUser")
    public int updateTestUser(){
        return testUserService.updateTestUser();

    }


    @RequestMapping("/deleteTestUser")
    public int deleteTestUser(){
        return testUserService.deleteTestUser();

    }

    @RequestMapping("/deleteKeyTestUser")
    public int deleteKeyTestUser(){
        return testUserService.deleteKeyTestUser();

    }

    @RequestMapping("/selectTestUser")
    public List<TestUser> selectKeyTestUser(){
        return testUserService.selectTestUser();

    }

    @RequestMapping("/selectOneTestUser")
    public TestUser selectOneKeyTestUser(){
        return testUserService.selectOneTestUser();

    }

    @RequestMapping("/selectExample")
    public List<TestUser> selectExample(){
        return testUserService.selectExample();

    }

    @RequestMapping("/queryAll")
    public PageInfo<TestUser> queryAll(int pageNum, int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<TestUser> list=testUserService.queryAll();
        PageInfo<TestUser> pageInfo = new PageInfo <TestUser>(list);
        return pageInfo;
    }
}
