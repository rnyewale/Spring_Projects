package com.spring.data.jpa.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.data.jpa.entity.Student;
import com.spring.data.jpa.repositories.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<Student>();
		studentRepository.findAll().forEach(students::add);
		return students;
	}

	public Optional<Student> findStudentById(long studentId) {
		return studentRepository.findById(studentId);
	}

	public void updateStudent(long id, Student student) {
		studentRepository.save(student);
	}

	public void deleteStudent(long studentId) {
		studentRepository.deleteById(studentId);
	}
	
	public void addStudent(Student student) {
		studentRepository.save(student);
	}
}
