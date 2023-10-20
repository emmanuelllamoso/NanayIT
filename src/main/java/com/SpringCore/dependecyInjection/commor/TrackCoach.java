package com.SpringCore.dependecyInjection.commor;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
	
	public TrackCoach() {
		System.out.println("In constructor: " + getClass().getSimpleName());
		}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run for 15mins!!!";
	}
	
	

}
