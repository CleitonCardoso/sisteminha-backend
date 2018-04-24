package com.sisteminha.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sisteminha.entities.Incubator;

@RestController
@RequestMapping(path = "incubator")
public class IncubatorResource extends LoggedResource {

	@RequestMapping(method = RequestMethod.GET)
	public Incubator get() {
		return getLoggedIncubator();
	}

}
