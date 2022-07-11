package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImp implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepo;

    public EmployeeServiceImp(EmployeeRepository repo) {
        this.employeeRepo = repo;
    }
    @Override
    public List<Employee> allEmployees() {
        return employeeRepo.allEmployees();
    }

    @Override
    public Optional<Employee> uniEmployee(int id) {
        return employeeRepo.uniEmployee(id);
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepo.addEmployee(employee);
    }

    @Override
    public String deleteEmployee(int id) {
        return employeeRepo.deleteEmployee(id);
    }

    @Override
    public Employee updateEmployee(Employee employee, int id) {
        Optional<Employee> emp = employeeRepo.uniEmployee(id);
        emp.get().setPhno(employee.getPhno());
        emp.get().setName(employee.getName());
        emp.get().setEmail(employee.getEmail());
//        emp.get().setProjects(employee.getProjects());
        return employeeRepo.addEmployee(emp.get());
    }
}