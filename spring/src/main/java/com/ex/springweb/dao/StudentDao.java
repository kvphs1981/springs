package com.ex.springweb.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ex.springweb.dto.StudentDto;
import com.ex.springweb.repository.StudentRepo;
@Component
public class StudentDao {
@Autowired
StudentRepo studentRepo;
	public String insertStudent(StudentDto studentDto) {
		studentRepo.save(studentDto);
		return "data inserted";
	}

}
