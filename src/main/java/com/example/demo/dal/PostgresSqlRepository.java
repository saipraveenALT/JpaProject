package com.example.demo.dal;

import com.example.demo.service.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.Employee;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PostgresSqlRepository implements EmployeeRepository {
    @Autowired
    private final EmployeeRepo repo;

    @Autowired
    private ProjectRepo projectRepo;
    public PostgresSqlRepository(EmployeeRepo repo) {
        this.repo = repo;
    }
    @Override
    public List<Employee> allEmployees() {
        return repo.findAll().stream().map(EntityConverter::EmployeeEntityToEmployee).collect(Collectors.toList());
    }

    @Override
    public Optional<Employee> uniEmployee(int id) {
        return repo.findById(id).map(EntityConverter::EmployeeEntityToEmployee);
    }

    @Override
    public Employee addEmployee(Employee employee) {
//        System.out.println(employee.getProjects().get(0).getProjectName());
//        System.out.println(employee.getProjects().get(0).getProjectId());
//        EmployeeEntity employeeEntity=EntityConverter.EmployeeToEmployeeEntity(employee);
//
//        ProjectEntity projectEntity=new ProjectEntity();
//        projectEntity.setEmployeeEntity();


        return EntityConverter.EmployeeEntityToEmployee(
                repo.save(EntityConverter.EmployeeToEmployeeEntity(employee))
        );
    }

    @Override
    public String deleteEmployee(int id) {
        repo.deleteById(id);
        return "Deleted";
    }

    @Override
    public Employee updateEmployee(Employee employee, int id) {
        return EntityConverter.EmployeeEntityToEmployee(
                repo.save(EntityConverter.EmployeeToEmployeeEntity(employee))
        );
    }


}
