package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.StudentAttendance;
import com.app.repositories.StudentAttendanceRepository;
import com.app.services.StudentAttendanceService;

@RestController
@CrossOrigin("http://localhost:3000/")
@RequestMapping("/api")
public class StudentAttendanceController {

    @Autowired
    private StudentAttendanceService studentAttendanceService;

    @Autowired
    private StudentAttendanceRepository studentAttendanceRepository;

    @PostMapping("/student-attendance")
    public ResponseEntity<String> markStudentAttendance(@RequestBody List<StudentAttendance> attendanceData) {
        for (StudentAttendance record : attendanceData) {
            // Check if attendance for the course and date combination already exists
            if (studentAttendanceRepository.existsByCourseNameAndDate(record.getCourse_name(), record.getDate())) {
                return ResponseEntity.badRequest().body("Attendance for the course on the given date already exists");
            }
        }

        // If validation passes, call the service to store attendance data in the database
        studentAttendanceService.markAttendance(attendanceData);

        return ResponseEntity.ok("Attendance marked successfully");
    }
    
    @GetMapping
    public List<StudentAttendance> getAllStudentAttendances() {
        return studentAttendanceService.getAllStudentAttendances();
    }
}
