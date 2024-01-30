package com.app.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.app.entity.CourseEntity;

public interface CourseRepository extends JpaRepository<CourseEntity, Integer> {
	
	
}
