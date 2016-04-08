package com.ebaotech.salesplatform.rest.model.quotation;

import java.io.Serializable;
import java.math.BigDecimal;

public class ExtraMortality implements Serializable {
	private static final long serialVersionUID = -1890467258510550372L;

	private String emType;

	private BigDecimal emValue;

	private String loadFrom;

	private String loadTo;

	private Long productId;

	public String getEmType() {
		return emType;
	}

	public void setEmType(String emType) {
		this.emType = emType;
	}

	public BigDecimal getEmValue() {
		return emValue;
	}

	public void setEmValue(BigDecimal emValue) {
		this.emValue = emValue;
	}

	public String getLoadFrom() {
		return loadFrom;
	}

	public void setLoadFrom(String loadFrom) {
		this.loadFrom = loadFrom;
	}

	public String getLoadTo() {
		return loadTo;
	}

	public void setLoadTo(String loadTo) {
		this.loadTo = loadTo;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}
}
