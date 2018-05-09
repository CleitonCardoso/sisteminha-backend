package com.sisteminha.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sisteminha.entities.Evaluation;
import com.sisteminha.entities.EvaluationResponse;
import com.sisteminha.entities.Incubator;
import com.sisteminha.entities.Tenant;
import com.sisteminha.repositories.EvaluationResponseRepository;
import com.sisteminha.repositories.TenantRepository;

@Service
public class TenantService {

	@Autowired
	private TenantRepository repository;

	@Autowired
	private EvaluationResponseRepository evaluationResponseRepository;

	public List<Tenant> findAll(Incubator incubator) {
		return repository.findAllByIncubator( incubator );
	}

	public Tenant save(Incubator loggedIncubator, Tenant tenant) {
		tenant.setIncubator( loggedIncubator );
		return repository.save( tenant );
	}

	public Tenant find(Long id) {
		return repository.findOne( id );
	}

	public List<EvaluationResponse> listEvaluationResponses(Incubator incubator, Long tenantId) {
		return evaluationResponseRepository.findAllByIncubatorAndTenantId( incubator, tenantId );
	}

	public void includeTenantInEvaluation(Incubator incubator, Long tenantId, Long evaluationId) {
		EvaluationResponse evaluationResponse = EvaluationResponse.builder()
				.tenant( Tenant.builder().id( tenantId ).build() )
				.evaluation( Evaluation.builder().id( evaluationId ).build() )
				.incubator( incubator )
				.build();
		evaluationResponseRepository.save( evaluationResponse );
	}
}
