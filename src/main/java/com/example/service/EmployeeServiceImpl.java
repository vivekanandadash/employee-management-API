package com.example.service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public String saveEmployeeData(Employee employee) {
        Employee save = employeeRepository.save(employee);
        return "Data is save";
    }
}
