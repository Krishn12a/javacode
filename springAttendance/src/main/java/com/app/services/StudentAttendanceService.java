package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.StudentAttendance;
import com.app.repositories.StudentAttendanceRepository;

@Service
public class StudentAttendanceService {
	
	 @Autowired
	    private StudentAttendanceRepository studentAttendanceRepository;

	    public void markAttendance(List<StudentAttendance> attendanceData) {
	        for (StudentAttendance record : attendanceData) {
	            // Create an entity from the record and save it to the database
	            StudentAttendance entity = new StudentAttendance();
	            entity.setStd_id(record.getStd_id());
	            entity.setStd_name(record.getStd_name());
	            entity.setDate(record.getDate());
	            entity.setAttendanceStaus(record.getAttendanceStaus());
	            entity.setCourse_name(record.getCourse_name());

	            studentAttendanceRepository.save(entity);
	        }
	    }
	    
	    public List<StudentAttendance> getAllStudentAttendances() {
	        return studentAttendanceRepository.findAll();
	    }

}
