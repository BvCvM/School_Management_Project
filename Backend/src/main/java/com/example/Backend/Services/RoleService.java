package com.example.Backend.Services;

import java.util.List;

import com.example.Backend.Models.Role;


public interface RoleService {
	Role addRole(Role role);
	List<Role> AllRoles();
	Role findRoleById(Integer id);
}
