package com.example.Backend.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Backend.Models.Role;
import com.example.Backend.Repositories.RoleRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService{
	private final RoleRepo repositoryrole;
	@Override
	public Role addRole(Role role) {
		return repositoryrole.save(role);
	}

	@Override
	public List<Role> AllRoles() {

		return repositoryrole.findAll();
	}

	@Override
	public Role findRoleById(Integer id) {
		
		return repositoryrole.findById(id).get();
	}


}
