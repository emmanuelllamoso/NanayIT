package com.SpringCore.configBean.common;

import org.springframework.stereotype.Component;

@Component	
public class CricketCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Hi I'm your Cricket coach";
	}

}
