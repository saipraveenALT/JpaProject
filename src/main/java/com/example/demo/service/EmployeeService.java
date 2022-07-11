package com.example.demo.service;

import com.example.demo.dal.EmployeeEntity;

import java.util.List;
import java.util.Optional;


public interface EmployeeService {
    List<Employee> allEmployees();

    Optional<Employee> uniEmployee(int id);

    Employee addEmployee(Employee employee);

    String deleteEmployee(int id);

    Employee updateEmployee(Employee employee, int id);
}
