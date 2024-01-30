package com.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.entity.ModuleEntity;

public interface ModuleRepository extends JpaRepository<ModuleEntity, Integer> {

    @Query("SELECT m.mname FROM ModuleEntity m JOIN m.course c WHERE c.course_name = :courseName")
    List<String> findModuleNamesByCourseName(@Param("courseName") String courseName);
}
