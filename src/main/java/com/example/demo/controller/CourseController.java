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

import com.example.demo.Entity.Course;
import com.example.demo.services.CourseServices;


@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	CourseServices courseservices; 
	
	@GetMapping("/")
	public List<Course> getCourse() {
          return courseservices.getCourse();
	}

	@PostMapping("/")
	public void addCourse(@RequestBody Course crs) {
		courseservices.addCourse(crs);
	}
    
	@PutMapping("/")
	public Course updateCourse(@RequestBody Course crs) {
		return courseservices.updateCourse(crs);
	}

	@DeleteMapping("/")
	public void deleteCourse(long id) {
		courseservices.deleteCourse(id);
	}
	
}
