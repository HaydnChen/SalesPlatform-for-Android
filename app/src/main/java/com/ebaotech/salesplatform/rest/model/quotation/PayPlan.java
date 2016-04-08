package com.ebaotech.salesplatform.rest.model.quotation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class PayPlan implements Serializable {
	private static final long serialVersionUID = 2985255918270642032L;

	private String payPlanType;

	private String planFreq;

	private String payPeriod;

	private Long payYear;

	private Long guaranteePeriod;

	private Long endYear;

	private String endPeriod;

	private Long payMode;

	private String payOption;

	private List<PayPlanPayee> payPlanPayees = new ArrayList<PayPlanPayee>();

	public String getPayPlanType() {
		return payPlanType;
	}

	public void setPayPlanType(String payPlanType) {
		this.payPlanType = payPlanType;
	}

	public String getPlanFreq() {
		return planFreq;
	}

	public void setPlanFreq(String planFreq) {
		this.planFreq = planFreq;
	}

	public String getPayPeriod() {
		return payPeriod;
	}

	public void setPayPeriod(String payPeriod) {
		this.payPeriod = payPeriod;
	}

	public Long getPayYear() {
		return payYear;
	}

	public void setPayYear(Long payYear) {
		this.payYear = payYear;
	}

	public Long getGuaranteePeriod() {
		return guaranteePeriod;
	}

	public void setGuaranteePeriod(Long guaranteePeriod) {
		this.guaranteePeriod = guaranteePeriod;
	}

	public Long getEndYear() {
		return endYear;
	}

	public void setEndYear(Long endYear) {
		this.endYear = endYear;
	}

	public String getEndPeriod() {
		return endPeriod;
	}

	public void setEndPeriod(String endPeriod) {
		this.endPeriod = endPeriod;
	}

	public Long getPayMode() {
		return payMode;
	}

	public void setPayMode(Long payMode) {
		this.payMode = payMode;
	}

	public String getPayOption() {
		return payOption;
	}

	public void setPayOption(String payOption) {
		this.payOption = payOption;
	}

	public List<PayPlanPayee> getPayPlanPayees() {
		return payPlanPayees;
	}

	public void setPayPlanPayees(List<PayPlanPayee> payPlanPayees) {
		this.payPlanPayees = payPlanPayees;
	}
}
