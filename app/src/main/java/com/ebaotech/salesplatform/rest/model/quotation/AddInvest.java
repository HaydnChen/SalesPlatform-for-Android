package com.ebaotech.salesplatform.rest.model.quotation;

import java.io.Serializable;
import java.math.BigDecimal;

public class AddInvest implements Serializable {
	private static final long serialVersionUID = 5722270801394924100L;

	private String addPremType;

	private BigDecimal addPrem;

	private Long payMode;

	private Long addYear;

	private Long addPeriod;

	private Long addStartDateTimestamp;

	private Long paidupDateTimestamp;

	private Long payToDateTimestamp;

	private String chargeMode;

	private BigDecimal addPremAn;

	public String getAddPremType() {
		return addPremType;
	}

	public void setAddPremType(String addPremType) {
		this.addPremType = addPremType;
	}

	public BigDecimal getAddPrem() {
		return addPrem;
	}

	public void setAddPrem(BigDecimal addPrem) {
		this.addPrem = addPrem;
	}

	public Long getPayMode() {
		return payMode;
	}

	public void setPayMode(Long payMode) {
		this.payMode = payMode;
	}

	public Long getAddYear() {
		return addYear;
	}

	public void setAddYear(Long addYear) {
		this.addYear = addYear;
	}

	public Long getAddPeriod() {
		return addPeriod;
	}

	public void setAddPeriod(Long addPeriod) {
		this.addPeriod = addPeriod;
	}

	public Long getAddStartDateTimestamp() {
		return addStartDateTimestamp;
	}

	public void setAddStartDateTimestamp(Long addStartDateTimestamp) {
		this.addStartDateTimestamp = addStartDateTimestamp;
	}

	public Long getPaidupDateTimestamp() {
		return paidupDateTimestamp;
	}

	public void setPaidupDateTimestamp(Long paidupDateTimestamp) {
		this.paidupDateTimestamp = paidupDateTimestamp;
	}

	public Long getPayToDateTimestamp() {
		return payToDateTimestamp;
	}

	public void setPayToDateTimestamp(Long payToDateTimestamp) {
		this.payToDateTimestamp = payToDateTimestamp;
	}

	public String getChargeMode() {
		return chargeMode;
	}

	public void setChargeMode(String chargeMode) {
		this.chargeMode = chargeMode;
	}

	public BigDecimal getAddPremAn() {
		return addPremAn;
	}

	public void setAddPremAn(BigDecimal addPremAn) {
		this.addPremAn = addPremAn;
	}
}
