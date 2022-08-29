package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Exam;

import com.example.demo.services.ExamServices;



@RestController
@RequestMapping("/exam")
public class ExamController {

	@Autowired
	ExamServices examservices; 
	
	@GetMapping("/")
	public List<Exam> getExam() {
          return examservices.getExam();
	}
	
	
	@PostMapping("/")
	public void addExam(@RequestBody Exam ex) {
		examservices.addExam(ex);
	}
    
	@PutMapping("/")
	public Exam updateExam(@RequestBody Exam ex) {
		return examservices.updateExam(ex);
	}

	@DeleteMapping("/")
	public void deleteExam(long id) {
		examservices.deleteExam(id);
	}
	
}
