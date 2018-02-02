package com.springboot.backstage.service.impl;

import com.springboot.backstage.dao.TestUserMapper;
import com.springboot.backstage.entity.TestUser;
import com.springboot.backstage.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestUserServiceImpl implements TestUserService{
    @Autowired
    private TestUserMapper testUserMapper;

    @Override
    public int insertTestUser(TestUser testUser) {
        return testUserMapper.insert(testUser);
    }

    @Override
    public int updateTestUser() {
        TestUser testUser=new TestUser();
        testUser.setId("5f7139ef295d42a3b964c082e0dd838f1");
        testUser.setName("李四四");
        //会把没有值的属性变成空
        //return testUserMapper.updateByPrimaryKey(testUser);
        return testUserMapper.insert(testUser);
    }

    @Override
    public int deleteTestUser() {
        TestUser testUser=new TestUser();
        //根据属性删除会把所有密码是123456的数据删除
        testUser.setPassword("123456");
        return testUserMapper.delete(testUser);
    }

    @Override
    public int deleteKeyTestUser() {
        //根据主键ID删除
        return testUserMapper.deleteByPrimaryKey("5f7139ef295d42a3b964c082e0dd838f");
    }

    @Override
    public List<TestUser> selectTestUser() {
        TestUser testUser=new TestUser();
        testUser.setPassword("123456");
        testUser.setUsername("lisi");
        return testUserMapper.select(testUser);
    }


    @Override
    public TestUser selectOneTestUser() {
        TestUser testUser=new TestUser();
        testUser.setUsername("wangwu");
        //结果只能返回一条数据否则会抛出异常
        return testUserMapper.selectOne(testUser);
    }

    @Override
    public List<TestUser> selectExample() {
        List<String>idList=new ArrayList<>();
        idList.add("5f7139ef295d42a3b964c082e0dd838f");
        idList.add("92377073eebd4354859528e87091d7fd");
        Example example = new Example(TestUser.class);
        //排序方法setOrderByClause("字段名 ASC")DESC降序
        example.setOrderByClause("name ASC");
        example.createCriteria()

        //添加xxx字段等于value条件
        .andEqualTo("password","123456")
        //模糊查询xxx字段like value条件
        //.andLike("name","%四%")
         //可以自由拼接SQL
        //.andCondition("ID = '5f7139ef295d42a3b964c082e0dd838f' ")
         //或者可以这么写
        //.andCondition("ID =","5f7139ef295d42a3b964c082e0dd838f")
        .andIn("id",idList)
        ;

        return testUserMapper.selectByExample(example);
    }

    @Override
    public List<TestUser> queryAll() {
        return testUserMapper.queryAll();
    }
}
