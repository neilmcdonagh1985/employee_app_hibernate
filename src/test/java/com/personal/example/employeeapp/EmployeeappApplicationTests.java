package com.personal.example.employeeapp;

import com.personal.example.employeeapp.models.Department;
import com.personal.example.employeeapp.models.Employee;
import com.personal.example.employeeapp.repositories.DepartmentRepository;
import com.personal.example.employeeapp.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeappApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment() {
		Department department1 = new Department("Accounts");
		departmentRepository.save(department1);

		Employee employee1 = new Employee("Keith", 42, "keith@theoffice.com", department1);
		employeeRepository.save(employee1);

	}

}
