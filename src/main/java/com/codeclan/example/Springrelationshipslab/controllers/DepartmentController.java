package com.codeclan.example.Springrelationshipslab.controllers;

import com.codeclan.example.Springrelationshipslab.models.Department;
import com.codeclan.example.Springrelationshipslab.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping
    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }


}
