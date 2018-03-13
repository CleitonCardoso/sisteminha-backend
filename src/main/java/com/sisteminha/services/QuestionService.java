package com.sisteminha.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sisteminha.entities.Evaluation;
import com.sisteminha.entities.Incubator;
import com.sisteminha.entities.Question;
import com.sisteminha.repositories.QuestionRepository;

@Service
public class QuestionService {

	@Autowired
	private QuestionRepository repository;

	public List<Question> findAll(Incubator incubator, Long evaluationId) {
		return repository.findAllByIncubatorAndEvaluationId(incubator, evaluationId);
	}

	public Question save(Incubator loggedIncubator, Long id, Question question) {
		question.setIncubator(loggedIncubator);
		question.setEvaluation(Evaluation.builder().id(id).build());
		return repository.save(question);
	}
}
