package com.sisteminha.resources;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sisteminha.entities.Evaluation;
import com.sisteminha.entities.Role;
import com.sisteminha.entities.User;
import com.sisteminha.services.EvaluationService;

@RestController
@RequestMapping(path = "evaluation")
public class EvaluationResource extends LoggedResource {

	@Autowired
	private EvaluationService service;

	@RequestMapping(method = RequestMethod.POST)
	public Evaluation save(@RequestBody Evaluation evaluation) {
		evaluation.setIncubator( getLoggedIncubator() );
		return service.save( evaluation );
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Evaluation> findAll() {
		return service.findAll( getLoggedIncubator() );
	}

	@RequestMapping(path = "{id}", method = RequestMethod.GET)
	public Evaluation find(@PathVariable("id") Long id) {
		return service.find( getLoggedIncubator(), id );
	}

	@Transactional
	@RequestMapping(path = "{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable("id") Long id) {
		service.delete( getLoggedIncubator(), id );
	}

}
