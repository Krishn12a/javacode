package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.app.Model.Course;
import com.app.Model.Student;

@RepositoryRestResource
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	

	public Iterable<Student> findStudentNameAndIdByCourseName();
}
