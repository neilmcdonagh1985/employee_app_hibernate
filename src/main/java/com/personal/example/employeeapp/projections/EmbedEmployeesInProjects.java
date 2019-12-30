package com.personal.example.employeeapp.projections;
import com.personal.example.employeeapp.models.Project;
import org.springframework.data.rest.core.config.Projection;
import java.util.List;

@Projection(name = "embedEmployeesInProjects", types = Project.class)
public interface EmbedEmployeesInProjects {
    String getName();
    List getEmployees();
}
