package com.app.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int Std_id;
	@Column
	private String Std_name;
	
	public Student() {
		
	}

	public Student(int std_id, String std_name) {
		super();
		Std_id = std_id;
		Std_name = std_name;
	}

	public int getStd_id() {
		return Std_id;
	}

	public void setStd_id(int std_id) {
		Std_id = std_id;
	}

	public String getStd_name() {
		return Std_name;
	}

	public void setStd_name(String std_name) {
		Std_name = std_name;
	}

	@Override
	public String toString() {
		return "Student [Std_id=" + Std_id + ", Std_name=" + Std_name + "]";
	}
	
	
}
