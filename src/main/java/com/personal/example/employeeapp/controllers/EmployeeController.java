package com.personal.example.employeeapp.controllers;
import com.personal.example.employeeapp.models.Employee;
import com.personal.example.employeeapp.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id) {
        return employeeRepository.findById(id);
    }
}
