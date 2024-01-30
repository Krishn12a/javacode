package com.app.controller;

import java.util.Iterator;
import java.util.List;

public class Question {  
	private int id;  
	private String name;  
	private Answer answers;  
	  
	public Question() {}  
	public Question(int id, String name, Answer answers) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.answers = answers;  
	}  
	  
	public void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println("answers are:");  
	    System.out.println("ubuhb "+answers.getId()+answers.getName()); 
	    
	}  
  
}
