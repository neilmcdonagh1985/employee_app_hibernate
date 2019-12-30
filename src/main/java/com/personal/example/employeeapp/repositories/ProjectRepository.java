package com.personal.example.employeeapp.repositories;

import com.personal.example.employeeapp.models.Project;
import com.personal.example.employeeapp.projections.EmbedEmployeesInProjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedEmployeesInProjects.class)
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
