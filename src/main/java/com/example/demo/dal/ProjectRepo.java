package com.example.demo.dal;

import org.springframework.data.jpa.repository.JpaRepository;

interface ProjectRepo extends JpaRepository<ProjectEntity,Long> {
}
