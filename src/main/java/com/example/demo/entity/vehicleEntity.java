package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(
    name="vehicle",
    uniqueConstraints={
        @uniqueConstraints(columnsNames="vehicle_number")
    }
)
public class Vehicle{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id",nullable=false)
    private User user;

    @Column(name="vehicle_number",nullable=false)
    private String vehicleNumber;

    @Column(name="cpacity_kg",)
}