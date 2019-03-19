package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.User;

public interface UserService {
	List<User> getAllUsers();

	User getUserById(Long id);

	User saveUser(User user);

}
