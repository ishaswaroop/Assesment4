package com.example.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Exam;
import com.example.demo.Entity.Staff;
import com.example.demo.Entity.Student;
import com.example.demo.repo.ExamRepo;
import com.example.demo.repo.StaffRepo;
import com.example.demo.repo.StudentRepo;
import com.example.demo.services.StaffServices;

@Service
public class StaffServiceImpl implements StaffServices{

	@Autowired 
	StaffRepo repo;
	@Autowired 
	StudentRepo srepo;
	@Autowired 
	ExamRepo exrepo;
	
	
	@Override
	public List<Staff> getStaff() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void addStaff(Staff ex) {
		// TODO Auto-generated method stub
		List<Student>add=new ArrayList<>();
		for(Student a:ex.getStudent()) {
			Student st=srepo.findById(a.getId()).get();
			add.add(st);
		}
		ex.setStudent(add);
		
		
		
		List<Exam>add2=new ArrayList<>();
		for(Exam exm:ex.getExam()) {
			Exam e=exrepo.findById(exm.getExamid()).get();
			add2.add(e);
		}
		ex.setExam(add2);
       repo.save(ex);
		
	}

	@Override
	public Staff updateStaff(Staff ex) {
		// TODO Auto-generated method stub
		return repo.save(ex);
	}

	@Override
	public void deleteStaff(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
