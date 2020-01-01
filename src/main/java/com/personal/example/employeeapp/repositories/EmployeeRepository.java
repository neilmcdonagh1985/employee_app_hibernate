package com.personal.example.employeeapp.repositories;
import com.personal.example.employeeapp.models.Employee;
import com.personal.example.employeeapp.projections.EmbedDepartment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedDepartment.class)
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findEmployeesByDepartmentId(Long departmentId);
}
