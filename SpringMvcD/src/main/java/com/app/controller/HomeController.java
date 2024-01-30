package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showMyPage()
	{
		return "main-menu";  //WEB-INF/view/main-menu.jsp
	}
	
	
}

