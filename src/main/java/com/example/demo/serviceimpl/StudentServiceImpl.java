package com.example.demo.serviceimpl;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Course;
import com.example.demo.Entity.Exam;
import com.example.demo.Entity.Student;
import com.example.demo.repo.CourseRerpo;
import com.example.demo.repo.ExamRepo;
import com.example.demo.repo.StudentRepo;
import com.example.demo.services.StudentServices;

@Service
public class StudentServiceImpl implements StudentServices{
 
	@Autowired 
	StudentRepo srepo;
	@Autowired
	ExamRepo exrepo;
	@Autowired 
	CourseRerpo crepo;
	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return srepo.findAll();
	}

	@Override
	public void addStudent(Student st) {
		// TODO Auto-generated method stub
		
		
		
		
		List<Exam>add2=new ArrayList<>();
		for(Exam exm:st.getExam()) {
			Exam e=exrepo.findById(exm.getExamid()).get();
			add2.add(e);
		}
		st.setExam(add2);
		
		List<Course>add3=new ArrayList<>();
		for(Course co:st.getCourse()) {
		  Course c=crepo.findById(co.getId()).get();
		  add3.add(c);
		}
       srepo.save(st);
		
	}

	@Override
	public Student updateStudent(Student st) {
		// TODO Auto-generated method stub
		return srepo.save(st);
	}

	@Override
	public void deleteStudent(long id) {
		// TODO Auto-generated method stub
		srepo.deleteById(id);
	}

}
