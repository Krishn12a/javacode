package com.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="module_name")
public class ModuleEntity {
	@Id
	private int sid;
	@Column
	private String mname;
	@Column(insertable = false, updatable = false)
	private int cid;
	
	@ManyToOne
	@JoinColumn(name = "cid")
	private Course course;
	
	
   

	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	@Override
	public String toString() {
		return "Module [sid=" + sid + ", mname=" + mname + ", cid=" + cid + "]";
	}
	
	
	

}
