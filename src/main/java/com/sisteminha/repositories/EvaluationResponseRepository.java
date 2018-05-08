package com.sisteminha.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sisteminha.entities.EvaluationResponse;
import com.sisteminha.entities.Incubator;

public interface EvaluationResponseRepository extends CrudRepository<EvaluationResponse, Long> {

	List<EvaluationResponse> findAllByIncubatorAndTenantId(Incubator incubator, Long tenantId);

}
