package com.example.springcrud.service;

import com.example.springcrud.domain.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployeeById(Long id);

    void deleteEmployeeById(Long id);

}
