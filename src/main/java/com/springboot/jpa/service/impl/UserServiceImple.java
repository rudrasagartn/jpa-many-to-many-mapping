package com.springboot.jpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpa.dao.IUserDAO;
import com.springboot.jpa.model.User;
import com.springboot.jpa.service.IRoleService;
import com.springboot.jpa.service.IUserService;

@Service
public class UserServiceImple implements IUserService {

	@Autowired
	IUserDAO userDao;
	
	

	@Override
	public User getUser() {
		return null;
	}

	@Override
	public void createUser(User user) {
		userDao.save(user);
	}

}
