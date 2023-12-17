package com.eventify.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventify.entity.User;
import com.eventify.repository.UserRepository;
import com.eventify.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> getAll() {
		return userRepository.findAll();

	}

	@Override
	public String addUser(User user) {
		if (user != null) {
			userRepository.save(user);
		}
		return "User Added";

	}

	@Override
	public String editUser(User user, Long userId) {
		Optional<User> optionalUser = userRepository.findById(userId);
		if (optionalUser.isPresent()) {
			User existingUser = optionalUser.get();
			existingUser.setAddress(user.getAddress());
			existingUser.setContact(user.getContact());
			existingUser.setEmail(user.getEmail());
			existingUser.setFirstName(user.getFirstName());
			existingUser.setLastName(user.getLastName());
			userRepository.save(existingUser);
			return "User Updated";
		}
		return "User not found";
	}

	@Override
	public String deleteUser(Long userId) {
		Optional<User> optionalUser = userRepository.findById(userId);

		if (optionalUser.isPresent()) {
			User user = optionalUser.get();
			user.setIsActive(false);
			userRepository.save(user);
			return "User deactivated successfully";
		} else {
			return "User not found";
		}
	}

}
