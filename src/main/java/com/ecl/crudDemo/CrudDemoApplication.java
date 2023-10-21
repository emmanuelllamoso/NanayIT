package com.ecl.crudDemo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ecl.crudDemo.dao.StudentDAO;
import com.ecl.crudDemo.entity.Student;

@SpringBootApplication
public class CrudDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudDemoApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commanLineRunner(StudentDAO studentDAO) {
		return runner ->{
			queryForStudentsByLastName(studentDAO);
		};
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		
		//get a list of students
		List<Student> students = studentDAO.findByLastName("pogi");
		
		//display list of students
		for(Student student: students) {
			System.out.println(student);
		}
		
	}

	private void queryForStudents(StudentDAO studentDAO) {
		//get list of student
		List<Student> students= studentDAO.findAll(); 
		
		// display list of students
		for(Student student:students) {
			System.out.println(student);
		}
		
	}

	private void readStudent(StudentDAO studentDAO) {
		// retrieve student based on the id: primay key
		Student myStudent = studentDAO.findById(1); 
		
		//display student
		System.out.println("Found the student: " + myStudent);
		
	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		//create multiple students object
		System.out.println("Creating new student object ...");
		Student tempStudent1 = new Student("Emman", "Pogi", "paulpogi@gmail.com"); 
		Student tempStudent2 = new Student("John", "Pogi", "paulpogi@gmail.com"); 
		Student tempStudent3 = new Student("Rafael", "Pogi", "paulpogi@gmail.com"); 
		Student tempStudent4 = new Student("Anton", "Pogi", "paulpogi@gmail.com"); 
		
		//save the student object
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent1);	
		studentDAO.save(tempStudent2);	
		studentDAO.save(tempStudent3);	
		studentDAO.save(tempStudent4);	
		
		//display id of the saved student
		System.out.println("Saved student. Genearted id: " + tempStudent1.getId()); 		
		System.out.println("Saved student. Genearted id: " + tempStudent2.getId()); 
		System.out.println("Saved student. Genearted id: " + tempStudent3.getId()); 
		System.out.println("Saved student. Genearted id: " + tempStudent4.getId()); 
		
	}

	private void createStudent(StudentDAO studentDAO) {
		//create the student object
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Paul", "Pogi", "paulpogi@gmail.com"); 
		
		//save the student object
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);
		
		//display id of the saved student
		System.out.println("Saved student. Genearted id: " + tempStudent.getId()); 
	}

}
