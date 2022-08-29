package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;


@Service
public interface StudentServices {
public List<Student> getStudent();

	
	public void addStudent(Student st);
    

	public Student updateStudent(Student st);

	
	public void deleteStudent(long id);
}
