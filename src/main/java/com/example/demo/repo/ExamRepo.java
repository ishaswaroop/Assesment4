package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Entity.Exam;

@Repository
public interface ExamRepo extends JpaRepository<Exam, Long> {

	public List<Exam> findByName(@PathVariable String name);


	
}