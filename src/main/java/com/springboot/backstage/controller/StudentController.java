package com.springboot.backstage.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.springboot.backstage.entity.Student;
import com.springboot.backstage.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/saveStudent")

    public Student saveStudent(Student student){
        int rs=studentService.save(student);
        System.out.println("rs="+rs);
        return student;
    }

    @RequestMapping("/queryStudentList")
    public PageInfo<Student> queryStudentList(int pageNum, int pageSize){
        //pageNum页码,pageSize条数

        PageHelper.startPage(pageNum,pageSize);
        List<Student>list=studentService.queryList();
        PageInfo<Student> p=new PageInfo<Student>(list);
    /*
    //当前页
    private int pageNum;
    //每页的数量
    private int pageSize;
    //当前页的数量
    private int size;
    //排序
    private String orderBy;

    //由于startRow和endRow不常用，这里说个具体的用法
    //可以在页面中"显示startRow到endRow 共size条数据"

    //当前页面第一个元素在数据库中的行号
    private int startRow;
    //当前页面最后一个元素在数据库中的行号
    private int endRow;
    //总记录数
    private long total;
    //总页数
    private int pages;
    //结果集
    private List<T> list;

    //第一页
    private int firstPage;
    //前一页
    private int prePage;
    //下一页
    private int nextPage;
    //最后一页
    private int lastPage;

    //是否为第一页
    private boolean isFirstPage = false;
    //是否为最后一页
    private boolean isLastPage = false;
    //是否有前一页
    private boolean hasPreviousPage = false;
    //是否有下一页
    private boolean hasNextPage = false;
    //导航页码数
    private int navigatePages;
    //所有导航页号
    private int[] navigatepageNums;
    */

        return p;
    }

    @RequestMapping("/delect")
    public int ceshi(String id){
        return studentService.removeStudent(id);

    }

}
