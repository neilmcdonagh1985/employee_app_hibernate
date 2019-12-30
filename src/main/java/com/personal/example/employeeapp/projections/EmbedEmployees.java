package com.personal.example.employeeapp.projections;
import com.personal.example.employeeapp.models.Department;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedEmployees", types = Department.class)
public interface EmbedEmployees {
    String getName();
    List getEmployees();
}
