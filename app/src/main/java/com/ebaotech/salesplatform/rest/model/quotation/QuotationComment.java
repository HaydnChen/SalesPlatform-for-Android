package com.ebaotech.salesplatform.rest.model.quotation;

import java.io.Serializable;

public class QuotationComment implements Serializable {
	private static final long serialVersionUID = -7258836038311161620L;

	private Long proposalStatus;

	private String comments;

	public Long getProposalStatus() {
		return proposalStatus;
	}

	public void setProposalStatus(Long proposalStatus) {
		this.proposalStatus = proposalStatus;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}
}
