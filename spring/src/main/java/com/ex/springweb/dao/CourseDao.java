package com.ex.springweb.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ex.springweb.dto.CourseDto;
import com.ex.springweb.repository.CourseRepo;
@Component
public class CourseDao {
@Autowired
CourseRepo courseRepo;
	public String insertCourse(CourseDto courseDto)

	{
		courseRepo.save(courseDto);
		return "course info saved";
		
	}
	public Optional<CourseDto> fetchCourseByPk(String cname){
		Optional<CourseDto> cd=courseRepo.findById(cname);
		return cd;
		
	}
}
