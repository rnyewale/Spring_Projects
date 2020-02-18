package com.spring.data.jpa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.data.jpa.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	public List<Student> findAll();
	
}
