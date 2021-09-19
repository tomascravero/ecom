package com.auriecommerce.enterprise.services.userService;

import org.springframework.beans.factory.annotation.Autowired;

import com.auriecommerce.enterprise.model.user.User;
import com.auriecommerce.enterprise.repositories.IUserRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UserService {
	@Autowired
    private IUserRepository userRepository;

	public UserService(IUserRepository userRepository) {
		this.userRepository = userRepository;
	}

}
