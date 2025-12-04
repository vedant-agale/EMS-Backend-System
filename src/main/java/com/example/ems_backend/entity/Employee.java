package com.example.ems_backend.entity;

import jakarta.persistence.*; //JPA ke tools import kiye

@Entity  // 1. Java ko bataya ki ye Class ek Batabase table hai 
@Table(name = "employees")  // 2. Table ka naam bataya (Jo MySql mein banaya tha)

public class Employee {

    @Id  // 3. Bataya ki ye Primary key hai
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 4. ID auto - increment hoga
    private Long id;

    @Column(name = "name") // 5. Column ka naam 
    private String name;

    @Column(name = "salary")
    private Double salary;

    //--- Constructor, Getters & Setters (Zaroori hote hai)---
    // (VS Code mein Right Click > Source Action > Generate Getters and Setters se bhi bana sakte ho)

    public Employee(){}

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }
    public Long getID() {
        return id;
    }
    public void setID(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Double getSalary(){
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }
}