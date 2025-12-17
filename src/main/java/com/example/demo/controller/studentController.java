package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import com.example.demo.entity.*;

@RestController
public class studentController{

    @Autowired
    studentService service;

    @GetMapping("/getAllStudent")
    public ListstudentEntity>getAll(){
        return service.getAll();
    }

      @PostMapping("/add")
     public studentEntity addStudent(@valid @RequestBody studentEntity student){
        return service.addStudent(student);
     }
}