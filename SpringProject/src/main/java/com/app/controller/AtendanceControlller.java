package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.DAO.CourseDao;
import com.app.model.Course;

@RestController
@RequestMapping("/Attendance")
public class AtendanceControlller {
	
	@Autowired
	CourseDao courseDao;
	
	@GetMapping("/cname")
	public List<Course> getCourseName(){
		return courseDao.findAll();
		
		}
	
//	@GetMapping("/coname")
//	public List<Course> getCourseId(){
//		return courseDao.getCourseId();
//		
//	}
	

}
