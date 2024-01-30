package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
    Optional<Course> findByCname(String cname);
}