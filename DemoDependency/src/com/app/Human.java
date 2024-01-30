package com.app;

public class Human {
	
	Heart heart;
	
	public Human() {
		// TODO Auto-generated constructor stub
	}

	public Human(Heart heart) {
		super();
		System.out.println("Constructor Invoked");
		this.heart = heart;
	}

	public void setHeart(Heart heart) {
		System.out.println("Setter Invoked");
		this.heart = heart;
	}
	public void pumping() {
		if(heart!=null) {
			heart.pump();
		}
		else {
			System.out.println("you are dead");
		}
	}
	
}
