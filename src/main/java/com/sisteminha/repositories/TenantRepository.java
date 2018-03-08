package com.sisteminha.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sisteminha.entities.Incubator;
import com.sisteminha.entities.Tenant;

public interface TenantRepository extends CrudRepository<Tenant, Long> {

	List<Tenant> findAllByIncubator(Incubator incubator);

}
