package com.personal.society.management.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.personal.society.management.app.domain.User;
import com.personal.society.management.app.dto.ResponseDto;
import com.personal.society.management.app.service.UserService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public List<User> getUsersList() {
		try {
			return userService.getUsersList();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}	
	
	@PostMapping("/user")
	public ResponseDto addUser(@RequestBody User user) {
		try {
			userService.addUser(user);
			return new ResponseDto(true, "User Added Successfully");
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseDto(false, e.getMessage());
		}
	}

	@PutMapping("/user/{id}")
	public ResponseDto updateUser(@RequestBody User user, @PathVariable int id) {
		try {
			userService.updateUser(user, id);
			return new ResponseDto(true, "User Updated Successfully");
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseDto(false, e.getMessage());
		}
	}
}
