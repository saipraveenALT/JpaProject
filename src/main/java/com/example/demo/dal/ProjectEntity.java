package com.example.demo.dal;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Data
@Transactional
public class ProjectEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long projectId;
    private String projectName;

}
