package com.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.repositories.ModuleRepository;

@Service
public class ModuleService {

    @Autowired
    private ModuleRepository moduleRepository;

    public List<String> findModuleNamesByCourseName(String courseName) {
        return moduleRepository.findModuleNamesByCourseName(courseName);
    }
}
