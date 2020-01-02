package com.personal.example.employeeapp.controllers;

import com.personal.example.employeeapp.models.Project;
import com.personal.example.employeeapp.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/projects")
public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping(value = "/named/{name}")
    public List<Project> findProjectsByName(@PathVariable String name) {
        return projectRepository.findProjectsByName(name);
    }

}
