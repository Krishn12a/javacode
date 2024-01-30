package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.ModuleEntity;
import com.app.entity.Student;
import com.app.repository.CourseRepository;
import com.app.repository.ModuleRepository;
import com.app.repository.StudentRepository;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private ModuleRepository moduleRepository;

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findStudentsByCourseName(String courseName) {
        List<ModuleEntity> modules = moduleRepository.findByCourseCname(courseName);
        List<Student> students = new ArrayList<>();

        for (ModuleEntity module : modules) {
            students.addAll(studentRepository.findByModulesCourseCname(courseName));
        }

        return students;
    }
}
