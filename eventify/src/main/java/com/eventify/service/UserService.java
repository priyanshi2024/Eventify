package com.eventify.service;

import java.util.List;

import com.eventify.entity.User;

public interface UserService {
	
	public List<User> getAll();
	public String addUser(User user);
	public String editUser(User user,Long userId);
	public String deleteUser(Long userId);

}
