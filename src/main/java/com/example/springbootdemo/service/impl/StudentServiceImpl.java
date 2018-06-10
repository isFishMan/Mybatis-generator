package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.dao.StudentMapper;
import com.example.springbootdemo.entity.Student;
import com.example.springbootdemo.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: isFishMan
 * @Date: Create in 2018-06-09 17:05
 * @CreateBy: IntelliJ Idea
 */
@Service
public class StudentServiceImpl implements StudentService{

    @Resource
    private StudentMapper studentMapper;

    @Override
    public int deleteByPrimaryKey(String studentno) {
        return studentMapper.deleteByPrimaryKey(studentno);
    }

    @Override
    public int insert(Student record) {
        return studentMapper.insert(record);
    }

    @Override
    public int insertSelective(Student record) {
        return studentMapper.insertSelective(record);
    }

    @Override
    public Student selectByPrimaryKey(String studentno) {
        return studentMapper.selectByPrimaryKey(studentno);
    }

    @Override
    public int updateByPrimaryKeySelective(Student record) {
        return studentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        return studentMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Student> selectAllStudent() {
        return studentMapper.selectAllStudent();
    }
}
