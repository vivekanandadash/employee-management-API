package com.example.controller;

import com.example.dto.APIResponse;
import com.example.entity.Employee;
import com.example.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<APIResponse<String>> saveRegistration(
            @RequestBody Employee employee
    ) {
        APIResponse<String> response = new APIResponse<>();
        Boolean data = employeeServiceImpl.saveEmployeeData(employee);
        if (data) {
            response.setMessage("Data is Saved");
            response.setData("Transaction Successful");
            response.setStatus(200);
            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        response.setMessage("Data is not saved");
        response.setData("Transaction Failed");
        response.setStatus(500);
        return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);

    }
}
