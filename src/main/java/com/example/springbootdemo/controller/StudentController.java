package com.example.springbootdemo.controller;

import com.alibaba.fastjson.JSON;
import com.example.springbootdemo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author: isFishMan
 * @Date: Create in 2018-06-09 15:24
 * @CreateBy: IntelliJ Idea
 */
@Controller
public class StudentController {

    @Resource
    private StudentService studentService;

    @GetMapping(value = "/student")
    @ResponseBody
    public String selectAllStudent(){
//        List<Student> students = studentService.selectAllStudent();
//        String result = JSON.toJSONString(students);
//        return result;
        return JSON.toJSONString(studentService.selectByPrimaryKey("10000"));
    }

}
