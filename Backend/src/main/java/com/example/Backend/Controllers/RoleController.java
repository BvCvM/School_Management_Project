package com.example.Backend.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Backend.Models.Role;
import com.example.Backend.Services.RoleService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/role")
@RequiredArgsConstructor
public class RoleController {
	
	  private final RoleService roleservices;
		
		@GetMapping("/allroles")
	    public List<Role> AllRoles()
		{
			return roleservices.AllRoles();
		}
		@GetMapping("/{id}")
	    public Role findRolebyid(@PathVariable Integer id)
		{
			return roleservices.findRoleById(id);
		}
		@PostMapping("/save")
		public Role AddRole(@RequestBody Role role) {
			return roleservices.addRole(role);
		}

}
