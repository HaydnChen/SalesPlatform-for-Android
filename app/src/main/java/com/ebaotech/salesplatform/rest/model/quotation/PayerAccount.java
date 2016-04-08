package com.ebaotech.salesplatform.rest.model.quotation;

import java.io.Serializable;

public class PayerAccount implements Serializable {
	private static final long serialVersionUID = 2236876382582143386L;

	private String accountOfflineId;

	private String payerOfflineId;

	private Long payMode;

	private Long payNext;

	private String nextAccountOfflineId;

	private Integer preferredDeductionDay;

	private String relationToPh;

	public String getAccountOfflineId() {
		return accountOfflineId;
	}

	public void setAccountOfflineId(String accountOfflineId) {
		this.accountOfflineId = accountOfflineId;
	}

	public String getPayerOfflineId() {
		return payerOfflineId;
	}

	public void setPayerOfflineId(String payerOfflineId) {
		this.payerOfflineId = payerOfflineId;
	}

	public Long getPayMode() {
		return payMode;
	}

	public void setPayMode(Long payMode) {
		this.payMode = payMode;
	}

	public Long getPayNext() {
		return payNext;
	}

	public void setPayNext(Long payNext) {
		this.payNext = payNext;
	}

	public String getNextAccountOfflineId() {
		return nextAccountOfflineId;
	}

	public void setNextAccountOfflineId(String nextAccountOfflineId) {
		this.nextAccountOfflineId = nextAccountOfflineId;
	}

	public Integer getPreferredDeductionDay() {
		return preferredDeductionDay;
	}

	public void setPreferredDeductionDay(Integer preferredDeductionDay) {
		this.preferredDeductionDay = preferredDeductionDay;
	}

	public String getRelationToPh() {
		return relationToPh;
	}

	public void setRelationToPh(String relationToPh) {
		this.relationToPh = relationToPh;
	}
}
