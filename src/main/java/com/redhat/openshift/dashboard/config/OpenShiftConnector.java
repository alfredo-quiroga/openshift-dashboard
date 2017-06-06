package com.redhat.openshift.dashboard.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.ConfigBuilder;
import io.fabric8.openshift.client.DefaultOpenShiftClient;

@Component
public class OpenShiftConnector {

	@SuppressWarnings("unused")
	private static final Logger LOGGER = LoggerFactory.getLogger(OpenShiftConnector.class);

	@Value("${kubernetes.master}")
	private String masterUrl;

	@Value("${kubernetes.auth.token}")
	private String oauthToken;

	public OpenShiftConnector() {

	}

	public DefaultOpenShiftClient connect() {
		final Config config = new ConfigBuilder().withMasterUrl(masterUrl).withOauthToken(oauthToken).build();
		return new DefaultOpenShiftClient(config);
	}

}
