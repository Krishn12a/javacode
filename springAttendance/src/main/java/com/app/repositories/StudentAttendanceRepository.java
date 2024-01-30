package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.entity.StudentAttendance;

public interface StudentAttendanceRepository extends JpaRepository<StudentAttendance, Integer> {

    @Query("SELECT CASE WHEN COUNT(sa) > 0 THEN true ELSE false END FROM StudentAttendance sa WHERE sa.course_name = :courseName AND sa.date = :date")
    boolean existsByCourseNameAndDate(@Param("courseName") String courseName, @Param("date") String date);
}

