package com.ebaotech.salesplatform.rest.model.prospect;

import java.io.Serializable;

public class ProspectRela implements Serializable {
	private static final long serialVersionUID = 5860728986825521704L;

	private Long relationId;

	private Prospect relaProspect;

	public Long getRelationId() {
		return relationId;
	}

	public void setRelationId(Long relationId) {
		this.relationId = relationId;
	}

	public Prospect getRelaProspect() {
		return relaProspect;
	}

	public void setRelaProspect(Prospect relaProspect) {
		this.relaProspect = relaProspect;
	}

}
