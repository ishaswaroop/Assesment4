package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Entity.Exam;
import com.example.demo.repo.ExamRepo;
import com.example.demo.services.ExamServices;

@Service
public class ExamserviceImpl implements ExamServices{

	
	@Autowired 
	ExamRepo exrepo;
	
	@Override
	public List<Exam> getExam() {
		// TODO Auto-generated method stub
		return exrepo.findAll();
	}

	@Override
	public void addExam(Exam ex) {
		// TODO Auto-generated method stub
		exrepo.save(ex);
	}

	@Override
	public Exam updateExam(Exam ex) {
		// TODO Auto-generated method stub
		return exrepo.save(ex);
	}

	@Override
	public void deleteExam(long id) {
		// TODO Auto-generated method stub
		exrepo.deleteById(id);
	}

	
	
}  
