package com.example.demo.service;

import com.example.demo.dal.ProjectEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Employee {
    private int id;
    private String name;
    private String email;
    private int phno;
    List<Project> projects;

}
