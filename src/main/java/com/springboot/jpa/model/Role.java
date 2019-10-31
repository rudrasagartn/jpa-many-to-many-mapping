package com.springboot.jpa.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author rudrasagar.tn
 */

@Entity
@Table(name = "ROLES")
public class Role {

	@Id
	@Column(name = "role_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer roleId;

	@Column(name = "role_name")
	private String rolename;

	@ManyToMany(mappedBy = "roles")
	private Set<User> users;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(Integer roleId, String rolename) {
		super();
		this.roleId = roleId;
		this.rolename = rolename;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}
