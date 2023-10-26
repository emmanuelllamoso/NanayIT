package com.ecl.springboot.employeeCRUD.service;

import java.util.List;

import com.ecl.springboot.employeeCRUD.entity.Employee;

public interface EmployeeService {
	
	List<Employee> findAll(); 
	
	Employee findById(int id); 
	
	Employee save(Employee theEmployee); 
	
	void delete(int id); 
}
