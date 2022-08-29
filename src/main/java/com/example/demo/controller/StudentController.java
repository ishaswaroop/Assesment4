package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.services.StudentServices;



@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentServices studentservices; 
	
	@GetMapping("/")
	public List<Student> getStudent() {
          return studentservices.getStudent();
	}

	@PostMapping("/")
	public void addStudent(@RequestBody Student st) {
		studentservices.addStudent(st);
	}
    
	@PutMapping("/")
	public Student updateStudent(@RequestBody Student st) {
		return studentservices.updateStudent(st);
	}

	@DeleteMapping("/")
	public void deleteStudent(long id) {
		studentservices.deleteStudent(id);
	}
	
}

