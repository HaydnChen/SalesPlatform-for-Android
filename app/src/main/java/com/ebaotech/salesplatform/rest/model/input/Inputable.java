package com.ebaotech.salesplatform.rest.model.input;

import java.io.Serializable;

public interface Inputable extends Serializable {
	String getAgentId();

	void setAgentId(String agentId);

	String getDeviceId();

	void setDeviceId(String deviceId);
	
	String getOfflineVersion();
	
	void setOfflineVersion(String offlineVersion);
}
