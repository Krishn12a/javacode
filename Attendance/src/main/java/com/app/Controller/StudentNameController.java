package com.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Model.Course;
import com.app.dao.CourseRepository;
import com.app.dao.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentNameController {
	
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
    private  StudentRepository studentRepository;
    
    @GetMapping("/java")
    public Iterable<Course> findStudentNameAndIdByCourseName(){
		return courseRepository.findStudentNameAndIdByCourseName() ;
    	
    }
    
    

}
