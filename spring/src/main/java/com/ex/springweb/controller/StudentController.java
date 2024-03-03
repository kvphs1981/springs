package com.ex.springweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ex.springweb.dto.CourseDto;
import com.ex.springweb.dto.StudentDto;
import com.ex.springweb.service.CourseService;
import com.ex.springweb.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	CourseService courseService;
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/sh")
	public String sHtml() {
		return "studentinsert";
	}
	
	@PostMapping("/sinsert")
	@ResponseBody
	public String insertStudent(@ModelAttribute StudentDto studentDto) {
		System.out.println(studentDto);
		String cname=studentDto.getCname();
		CourseDto courseDto=courseService.fetchCourseByPk(cname);
		studentDto.setCourseDto(courseDto);
		System.out.println(studentDto);
		return studentService.insertStudent(studentDto);
		
		
	}

}
