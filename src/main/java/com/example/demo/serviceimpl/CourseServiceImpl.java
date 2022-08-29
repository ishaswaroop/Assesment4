package com.example.demo.serviceimpl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Course;
import com.example.demo.repo.CourseRerpo;
import com.example.demo.services.CourseServices;

@Service
public class CourseServiceImpl implements CourseServices{
	
	@Autowired
	CourseRerpo repo;
	

	@Override
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void addCourse(Course crs) {
		// TODO Auto-generated method stub
		repo.save(crs);
	}

	@Override
	public Course updateCourse(Course crs) {
		// TODO Auto-generated method stub
		return repo.save(crs);
	}

	@Override
	public void deleteCourse(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
