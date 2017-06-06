package com.redhat.openshift.dashboard.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.redhat.openshift.dashboard.models.AppVersion;

@RestController
@RequestMapping(path = RestResources.ROOT)
public class RootRestResource {

	@Autowired
	private AppVersion appVersion;

	public RootRestResource() {

	}

	@RequestMapping(method = RequestMethod.GET)
	public AppVersion root() {
		return appVersion;
	}

}
