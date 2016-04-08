package com.ebaotech.salesplatform.rest.model.quotation;

import java.io.Serializable;
import java.math.BigDecimal;

public class QuotationAlteration implements Serializable {
	private static final long serialVersionUID = -7157527418431866311L;

	private Long alterType;

	private Long startYear;

	private Long endYear;

	private BigDecimal annualTopup;

	private BigDecimal annualWithdraw;

	private Long applyDateTimestamp;

	private String payFrequency;

	public Long getAlterType() {
		return alterType;
	}

	public void setAlterType(Long alterType) {
		this.alterType = alterType;
	}

	public Long getStartYear() {
		return startYear;
	}

	public void setStartYear(Long startYear) {
		this.startYear = startYear;
	}

	public Long getEndYear() {
		return endYear;
	}

	public void setEndYear(Long endYear) {
		this.endYear = endYear;
	}

	public BigDecimal getAnnualTopup() {
		return annualTopup;
	}

	public void setAnnualTopup(BigDecimal annualTopup) {
		this.annualTopup = annualTopup;
	}

	public BigDecimal getAnnualWithdraw() {
		return annualWithdraw;
	}

	public void setAnnualWithdraw(BigDecimal annualWithdraw) {
		this.annualWithdraw = annualWithdraw;
	}

	public Long getApplyDateTimestamp() {
		return applyDateTimestamp;
	}

	public void setApplyDateTimestamp(Long applyDateTimestamp) {
		this.applyDateTimestamp = applyDateTimestamp;
	}

	public String getPayFrequency() {
		return payFrequency;
	}

	public void setPayFrequency(String payFrequency) {
		this.payFrequency = payFrequency;
	}

}
