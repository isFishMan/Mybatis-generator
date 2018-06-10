package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: isFishMan
 * @Date: Create in 2018-06-09 13:25
 * @CreateBy: IntelliJ Idea
 */
@RestController
public class TestController {

    @GetMapping(value="/test")
    public String test(){
        return "springboot Test";
    }

}
