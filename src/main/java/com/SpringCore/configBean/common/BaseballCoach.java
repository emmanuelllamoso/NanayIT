package com.SpringCore.configBean.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Im really good at baseball";
	}
	
	

}
