package com.ebaotech.salesplatform.rest.model.quotation;

import java.math.BigDecimal;

public class Beneficiary extends QuotationRole {
	private static final long serialVersionUID = -2798680872715083567L;

	private String addressOfflineId;

	private String insuredOfflineId;

	private String beneType;

	private Long shareOrder;

	private BigDecimal shareRate;

	private Long designation;

	private String legalBene;

	private String telephone;

	private String mobile;

	public String getAddressOfflineId() {
		return addressOfflineId;
	}

	public void setAddressOfflineId(String addressOfflineId) {
		this.addressOfflineId = addressOfflineId;
	}

	public String getInsuredOfflineId() {
		return insuredOfflineId;
	}

	public void setInsuredOfflineId(String insuredOfflineId) {
		this.insuredOfflineId = insuredOfflineId;
	}

	public String getBeneType() {
		return beneType;
	}

	public void setBeneType(String beneType) {
		this.beneType = beneType;
	}

	public Long getShareOrder() {
		return shareOrder;
	}

	public void setShareOrder(Long shareOrder) {
		this.shareOrder = shareOrder;
	}

	public BigDecimal getShareRate() {
		return shareRate;
	}

	public void setShareRate(BigDecimal shareRate) {
		this.shareRate = shareRate;
	}

	public Long getDesignation() {
		return designation;
	}

	public void setDesignation(Long designation) {
		this.designation = designation;
	}

	public String getLegalBene() {
		return legalBene;
	}

	public void setLegalBene(String legalBene) {
		this.legalBene = legalBene;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
