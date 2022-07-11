package com.example.demo.api;


import com.example.demo.dal.EmployeeRepo;
import com.example.demo.service.Employee;
import com.example.demo.service.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1/hrms")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> listEmployees(){
        return employeeService.allEmployees();
    }

    @GetMapping("/employees/{id}")
    public Optional<Employee> getEmployee(@PathVariable("id") int id){
        return employeeService.uniEmployee(id);
    }
    
    @PostMapping(value = "/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable("id") int id){
        return employeeService.deleteEmployee(id);
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@RequestBody Employee employee, @PathVariable("id") int id){
        return employeeService.updateEmployee(employee,id);
    }
}
