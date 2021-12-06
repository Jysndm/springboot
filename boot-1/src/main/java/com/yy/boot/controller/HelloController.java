package com.yy.boot.controller;

import com.yy.boot.bean.Car;
import com.yy.boot.bean.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@Slf4j//添加日志功能
@RestController
public class HelloController {
    @Autowired
    Car car;
    @Autowired
    Person person;
    @RequestMapping("/car")
    public Car car(){
        return car;
    }

    @RequestMapping("/hello")
    public  String handle01(@RequestParam("name") String name){
        log.info("请求进入。。。。。");
        return "hello,Spring,Boot"+name;
    }
    @RequestMapping("/person")
    public Person person(){
        return person;
    }
}
