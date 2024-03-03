package com.ex.springweb.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class StudentDto {
	@Id
	private int sid;
	private String sname;
	private String email;
	private String cname;
	@OneToOne
	private CourseDto courseDto;
	
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public CourseDto getCourseDto() {
		return courseDto;
	}
	public void setCourseDto(CourseDto courseDto) {
		this.courseDto = courseDto;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "StudentDto [sid=" + sid + ", sname=" + sname + ", email=" + email + ", cname=" + cname + ", courseDto="
				+ courseDto + "]";
	}
	
	

}
