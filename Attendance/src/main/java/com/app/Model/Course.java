package com.app.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
	
	@Id
	private int Course_id;
	@Column
	private String Course_name;
	@Column
	private String Start_dte;
	@Column
	private String End_dte;
	@Column
	private int Std_id;
	
	public Course() {
		
	}
	
	public Course(int course_id, String course_name, String start_dte, String end_dte, int std_id) {
		super();
		Course_id = course_id;
		Course_name = course_name;
		Start_dte = start_dte;
		End_dte = end_dte;
		Std_id = std_id;
	}

	public int getCourse_id() {
		return Course_id;
	}

	public void setCourse_id(int course_id) {
		Course_id = course_id;
	}

	public String getCourse_name() {
		return Course_name;
	}

	public void setCourse_name(String course_name) {
		Course_name = course_name;
	}

	public String getStart_dte() {
		return Start_dte;
	}

	public void setStart_dte(String start_dte) {
		Start_dte = start_dte;
	}

	public String getEnd_dte() {
		return End_dte;
	}

	public void setEnd_dte(String end_dte) {
		End_dte = end_dte;
	}

	public int getStd_id() {
		return Std_id;
	}

	public void setStd_id(int std_id) {
		Std_id = std_id;
	}

	@Override
	public String toString() {
		return "Course [Course_id=" + Course_id + ", Course_name=" + Course_name + ", Start_dte=" + Start_dte
				+ ", End_dte=" + End_dte + ", Std_id=" + Std_id + "]";
	}
	
	
	

}
