package com.springboot.backstage.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import javax.persistence.*;

@Table(name = "user_student")
public class UserStudent {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    @GeneratedValue(generator = "UUID")
    private String id;

    /**
     * 姓名
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 生日
     */
    @Column(name = "BIRTHDATE")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    private Date birthdate;




    /**
     * 获取ID
     *
     * @return ID - ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取姓名
     *
     * @return NAME - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取生日
     *
     * @return BIRTHDATE - 生日
     */
    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * 设置生日
     *
     * @param birthdate 生日
     */
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}