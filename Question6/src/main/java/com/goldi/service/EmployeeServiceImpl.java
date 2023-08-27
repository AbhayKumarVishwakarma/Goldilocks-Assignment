package com.goldi.service;

import com.goldi.exception.EmployeeException;
import com.goldi.model.Employee;
import com.goldi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> printReceivedValue() throws EmployeeException {
        List<Employee> employees = employeeRepository.findAll();

        if(employees.isEmpty()) throw new EmployeeException("Not find any employee in database!");

        employees.forEach(employee -> System.out.println("Name: " + employee.getName() + ", Age: " + employee.getAge()));

        return employees;
    }
}
