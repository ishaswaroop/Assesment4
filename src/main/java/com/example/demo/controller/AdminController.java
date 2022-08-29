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

import com.example.demo.Entity.Admin;
import com.example.demo.services.AdminServices;



@RestController
@RequestMapping("/home")
public class AdminController {

	@Autowired
	AdminServices adminservices;
	
	@GetMapping("/")
	public List<Admin> getAdmin() {
          return adminservices.getAdmin();
	}

	@PostMapping("/")
	public void addAdmin(@RequestBody Admin adm) {
		adminservices.addAdmin(adm);
	}
    
	@PutMapping("/")
	public Admin updateAdmin(@RequestBody Admin adm) {
		return adminservices.updateAdmin(adm);
	}

	@DeleteMapping("/")
	public void deleteDepartment(long id) {
		adminservices.deleteAdmin(id);
	}
	
}
