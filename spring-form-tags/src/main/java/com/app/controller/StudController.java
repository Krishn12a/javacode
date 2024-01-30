package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.Student;

@Controller
@RequestMapping("/student")
public class StudController {
	
	@GetMapping("/showForm")
	public String showForm(Model model)
	{
		Student s = new Student();
		model.addAttribute("student", s);
		return "form";
	}
	
	@PostMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent)
	{
		return "student-confirmation";
	}
	
	

}
