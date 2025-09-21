package com.example.Backend.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Backend.Services.UserService;

@RestController
@RequestMapping("/api/User")
public class UserController {
	private UserService Userservices;
	

	/*@GetMapping("/allUser")
    public List<User> findAllUsers()
	{
		return Userservices.findAllUsers();
	}
	@GetMapping("/{id}")
    public User findUserbyid(@PathVariable Long id)
	{
		return Userservices.findUserbyid(id);
	}*/
	
}
