package com.example.demo.service;

import com.example.demo.entity.StudentEntity;

import java.util.List;

public interface StudentService {

    List<StudentEntity> getAll();
    StudentEntity addStudent(StudentEntity student);

    StudentEntity getbyId(Long id);

    StudentEntity updateById( Long id, StudentEntity newstu);
    
    StudentEntity deleteByID(Long id);
    }
