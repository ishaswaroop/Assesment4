package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Course;

@Service
public interface CourseServices {
public List<Course> getCourse();

	
	public void addCourse(Course crs);
    

	public Course updateCourse(Course crs);

	
	public void deleteCourse(long id);
	
}
