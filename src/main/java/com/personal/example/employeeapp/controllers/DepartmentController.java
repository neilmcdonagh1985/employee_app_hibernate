package com.personal.example.employeeapp.controllers;

import com.personal.example.employeeapp.models.Department;
import com.personal.example.employeeapp.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {

    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping(value = "/employees/named/{name}")
    public List<Department> findDepartmentsThatHaveEmployeesNamed(@PathVariable String name) {
        return departmentRepository.findDepartmentsThatHaveEmployeesNamed(name);
    }
}
