package com.springboot.jpa.service;

import com.springboot.jpa.model.User;

public interface IUserService {
	public User getUser();

	public void createUser(User user);
}
