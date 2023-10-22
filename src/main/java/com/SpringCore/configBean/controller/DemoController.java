package com.SpringCore.configBean.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringCore.configBean.common.Coach;

@RestController
public class DemoController {
	
	private Coach coach; 
	
	public DemoController(@Qualifier("aquatic") Coach coach) {
			this.coach = coach; 
	}
	
	@GetMapping("/swimming")
	public String letSwim() {
		return coach.getDailyWorkout(); 
	}
}
