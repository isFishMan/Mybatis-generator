package com.example.springbootdemo.dao;

import com.example.springbootdemo.entity.Student;

import java.util.List;

public interface StudentMapper {
    int deleteByPrimaryKey(String studentno);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String studentno);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    List<Student> selectAllStudent();
}