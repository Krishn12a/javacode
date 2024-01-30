package com.app.HibernateDemo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student")
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int roolno;
	@Column
	String name;
	@Column
	float total_marks;
	@Column
	char pass;
	
	public int getRoolno() 
	{
		return roolno;
	}
	public void setRoolno(int roolno) {
		this.roolno = roolno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getTotal_marks() {
		return total_marks;
	}
	public void setTotal_marks(float total_marks) {
		this.total_marks = total_marks;
	}
	public char getPass() {
		return pass;
	}
	public void setPass(char pass) {
		this.pass = pass;
	}
	
	

}
