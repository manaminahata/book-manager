package com.example.demo.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/yonda")
public class MainController {
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping("/home")
	public String goHome() {
		
		System.out.println("main:" + session.getAttribute("user"));
		
		if (session.getAttribute("user") == null) {
			return "redirect:/yonda/login";
		}
		
		return "home";
	}
}
