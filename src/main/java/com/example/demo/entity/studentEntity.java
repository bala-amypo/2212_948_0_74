package com.example.demo.entity;

import jakarta.persistence.*;



@Entity
public class studentEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Email(message = "Email Format is not valid")
    private String email;

}