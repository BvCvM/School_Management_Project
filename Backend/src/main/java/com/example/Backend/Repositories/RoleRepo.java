package com.example.Backend.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Backend.Models.Role;

public interface RoleRepo extends JpaRepository<Role, Integer>  {

}
