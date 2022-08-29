package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Exam;


@Service
public interface ExamServices {
public List<Exam> getExam();

	
	public void addExam(Exam ex);
    

	public Exam updateExam(Exam ex);

	
	public void deleteExam(long id);


	


	

	



}
