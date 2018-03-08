package com.sisteminha.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;

import com.sisteminha.entities.Incubator;
import com.sisteminha.entities.Tenant;
import com.sisteminha.entities.User;
import com.sisteminha.services.UserService;

public class LoggedResource {

	@Autowired
	private UserService userService;

	public User getLoggedUser() {
		return userService.findByUserName(SecurityContextHolder.getContext().getAuthentication().getName());
	}

	public Tenant getLoggedTenant() {
		return getLoggedUser().getTenant();
	}
	
	public Incubator getLoggedIncubator() {
		return getLoggedUser().getIncubator();
	}

}
