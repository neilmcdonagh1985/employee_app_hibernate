package com.personal.example.employeeapp.repositories;

import com.personal.example.employeeapp.models.Department;

import java.util.List;

public interface DepartmentRepositoryCustom {
    List<Department> findDepartmentsThatHaveEmployeesNamed(String name);
}
