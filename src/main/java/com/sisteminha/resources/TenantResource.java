package com.sisteminha.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sisteminha.entities.Tenant;
import com.sisteminha.services.TenantService;

@RestController
@RequestMapping(path = "tenant")
public class TenantResource extends LoggedResource {

	@Autowired
	private TenantService service;

	// TODO esse método tem que mudar de acordo com a role do user logado
	@RequestMapping(method = RequestMethod.GET)
	public List<Tenant> findAll() {
		return service.findAll(getLoggedIncubator());
	}

	// @Transactional
	// @RequestMapping(path = "{id}", method = RequestMethod.DELETE)
	// public void delete(@PathVariable("id") Long id) {
	// service.delete(getLoggedIncubator(), id);
	// }
}
