package com.bankofamerica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bankofamerica.entity.User;
import com.bankofamerica.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/register")
	public String getRegisterForm(Model model) {
		model.addAttribute("user", new User());
		return "registration";
	}

	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@ModelAttribute("user") User user) {
		System.out.println(user);
		try {
			userService.registerUser(user);
			return new ResponseEntity<String>("Register sucessfully", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Not Register " +e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
