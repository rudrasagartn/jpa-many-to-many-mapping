package com.springboot.jpa.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpa.dao.IRoleDAO;
import com.springboot.jpa.model.Role;
import com.springboot.jpa.service.IRoleService;

@Service
public class RoleServiceImpl implements IRoleService {
	
	@Autowired
	IRoleDAO iRoleDAO;

	public Optional<Role> getRole(int role_id) {
		return iRoleDAO.findById(role_id);
	}

}
