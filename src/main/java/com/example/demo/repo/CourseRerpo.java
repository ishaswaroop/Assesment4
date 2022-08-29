package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.Entity.Course;

@Repository
public interface CourseRerpo extends JpaRepository<Course, Long> {

}


