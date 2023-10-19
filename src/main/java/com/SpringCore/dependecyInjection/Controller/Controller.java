package com.SpringCore.dependecyInjection.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringCore.dependecyInjection.commor.Coach;

@RestController
public class Controller {
	
	//define a private field for the dependency
	private Coach coach;

	//define a constructor for dependency injection
//	@Autowired
//	public Controller(Coach coach) {
//		this.coach = coach;
//	}
	
	//Define a setter for dependency injection
//	@Autowired
//	public void setCoach(Coach coach) {
//		this.coach = coach; 
//	}
	
	//Qualifier annotation for setter and constructor if we have multiple beans
	@Autowired
	public void setCoach(@Qualifier("trackCoach")Coach coach) {
		this.coach = coach; 
	}
	
	@GetMapping("/dailyworkout")
	public String getdailyWorkout() {
		return coach.getDailyWorkout(); 
	}

	
}
