package com.ebaotech.salesplatform.rest.model.filter;

import com.ebaotech.salesplatform.rest.model.input.DeviceCheck;
import java.util.List;

public class Filter extends DeviceCheck implements Filterable {

	private static final long serialVersionUID = 5670477851550147316L;
	private List<String> prospectOfflineIdList;
	private Long lastSyncDateTimestamp;

	@Override
	public Long getLastSyncDateTimestamp() {
		return lastSyncDateTimestamp;
	}

	@Override
	public void setLastSyncDateTimestamp(Long lastSyncDateTimestamp) {
		this.lastSyncDateTimestamp = lastSyncDateTimestamp;
	}

	@Override
	public List<String> getProspectOfflineIdList() {
		return prospectOfflineIdList;
	}

	@Override
	public void setProspectOfflineIdList(List<String> prospectOfflineIdList) {
		this.prospectOfflineIdList = prospectOfflineIdList;
	}
}
