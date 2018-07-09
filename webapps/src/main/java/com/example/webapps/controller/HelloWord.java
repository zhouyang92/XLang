package com.example.webapps.controller;

import com.example.webapps.api.Student;
import com.example.webapps.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2018/6/28.
 */
//@Api(description = "demo")
@RestController
@RequestMapping(value = "/hello")
public class HelloWord {

    @Autowired
    private StudentMapper UserMapper;

    @RequestMapping("/hello")
    public String index() {
        System.out.println("output:>>>" + "进入controller");
        return "Hey,Judy";

    }

    @RequestMapping("/insert")
    public String insert(){
        UserMapper.insert(new Student("aa", "a123456", "qwe"));
        UserMapper.insert(new Student("bb", "b123456", "qwe"));
        UserMapper.insert(new Student("cc", "b123456", "qwe"));
        return "";
    }
}