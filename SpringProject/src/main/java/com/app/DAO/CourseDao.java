package com.app.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.app.model.Course;

@RepositoryRestResource
public interface CourseDao extends JpaRepository<Course, Integer> {
	
	

}
