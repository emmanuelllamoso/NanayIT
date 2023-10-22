package com.ecl.crudDemo.dao;

import java.util.List;

import com.ecl.crudDemo.entity.Student;

public interface StudentDAO {
	
	void save(Student theStudent);
	
	Student findById(Integer id); 
	
	List<Student> findAll(); 
	
	List<Student> findByLastName(String lastName);
	
	void update(Student theStudent); 
	
	void delete(Integer id);

	int deleteAll(); 
}
