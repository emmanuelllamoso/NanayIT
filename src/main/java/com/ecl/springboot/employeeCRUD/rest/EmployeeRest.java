package com.ecl.springboot.employeeCRUD.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecl.springboot.employeeCRUD.dao.EmployeeDAO;
import com.ecl.springboot.employeeCRUD.entity.Employee;
import com.ecl.springboot.employeeCRUD.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRest {
	
	private EmployeeService employeeService;

	//quick and dirty: inject employee dao
	public EmployeeRest(EmployeeService theEmployeeService) {
		this.employeeService = theEmployeeService;
	} 

	
	//expore "/employees" and return a list of employees
	@GetMapping("/employees")
	public List<Employee> findAll(){
		return employeeService.findAll();
	}
	
	// add mapping for GET /employees/{employeeId} // the PathVariable must be the same as the {employeeId}
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) {
		Employee employee = employeeService.findById(employeeId); 
		
		if(employee==null) {
			throw new RuntimeException("Employee id not found - " + employeeId); 
		}
		
		return employee; 
	}
	
	//add mapping for POST /employees - add new employee
	@PostMapping("/employees")
	public Employee addEmployee(@RequestBody Employee employee) {
		
		//also just in case they pass id in JSON ... set id to 0
		//this is to force a save of new item ... instead of update
		
		employee.setId(0); 
		
		Employee dbEmployee = employeeService.save(employee); 
		
		return dbEmployee; 
		
	}
	
	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		
		Employee dbEmployee = employeeService.save(employee); 
		
		return dbEmployee; 
	}
	
	//add mapping for DELETE /employees/{employeeID] - delete employee
	@DeleteMapping("/employees/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {
		Employee employee = employeeService.findById(employeeId);
		
		// throw exception if null 
		
		if(employee==null)
			throw new RuntimeException("Employee not found " + employeeId); 
		
		employeeService.delete(employeeId);
		
		return "Employee's data with Id of " + employeeId + " successfully deleted"; 
	}
	
}
