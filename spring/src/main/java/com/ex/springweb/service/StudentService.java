package com.ex.springweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.springweb.dao.StudentDao;
import com.ex.springweb.dto.StudentDto;
@Service
public class StudentService {
	@Autowired
	StudentDao studentDao;
	
public String insertStudent(StudentDto studentDto) {
	return studentDao.insertStudent(studentDto);
	
}
}
