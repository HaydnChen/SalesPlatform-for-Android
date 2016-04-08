package com.ebaotech.salesplatform.rest.model.quotation;

import java.io.Serializable;

public class QuotationRole implements Serializable {
	private static final long serialVersionUID = -4011108586686396287L;

	private String prospectOfflineId;

	public String getProspectOfflineId() {
		return prospectOfflineId;
	}

	public void setProspectOfflineId(String prospectOfflineId) {
		this.prospectOfflineId = prospectOfflineId;
	}
}
