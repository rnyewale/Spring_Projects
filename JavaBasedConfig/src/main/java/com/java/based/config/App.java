package com.java.based.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.based.config.configuration.CollegeConfig;
import com.java.based.config.model.College;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college = context.getBean("collegeBean", College.class);
		college.collegeInfo();

		/*Teacher teacher = context.getBean("teacherBean", Teacher.class);
		teacher.getTeacherInfo();*/

		System.out.println(college);
	}
}
