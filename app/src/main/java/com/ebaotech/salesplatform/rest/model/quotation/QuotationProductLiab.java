package com.ebaotech.salesplatform.rest.model.quotation;

import java.io.Serializable;
import java.math.BigDecimal;

public class QuotationProductLiab implements Serializable {
	private static final long serialVersionUID = 1103069770511483245L;

	private Long liabId;

	private String premIndi;

	private BigDecimal sa;

	private BigDecimal unit;

	private Long applyDateTimestamp;

	private Long validateDateTimestamp;

	private String countWay;

	private BigDecimal stdPremBf;

	private BigDecimal stdPremAf;

	private BigDecimal totalPremAf;

	private BigDecimal discountPrem;

	private BigDecimal grossPremAf;

	private BigDecimal extraPremAf;

	private BigDecimal extraPremBf;

	private BigDecimal extraPremAn;

	public Long getLiabId() {
		return liabId;
	}

	public void setLiabId(Long liabId) {
		this.liabId = liabId;
	}

	public String getPremIndi() {
		return premIndi;
	}

	public void setPremIndi(String premIndi) {
		this.premIndi = premIndi;
	}

	public BigDecimal getSa() {
		return sa;
	}

	public void setSa(BigDecimal sa) {
		this.sa = sa;
	}

	public BigDecimal getUnit() {
		return unit;
	}

	public void setUnit(BigDecimal unit) {
		this.unit = unit;
	}

	public Long getApplyDateTimestamp() {
		return applyDateTimestamp;
	}

	public void setApplyDateTimestamp(Long applyDateTimestamp) {
		this.applyDateTimestamp = applyDateTimestamp;
	}

	public Long getValidateDateTimestamp() {
		return validateDateTimestamp;
	}

	public void setValidateDateTimestamp(Long validateDateTimestamp) {
		this.validateDateTimestamp = validateDateTimestamp;
	}

	public String getCountWay() {
		return countWay;
	}

	public void setCountWay(String countWay) {
		this.countWay = countWay;
	}

	public BigDecimal getStdPremBf() {
		return stdPremBf;
	}

	public void setStdPremBf(BigDecimal stdPremBf) {
		this.stdPremBf = stdPremBf;
	}

	public BigDecimal getStdPremAf() {
		return stdPremAf;
	}

	public void setStdPremAf(BigDecimal stdPremAf) {
		this.stdPremAf = stdPremAf;
	}

	public BigDecimal getTotalPremAf() {
		return totalPremAf;
	}

	public void setTotalPremAf(BigDecimal totalPremAf) {
		this.totalPremAf = totalPremAf;
	}

	public BigDecimal getDiscountPrem() {
		return discountPrem;
	}

	public void setDiscountPrem(BigDecimal discountPrem) {
		this.discountPrem = discountPrem;
	}

	public BigDecimal getGrossPremAf() {
		return grossPremAf;
	}

	public void setGrossPremAf(BigDecimal grossPremAf) {
		this.grossPremAf = grossPremAf;
	}

	public BigDecimal getExtraPremAf() {
		return extraPremAf;
	}

	public void setExtraPremAf(BigDecimal extraPremAf) {
		this.extraPremAf = extraPremAf;
	}

	public BigDecimal getExtraPremBf() {
		return extraPremBf;
	}

	public void setExtraPremBf(BigDecimal extraPremBf) {
		this.extraPremBf = extraPremBf;
	}

	public BigDecimal getExtraPremAn() {
		return extraPremAn;
	}

	public void setExtraPremAn(BigDecimal extraPremAn) {
		this.extraPremAn = extraPremAn;
	}
}
