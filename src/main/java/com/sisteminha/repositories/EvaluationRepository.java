package com.sisteminha.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sisteminha.entities.Evaluation;
import com.sisteminha.entities.Incubator;

public interface EvaluationRepository extends CrudRepository<Evaluation, Long> {

	List<Evaluation> findAllByIncubator(Incubator incubator);

	void deleteByIncubatorAndId(Incubator incubator, Long id);

}
