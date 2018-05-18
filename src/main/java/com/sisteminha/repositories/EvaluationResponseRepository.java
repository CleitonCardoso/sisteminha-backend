package com.sisteminha.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import com.sisteminha.entities.EvaluationResponse;
import com.sisteminha.entities.Incubator;

public interface EvaluationResponseRepository
		extends CrudRepository<EvaluationResponse, Long>, QueryByExampleExecutor<EvaluationResponse> {

	List<EvaluationResponse> findAllByIncubatorAndTenantId(Incubator incubator, Long tenantId);

}
