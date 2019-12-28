package com.personal.example.employeeapp.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @JsonIgnoreProperties(value = "projects")
    @ManyToMany
    @JoinTable(
            name = "employees_projects",
            joinColumns = { @JoinColumn(
                    name = "project_id",
                    nullable = false,
                    updatable = false
            )},
            inverseJoinColumns = { @JoinColumn(
                    name = "employee_id",
                    nullable = false,
                    updatable = false
            )}
    )

    private List<Employee> employees;

    public Project(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public Project() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee( Employee employee) {
        this.employees.add(employee);
    }
}
