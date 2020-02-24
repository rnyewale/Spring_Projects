package com.java.based.config.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.java.based.config.model.College;
import com.java.based.config.service.Principal;
import com.java.based.config.service.Teacher;
import com.java.based.config.serviceImpl.MathTeacher;

@Configuration
@ComponentScan(basePackages = "com.java.based.config")
public class CollegeConfig {

	@Bean
	public Principal principalBean() {
		return new Principal();
	}

	@Bean
	public Teacher teacherBean() {
		return new MathTeacher();
	}

	@Bean
	public College collegeBean() {
		College college = new College();
		college.setCollege(principalBean());
		return college;
		
	}

}
