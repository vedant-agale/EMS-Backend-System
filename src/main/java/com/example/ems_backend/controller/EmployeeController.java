package com.example.ems_backend.controller;

import com.example.ems_backend.entity.Employee;
import com.example.ems_backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // 1. Ye ban gaya humara Waiter (Web Handler)
@RequestMapping("/api/employees") // 2. Is address par ye sunega
public class EmployeeController {

    @Autowired // 3. Spring Boot se bola: "Bhai, wo Repository wali file mujhe laa ke do"
    private EmployeeRepository employeeRepository;

    // --- GET ALL EMPLOYEES ---
    // Jab koi bolega: GET /api/employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        // Repository (Cashier) ko bola: "Saare employees ki list do"
        return employeeRepository.findAll();
    }
}