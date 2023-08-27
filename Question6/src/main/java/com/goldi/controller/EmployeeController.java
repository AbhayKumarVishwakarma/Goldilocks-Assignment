package com.goldi.controller;

import com.goldi.model.Employee;
import com.goldi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * Endpoint to print and get the received values
     * @return List of received employees from database
     * @URL http://localhost:8080/employees
     */
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> printReceivedValueHandler(){
        List<Employee> list = employeeService.printReceivedValue();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
