package com.example.demo.controller;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
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
    public StudentEntity getbyId(@PathVariable Long id){
         return service.getbyId(id);

    }

    @PutMapping("/update{id}")
    public StudentEntity updateByid(@PathVariable Long id,@Valid @RequestBody StudentEntity newstu){
        return service.updateById(id,newstu);
    }
}
