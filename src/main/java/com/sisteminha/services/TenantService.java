package com.sisteminha.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sisteminha.entities.Incubator;
import com.sisteminha.entities.Tenant;
import com.sisteminha.repositories.TenantRepository;

@Service
public class TenantService {

	@Autowired
	private TenantRepository repository;

	public List<Tenant> findAll(Incubator incubator) {
		return repository.findAllByIncubator(incubator);
	}
}
