package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.ModuleEntity;

public interface ModuleRepository extends JpaRepository<ModuleEntity, Integer> {
    List<ModuleEntity> findByCourseCname(String cname);
}