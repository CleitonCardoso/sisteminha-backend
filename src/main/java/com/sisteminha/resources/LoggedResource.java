package com.sisteminha.resources;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;

import com.sisteminha.entities.User;
import com.sisteminha.services.UserService;

public class LoggedResource {

	@Autowired
	private Principal principal;

	@Autowired
	private UserService userService;

	public User getLoggedUser() {
		return userService.findByUserName(principal.getName());
	}

}
