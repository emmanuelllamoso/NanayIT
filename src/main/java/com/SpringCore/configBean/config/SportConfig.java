package com.SpringCore.configBean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.SpringCore.configBean.common.Coach;
import com.SpringCore.configBean.common.SwimCoach;

@Configuration
public class SportConfig {

	@Bean("aquatic")
	public Coach swimCoach() {
		return new SwimCoach(); 
	}
}
