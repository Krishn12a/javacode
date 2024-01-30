package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.services.ModuleService;

@RestController
@CrossOrigin("http://localhost:3000/")
@RequestMapping("/modules")
public class ModuleController {

    @Autowired
    private ModuleService moduleService;

    @GetMapping("/mnamesByCourse")
    public ResponseEntity<List<String>> getModuleNamesByCourseName(@RequestParam String courseName) {
        List<String> moduleNames = moduleService.findModuleNamesByCourseName(courseName);
        return new ResponseEntity<>(moduleNames, HttpStatus.OK);
    }
}
