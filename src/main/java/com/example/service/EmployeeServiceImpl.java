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
    public Boolean saveEmployeeData(Employee employee) {
        try {
            Employee save = employeeRepository.save(employee);
            return true;
        }catch (Exception e){
            return false;
        }

    }
}
