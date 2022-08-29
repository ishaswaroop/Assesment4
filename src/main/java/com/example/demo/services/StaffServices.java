package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Staff;


@Service
public interface StaffServices {
public List<Staff> getStaff();

	
	public void addStaff(Staff ex);
    

	public Staff updateStaff(Staff ex);

	
	public void deleteStaff(long id);
}
