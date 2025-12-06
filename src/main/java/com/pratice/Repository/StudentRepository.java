package com.pratice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pratice.Entity.StudentData;

@Repository
public interface StudentRepository extends JpaRepository<StudentData, Integer> {

}
