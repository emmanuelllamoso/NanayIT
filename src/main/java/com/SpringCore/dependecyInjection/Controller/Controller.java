package com.SpringCore.dependecyInjection.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringCore.dependecyInjection.commor.Coach;

@RestController
public class Controller {
	
	private Coach coach; 
	
	@Autowired
	public Controller(@Qualifier("baseballCoach")Coach coach) {
		this.coach = coach; 
	}
	
	@GetMapping("/dailyworkout")
	public String getdailyWorkout() {
		return coach.getDailyWorkout(); 
	}

	
}
