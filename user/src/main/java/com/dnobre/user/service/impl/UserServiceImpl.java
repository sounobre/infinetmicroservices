package com.dnobre.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dnobre.user.entities.User;
import com.dnobre.user.form.UserForm.UserFormPost;
import com.dnobre.user.repositories.UserRepository;
import com.dnobre.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findAll() {

		return userRepository.findAll();
	}

	@Override
	public User findById(Long id) {

		return userRepository.findById(id).get();
	}

	@Override
	public User save(UserFormPost userFormPost) {
		User user = new User();
		user.setName(userFormPost.getName());
		user.setEmail(userFormPost.getEmail());
		user.setPassword(userFormPost.getPassword());
		

		return userRepository.save(user);
	}

	@Override
	public User update(User user) {

		return userRepository.save(user);

	}

	@Override
	public void delete(Long id) {
		User user = userRepository.findById(id).get();
		userRepository.delete(user);
	}

}
