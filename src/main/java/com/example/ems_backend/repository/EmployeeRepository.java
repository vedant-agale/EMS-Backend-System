package com.example.ems_backend.repository;

import com.example.ems_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<Employee, Long> ka matlab:
// "Main 'Employee' table ka manager hu, aur uski ID 'Long' type ki hai"
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // 😲 MAGIC: Yahan kuch likhne ki zaroorat nahi hai!
    // 'extends JpaRepository' likhte hi Spring Boot ne background mein
    // save(), findAll(), findById(), delete() sab methods apne aap bana diye.
}