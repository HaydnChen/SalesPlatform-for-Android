package com.ebaotech.salesplatform.rest.model.filter;

import com.ebaotech.salesplatform.rest.model.input.Inputable;
import java.util.List;

public interface Filterable extends Inputable {
	Long getLastSyncDateTimestamp();

	void setLastSyncDateTimestamp(Long lastSyncDateTimestamp);

	List<String> getProspectOfflineIdList();

	public void setProspectOfflineIdList(List<String> prospectOfflineIdList);
}
