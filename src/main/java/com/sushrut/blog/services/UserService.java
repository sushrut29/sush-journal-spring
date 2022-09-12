package com.sushrut.blog.services;

import java.util.List;

import com.sushrut.blog.payloads.UserDto;
//import com.sushrut.blog.payloads.UserDtoForRegisterUser;

public interface UserService {

	UserDto registerNewUser(UserDto user);
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto user, Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto> getAllUsers();
	void deleteUser(Integer userId);
//	UserDto registerNewUser(UserDtoForRegisterUser userdto);
	
}
