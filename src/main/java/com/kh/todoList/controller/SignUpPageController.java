package com.kh.todoList.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpPageController {

	@GetMapping("signUpForm")
	public String signUpPage() {
		
		return "common/signUpPage";
		
	}
	
	@PostMapping("signUp")
	public String signUp() {
		
		return "redirect:/../todoList";
		
	}
	
	@PostMapping("login")
	public String login() {
		
		return "todoList/todoList";
		
	}
	
}
