package com.example.demo.dal;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
@Transactional
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String email;
	private int phno;
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(referencedColumnName = "id")
//	private List<ProjectEntity> projects;

}
