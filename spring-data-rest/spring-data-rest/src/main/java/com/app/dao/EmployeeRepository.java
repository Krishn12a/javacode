package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.app.entity.Employee;

@RepositoryRestResource
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	// Retrieving all records from the Employee table
	@Query(value = "SELECT e FROM Employee e")
	public Iterable<Employee> getAllEmployees();
	
	@Query(value="select count(*) from Employee ")
	public int getCount();
}
