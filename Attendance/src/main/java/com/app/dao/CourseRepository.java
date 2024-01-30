package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.app.Model.Course;


@RepositoryRestResource
public interface CourseRepository extends JpaRepository<Course, Integer> {
	
	
	@Query("SELECT s.std_id, s.std_name FROM student JOIN course c ON s.Std_id = c.Std_id WHERE c.Course_name = 'Java'")
	public Iterable<Course> findStudentNameAndIdByCourseName();
}
