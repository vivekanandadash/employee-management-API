package com.example.service;


import com.example.entity.Employee;
import org.springframework.http.ResponseEntity;

public interface EmployeeService {
    public String saveEmployeeData(Employee employee);
}
