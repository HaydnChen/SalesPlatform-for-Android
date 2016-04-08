package com.ebaotech.salesplatform.rest.model;

import java.io.Serializable;

public interface Syncable extends Serializable {
	String getOfflineId();

	void setOfflineId(String offlineId);

	String getDeleteFlag();

	void setDeleteFlag(String deleteFlag);

	Long getLastUpdatedDateTimestamp();

	void setLastUpdatedDateTimestamp(Long lastUpdatedDateTimestamp);

	Long getOfflineCreatedDateTimestamp();

	void setOfflineCreatedDateTimestamp(Long offlineCreatedDateTimestamp);
}
