package com.ex.springweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.springweb.dto.CourseDto;

public interface CourseRepo extends JpaRepository<CourseDto, String>{

}
