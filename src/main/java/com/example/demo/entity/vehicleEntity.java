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

    @Column(name="cpacity_kg",nullable=false)
    private Double capacityKg;

    @Column(name="fuel_efficiency")
    private Double fuelEfficiency;

    public Vehicle(){}

    public Vehicle(User user,String vehicleNumber,Double capacityKg,Double fuelEfficiency){
        this.user=user;
        this.vehicleNumber=vehicleNumber;
        setCapacityKg(capacityKg);
        this.fuelEfficiency=fuelEfficiency;
    }
    public Long gatId(){
        return id;
    }

    public User getUser(){
        return user;
    }
    public void setUser(User user){
        this.user=user;
    }
    public String getVehicleNumber(){
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber){
        this.vehicleNumber=vehicleNumber;
    }
    public Double getCapacityKg(){
        return capacityKg;
    }

    public void setCapacityKg(Double capacityKg){
        if(capacityKg==null || capacityKg<=0){
            throw new IllegalArgumentException("Capacity must be greater than zero");
        }
        this.capacityKg=capacityKg;
    }
    public Double getFuelEfficiency(){
        return fuelEfficiency;
    }
    public void setFuelEfficiency(Double fuelEfficiency){
        this.fuelEfficiency=fuelEfficiency;
    }
}