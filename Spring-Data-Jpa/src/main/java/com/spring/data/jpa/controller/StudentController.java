package com.spring.data.jpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.data.jpa.entity.Student;
import com.spring.data.jpa.services.StudentService;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	// @GetMapping(value = "/getAllStudents")
	@RequestMapping(method = RequestMethod.GET, value = "/getAllStudents")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	// @GetMapping(value = "/getStudent/{studId}")
	@RequestMapping(method = RequestMethod.GET, value = "/getStudent/{Id}")
	public Optional<Student> getStudentById(@PathVariable long Id) {
		return studentService.findStudentById(Id);
	}

	// @PutMapping(value = "/update/{studentId}")
	@RequestMapping(method = RequestMethod.PUT, value = "/update/{Id}")
	public void updateStudentById(@PathVariable long Id, @RequestBody Student student) {
		studentService.updateStudent(Id, student);
	}

	// @DeleteMapping(value = "/delete/{studentId}")
	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{Id}")
	public void deleteStudentById(@PathVariable long Id) {
		studentService.deleteStudent(Id);
	}

	//@PostMapping(value = "/save")
	@RequestMapping(method = RequestMethod.POST, value = "/save")
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
	}
}
