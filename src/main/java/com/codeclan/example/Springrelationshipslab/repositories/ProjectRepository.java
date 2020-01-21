package com.codeclan.example.Springrelationshipslab.repositories;

import com.codeclan.example.Springrelationshipslab.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
