package com.example.service;

import com.example.dto.UserCreateDTO;
import com.example.dto.UserViewDTO;

public interface UserService {
	
	UserViewDTO getUserById(Long id);  // UserAPI den gelen isteğimiz

	UserViewDTO createUser(UserCreateDTO userCreateDTO);
	
	

}
