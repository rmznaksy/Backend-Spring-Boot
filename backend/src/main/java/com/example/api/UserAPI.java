package com.example.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.UserViewDTO;
import com.example.service.UserService;

@RestController
@RequestMapping("/api")
public class UserAPI {
	
	private final UserService userService;
	
	public UserAPI(UserService userService) {
		this.userService = userService;
	}
//	@Deprecated   // bunu kullanırsak burayı devre dısı bırakmıs oluruz
	@GetMapping("v1/user/{id}")
	public ResponseEntity<UserViewDTO> getUserById(@PathVariable Long id) {
		final UserViewDTO user = userService.getUserById(id);
		return ResponseEntity.ok(user);
		
	}
	/*
	@PostMapping("v1/user")
	public ResponseEntity<?>createUser(@RequestBody UserCreateDTO userCreateDTO){
		return null;
	}
	*/
	
	
	
	
	
	


}