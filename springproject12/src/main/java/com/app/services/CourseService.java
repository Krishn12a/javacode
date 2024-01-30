package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.CourseEntity;
import com.app.repositories.CourseRepository;

@Service
public class CourseService {
	 @Autowired
	    private CourseRepository courseRepository;

	    public List<CourseEntity> getAllCourses() {
	        return courseRepository.findAll();
	    }

}
