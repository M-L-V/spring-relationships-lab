package com.codeclan.example.Springrelationshipslab.repositories;

import com.codeclan.example.Springrelationshipslab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
