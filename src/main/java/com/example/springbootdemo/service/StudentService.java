package com.example.springbootdemo.service;

import com.example.springbootdemo.entity.Student;

import java.util.List;

/**
 * @author: isFishMan
 * @Date: Create in 2018-06-09 17:04
 * @CreateBy: IntelliJ Idea
 */
public interface StudentService {
    int deleteByPrimaryKey(String studentno);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String studentno);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
    //查出所有学生的信息
    List<Student> selectAllStudent();
}
