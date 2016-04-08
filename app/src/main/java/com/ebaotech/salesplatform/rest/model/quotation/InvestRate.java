package com.ebaotech.salesplatform.rest.model.quotation;

import java.io.Serializable;
import java.math.BigDecimal;

public class InvestRate implements Serializable {
	private static final long serialVersionUID = -3080163225534245049L;

	private String fundCode;

	private Long lowPlyYear;

	private Long highPlyYear;

	private BigDecimal assignRate;

	private BigDecimal amount;

	private String premType;

	private String allocationFlag;

	public String getFundCode() {
		return fundCode;
	}

	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

	public Long getLowPlyYear() {
		return lowPlyYear;
	}

	public void setLowPlyYear(Long lowPlyYear) {
		this.lowPlyYear = lowPlyYear;
	}

	public Long getHighPlyYear() {
		return highPlyYear;
	}

	public void setHighPlyYear(Long highPlyYear) {
		this.highPlyYear = highPlyYear;
	}

	public BigDecimal getAssignRate() {
		return assignRate;
	}

	public void setAssignRate(BigDecimal assignRate) {
		this.assignRate = assignRate;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getPremType() {
		return premType;
	}

	public void setPremType(String premType) {
		this.premType = premType;
	}

	public String getAllocationFlag() {
		return allocationFlag;
	}

	public void setAllocationFlag(String allocationFlag) {
		this.allocationFlag = allocationFlag;
	}

}
