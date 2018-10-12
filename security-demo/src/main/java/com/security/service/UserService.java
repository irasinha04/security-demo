package com.security.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.model.User;
import com.security.model.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public void saveUser(User user) {
		repository.save(user);
	}

	public User findUser(String userId) {

		Optional<User> user = repository.findById(userId);
		return user.get();
	}

	public void deleteUser(String userId) {

		repository.deleteById(userId);
	}

}
