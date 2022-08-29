package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Admin;

@Service
public interface AdminServices {

public List<Admin> getAdmin();

	
	public void addAdmin( Admin adm);
    

	public Admin updateAdmin(Admin adm);

	
	public void deleteAdmin(long id);
}