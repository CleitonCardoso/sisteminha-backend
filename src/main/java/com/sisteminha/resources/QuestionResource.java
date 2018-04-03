package com.sisteminha.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sisteminha.entities.Question;
import com.sisteminha.services.QuestionService;

@RestController
public class QuestionResource extends LoggedResource {

	@Autowired
	private QuestionService questionService;

	@RequestMapping(path = "evaluation/{id}/questions", method = RequestMethod.GET)
	public List<Question> findAll(@PathVariable("id") Long id) {
		return questionService.findAll( getLoggedIncubator(), id );
	}

	@RequestMapping(path = "evaluation/{id}/question", method = RequestMethod.POST)
	public Question save(@PathVariable("id") Long id, @RequestBody Question question) {
		return questionService.save( getLoggedIncubator(), id, question );
	}

	@RequestMapping(path = "evaluation/{id}/question", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		questionService.delete( getLoggedIncubator(), id );
	}

}
