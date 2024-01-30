package com.app.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Module {
	
	@Id
	private int Mod_id;
	@Column
	private String Mod_name;
	@Column
	private int Course_id;
	
	public Module() {}
	
	public Module(int mod_id, String mod_name, int course_id) {
		super();
		Mod_id = mod_id;
		Mod_name = mod_name;
		Course_id = course_id;
	}

	public int getMod_id() {
		return Mod_id;
	}

	public void setMod_id(int mod_id) {
		Mod_id = mod_id;
	}

	public String getMod_name() {
		return Mod_name;
	}

	public void setMod_name(String mod_name) {
		Mod_name = mod_name;
	}

	public int getCourse_id() {
		return Course_id;
	}

	public void setCourse_id(int course_id) {
		Course_id = course_id;
	}

	@Override
	public String toString() {
		return "Module [Mod_id=" + Mod_id + ", Mod_name=" + Mod_name + ", Course_id=" + Course_id + "]";
	}
	
	
	
	

}
