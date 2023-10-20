package com.SpringCore.dependecyInjection.commor;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary 
//@Primary to give higher preference to a bean when there are multiple beans of the same type.
public class TennisCoach implements Coach{
    
	public TennisCoach() {
		System.out.println("In constructor: " + getClass().getSimpleName());
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Let's play tennis for 15mins";
	}
	
	

}
