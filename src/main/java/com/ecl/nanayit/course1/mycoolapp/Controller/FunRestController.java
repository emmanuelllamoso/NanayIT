package com.ecl.nanayit.course1.mycoolapp.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@Value("${coach.name}")
	private String coachName;
	
	@Value("${team.name}")
	private String teamName; 
	
	@GetMapping("/hello")
	public String hello() {
		return coachName;  
	}
	
	// expose a new endpoint for "workout"
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a hard 5k"; 
	}
	// expose a new endpoint for "fortune"
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "Today is your lucky day."; 
	}

}
