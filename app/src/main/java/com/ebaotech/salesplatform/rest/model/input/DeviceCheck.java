package com.ebaotech.salesplatform.rest.model.input;

public class DeviceCheck implements Inputable {
	private static final long serialVersionUID = 468687374985377414L;
	private String agentId;
	private String deviceId;
	private String offlineVersion;

	@Override
	public String getAgentId() {
		return this.agentId;
	}

	@Override
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	@Override
	public String getDeviceId() {
		return this.deviceId;
	}

	@Override
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	@Override
	public String getOfflineVersion() {
		return offlineVersion;
	}

	@Override
	public void setOfflineVersion(String offlineVersion) {
		this.offlineVersion = offlineVersion;
	}

}
