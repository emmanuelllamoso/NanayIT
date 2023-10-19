package com.SpringCore.dependecyInjection.commor;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice fast bowling fo 15 minutes !!!";
	}

}
