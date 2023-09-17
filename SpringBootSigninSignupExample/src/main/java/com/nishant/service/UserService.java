package com.nishant.service;

import com.nishant.model.User;


public interface UserService {

	 public User findUserByEmail(String email);
	 
	 public void saveUser(User user);
}
