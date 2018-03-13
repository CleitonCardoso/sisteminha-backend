package com.sisteminha.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sisteminha.entities.Evaluation;
import com.sisteminha.entities.Incubator;
import com.sisteminha.repositories.EvaluationRepository;

@Service
public class EvaluationService {

	@Autowired
	private EvaluationRepository repository;

	public List<Evaluation> findAll(Incubator incubator) {
		return repository.findAllByIncubator(incubator);
	}

	public void delete(Incubator incubator, Long id) {
		repository.deleteByIncubatorAndId(incubator, id);
	}

	public Evaluation find(Incubator incubator, Long id) {
		return repository.findByIncubatorAndId(incubator, id);
	}

}
