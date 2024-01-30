package com.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
    
    @Query("SELECT s.sid, s.sname FROM StudentEntity s " +
            "JOIN s.module m " +
            "JOIN m.course c " +
            "WHERE c.cname = :courseName")
     List<Object[]> findStudentsByCourseName(@Param("courseName") String courseName);
}
