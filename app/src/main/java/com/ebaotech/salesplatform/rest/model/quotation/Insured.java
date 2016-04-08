package com.ebaotech.salesplatform.rest.model.quotation;


public class Insured extends QuotationRole {
	private static final long serialVersionUID = 7985190240749883997L;

	private Long relationToPh;

	private Long birthDateTimestamp;

	private Long industryType;

	private Long jobCateId;

	private String smoking;

	private String mobile;

	private String telephone;

	private Long relationM;

	private String phIndi;

	private String smokeUnit;

	private Long smokeAmount;

	private Long smokeYears;

	private String smokeFrequency;

	private String companyOrTrustName;

	private String gender;

	public Long getRelationToPh() {
		return relationToPh;
	}

	public void setRelationToPh(Long relationToPh) {
		this.relationToPh = relationToPh;
	}

	public Long getBirthDateTimestamp() {
		return birthDateTimestamp;
	}

	public void setBirthDateTimestamp(Long birthDateTimestamp) {
		this.birthDateTimestamp = birthDateTimestamp;
	}

	public Long getIndustryType() {
		return industryType;
	}

	public void setIndustryType(Long industryType) {
		this.industryType = industryType;
	}

	public Long getJobCateId() {
		return jobCateId;
	}

	public void setJobCateId(Long jobCateId) {
		this.jobCateId = jobCateId;
	}

	public String getSmoking() {
		return smoking;
	}

	public void setSmoking(String smoking) {
		this.smoking = smoking;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Long getRelationM() {
		return relationM;
	}

	public void setRelationM(Long relationM) {
		this.relationM = relationM;
	}

	public String getPhIndi() {
		return phIndi;
	}

	public void setPhIndi(String phIndi) {
		this.phIndi = phIndi;
	}

	public String getSmokeUnit() {
		return smokeUnit;
	}

	public void setSmokeUnit(String smokeUnit) {
		this.smokeUnit = smokeUnit;
	}

	public Long getSmokeAmount() {
		return smokeAmount;
	}

	public void setSmokeAmount(Long smokeAmount) {
		this.smokeAmount = smokeAmount;
	}

	public Long getSmokeYears() {
		return smokeYears;
	}

	public void setSmokeYears(Long smokeYears) {
		this.smokeYears = smokeYears;
	}

	public String getSmokeFrequency() {
		return smokeFrequency;
	}

	public void setSmokeFrequency(String smokeFrequency) {
		this.smokeFrequency = smokeFrequency;
	}

	public String getCompanyOrTrustName() {
		return companyOrTrustName;
	}

	public void setCompanyOrTrustName(String companyOrTrustName) {
		this.companyOrTrustName = companyOrTrustName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
