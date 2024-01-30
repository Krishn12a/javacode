package com.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class StudentAttendance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int aid;
	private int std_id;
	private String std_name;
	private String date;
	private String attendanceStaus;
	private String course_name;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAttendanceStaus() {
		return attendanceStaus;
	}
	public void setAttendanceStaus(String attendanceStaus) {
		this.attendanceStaus = attendanceStaus;
	}
	
	

}
