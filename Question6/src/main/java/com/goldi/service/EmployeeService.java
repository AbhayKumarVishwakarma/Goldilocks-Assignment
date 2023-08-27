package com.goldi.service;

import com.goldi.exception.EmployeeException;
import com.goldi.model.Employee;

import java.util.List;

public interface EmployeeService {

    /**
     * This method is used to find and print the received value
     * @return List of employee
     * @throws EmployeeException if not found any employee
     */
    public List<Employee> printReceivedValue() throws EmployeeException;
}
