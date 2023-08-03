package com.example.Project02.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project02.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}