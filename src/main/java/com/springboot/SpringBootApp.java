package com.springboot;


import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@MapperScan("com.springboot.backstage.dao")
public class SpringBootApp extends WebMvcConfigurerAdapter {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        //1.需要先定义一个convert消息转换的对象
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        //2.添加fastJson的配置信息,比如:要格式化返回的json数据
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(
                SerializerFeature.PrettyFormat
        );
        //3.处理中文乱码问题
        List<MediaType> fastMediaTypes = new ArrayList<>();
        fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
        fastConverter.setSupportedMediaTypes(fastMediaTypes);
        //4.在convert中添加配置信息
        fastConverter.setFastJsonConfig(fastJsonConfig);

        converters.add(fastConverter);
    }

   /* *//**
     * 在这里使用@Bean注入FastJsonHttpMessageConverter
     * @return
     *//*
    @Bean
    public  HttpMessageConverters fastJsonHttpMessageConverter(){
        //1.需要先定义一个convert消息转换的对象
        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        //2.添加fastJson的配置信息,比如:要格式化返回的json数据
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
        //3.处理中文乱码问题
        List<MediaType> fastMediaTypes = new ArrayList<>();
        fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
        fastConverter.setSupportedMediaTypes(fastMediaTypes);

        //4.在convert中添加配置信息
        fastConverter.setFastJsonConfig(fastJsonConfig);

        HttpMessageConverter<?> converter = fastConverter;
        return new HttpMessageConverters(converter);


    }*/

    public static void main(String[] args) {
       SpringApplication.run(SpringBootApp.class,args);
    }
}
