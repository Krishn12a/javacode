package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByModulesCourseCname(String cname);
}
