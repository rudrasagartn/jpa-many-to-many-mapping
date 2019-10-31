package com.springboot.jpa.controller;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.model.Role;
import com.springboot.jpa.model.User;
import com.springboot.jpa.service.IRoleService;
import com.springboot.jpa.service.IUserService;

@RestController
public class UserController {

	@Autowired
	IRoleService iRoleService;

	@Autowired
	IUserService iUserService;

	@RequestMapping(value = "/get/user")
	public String getUser() {

		return "In JpaManyToManyMappingApplication::getUser";
	}

	@RequestMapping(value = "/create/user")
	public void createUser() {
		User user = new User();
		user.setUsername("Rudrasagar");
		Optional<Role> role = iRoleService.getRole(1);

		Set<Role> roles = new HashSet<Role>();
		roles.add(role.get());
		user.setRoles(roles);
		iUserService.createUser(user);
	}

}
