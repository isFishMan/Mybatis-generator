package com.example.springbootdemo.result;

import com.example.springbootdemo.result.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(String studentno);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(String studentno);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}