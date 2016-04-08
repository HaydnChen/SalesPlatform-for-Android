package com.ebaotech.salesplatform.rest.model.quotation;

import java.io.Serializable;
import java.math.BigDecimal;

public class Payment implements Serializable {
	private static final long serialVersionUID = -5193627470029763792L;

	private Long payMode;

	private BigDecimal payAmount;

	private String payAccountNO;

	private String bankCode;

	private Long moneyId;

	private Long payDueDateTimestamp;

	public Long getPayMode() {
		return payMode;
	}

	public void setPayMode(Long payMode) {
		this.payMode = payMode;
	}

	public BigDecimal getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(BigDecimal payAmount) {
		this.payAmount = payAmount;
	}

	public String getPayAccountNO() {
		return payAccountNO;
	}

	public void setPayAccountNO(String payAccountNO) {
		this.payAccountNO = payAccountNO;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public Long getMoneyId() {
		return moneyId;
	}

	public void setMoneyId(Long moneyId) {
		this.moneyId = moneyId;
	}

	public Long getPayDueDateTimestamp() {
		return payDueDateTimestamp;
	}

	public void setPayDueDateTimestamp(Long payDueDateTimestamp) {
		this.payDueDateTimestamp = payDueDateTimestamp;
	}

}
