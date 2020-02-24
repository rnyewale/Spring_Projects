package com.java.based.config.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.java.based.config.service.Principal;
import com.java.based.config.service.Teacher;

//@Component
public class College {

	@Autowired
	private Principal principal;

	@Autowired
	private Teacher teacher;
	
	// setter injection
	@Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	// setter injection
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	//setter injection for college
	public void setCollege(Principal principal){
		this.principal =principal;
	}
	
	/*// constructor injection for principal
	public College(Principal principal) {
		this.principal = principal;
	}
	
	// constructor injection for Teacher
	public College(Teacher teacher){
		this.teacher = teacher;
	}
*/
	public void collegeInfo() {
		System.out.println("Principal object: ");
		principal.getPrincipalInfo();
		teacher.getTeacherInfo();
		System.out.println("College info: MSSS CET Jalna");
	}
	
	
}
