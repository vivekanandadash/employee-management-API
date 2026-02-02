package com.example.controller;

import com.example.entity.Employee;
import com.example.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    @Autowired
   EmployeeServiceImpl employeeServiceImpl;

    @PostMapping("/save")
    public String saveRegistration(
            @RequestBody Employee employee
    ){
        employeeServiceImpl.saveEmployeeData(employee);
       return "";
    }

}
