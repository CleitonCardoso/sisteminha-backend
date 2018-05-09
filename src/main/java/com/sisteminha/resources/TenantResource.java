package com.sisteminha.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sisteminha.entities.EvaluationResponse;
import com.sisteminha.entities.Tenant;
import com.sisteminha.services.TenantService;

@RestController
@RequestMapping(path = "tenant")
public class TenantResource extends LoggedResource {

	@Autowired
	private TenantService service;

	@RequestMapping(path = "{id}", method = RequestMethod.GET)
	public Tenant get(@PathVariable("id") Long id) {
		return service.find( id );
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Tenant> findAll() {
		return service.findAll( getLoggedIncubator() );
	}

	@RequestMapping(method = RequestMethod.POST)
	public Tenant save(@RequestBody Tenant tenant) {
		return service.save( getLoggedIncubator(), tenant );
	}

	@RequestMapping(path = "{id}/evaluations", method = RequestMethod.GET)
	public List<EvaluationResponse> listEvaluationResponses(@PathVariable("id") Long tenantId) {
		return service.listEvaluationResponses( getLoggedIncubator(), tenantId );
	}

	@RequestMapping(path = "{tenantId}/evaluation/{evaluationId}", method = RequestMethod.POST)
	public void includeInEvaluation(@PathVariable("tenantId") Long tenantId,
			@PathVariable("evaluationId") Long evaluationId) {
		service.includeTenantInEvaluation( getLoggedIncubator(), tenantId, evaluationId );
	}

}
