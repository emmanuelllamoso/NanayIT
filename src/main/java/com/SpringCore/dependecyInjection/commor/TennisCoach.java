package com.SpringCore.dependecyInjection.commor;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Let's play tennis for 15mins";
	}
	
	

}
