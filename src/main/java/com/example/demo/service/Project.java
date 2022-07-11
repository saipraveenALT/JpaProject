package com.example.demo.service;

import com.example.demo.dal.EmployeeEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
public class Project {
    private Long projectId;
    private String projectName;
}
