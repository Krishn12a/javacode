package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	
	@Id
	private int sid;
	@Column
	private String sname;
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSnmae() {
		return sname;
	}
	public void setSnmae(String sname) {
		this.sname = sname;
	}
	
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", snmae=" + sname + "]";
	}
	
	
	
	
}
