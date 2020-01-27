package com.personal.society.management.app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.society.management.app.domain.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@PostMapping("/register")
	public void registration(@RequestBody User user) {
		System.out.println(user);
	}

}
