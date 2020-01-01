package com.personal.example.employeeapp;

import com.personal.example.employeeapp.models.Department;
import com.personal.example.employeeapp.models.Employee;
import com.personal.example.employeeapp.models.Project;
import com.personal.example.employeeapp.repositories.DepartmentRepository;
import com.personal.example.employeeapp.repositories.EmployeeRepository;
import com.personal.example.employeeapp.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EmployeeappApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment() {
		Department department1 = new Department("Accounts");
		departmentRepository.save(department1);

		Employee employee1 = new Employee("Keith", 42, "keith@theoffice.com", department1);
		employeeRepository.save(employee1);

	}

	@Test
	public void addEmployeesAndProjects() {
		Department department2 = new Department("IT");
		departmentRepository.save(department2);

		Department department3 = new Department("HR");
		departmentRepository.save(department3);

		Employee employee2 = new Employee("Tim", 32, "tim@theoffice.com", department2);
		employeeRepository.save(employee2);

		Project project1 = new Project("flash");
		projectRepository.save(project1);

		project1.addEmployee(employee2);
		projectRepository.save(project1);

		Employee employee3 = new Employee("Gareth", 34, "gareth@theoffice.com", department3);
		employeeRepository.save(employee3);

		Employee employee4 = new Employee("jennifer", 34, "jennifer@theoffice.com", department2);
		employeeRepository.save(employee4);

		project1.addEmployee(employee4);
		projectRepository.save(project1);

	}

	@Test
	public void findEmployeesByDepartmentId() {
		List<Employee> found = employeeRepository.findEmployeesByDepartmentId(1L);
		assertEquals("Dawn", found.get(0).getName());

	}

	@Test
	public void findProjectByLocationName() {
		List<Project> found = projectRepository.findProjectsByName("lightbulb");
		assertEquals("lightbulb", found.get(0).getName());
	}

}
