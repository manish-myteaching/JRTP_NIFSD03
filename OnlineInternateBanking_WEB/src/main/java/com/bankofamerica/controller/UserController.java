package com.bankofamerica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bankofamerica.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/register")
	public String getRegisterForm() {

		return "registration";
	}

	@PostMapping("/register")
	public String registerUser() {
		return "registration";
	}

}
