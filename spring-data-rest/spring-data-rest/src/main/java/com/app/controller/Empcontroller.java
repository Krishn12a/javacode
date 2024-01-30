package com.app.controller;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.EmployeeRepository;
import com.app.entity.Employee;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/employees")
public class Empcontroller{
	
	@Autowired
	private EmployeeRepository emprep;
	
	@GetMapping("/user")
	public Iterable<Employee> getEmployeeCount() {
		return emprep.getAllEmployees();
		
	};
	@GetMapping("/count")
	public int getCount() {
		return emprep.getCount();
	}
	

}
