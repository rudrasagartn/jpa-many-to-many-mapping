package com.springboot.jpa.service;

import java.util.Optional;

import com.springboot.jpa.model.Role;

public interface IRoleService {
	
	public Optional<Role> getRole(int role_id);

}
