package com.example.demo.dal;

import com.example.demo.service.Employee;
import com.example.demo.service.Project;
import org.springframework.beans.BeanUtils;

import java.util.stream.Collectors;

public class EntityConverter {
    public static Employee EmployeeEntityToEmployee(EmployeeEntity employeeEntity){
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeEntity,employee);
        employee.setProjects(
                employeeEntity.getProjects()
                        .stream()
                        .map(EntityConverter::ProjectEntityToProject)
                        .collect(Collectors.toList())
        );
        return employee;
    }
    public static EmployeeEntity EmployeeToEmployeeEntity(Employee employee){
        EmployeeEntity employeeEntity = new EmployeeEntity();
        BeanUtils.copyProperties(employee,employeeEntity);
        employeeEntity.setProjects(
                employee.getProjects()
                        .stream()
                        .map(EntityConverter::ProjectToProjectEntity)
                        .collect(Collectors.toList())
        );
        return employeeEntity;
    }
    public static ProjectEntity ProjectToProjectEntity(Project project){
        ProjectEntity projectEntity = new ProjectEntity();
        BeanUtils.copyProperties(project,projectEntity);
        return projectEntity;
    }
    public static Project ProjectEntityToProject(ProjectEntity projectEntity){
        Project project = new Project();
        BeanUtils.copyProperties(projectEntity,project);
        return project;
    }
}