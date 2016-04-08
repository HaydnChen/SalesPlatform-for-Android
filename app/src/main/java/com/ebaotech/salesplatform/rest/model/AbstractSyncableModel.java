package com.ebaotech.salesplatform.rest.model;

public abstract class AbstractSyncableModel implements Syncable {
	private static final long serialVersionUID = -5508631789253855876L;
	private String offlineId;
	private String deleteFlag;
	private Long lastUpdatedDateTimestamp;
	private Long offlineCreatedDateTimestamp;

	@Override
	public String getOfflineId() {
		return offlineId;
	}

	@Override
	public void setOfflineId(String offlineId) {
		this.offlineId = offlineId;
	}

	@Override
	public String getDeleteFlag() {
		return deleteFlag;
	}

	@Override
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	@Override
	public Long getLastUpdatedDateTimestamp() {
		return lastUpdatedDateTimestamp;
	}

	@Override
	public void setLastUpdatedDateTimestamp(Long lastUpdatedDateTimestamp) {
		this.lastUpdatedDateTimestamp = lastUpdatedDateTimestamp;
	}

	@Override
	public Long getOfflineCreatedDateTimestamp() {
		return offlineCreatedDateTimestamp;
	}

	@Override
	public void setOfflineCreatedDateTimestamp(Long offlineCreatedDateTimestamp) {
		this.offlineCreatedDateTimestamp = offlineCreatedDateTimestamp;
	}

}
