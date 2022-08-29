package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Staff;
import com.example.demo.services.StaffServices;



@RestController
@RequestMapping("/staff")
public class StaffController {
	@Autowired
	StaffServices staffservices; 
	
	@GetMapping("/")
	public List<Staff> getStaff() {
          return staffservices.getStaff();
	}

	@PostMapping("/")
	public void addSatff(@RequestBody Staff st) {
		staffservices.addStaff(st);
	}
    
	@PutMapping("/")
	public Staff updateStaff(@RequestBody Staff st) {
		return staffservices.updateStaff(st);
	}

	@DeleteMapping("/")
	public void deleteStaff(long id) {
		staffservices.deleteStaff(id);
	}
	
}

