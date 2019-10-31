package com.springboot.jpa.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.model.User;

@Repository
public interface IUserDAO extends CrudRepository<User, Integer> {

}
