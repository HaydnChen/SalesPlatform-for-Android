package com.ebaotech.salesplatform.rest.model.quotation;

import java.io.Serializable;

public class PolicyAccount implements Serializable {
	private static final long serialVersionUID = -2922032389492089863L;

	private Long accountType;

	// point to quotation.quotationProduct[quotationProductIndex]
	private Integer quotationProductIndex;

	public Long getAccountType() {
		return accountType;
	}

	public void setAccountType(Long accountType) {
		this.accountType = accountType;
	}

	public Integer getQuotationProductIndex() {
		return quotationProductIndex;
	}

	public void setQuotationProductIndex(Integer quotationProductIndex) {
		this.quotationProductIndex = quotationProductIndex;
	}
}
