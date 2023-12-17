package com.eventify.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eventify.entity.Event;
import com.eventify.entity.User;
import com.eventify.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/getAll")
	public List<User> getAll() {
		return userService.getAll();
	}
	
	@PostMapping("/save")
	public String addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@PutMapping("/edit")
	public String editUser(@RequestBody User user , @RequestParam Long userId) {
		return userService.editUser(user,userId);
	}
		@DeleteMapping("/delete")
	public String deleteUser(@RequestParam Long userId) {
		return userService.deleteUser(userId);
	}

}
