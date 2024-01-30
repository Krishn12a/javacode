package com.app.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class StudentController {
	
	@GetMapping("/")
	public String getStudentForm()
	{
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String getStudentInfo(HttpServletRequest request, Model model)
	{
		String fname = request.getParameter("txtFirstname");
		String lname = request.getParameter("txtLastname");
		
		//convert firstname and lastname uppercase
		String theName = fname.toUpperCase()+" "+lname.toUpperCase();
		
		//create a message
		String result = "Hi, welcome "+theName;
		
		//add a message to the model
		model.addAttribute("message", result);
		
		return "helloWorld";
		
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String getInfo(@RequestParam("txtFirstname") String fname,
			@RequestParam("txtLastname") String lname, Model model
			)
	{
		//convert firstname and lastname uppercase
				String theName = fname.toUpperCase()+" "+lname.toUpperCase();
				
				//create a message
				String result = "Hello, welcome "+theName;
				
				//add a message to the model
				model.addAttribute("message", result);
				
				return "helloWorld";
	}
	
	

}
