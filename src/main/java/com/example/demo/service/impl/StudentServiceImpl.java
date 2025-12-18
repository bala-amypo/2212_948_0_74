package com.example.demo.service.impl;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.StudentService;
import com.example.demo.exception.StudentNotFoundException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repo;

    @Override
    public List<StudentEntity> getAll() {
        return repo.findAll();
    }

    @Override
    public StudentEntity addStudent(StudentEntity student) {
        return repo.save(student);
    }

    @Override
    public StudentEntity getbyId(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new StudentNotFoundException("Student ID not Found"));
    }

    @Override
    public StudentEntity updateById(Long id, StudentEntity newstu) {
        StudentEntity existing = getbyId(id);
        newstu.setId(existing.getId());
        return repo.save(newstu);
    }

    @Override
    public String deleteByID(Long id) {
        StudentEntity data = getbyId(id);
        repo.delete(data);
        return "Deleted successfully !";
    }
}
