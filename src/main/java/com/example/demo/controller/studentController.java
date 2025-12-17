package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.*;

@RestController
public class studentController{

    @Autowired
    studentService service;

    @GetMapping("/getAllStudent")
    public ListstudentEntity>getAll(){
        return service.getAll();
    }
}