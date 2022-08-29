package com.example.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Admin;
import com.example.demo.Entity.Exam;
import com.example.demo.Entity.Staff;
import com.example.demo.Entity.Student;
import com.example.demo.repo.AdminRepo;
import com.example.demo.repo.ExamRepo;
import com.example.demo.repo.StaffRepo;
import com.example.demo.repo.StudentRepo;
import com.example.demo.services.AdminServices;

@Service
public class AdminserviceImpl implements AdminServices
{
	@Autowired
	AdminRepo repo;
	@Autowired
	StaffRepo srepo;
	@Autowired
	StudentRepo strepo;
	@Autowired 
	ExamRepo exrepo;

	@Override
	public List<Admin> getAdmin() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void addAdmin(Admin adm) {
		// TODO Auto-generated method stub
		List<Student>add=new ArrayList<>();
		for(Student a:adm.getStudent()) {
			Student st=strepo.findById(a.getId()).get();
			add.add(st);
		}
		adm.setStudent(add);
		
		List<Staff>add1=new ArrayList<>();
		for(Staff s:adm.getStaff()) {
			Staff st=srepo.findById(s.getId()).get();
			add1.add(st);
		}
		adm.setStaff(add1);
		
		List<Exam>add2=new ArrayList<>();
		for(Exam ex:adm.getExam()) {
			Exam e=exrepo.findById(ex.getExamid()).get();
			add2.add(e);
		}
       repo.save(adm);
		
	
	}

	@Override
	public Admin updateAdmin(Admin adm) {
		// TODO Auto-generated method stub
		return repo.save(adm);
	}

	@Override
	public void deleteAdmin(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	
	}

}
