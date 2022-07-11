package com.example.demo.dal;

import com.example.demo.service.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

 public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Integer> {

}
