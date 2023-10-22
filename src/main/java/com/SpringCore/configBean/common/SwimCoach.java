package com.SpringCore.configBean.common;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class SwimCoach implements Coach{
	
	public SwimCoach() {
		System.out.print("In constructor: " + getClass().getName()); 
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Let's Swim for an hour!";
	}

}
