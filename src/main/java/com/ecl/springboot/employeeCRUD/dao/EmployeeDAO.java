package com.ecl.springboot.employeeCRUD.dao;

import java.util.List;

import com.ecl.springboot.employeeCRUD.entity.Employee;

public interface EmployeeDAO {
	
	List<Employee> findAll(); 
	
	Employee findById(int id); 
	
	Employee save(Employee theEmployee); 
	
	void delete(int id); 
}
