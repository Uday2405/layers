package com.pratice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pratice.Entity.StudentData;
import com.pratice.Service.StudentService;

@RestController
@EnableJpaRepositories
@RequestMapping("/Student")
public class StudentController {
	@Autowired
	StudentService StudentService;

	@PostMapping("/add")
	public StudentData addStudent(@RequestBody StudentData s) {
		StudentService.addStudent(s);
		return s;

	}
	@GetMapping("/get")
	public List<StudentData> getStudentdata(StudentData s){
		return StudentService.getAll();
		
	}

}
