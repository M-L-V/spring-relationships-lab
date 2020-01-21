package com.codeclan.example.Springrelationshipslab;

import com.codeclan.example.Springrelationshipslab.models.Department;
import com.codeclan.example.Springrelationshipslab.models.Employee;
import com.codeclan.example.Springrelationshipslab.repositories.DepartmentRepository;
import com.codeclan.example.Springrelationshipslab.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)

@SpringBootTest
class SpringRelationshipsLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment(){
		Department funkDepartment = new Department("FunkDepartment" );
		departmentRepository.save(funkDepartment);
		Employee jamiroquai = new Employee("Jamiroquai", "Jones", 123, funkDepartment);
		employeeRepository.save(jamiroquai);
	}


}
