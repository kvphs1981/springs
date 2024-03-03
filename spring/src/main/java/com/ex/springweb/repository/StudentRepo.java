package com.ex.springweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.springweb.dto.StudentDto;

public interface StudentRepo extends JpaRepository<StudentDto, Integer>{

}
