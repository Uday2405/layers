package com.pratice.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratice.Entity.StudentData;
import com.pratice.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository StudentRepo;

	public StudentData addStudent(StudentData s) {
		return StudentRepo.save(s);

	}

	

	public List<StudentData> getAll() {
		List<StudentData> u=StudentRepo.findAll();
		return u;
	}

}
