package com.ebaotech.salesplatform.rest.model.quotation;


public class PolicyHolder extends QuotationRole {
	private static final long serialVersionUID = -1192634645866184301L;

	private String addressOfflineId;

	private Long applicantAge;

	private Long birthDayTimestamp;

	private String telephone;

	private String mobileTel;

	private String dispatchType;

	private String companyOrTrustName;

	public String getAddressOfflineId() {
		return addressOfflineId;
	}

	public void setAddressOfflineId(String addressOfflineId) {
		this.addressOfflineId = addressOfflineId;
	}

	public Long getApplicantAge() {
		return applicantAge;
	}

	public void setApplicantAge(Long applicantAge) {
		this.applicantAge = applicantAge;
	}

	public Long getBirthDayTimestamp() {
		return birthDayTimestamp;
	}

	public void setBirthDayTimestamp(Long birthDayTimestamp) {
		this.birthDayTimestamp = birthDayTimestamp;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMobileTel() {
		return mobileTel;
	}

	public void setMobileTel(String mobileTel) {
		this.mobileTel = mobileTel;
	}

	public String getDispatchType() {
		return dispatchType;
	}

	public void setDispatchType(String dispatchType) {
		this.dispatchType = dispatchType;
	}

	public String getCompanyOrTrustName() {
		return companyOrTrustName;
	}

	public void setCompanyOrTrustName(String companyOrTrustName) {
		this.companyOrTrustName = companyOrTrustName;
	}
}
