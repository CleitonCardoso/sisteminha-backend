package com.sisteminha.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sisteminha.entities.Incubator;
import com.sisteminha.entities.Question;

public interface QuestionRepository extends CrudRepository<Question, Long> {

	List<Question> findAllByIncubatorAndEvaluationId(Incubator incubator, Long evaluationId);

}
