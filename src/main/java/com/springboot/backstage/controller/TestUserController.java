package com.springboot.backstage.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestUserController {
    @Autowired


    @RequestMapping("/insertTestUser")
    public int insertTestUser(){

    }
}
