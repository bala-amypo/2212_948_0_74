package com.example.demo.service;

import com.example.demo.entity.StudentEntity;
import java.util.List;

public interface StudentService {

    List<StudentEntity> getAll();
    StudentEntity addStudent(StudentEntity student);

    StudentEntity getbyI(Long id);
    }
