package com.ecl.springboot.employeeCRUD.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecl.springboot.employeeCRUD.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

	//define field for entity manager
	private EntityManager entityManager; 
	
	
	@Autowired
	public EmployeeDAOJpaImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Employee> findAll() {
		//create a query
		
		TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee", Employee.class); 
		
		//execute query and get result list
		List<Employee> employees = theQuery.getResultList();
		
		
		//return the results
		return employees;
	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		
		//get the employee
		Employee theEmployee = entityManager.find(Employee.class, id); 
		
		return theEmployee;
	}

	@Override
	public Employee save(Employee theEmployee) {
		// TODO Auto-generated method stub
		
		Employee employee = entityManager.merge(theEmployee); 
		
		return employee;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Employee employee =entityManager.find(Employee.class, id);
		
		entityManager.remove(employee);
	}

}
