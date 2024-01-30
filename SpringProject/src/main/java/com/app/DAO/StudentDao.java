package com.app.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.app.model.Student;

@RepositoryRestResource
public interface StudentDao extends JpaRepository<Student, Integer>{

}
