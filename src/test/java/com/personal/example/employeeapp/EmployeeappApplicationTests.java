package com.personal.example.employeeapp;

import com.personal.example.employeeapp.models.Employee;
import com.personal.example.employeeapp.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeappApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployee() {
		Employee david = new Employee("David", 43, "davidbrent@gmail.com");
		employeeRepository.save(david);
	}

}
