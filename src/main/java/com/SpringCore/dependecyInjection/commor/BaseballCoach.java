package com.SpringCore.dependecyInjection.commor;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
	
	public BaseballCoach() {
		System.out.println("In constructor: " + getClass().getSimpleName());
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "BaseballCoach";
	}

}
