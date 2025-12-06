package com.pratice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pratice.Entity.EmployeeData;
import com.pratice.Service.EmployeeDataService;

@RestController
@EnableJpaRepositories
@RequestMapping("/Employeee")
public class EmployeeController {
	
	
	@Autowired
	EmployeeDataService EmployeeService;
	
	@PostMapping("/addd")
	public EmployeeData addemployee(@RequestBody EmployeeData e) {
		
		EmployeeService.add(e); 
		
		return e;
	}
	
	
	
	

}
