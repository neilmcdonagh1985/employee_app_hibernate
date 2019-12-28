package com.personal.example.employeeapp.projections;
import com.personal.example.employeeapp.models.Department;
import com.personal.example.employeeapp.models.Employee;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedDepartment", types = Employee.class)
public interface EmbedDepartment {
    String getName();
    int getAge();
    String getEmail();
    Department getDepartment();
}
