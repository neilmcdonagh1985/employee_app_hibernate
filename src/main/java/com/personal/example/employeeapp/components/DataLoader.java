package com.personal.example.employeeapp.components;
import com.personal.example.employeeapp.models.Department;
import com.personal.example.employeeapp.models.Employee;
import com.personal.example.employeeapp.models.Project;
import com.personal.example.employeeapp.repositories.DepartmentRepository;
import com.personal.example.employeeapp.repositories.EmployeeRepository;
import com.personal.example.employeeapp.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    ProjectRepository projectRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        Department department1 = new Department("marketing");
        departmentRepository.save(department1);

        Department department2 = new Department("legal");
        departmentRepository.save(department2);

        Employee employee1 = new Employee("Dawn", 27, "dawn@theoffice.com", department1);
        employeeRepository.save(employee1);

        Employee employee2 = new Employee("Neil", 36, "neil@theoffice.com", department2);
        employeeRepository.save(employee2);

        Project project1 = new Project("lightbulb");
        projectRepository.save(project1);

        Project project2 = new Project("watt");
        projectRepository.save(project2);

        employee1.addProject(project1);
        employee1.addProject(project2);
        employeeRepository.save(employee1);

        project2.addEmployee(employee2);
        projectRepository.save(project2);

        department1.addEmployee(employee1);
        departmentRepository.save(department1);


    }

}
