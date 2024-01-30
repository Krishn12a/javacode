package com.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

    @Query("SELECT s.Regid, s.full_name FROM StudentEntity s JOIN s.course c WHERE c.course_name = :courseName")
    List<Object[]> findStudentsByCourseName(@Param("courseName") String courseName);
}
