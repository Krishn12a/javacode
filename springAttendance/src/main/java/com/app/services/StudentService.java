package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.repositories.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Object[]> findStudentsByCourseName(String courseName) {
        return studentRepository.findStudentsByCourseName(courseName);
    }
}

