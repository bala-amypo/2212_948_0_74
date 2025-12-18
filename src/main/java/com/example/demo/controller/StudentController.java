package com.example.demo.controller;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/getAllStudent")
    public List<StudentEntity> getAll() {
        return service.getAll();
    }

    @PostMapping("/add")
    public StudentEntity addStudent(@Valid @RequestBody StudentEntity student) {
        return service.addStudent(student);
    }

    @GetMapping("/get/{id}")
    public StudentEntity getById(@PathVariable Long id) {
        return service.getbyId(id);
    }

    @PutMapping("/update/{id}")
    public StudentEntity updateById(
            @PathVariable Long id,
            @Valid @RequestBody StudentEntity newstu) {
        return service.updateById(id, newstu);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteByID(@PathVariable Long id) {
        return service.deleteByID(id);
    }
}
