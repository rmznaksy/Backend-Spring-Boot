package com.example.service;

import org.springframework.stereotype.Service;

import com.example.dto.UserViewDTO;
import com.example.exception.NotFoundException;
import com.example.model.User;
import com.example.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository; // servis katmanından repository e istek atıyoruz
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	

	@Override
	public UserViewDTO getUserById(Long id) {
		User user = userRepository.findById(id).orElseThrow(
				()-> new NotFoundException("Not Found Exception"));
		return UserViewDTO.of(user);
	}

}
