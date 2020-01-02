package com.personal.example.employeeapp.repositories;
import com.personal.example.employeeapp.models.Department;
import com.personal.example.employeeapp.projections.EmbedEmployees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource(excerptProjection = EmbedEmployees.class)
public interface DepartmentRepository extends JpaRepository<Department, Long>, DepartmentRepositoryCustom {
    List<Department> findDepartmentsThatHaveEmployeesNamed(String name);
}
