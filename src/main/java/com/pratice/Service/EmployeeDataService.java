package com.pratice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratice.Entity.EmployeeData;
import com.pratice.Repository.EmployeeRepository;

@Service
public class EmployeeDataService {

	
	@Autowired
	EmployeeRepository EmployeeRepo;
	public EmployeeData add(EmployeeData e) {
		return EmployeeRepo.save(e);
		
	}
	
	

}
