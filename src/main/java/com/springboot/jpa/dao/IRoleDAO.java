package com.springboot.jpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.jpa.model.Role;


public interface IRoleDAO extends CrudRepository<Role, Integer> {

}
