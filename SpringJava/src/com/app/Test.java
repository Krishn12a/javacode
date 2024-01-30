package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
		
		ApplicationContext context=ClassPathXmlApplicationContext();
		Human human = context.getBean("human",Human.class);
		human.pumping();
	}

}
