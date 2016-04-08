package com.ebaotech.salesplatform.rest.model.quotation;

import java.io.Serializable;
import java.math.BigDecimal;

public class PayPlanPayee implements Serializable {
	private static final long serialVersionUID = -8528741393823008975L;

	private String payeeAddressOfflineId;

	private String payeeAccountOfflineId;

	private String payeeOfflineId;

	private Long payMode;

	private BigDecimal payeeRate;

	public String getPayeeAddressOfflineId() {
		return payeeAddressOfflineId;
	}

	public void setPayeeAddressOfflineId(String payeeAddressOfflineId) {
		this.payeeAddressOfflineId = payeeAddressOfflineId;
	}

	public String getPayeeAccountOfflineId() {
		return payeeAccountOfflineId;
	}

	public void setPayeeAccountOfflineId(String payeeAccountOfflineId) {
		this.payeeAccountOfflineId = payeeAccountOfflineId;
	}

	public String getPayeeOfflineId() {
		return payeeOfflineId;
	}

	public void setPayeeOfflineId(String payeeOfflineId) {
		this.payeeOfflineId = payeeOfflineId;
	}

	public Long getPayMode() {
		return payMode;
	}

	public void setPayMode(Long payMode) {
		this.payMode = payMode;
	}

	public BigDecimal getPayeeRate() {
		return payeeRate;
	}

	public void setPayeeRate(BigDecimal payeeRate) {
		this.payeeRate = payeeRate;
	}
}
