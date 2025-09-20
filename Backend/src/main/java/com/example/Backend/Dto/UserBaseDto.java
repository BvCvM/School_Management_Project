package com.example.Backend.Dto;

import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class UserBaseDto {

	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String adress;
	private String phone;
	private Set<String> roles;
	
	
}
