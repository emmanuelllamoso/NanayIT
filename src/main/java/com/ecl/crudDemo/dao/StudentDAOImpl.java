package com.ecl.crudDemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ecl.crudDemo.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class StudentDAOImpl implements StudentDAO{
	
	// define fild for entity manager
	private EntityManager entityManager; 
	
	//define constructor
	@Autowired
	public StudentDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	@Override
	@Transactional
	public void save(Student theStudent) {
		
		entityManager.persist(theStudent);
		
	}

	@Override
	public Student findById(Integer id) {
		// TODO Auto-generated method stub
		return entityManager.find(Student.class, id);
	}

	@Override
	public List<Student> findAll() {
		
		TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student", Student.class); 
		return theQuery.getResultList();
	}

	@Override
	public List<Student> findByLastName(String lastName) {
		//create query
		TypedQuery<Student> theQuery = entityManager.createQuery("FROM Student WHERE lastName=:theData", Student.class); 
		
		theQuery.setParameter("theData", lastName);
		
		//return query results
		return theQuery.getResultList();
	}

	

}
