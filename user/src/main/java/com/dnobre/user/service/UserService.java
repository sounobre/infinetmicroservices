package com.dnobre.user.service;

import java.util.List;

import com.dnobre.user.entities.User;
import com.dnobre.user.form.UserForm.UserFormPost;

public interface UserService {

	List<User> findAll();
	User findById(Long id);
	User save(UserFormPost userFormPost);
	User update(User user);
	void delete(Long id);
}
