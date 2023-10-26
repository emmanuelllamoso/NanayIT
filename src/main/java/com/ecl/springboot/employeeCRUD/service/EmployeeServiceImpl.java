package com.ecl.springboot.employeeCRUD.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecl.springboot.employeeCRUD.dao.EmployeeDAO;
import com.ecl.springboot.employeeCRUD.entity.Employee;

import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDAO employeeDAO; 
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDAO employeedb) {
		this.employeeDAO = employeedb;
	}
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeDAO.findAll();
	}
	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return employeeDAO.findById(id);
	}
	@Override
	@Transactional
	public Employee save(Employee theEmployee) {
		// TODO Auto-generated method stub
		return employeeDAO.save(theEmployee);
	}
	@Override
	@Transactional
	public void delete(int id) {
		// TODO Auto-generated method stub
		employeeDAO.delete(id);
	}

}
