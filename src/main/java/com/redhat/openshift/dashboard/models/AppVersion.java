package com.redhat.openshift.dashboard.models;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppVersion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Value("${app.name}")
	private String appName;

	@Value("${app.version}")
	private String appVersion;

	public AppVersion() {

	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

}
