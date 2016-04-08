package com.ebaotech.salesplatform.rest.model.quotation;

import java.io.Serializable;

public class BenefitInsured implements Serializable {
	private static final long serialVersionUID = 3711554733977308910L;

	private Long entryAge;

	private Long orderId;

	private Long jobClass;

	private Integer issuredIndex;// point to quotation.insureds[issuredIndex]

	public Long getEntryAge() {
		return entryAge;
	}

	public void setEntryAge(Long entryAge) {
		this.entryAge = entryAge;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getJobClass() {
		return jobClass;
	}

	public void setJobClass(Long jobClass) {
		this.jobClass = jobClass;
	}

	public Integer getIssuredIndex() {
		return issuredIndex;
	}

	public void setIssuredIndex(Integer issuredIndex) {
		this.issuredIndex = issuredIndex;
	}

}
