package com.pratice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratice.Entity.EmployeeData;

public interface EmployeeRepository  extends JpaRepository<EmployeeData, Integer>{

}
